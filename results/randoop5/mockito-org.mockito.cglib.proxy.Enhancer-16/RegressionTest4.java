import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback4 = null;
        enhancer0.setCallback(callback4);
        enhancer0.setUseCache(false);
        boolean boolean8 = enhancer0.getUseCache();
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer11.getStrategy();
        java.lang.ClassLoader classLoader13 = enhancer11.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter14 = null;
        enhancer11.setCallbackFilter(callbackFilter14);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = enhancer11.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy16);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class19 = null;
        enhancer18.setSuperclass(class19);
        enhancer18.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer18.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = enhancer25.getStrategy();
        enhancer25.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class30 = null;
        enhancer29.setSuperclass(class30);
        java.lang.ClassLoader classLoader32 = enhancer29.getClassLoader();
        enhancer25.setClassLoader(classLoader32);
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = enhancer34.getStrategy();
        java.lang.ClassLoader classLoader36 = enhancer34.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter37 = null;
        enhancer34.setCallbackFilter(callbackFilter37);
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
        org.mockito.cglib.proxy.Callback callback53 = null;
        enhancer39.setCallback(callback53);
        java.lang.ClassLoader classLoader55 = enhancer39.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy57 = enhancer56.getStrategy();
        enhancer56.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback60 = null;
        enhancer56.setCallback(callback60);
        enhancer56.setUseCache(false);
        boolean boolean64 = enhancer56.getUseCache();
        enhancer56.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Enhancer enhancer67 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy68 = enhancer67.getStrategy();
        java.lang.ClassLoader classLoader69 = enhancer67.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter70 = null;
        enhancer67.setCallbackFilter(callbackFilter70);
        org.mockito.cglib.core.NamingPolicy namingPolicy72 = enhancer67.getNamingPolicy();
        enhancer56.setNamingPolicy(namingPolicy72);
        java.lang.Class<?> wildcardClass74 = enhancer56.getClass();
        enhancer39.setSuperclass((java.lang.Class) wildcardClass74);
        org.mockito.cglib.proxy.Callback callback76 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray77 = new org.mockito.cglib.proxy.Callback[] { callback76 };
        enhancer39.setCallbacks(callbackArray77);
        enhancer34.setCallbacks(callbackArray77);
        enhancer25.setCallbacks(callbackArray77);
        enhancer18.setCallbacks(callbackArray77);
        enhancer0.setCallbacks(callbackArray77);
        boolean boolean83 = enhancer0.getUseCache();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertNotNull(namingPolicy16);
        org.junit.Assert.assertNotNull(generatorStrategy26);
        org.junit.Assert.assertNotNull(classLoader32);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertNotNull(classLoader36);
        org.junit.Assert.assertNotNull(namingPolicy42);
        org.junit.Assert.assertNotNull(generatorStrategy44);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(classLoader55);
        org.junit.Assert.assertNotNull(generatorStrategy57);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(generatorStrategy68);
        org.junit.Assert.assertNotNull(classLoader69);
        org.junit.Assert.assertNotNull(namingPolicy72);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(callbackArray77);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer0.setNamingPolicy(namingPolicy7);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter9 = null;
        enhancer0.setCallbackFilter(callbackFilter9);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        boolean boolean33 = enhancer0.getAttemptLoad();
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer36.getStrategy();
        java.lang.ClassLoader classLoader38 = enhancer36.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter39 = null;
        enhancer36.setCallbackFilter(callbackFilter39);
        enhancer36.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer43 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class44 = null;
        enhancer43.setSuperclass(class44);
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = enhancer46.getStrategy();
        java.lang.ClassLoader classLoader48 = enhancer46.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter49 = null;
        enhancer46.setCallbackFilter(callbackFilter49);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = enhancer46.getStrategy();
        enhancer43.setStrategy(generatorStrategy51);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = enhancer43.getStrategy();
        enhancer36.setStrategy(generatorStrategy53);
        java.lang.Class<?> wildcardClass55 = generatorStrategy53.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass55);
        boolean boolean57 = enhancer0.getUseCache();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy60 = enhancer0.getNamingPolicy();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(classLoader38);
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(classLoader48);
        org.junit.Assert.assertNotNull(generatorStrategy51);
        org.junit.Assert.assertNotNull(generatorStrategy53);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(namingPolicy60);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseFactory(false);
        enhancer0.setAttemptLoad(false);
        enhancer0.setUseFactory(false);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        enhancer0.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = enhancer25.getStrategy();
        java.lang.ClassLoader classLoader27 = enhancer25.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter28 = null;
        enhancer25.setCallbackFilter(callbackFilter28);
        enhancer25.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class33 = null;
        enhancer32.setSuperclass(class33);
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer35.getStrategy();
        java.lang.ClassLoader classLoader37 = enhancer35.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter38 = null;
        enhancer35.setCallbackFilter(callbackFilter38);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = enhancer35.getStrategy();
        enhancer32.setStrategy(generatorStrategy40);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy42 = enhancer32.getStrategy();
        enhancer25.setStrategy(generatorStrategy42);
        java.lang.Class<?> wildcardClass44 = generatorStrategy42.getClass();
        boolean boolean45 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass44);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass44);
        enhancer0.setUseCache(true);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy13);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(generatorStrategy26);
        org.junit.Assert.assertNotNull(classLoader27);
        org.junit.Assert.assertNotNull(generatorStrategy36);
        org.junit.Assert.assertNotNull(classLoader37);
        org.junit.Assert.assertNotNull(generatorStrategy40);
        org.junit.Assert.assertNotNull(generatorStrategy42);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = enhancer23.getStrategy();
        enhancer23.setSerialVersionUID((java.lang.Long) 0L);
        enhancer23.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class30 = null;
        enhancer29.setSuperclass(class30);
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = enhancer29.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer33.getStrategy();
        enhancer29.setStrategy(generatorStrategy34);
        enhancer23.setStrategy(generatorStrategy34);
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = enhancer37.getStrategy();
        java.lang.Class<?> wildcardClass39 = enhancer37.getClass();
        boolean boolean40 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass39);
        enhancer23.setSuperclass((java.lang.Class) wildcardClass39);
        boolean boolean42 = enhancer23.getUseCache();
        java.lang.ClassLoader classLoader43 = enhancer23.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = enhancer44.getStrategy();
        java.lang.ClassLoader classLoader46 = enhancer44.getClassLoader();
        enhancer44.setUseFactory(true);
        enhancer44.setUseFactory(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy51 = enhancer44.getNamingPolicy();
        enhancer23.setNamingPolicy(namingPolicy51);
        enhancer0.setNamingPolicy(namingPolicy51);
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy57 = enhancer56.getStrategy();
        java.lang.ClassLoader classLoader58 = enhancer56.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter59 = null;
        enhancer56.setCallbackFilter(callbackFilter59);
        enhancer56.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer63 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class64 = null;
        enhancer63.setSuperclass(class64);
        org.mockito.cglib.proxy.Enhancer enhancer66 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy67 = enhancer66.getStrategy();
        java.lang.ClassLoader classLoader68 = enhancer66.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter69 = null;
        enhancer66.setCallbackFilter(callbackFilter69);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy71 = enhancer66.getStrategy();
        enhancer63.setStrategy(generatorStrategy71);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy73 = enhancer63.getStrategy();
        enhancer56.setStrategy(generatorStrategy73);
        enhancer0.setStrategy(generatorStrategy73);
        enhancer0.setInterceptDuringConstruction(true);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(classLoader12);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(generatorStrategy24);
        org.junit.Assert.assertNotNull(namingPolicy32);
        org.junit.Assert.assertNotNull(generatorStrategy34);
        org.junit.Assert.assertNotNull(generatorStrategy38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(classLoader43);
        org.junit.Assert.assertNotNull(generatorStrategy45);
        org.junit.Assert.assertNotNull(classLoader46);
        org.junit.Assert.assertNotNull(namingPolicy51);
        org.junit.Assert.assertNotNull(generatorStrategy57);
        org.junit.Assert.assertNotNull(classLoader58);
        org.junit.Assert.assertNotNull(generatorStrategy67);
        org.junit.Assert.assertNotNull(classLoader68);
        org.junit.Assert.assertNotNull(generatorStrategy71);
        org.junit.Assert.assertNotNull(generatorStrategy73);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        enhancer0.setAttemptLoad(true);
        enhancer0.setUseFactory(false);
        boolean boolean13 = enhancer0.getAttemptLoad();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader23 = enhancer0.getClassLoader();
        java.lang.Class<?> wildcardClass24 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class26 = null;
        enhancer25.setSuperclass(class26);
        enhancer25.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback30 = null;
        enhancer25.setCallback(callback30);
        enhancer25.setUseFactory(false);
        java.lang.ClassLoader classLoader34 = enhancer25.getClassLoader();
        boolean boolean35 = enhancer25.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = enhancer36.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer38.getStrategy();
        enhancer38.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback42 = null;
        enhancer38.setCallback(callback42);
        enhancer38.setUseCache(false);
        boolean boolean46 = enhancer38.getUseCache();
        org.mockito.cglib.proxy.Callback callback47 = null;
        enhancer38.setCallback(callback47);
        java.lang.Class<?> wildcardClass49 = enhancer38.getClass();
        enhancer36.setSuperclass((java.lang.Class) wildcardClass49);
        java.lang.Class[] classArray51 = new java.lang.Class[] { wildcardClass49 };
        enhancer25.setInterfaces(classArray51);
        org.mockito.cglib.proxy.Callback callback53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass24, classArray51, callback53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader20);
        org.junit.Assert.assertNotNull(classLoader23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(classLoader34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(namingPolicy37);
        org.junit.Assert.assertNotNull(generatorStrategy39);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(classArray51);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = enhancer46.getStrategy();
        enhancer46.setSerialVersionUID((java.lang.Long) 0L);
        enhancer46.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = enhancer52.getStrategy();
        enhancer52.setSerialVersionUID((java.lang.Long) 0L);
        enhancer52.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy58 = enhancer52.getStrategy();
        enhancer46.setStrategy(generatorStrategy58);
        enhancer46.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy62 = enhancer46.getStrategy();
        enhancer0.setStrategy(generatorStrategy62);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = enhancer0.create();
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
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(generatorStrategy53);
        org.junit.Assert.assertNotNull(generatorStrategy58);
        org.junit.Assert.assertNotNull(generatorStrategy62);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        java.lang.Class<?> wildcardClass15 = enhancer0.getClass();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer0.setStrategy(generatorStrategy5);
        enhancer0.setUseFactory(true);
        java.lang.Class<?> wildcardClass9 = enhancer0.getClass();
        org.mockito.cglib.proxy.Callback callback10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass9, callback10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        boolean boolean25 = enhancer23.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = enhancer23.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy26);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = enhancer28.getStrategy();
        enhancer28.setSerialVersionUID((java.lang.Long) 0L);
        enhancer28.setUseFactory(false);
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
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer49.getStrategy();
        java.lang.Class<?> wildcardClass51 = enhancer49.getClass();
        java.lang.Class[] classArray52 = new java.lang.Class[] { wildcardClass36, wildcardClass39, wildcardClass42, wildcardClass45, wildcardClass48, wildcardClass51 };
        enhancer28.setInterfaces(classArray52);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertNotNull(generatorStrategy24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(namingPolicy26);
        org.junit.Assert.assertNotNull(generatorStrategy29);
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
        org.junit.Assert.assertNotNull(generatorStrategy50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray52);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        enhancer0.setAttemptLoad(false);
        enhancer0.setUseCache(true);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(generatorStrategy16);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        boolean boolean13 = enhancer0.getAttemptLoad();
        enhancer0.setAttemptLoad(false);
        enhancer0.setUseCache(false);
        boolean boolean18 = enhancer0.getUseCache();
        enhancer0.setUseFactory(false);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        boolean boolean45 = enhancer0.getUseCache();
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
        org.mockito.cglib.proxy.CallbackFilter callbackFilter62 = null;
        enhancer46.setCallbackFilter(callbackFilter62);
        boolean boolean64 = enhancer46.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer65 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy66 = enhancer65.getStrategy();
        enhancer65.setSerialVersionUID((java.lang.Long) 0L);
        enhancer65.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer71 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class72 = null;
        enhancer71.setSuperclass(class72);
        org.mockito.cglib.core.NamingPolicy namingPolicy74 = enhancer71.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer75 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy76 = enhancer75.getStrategy();
        enhancer71.setStrategy(generatorStrategy76);
        enhancer65.setStrategy(generatorStrategy76);
        boolean boolean79 = enhancer65.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy80 = null;
        enhancer65.setStrategy(generatorStrategy80);
        org.mockito.cglib.core.NamingPolicy namingPolicy82 = enhancer65.getNamingPolicy();
        enhancer46.setNamingPolicy(namingPolicy82);
        enhancer0.setNamingPolicy(namingPolicy82);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(namingPolicy49);
        org.junit.Assert.assertNotNull(generatorStrategy51);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(generatorStrategy66);
        org.junit.Assert.assertNotNull(namingPolicy74);
        org.junit.Assert.assertNotNull(generatorStrategy76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(namingPolicy82);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        java.lang.Class<?> wildcardClass16 = enhancer14.getClass();
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass16);
        enhancer0.setAttemptLoad(false);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Callback callback2 = null;
        enhancer0.setCallback(callback2);
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class5 = null;
        enhancer4.setSuperclass(class5);
        enhancer4.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback9 = null;
        enhancer4.setCallback(callback9);
        enhancer4.setUseFactory(false);
        java.lang.ClassLoader classLoader13 = enhancer4.getClassLoader();
        enhancer0.setClassLoader(classLoader13);
        boolean boolean15 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer16.getStrategy();
        enhancer16.setSerialVersionUID((java.lang.Long) 0L);
        enhancer16.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class23 = null;
        enhancer22.setSuperclass(class23);
        org.mockito.cglib.core.NamingPolicy namingPolicy25 = enhancer22.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer26.getStrategy();
        enhancer22.setStrategy(generatorStrategy27);
        enhancer16.setStrategy(generatorStrategy27);
        enhancer0.setStrategy(generatorStrategy27);
        enhancer0.setUseFactory(true);
        boolean boolean33 = enhancer0.getUseCache();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(namingPolicy25);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback1 = null;
        enhancer0.setCallback(callback1);
        enhancer0.setUseCache(false);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer7.getStrategy();
        java.lang.ClassLoader classLoader9 = enhancer7.getClassLoader();
        enhancer0.setClassLoader(classLoader9);
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = enhancer0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer13.getStrategy();
        enhancer13.setSerialVersionUID((java.lang.Long) 0L);
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
        enhancer13.setCallbacks(callbackArray44);
        enhancer0.setCallbacks(callbackArray44);
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class49 = null;
        enhancer48.setSuperclass(class49);
        org.mockito.cglib.core.NamingPolicy namingPolicy51 = enhancer48.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = enhancer52.getStrategy();
        enhancer52.setSerialVersionUID((java.lang.Long) 0L);
        enhancer52.setUseFactory(false);
        java.lang.Class<?> wildcardClass58 = enhancer52.getClass();
        enhancer48.setSuperclass((java.lang.Class) wildcardClass58);
        org.mockito.cglib.proxy.Callback callback60 = null;
        enhancer48.setCallback(callback60);
        enhancer48.setUseCache(true);
        java.lang.ClassLoader classLoader64 = enhancer48.getClassLoader();
        org.mockito.cglib.proxy.Callback callback65 = null;
        enhancer48.setCallback(callback65);
        java.lang.ClassLoader classLoader67 = enhancer48.getClassLoader();
        enhancer48.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer70 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class71 = null;
        enhancer70.setSuperclass(class71);
        java.lang.Class<?> wildcardClass73 = enhancer70.getClass();
        enhancer48.setSuperclass((java.lang.Class) wildcardClass73);
        boolean boolean75 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass73);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy11);
        org.junit.Assert.assertNotNull(namingPolicy12);
        org.junit.Assert.assertNotNull(generatorStrategy14);
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
        org.junit.Assert.assertNotNull(namingPolicy51);
        org.junit.Assert.assertNotNull(generatorStrategy53);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(classLoader64);
        org.junit.Assert.assertNotNull(classLoader67);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        enhancer0.setAttemptLoad(false);
        boolean boolean69 = enhancer0.getUseCache();
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
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = enhancer3.getStrategy();
        java.lang.ClassLoader classLoader5 = enhancer3.getClassLoader();
        enhancer3.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer8.getStrategy();
        enhancer8.setSerialVersionUID((java.lang.Long) 0L);
        enhancer8.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        java.lang.Class<?> wildcardClass16 = enhancer14.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer17.getStrategy();
        java.lang.Class<?> wildcardClass19 = enhancer17.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer20.getStrategy();
        enhancer20.setSerialVersionUID((java.lang.Long) 0L);
        enhancer20.setUseFactory(false);
        java.lang.Class<?> wildcardClass26 = enhancer20.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        enhancer27.setSerialVersionUID((java.lang.Long) 0L);
        enhancer27.setUseFactory(false);
        java.lang.Class<?> wildcardClass33 = enhancer27.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class35 = null;
        enhancer34.setSuperclass(class35);
        java.lang.ClassLoader classLoader37 = enhancer34.getClassLoader();
        java.lang.Class<?> wildcardClass38 = enhancer34.getClass();
        java.lang.Class[] classArray39 = new java.lang.Class[] { wildcardClass16, wildcardClass19, wildcardClass26, wildcardClass33, wildcardClass38 };
        enhancer8.setInterfaces(classArray39);
        java.lang.Class<?> wildcardClass41 = enhancer8.getClass();
        enhancer3.setSuperclass((java.lang.Class) wildcardClass41);
        org.mockito.cglib.proxy.Enhancer enhancer43 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = enhancer43.getStrategy();
        enhancer43.setSerialVersionUID((java.lang.Long) 0L);
        enhancer43.setUseFactory(false);
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
        org.mockito.cglib.proxy.Enhancer enhancer64 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy65 = enhancer64.getStrategy();
        java.lang.Class<?> wildcardClass66 = enhancer64.getClass();
        java.lang.Class[] classArray67 = new java.lang.Class[] { wildcardClass51, wildcardClass54, wildcardClass57, wildcardClass60, wildcardClass63, wildcardClass66 };
        enhancer43.setInterfaces(classArray67);
        enhancer3.setInterfaces(classArray67);
        enhancer0.setInterfaces(classArray67);
        enhancer0.setUseFactory(true);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer75 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class76 = null;
        enhancer75.setSuperclass(class76);
        org.mockito.cglib.core.NamingPolicy namingPolicy78 = enhancer75.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer79 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy80 = enhancer79.getStrategy();
        enhancer79.setSerialVersionUID((java.lang.Long) 0L);
        enhancer79.setUseFactory(false);
        java.lang.Class<?> wildcardClass85 = enhancer79.getClass();
        enhancer75.setSuperclass((java.lang.Class) wildcardClass85);
        org.mockito.cglib.proxy.Callback callback87 = null;
        enhancer75.setCallback(callback87);
        org.mockito.cglib.proxy.Callback callback89 = null;
        enhancer75.setCallback(callback89);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy91 = enhancer75.getStrategy();
        enhancer0.setStrategy(generatorStrategy91);
        enhancer0.setUseFactory(false);
        org.mockito.asm.ClassVisitor classVisitor95 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy4);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(classLoader37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(generatorStrategy44);
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
        org.junit.Assert.assertNotNull(generatorStrategy65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(classArray67);
        org.junit.Assert.assertNotNull(namingPolicy78);
        org.junit.Assert.assertNotNull(generatorStrategy80);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(generatorStrategy91);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        java.lang.ClassLoader classLoader16 = enhancer14.getClassLoader();
        enhancer0.setClassLoader(classLoader16);
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Callback callback23 = null;
        enhancer0.setCallback(callback23);
        java.lang.ClassLoader classLoader25 = enhancer0.getClassLoader();
        java.lang.ClassLoader classLoader26 = enhancer0.getClassLoader();
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
        org.mockito.cglib.proxy.Callback callback41 = null;
        enhancer27.setCallback(callback41);
        java.lang.ClassLoader classLoader43 = enhancer27.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = enhancer44.getStrategy();
        enhancer44.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback48 = null;
        enhancer44.setCallback(callback48);
        enhancer44.setUseCache(false);
        boolean boolean52 = enhancer44.getUseCache();
        enhancer44.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = enhancer55.getStrategy();
        java.lang.ClassLoader classLoader57 = enhancer55.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter58 = null;
        enhancer55.setCallbackFilter(callbackFilter58);
        org.mockito.cglib.core.NamingPolicy namingPolicy60 = enhancer55.getNamingPolicy();
        enhancer44.setNamingPolicy(namingPolicy60);
        java.lang.Class<?> wildcardClass62 = enhancer44.getClass();
        enhancer27.setSuperclass((java.lang.Class) wildcardClass62);
        org.mockito.cglib.proxy.Callback callback64 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray65 = new org.mockito.cglib.proxy.Callback[] { callback64 };
        enhancer27.setCallbacks(callbackArray65);
        enhancer0.setCallbacks(callbackArray65);
        enhancer0.setUseFactory(true);
        java.lang.Class[] classArray70 = null;
        enhancer0.setInterfaces(classArray70);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(namingPolicy22);
        org.junit.Assert.assertNotNull(classLoader25);
        org.junit.Assert.assertNotNull(classLoader26);
        org.junit.Assert.assertNotNull(namingPolicy30);
        org.junit.Assert.assertNotNull(generatorStrategy32);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(classLoader43);
        org.junit.Assert.assertNotNull(generatorStrategy45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(generatorStrategy56);
        org.junit.Assert.assertNotNull(classLoader57);
        org.junit.Assert.assertNotNull(namingPolicy60);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(callbackArray65);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class22 = null;
        enhancer21.setSuperclass(class22);
        enhancer21.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback26 = null;
        enhancer21.setCallback(callback26);
        enhancer21.setUseFactory(false);
        java.lang.ClassLoader classLoader30 = enhancer21.getClassLoader();
        org.mockito.cglib.proxy.Callback callback31 = null;
        enhancer21.setCallback(callback31);
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer21.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy33);
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
        org.mockito.cglib.proxy.Callback callback61 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray62 = new org.mockito.cglib.proxy.Callback[] { callback61 };
        enhancer35.setCallbacks(callbackArray62);
        java.lang.ClassLoader classLoader64 = enhancer35.getClassLoader();
        enhancer0.setClassLoader(classLoader64);
        org.mockito.cglib.proxy.Callback callback66 = null;
        enhancer0.setCallback(callback66);
        enhancer0.setInterceptDuringConstruction(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class70 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: createClass does not accept callbacks");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(classLoader12);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(classLoader30);
        org.junit.Assert.assertNotNull(namingPolicy33);
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
        org.junit.Assert.assertNotNull(callbackArray62);
        org.junit.Assert.assertNotNull(classLoader64);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = enhancer0.getNamingPolicy();
        java.lang.ClassLoader classLoader27 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer0.getStrategy();
        enhancer0.setUseCache(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class31 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(namingPolicy26);
        org.junit.Assert.assertNotNull(classLoader27);
        org.junit.Assert.assertNotNull(generatorStrategy28);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = enhancer0.getNamingPolicy();
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer18.getStrategy();
        enhancer18.setSerialVersionUID((java.lang.Long) 0L);
        enhancer18.setUseFactory(false);
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
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = enhancer39.getStrategy();
        java.lang.Class<?> wildcardClass41 = enhancer39.getClass();
        java.lang.Class[] classArray42 = new java.lang.Class[] { wildcardClass26, wildcardClass29, wildcardClass32, wildcardClass35, wildcardClass38, wildcardClass41 };
        enhancer18.setInterfaces(classArray42);
        org.mockito.cglib.core.NamingPolicy namingPolicy44 = enhancer18.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = enhancer18.getNamingPolicy();
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
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy62 = enhancer46.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer63 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class64 = null;
        enhancer63.setSuperclass(class64);
        org.mockito.cglib.core.NamingPolicy namingPolicy66 = enhancer63.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer67 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy68 = enhancer67.getStrategy();
        enhancer67.setSerialVersionUID((java.lang.Long) 0L);
        enhancer67.setUseFactory(false);
        java.lang.Class<?> wildcardClass73 = enhancer67.getClass();
        enhancer63.setSuperclass((java.lang.Class) wildcardClass73);
        org.mockito.cglib.proxy.Callback callback75 = null;
        enhancer63.setCallback(callback75);
        org.mockito.cglib.proxy.Callback callback77 = null;
        enhancer63.setCallback(callback77);
        java.lang.ClassLoader classLoader79 = enhancer63.getClassLoader();
        enhancer46.setClassLoader(classLoader79);
        enhancer18.setClassLoader(classLoader79);
        java.lang.Class<?> wildcardClass82 = classLoader79.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass82);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(namingPolicy15);
        org.junit.Assert.assertNotNull(generatorStrategy19);
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
        org.junit.Assert.assertNotNull(generatorStrategy40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(namingPolicy44);
        org.junit.Assert.assertNotNull(namingPolicy45);
        org.junit.Assert.assertNotNull(namingPolicy49);
        org.junit.Assert.assertNotNull(generatorStrategy51);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(generatorStrategy62);
        org.junit.Assert.assertNotNull(namingPolicy66);
        org.junit.Assert.assertNotNull(generatorStrategy68);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(classLoader79);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer0.getStrategy();
        enhancer0.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(generatorStrategy22);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setUseCache(false);
        boolean boolean5 = enhancer0.getUseCache();
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
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = enhancer6.getNamingPolicy();
        java.lang.ClassLoader classLoader33 = enhancer6.getClassLoader();
        java.lang.Class<?> wildcardClass34 = classLoader33.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass34);
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setUseFactory(false);
        enhancer0.setAttemptLoad(false);
        enhancer0.setUseFactory(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
        org.junit.Assert.assertNotNull(namingPolicy32);
        org.junit.Assert.assertNotNull(classLoader33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer35.getStrategy();
        java.lang.Class<?> wildcardClass37 = enhancer35.getClass();
        boolean boolean38 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass37);
        boolean boolean39 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass37);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass37);
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
        org.junit.Assert.assertNotNull(generatorStrategy36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class22 = null;
        enhancer21.setSuperclass(class22);
        enhancer21.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback26 = null;
        enhancer21.setCallback(callback26);
        enhancer21.setUseFactory(false);
        java.lang.ClassLoader classLoader30 = enhancer21.getClassLoader();
        org.mockito.cglib.proxy.Callback callback31 = null;
        enhancer21.setCallback(callback31);
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer21.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class35 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(classLoader12);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(classLoader30);
        org.junit.Assert.assertNotNull(namingPolicy33);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer30.getStrategy();
        enhancer30.setSerialVersionUID((java.lang.Long) 0L);
        enhancer30.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer36.getStrategy();
        java.lang.Class<?> wildcardClass38 = enhancer36.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = enhancer39.getStrategy();
        java.lang.Class<?> wildcardClass41 = enhancer39.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = enhancer42.getStrategy();
        enhancer42.setSerialVersionUID((java.lang.Long) 0L);
        enhancer42.setUseFactory(false);
        java.lang.Class<?> wildcardClass48 = enhancer42.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer49.getStrategy();
        enhancer49.setSerialVersionUID((java.lang.Long) 0L);
        enhancer49.setUseFactory(false);
        java.lang.Class<?> wildcardClass55 = enhancer49.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class57 = null;
        enhancer56.setSuperclass(class57);
        java.lang.ClassLoader classLoader59 = enhancer56.getClassLoader();
        java.lang.Class<?> wildcardClass60 = enhancer56.getClass();
        java.lang.Class[] classArray61 = new java.lang.Class[] { wildcardClass38, wildcardClass41, wildcardClass48, wildcardClass55, wildcardClass60 };
        enhancer30.setInterfaces(classArray61);
        java.lang.Class<?> wildcardClass63 = enhancer30.getClass();
        boolean boolean64 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass63);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(namingPolicy15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(generatorStrategy31);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(generatorStrategy40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(generatorStrategy43);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(generatorStrategy50);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(classLoader59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        org.mockito.cglib.proxy.Callback callback21 = null;
        enhancer0.setCallback(callback21);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(generatorStrategy16);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer7.getStrategy();
        enhancer7.setSerialVersionUID((java.lang.Long) 0L);
        enhancer7.setUseFactory(false);
        enhancer7.setAttemptLoad(false);
        org.mockito.cglib.proxy.Callback callback15 = null;
        enhancer7.setCallback(callback15);
        boolean boolean17 = enhancer7.getAttemptLoad();
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
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer36.getStrategy();
        java.lang.ClassLoader classLoader38 = enhancer36.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter39 = null;
        enhancer36.setCallbackFilter(callbackFilter39);
        enhancer36.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer43 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = enhancer43.getStrategy();
        enhancer43.setSerialVersionUID((java.lang.Long) 0L);
        enhancer43.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer49.getStrategy();
        java.lang.Class<?> wildcardClass51 = enhancer49.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = enhancer52.getStrategy();
        java.lang.Class<?> wildcardClass54 = enhancer52.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = enhancer55.getStrategy();
        enhancer55.setSerialVersionUID((java.lang.Long) 0L);
        enhancer55.setUseFactory(false);
        java.lang.Class<?> wildcardClass61 = enhancer55.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer62 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy63 = enhancer62.getStrategy();
        enhancer62.setSerialVersionUID((java.lang.Long) 0L);
        enhancer62.setUseFactory(false);
        java.lang.Class<?> wildcardClass68 = enhancer62.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer69 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class70 = null;
        enhancer69.setSuperclass(class70);
        java.lang.ClassLoader classLoader72 = enhancer69.getClassLoader();
        java.lang.Class<?> wildcardClass73 = enhancer69.getClass();
        java.lang.Class[] classArray74 = new java.lang.Class[] { wildcardClass51, wildcardClass54, wildcardClass61, wildcardClass68, wildcardClass73 };
        enhancer43.setInterfaces(classArray74);
        enhancer36.setInterfaces(classArray74);
        enhancer18.setInterfaces(classArray74);
        boolean boolean78 = enhancer18.getAttemptLoad();
        java.lang.Class[] classArray79 = null;
        enhancer18.setInterfaces(classArray79);
        org.mockito.cglib.core.NamingPolicy namingPolicy81 = enhancer18.getNamingPolicy();
        enhancer7.setNamingPolicy(namingPolicy81);
        enhancer0.setNamingPolicy(namingPolicy81);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(namingPolicy21);
        org.junit.Assert.assertNotNull(generatorStrategy23);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(classLoader34);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(classLoader38);
        org.junit.Assert.assertNotNull(generatorStrategy44);
        org.junit.Assert.assertNotNull(generatorStrategy50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(generatorStrategy53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(generatorStrategy56);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(generatorStrategy63);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(classLoader72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(classArray74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(namingPolicy81);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer0.setStrategy(generatorStrategy5);
        boolean boolean7 = enhancer0.getUseCache();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        boolean boolean15 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class17 = null;
        enhancer16.setSuperclass(class17);
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = enhancer16.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer20.getStrategy();
        enhancer16.setStrategy(generatorStrategy21);
        enhancer16.setUseFactory(true);
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
        enhancer16.setSuperclass((java.lang.Class) wildcardClass35);
        boolean boolean38 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass35);
        boolean boolean39 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass35);
        boolean boolean40 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass35);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass35);
        boolean boolean42 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass35);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(namingPolicy19);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(namingPolicy28);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback1 = null;
        enhancer0.setCallback(callback1);
        enhancer0.setUseCache(false);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer7.getStrategy();
        java.lang.ClassLoader classLoader9 = enhancer7.getClassLoader();
        enhancer0.setClassLoader(classLoader9);
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = enhancer0.getNamingPolicy();
        boolean boolean12 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback14 = null;
        enhancer13.setCallback(callback14);
        enhancer13.setUseCache(false);
        enhancer13.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer20.getStrategy();
        java.lang.ClassLoader classLoader22 = enhancer20.getClassLoader();
        enhancer13.setClassLoader(classLoader22);
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = enhancer13.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy24);
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = enhancer0.getNamingPolicy();
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(classLoader22);
        org.junit.Assert.assertNotNull(namingPolicy24);
        org.junit.Assert.assertNotNull(namingPolicy26);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = enhancer0.getNamingPolicy();
        boolean boolean17 = enhancer0.getAttemptLoad();
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(namingPolicy16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        boolean boolean18 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Callback callback19 = null;
        enhancer0.setCallback(callback19);
        java.lang.ClassLoader classLoader21 = enhancer0.getClassLoader();
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Callback callback24 = null;
        enhancer0.setCallback(callback24);
        boolean boolean26 = enhancer0.getAttemptLoad();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback1 = null;
        enhancer0.setCallback(callback1);
        boolean boolean3 = enhancer0.getAttemptLoad();
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
        org.mockito.cglib.proxy.Callback callback18 = null;
        enhancer6.setCallback(callback18);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer20.getStrategy();
        java.lang.ClassLoader classLoader22 = enhancer20.getClassLoader();
        enhancer6.setClassLoader(classLoader22);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        enhancer24.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback28 = null;
        enhancer24.setCallback(callback28);
        enhancer24.setUseCache(false);
        boolean boolean32 = enhancer24.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class34 = null;
        enhancer33.setSuperclass(class34);
        enhancer33.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback38 = null;
        enhancer33.setCallback(callback38);
        java.lang.Class<?> wildcardClass40 = enhancer33.getClass();
        enhancer24.setSuperclass((java.lang.Class) wildcardClass40);
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class43 = null;
        enhancer42.setSuperclass(class43);
        java.lang.ClassLoader classLoader45 = enhancer42.getClassLoader();
        enhancer24.setClassLoader(classLoader45);
        enhancer6.setClassLoader(classLoader45);
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class49 = null;
        enhancer48.setSuperclass(class49);
        java.lang.Class<?> wildcardClass51 = enhancer48.getClass();
        enhancer6.setSuperclass((java.lang.Class) wildcardClass51);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(classLoader22);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(classLoader45);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer20.getStrategy();
        enhancer20.setSerialVersionUID((java.lang.Long) 0L);
        enhancer20.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer26.getStrategy();
        java.lang.Class<?> wildcardClass28 = enhancer26.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer29.getStrategy();
        java.lang.Class<?> wildcardClass31 = enhancer29.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer32.getStrategy();
        enhancer32.setSerialVersionUID((java.lang.Long) 0L);
        enhancer32.setUseFactory(false);
        java.lang.Class<?> wildcardClass38 = enhancer32.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = enhancer39.getStrategy();
        enhancer39.setSerialVersionUID((java.lang.Long) 0L);
        enhancer39.setUseFactory(false);
        java.lang.Class<?> wildcardClass45 = enhancer39.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class47 = null;
        enhancer46.setSuperclass(class47);
        java.lang.ClassLoader classLoader49 = enhancer46.getClassLoader();
        java.lang.Class<?> wildcardClass50 = enhancer46.getClass();
        java.lang.Class[] classArray51 = new java.lang.Class[] { wildcardClass28, wildcardClass31, wildcardClass38, wildcardClass45, wildcardClass50 };
        enhancer20.setInterfaces(classArray51);
        enhancer0.setInterfaces(classArray51);
        org.mockito.cglib.proxy.Enhancer enhancer54 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class55 = null;
        enhancer54.setSuperclass(class55);
        enhancer54.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback59 = null;
        enhancer54.setCallback(callback59);
        enhancer54.setUseFactory(false);
        java.lang.ClassLoader classLoader63 = enhancer54.getClassLoader();
        org.mockito.cglib.proxy.Callback callback64 = null;
        enhancer54.setCallback(callback64);
        boolean boolean66 = enhancer54.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy67 = enhancer54.getStrategy();
        enhancer0.setStrategy(generatorStrategy67);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(classLoader12);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(namingPolicy19);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(generatorStrategy40);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(classLoader49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertNotNull(classLoader63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(generatorStrategy67);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        enhancer27.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback31 = null;
        enhancer27.setCallback(callback31);
        java.lang.Class<?> wildcardClass33 = enhancer27.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass33);
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class39 = null;
        enhancer38.setSuperclass(class39);
        org.mockito.cglib.core.NamingPolicy namingPolicy41 = enhancer38.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy41);
        enhancer0.setAttemptLoad(false);
        enhancer0.setAttemptLoad(false);
        enhancer0.setInterceptDuringConstruction(true);
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
        org.junit.Assert.assertNotNull(namingPolicy26);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(namingPolicy41);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class5 = null;
        enhancer4.setSuperclass(class5);
        java.lang.ClassLoader classLoader7 = enhancer4.getClassLoader();
        enhancer0.setClassLoader(classLoader7);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter9 = null;
        enhancer0.setCallbackFilter(callbackFilter9);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter11 = null;
        enhancer0.setCallbackFilter(callbackFilter11);
        java.lang.ClassLoader classLoader13 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter14 = null;
        enhancer0.setCallbackFilter(callbackFilter14);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = enhancer0.getNamingPolicy();
        java.lang.Class<?> wildcardClass17 = namingPolicy16.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer18.getStrategy();
        java.lang.ClassLoader classLoader20 = enhancer18.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter21 = null;
        enhancer18.setCallbackFilter(callbackFilter21);
        enhancer18.setInterceptDuringConstruction(true);
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
        enhancer18.setInterfaces(classArray56);
        java.util.List list59 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass17, classArray56, list59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertNotNull(namingPolicy16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertNotNull(classLoader20);
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
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        enhancer27.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback31 = null;
        enhancer27.setCallback(callback31);
        java.lang.Class<?> wildcardClass33 = enhancer27.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass33);
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback38 = null;
        enhancer37.setCallback(callback38);
        enhancer37.setUseCache(false);
        enhancer37.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = enhancer44.getStrategy();
        java.lang.ClassLoader classLoader46 = enhancer44.getClassLoader();
        enhancer37.setClassLoader(classLoader46);
        org.mockito.cglib.core.NamingPolicy namingPolicy48 = enhancer37.getNamingPolicy();
        boolean boolean49 = enhancer37.getAttemptLoad();
        java.lang.Class<?> wildcardClass50 = enhancer37.getClass();
        boolean boolean51 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass50);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass50);
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter55 = null;
        enhancer0.setCallbackFilter(callbackFilter55);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(namingPolicy26);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(generatorStrategy45);
        org.junit.Assert.assertNotNull(classLoader46);
        org.junit.Assert.assertNotNull(namingPolicy48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        boolean boolean4 = enhancer0.getAttemptLoad();
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
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
        enhancer7.setUseCache(true);
        java.lang.ClassLoader classLoader23 = enhancer7.getClassLoader();
        org.mockito.cglib.proxy.Callback callback24 = null;
        enhancer7.setCallback(callback24);
        java.lang.ClassLoader classLoader26 = enhancer7.getClassLoader();
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
        org.mockito.cglib.proxy.Callback callback41 = null;
        enhancer27.setCallback(callback41);
        java.lang.ClassLoader classLoader43 = enhancer27.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = enhancer44.getStrategy();
        enhancer44.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback48 = null;
        enhancer44.setCallback(callback48);
        enhancer44.setUseCache(false);
        boolean boolean52 = enhancer44.getUseCache();
        enhancer44.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = enhancer55.getStrategy();
        java.lang.ClassLoader classLoader57 = enhancer55.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter58 = null;
        enhancer55.setCallbackFilter(callbackFilter58);
        org.mockito.cglib.core.NamingPolicy namingPolicy60 = enhancer55.getNamingPolicy();
        enhancer44.setNamingPolicy(namingPolicy60);
        java.lang.Class<?> wildcardClass62 = enhancer44.getClass();
        enhancer27.setSuperclass((java.lang.Class) wildcardClass62);
        org.mockito.cglib.proxy.Callback callback64 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray65 = new org.mockito.cglib.proxy.Callback[] { callback64 };
        enhancer27.setCallbacks(callbackArray65);
        enhancer7.setCallbacks(callbackArray65);
        enhancer0.setCallbacks(callbackArray65);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter69 = null;
        enhancer0.setCallbackFilter(callbackFilter69);
        enhancer0.setUseFactory(true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classLoader23);
        org.junit.Assert.assertNotNull(classLoader26);
        org.junit.Assert.assertNotNull(namingPolicy30);
        org.junit.Assert.assertNotNull(generatorStrategy32);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(classLoader43);
        org.junit.Assert.assertNotNull(generatorStrategy45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(generatorStrategy56);
        org.junit.Assert.assertNotNull(classLoader57);
        org.junit.Assert.assertNotNull(namingPolicy60);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(callbackArray65);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback1 = null;
        enhancer0.setCallback(callback1);
        enhancer0.setUseCache(false);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer7.getStrategy();
        java.lang.ClassLoader classLoader9 = enhancer7.getClassLoader();
        enhancer0.setClassLoader(classLoader9);
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = enhancer0.getNamingPolicy();
        boolean boolean12 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback14 = null;
        enhancer13.setCallback(callback14);
        enhancer13.setUseCache(false);
        enhancer13.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer20.getStrategy();
        java.lang.ClassLoader classLoader22 = enhancer20.getClassLoader();
        enhancer13.setClassLoader(classLoader22);
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = enhancer13.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy24);
        org.mockito.asm.ClassVisitor classVisitor26 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(classLoader22);
        org.junit.Assert.assertNotNull(namingPolicy24);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        enhancer0.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = enhancer23.getStrategy();
        java.lang.ClassLoader classLoader25 = enhancer23.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter26 = null;
        enhancer23.setCallbackFilter(callbackFilter26);
        enhancer23.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter30 = null;
        enhancer23.setCallbackFilter(callbackFilter30);
        boolean boolean32 = enhancer23.getAttemptLoad();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter33 = null;
        enhancer23.setCallbackFilter(callbackFilter33);
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = enhancer23.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy35);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader20);
        org.junit.Assert.assertNotNull(generatorStrategy24);
        org.junit.Assert.assertNotNull(classLoader25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(namingPolicy35);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Callback callback2 = null;
        enhancer0.setCallback(callback2);
        enhancer0.setAttemptLoad(true);
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = enhancer0.getNamingPolicy();
        java.lang.ClassLoader classLoader9 = enhancer0.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class10 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: createClass does not accept callbacks");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy8);
        org.junit.Assert.assertNotNull(classLoader9);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        org.mockito.cglib.proxy.Callback callback46 = null;
        enhancer0.setCallback(callback46);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
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
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer36.getStrategy();
        enhancer36.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback40 = null;
        enhancer36.setCallback(callback40);
        java.lang.ClassLoader classLoader42 = enhancer36.getClassLoader();
        enhancer0.setClassLoader(classLoader42);
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
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(classLoader42);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = enhancer0.getNamingPolicy();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class39 = null;
        enhancer38.setSuperclass(class39);
        org.mockito.cglib.core.NamingPolicy namingPolicy41 = enhancer38.getNamingPolicy();
        boolean boolean42 = enhancer38.getAttemptLoad();
        enhancer38.setUseFactory(true);
        java.lang.ClassLoader classLoader45 = enhancer38.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback47 = null;
        enhancer46.setCallback(callback47);
        enhancer46.setUseCache(false);
        enhancer46.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = enhancer53.getStrategy();
        java.lang.ClassLoader classLoader55 = enhancer53.getClassLoader();
        enhancer46.setClassLoader(classLoader55);
        org.mockito.cglib.core.NamingPolicy namingPolicy57 = enhancer46.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy58 = enhancer46.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer59 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy60 = enhancer59.getStrategy();
        enhancer59.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer63 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy64 = enhancer63.getStrategy();
        enhancer63.setSerialVersionUID((java.lang.Long) 0L);
        enhancer63.setUseFactory(false);
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
        org.mockito.cglib.proxy.Enhancer enhancer84 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy85 = enhancer84.getStrategy();
        java.lang.Class<?> wildcardClass86 = enhancer84.getClass();
        java.lang.Class[] classArray87 = new java.lang.Class[] { wildcardClass71, wildcardClass74, wildcardClass77, wildcardClass80, wildcardClass83, wildcardClass86 };
        enhancer63.setInterfaces(classArray87);
        org.mockito.cglib.proxy.Callback callback89 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray90 = new org.mockito.cglib.proxy.Callback[] { callback89 };
        enhancer63.setCallbacks(callbackArray90);
        enhancer59.setCallbacks(callbackArray90);
        enhancer46.setCallbacks(callbackArray90);
        enhancer38.setCallbacks(callbackArray90);
        enhancer0.setCallbacks(callbackArray90);
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
        org.junit.Assert.assertNotNull(namingPolicy35);
        org.junit.Assert.assertNotNull(namingPolicy41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(classLoader45);
        org.junit.Assert.assertNotNull(generatorStrategy54);
        org.junit.Assert.assertNotNull(classLoader55);
        org.junit.Assert.assertNotNull(namingPolicy57);
        org.junit.Assert.assertNotNull(namingPolicy58);
        org.junit.Assert.assertNotNull(generatorStrategy60);
        org.junit.Assert.assertNotNull(generatorStrategy64);
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
        org.junit.Assert.assertNotNull(generatorStrategy85);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(classArray87);
        org.junit.Assert.assertNotNull(callbackArray90);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        boolean boolean2 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = enhancer3.getStrategy();
        enhancer3.setSerialVersionUID((java.lang.Long) 0L);
        enhancer3.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer9.getStrategy();
        enhancer9.setSerialVersionUID((java.lang.Long) 0L);
        enhancer9.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer9.getStrategy();
        enhancer3.setStrategy(generatorStrategy15);
        enhancer3.setUseCache(false);
        boolean boolean19 = enhancer3.getUseCache();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter20 = null;
        enhancer3.setCallbackFilter(callbackFilter20);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class23 = null;
        enhancer22.setSuperclass(class23);
        java.lang.ClassLoader classLoader25 = enhancer22.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class27 = null;
        enhancer26.setSuperclass(class27);
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = enhancer26.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer30.getStrategy();
        enhancer26.setStrategy(generatorStrategy31);
        enhancer22.setStrategy(generatorStrategy31);
        java.lang.Class<?> wildcardClass34 = enhancer22.getClass();
        boolean boolean35 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass34);
        enhancer3.setSuperclass((java.lang.Class) wildcardClass34);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass34);
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class39 = null;
        enhancer38.setSuperclass(class39);
        enhancer38.setUseCache(false);
        boolean boolean43 = enhancer38.getUseCache();
        enhancer38.setUseCache(true);
        java.lang.ClassLoader classLoader46 = enhancer38.getClassLoader();
        enhancer0.setClassLoader(classLoader46);
        java.lang.ClassLoader classLoader48 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = enhancer0.getStrategy();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(generatorStrategy4);
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(classLoader25);
        org.junit.Assert.assertNotNull(namingPolicy29);
        org.junit.Assert.assertNotNull(generatorStrategy31);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(classLoader46);
        org.junit.Assert.assertNotNull(classLoader48);
        org.junit.Assert.assertNotNull(generatorStrategy49);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        java.lang.ClassLoader classLoader16 = enhancer14.getClassLoader();
        enhancer0.setClassLoader(classLoader16);
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Callback callback23 = null;
        enhancer0.setCallback(callback23);
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        java.lang.ClassLoader classLoader27 = enhancer0.getClassLoader();
        java.lang.Class<?> wildcardClass28 = enhancer0.getClass();
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(namingPolicy22);
        org.junit.Assert.assertNotNull(classLoader27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseFactory(false);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter26 = null;
        enhancer0.setCallbackFilter(callbackFilter26);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(generatorStrategy21);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        org.mockito.cglib.proxy.Callback callback20 = null;
        enhancer0.setCallback(callback20);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter22 = null;
        enhancer0.setCallbackFilter(callbackFilter22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(classLoader19);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        boolean boolean18 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Callback callback19 = null;
        enhancer0.setCallback(callback19);
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Callback callback23 = null;
        enhancer0.setCallback(callback23);
        java.lang.ClassLoader classLoader25 = enhancer0.getClassLoader();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(classLoader25);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback1 = null;
        enhancer0.setCallback(callback1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter4 = null;
        enhancer0.setCallbackFilter(callbackFilter4);
        enhancer0.setUseFactory(false);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        boolean boolean33 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = enhancer0.getNamingPolicy();
        java.lang.ClassLoader classLoader35 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class37 = null;
        enhancer36.setSuperclass(class37);
        org.mockito.cglib.core.NamingPolicy namingPolicy39 = enhancer36.getNamingPolicy();
        enhancer36.setUseCache(false);
        enhancer36.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = enhancer36.getStrategy();
        java.lang.Class<?> wildcardClass45 = generatorStrategy44.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass45);
        java.lang.ClassLoader classLoader47 = enhancer0.getClassLoader();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(namingPolicy34);
        org.junit.Assert.assertNotNull(classLoader35);
        org.junit.Assert.assertNotNull(namingPolicy39);
        org.junit.Assert.assertNotNull(generatorStrategy44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(classLoader47);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        boolean boolean18 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Callback callback19 = null;
        enhancer0.setCallback(callback19);
        enhancer0.setAttemptLoad(true);
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setUseCache(false);
        boolean boolean5 = enhancer0.getUseCache();
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
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = enhancer6.getNamingPolicy();
        java.lang.ClassLoader classLoader33 = enhancer6.getClassLoader();
        java.lang.Class<?> wildcardClass34 = classLoader33.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass34);
        enhancer0.setInterceptDuringConstruction(true);
        enhancer0.setUseFactory(false);
        enhancer0.setUseCache(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
        org.junit.Assert.assertNotNull(namingPolicy32);
        org.junit.Assert.assertNotNull(classLoader33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer38.getStrategy();
        enhancer38.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy42 = enhancer38.getNamingPolicy();
        enhancer38.setSerialVersionUID((java.lang.Long) 10L);
        enhancer38.setUseFactory(false);
        enhancer38.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class50 = null;
        enhancer49.setSuperclass(class50);
        org.mockito.cglib.core.NamingPolicy namingPolicy52 = enhancer49.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = enhancer53.getStrategy();
        enhancer53.setSerialVersionUID((java.lang.Long) 0L);
        enhancer53.setUseFactory(false);
        java.lang.Class<?> wildcardClass59 = enhancer53.getClass();
        enhancer49.setSuperclass((java.lang.Class) wildcardClass59);
        org.mockito.cglib.proxy.Callback callback61 = null;
        enhancer49.setCallback(callback61);
        enhancer49.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy65 = enhancer49.getNamingPolicy();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter66 = null;
        enhancer49.setCallbackFilter(callbackFilter66);
        enhancer49.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer70 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy71 = enhancer70.getStrategy();
        enhancer70.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback74 = null;
        enhancer70.setCallback(callback74);
        java.lang.Class<?> wildcardClass76 = enhancer70.getClass();
        enhancer49.setSuperclass((java.lang.Class) wildcardClass76);
        enhancer38.setSuperclass((java.lang.Class) wildcardClass76);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass76);
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
        org.junit.Assert.assertNotNull(generatorStrategy39);
        org.junit.Assert.assertNotNull(namingPolicy42);
        org.junit.Assert.assertNotNull(namingPolicy52);
        org.junit.Assert.assertNotNull(generatorStrategy54);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(namingPolicy65);
        org.junit.Assert.assertNotNull(generatorStrategy71);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer18.getStrategy();
        enhancer18.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer18.getStrategy();
        enhancer0.setStrategy(generatorStrategy22);
        enhancer0.setUseFactory(false);
        enhancer0.setAttemptLoad(false);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertNotNull(generatorStrategy22);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        enhancer0.setAttemptLoad(true);
        boolean boolean11 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer12.getStrategy();
        enhancer12.setSerialVersionUID((java.lang.Long) 0L);
        enhancer12.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer18.getStrategy();
        java.lang.Class<?> wildcardClass20 = enhancer18.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer21.getStrategy();
        java.lang.Class<?> wildcardClass23 = enhancer21.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        enhancer24.setSerialVersionUID((java.lang.Long) 0L);
        enhancer24.setUseFactory(false);
        java.lang.Class<?> wildcardClass30 = enhancer24.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = enhancer31.getStrategy();
        enhancer31.setSerialVersionUID((java.lang.Long) 0L);
        enhancer31.setUseFactory(false);
        java.lang.Class<?> wildcardClass37 = enhancer31.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class39 = null;
        enhancer38.setSuperclass(class39);
        java.lang.ClassLoader classLoader41 = enhancer38.getClassLoader();
        java.lang.Class<?> wildcardClass42 = enhancer38.getClass();
        java.lang.Class[] classArray43 = new java.lang.Class[] { wildcardClass20, wildcardClass23, wildcardClass30, wildcardClass37, wildcardClass42 };
        enhancer12.setInterfaces(classArray43);
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = enhancer12.getNamingPolicy();
        java.lang.Class[] classArray46 = null;
        enhancer12.setInterfaces(classArray46);
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = enhancer48.getStrategy();
        enhancer48.setSerialVersionUID((java.lang.Long) 0L);
        enhancer48.setUseFactory(false);
        java.lang.Class<?> wildcardClass54 = enhancer48.getClass();
        enhancer12.setSuperclass((java.lang.Class) wildcardClass54);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass54);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter57 = null;
        enhancer0.setCallbackFilter(callbackFilter57);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter59 = null;
        enhancer0.setCallbackFilter(callbackFilter59);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(generatorStrategy32);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(classLoader41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(namingPolicy45);
        org.junit.Assert.assertNotNull(generatorStrategy49);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        enhancer0.setAttemptLoad(false);
        boolean boolean15 = enhancer0.getUseCache();
        enhancer0.setSerialVersionUID((java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        boolean boolean2 = enhancer0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        boolean boolean4 = enhancer0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(generatorStrategy5);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy23 = enhancer22.getStrategy();
        enhancer22.setSerialVersionUID((java.lang.Long) 0L);
        enhancer22.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = enhancer28.getStrategy();
        enhancer28.setSerialVersionUID((java.lang.Long) 0L);
        enhancer28.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer28.getStrategy();
        enhancer22.setStrategy(generatorStrategy34);
        enhancer22.setUseCache(false);
        boolean boolean38 = enhancer22.getUseCache();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter39 = null;
        enhancer22.setCallbackFilter(callbackFilter39);
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class42 = null;
        enhancer41.setSuperclass(class42);
        java.lang.ClassLoader classLoader44 = enhancer41.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer45 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class46 = null;
        enhancer45.setSuperclass(class46);
        org.mockito.cglib.core.NamingPolicy namingPolicy48 = enhancer45.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer49.getStrategy();
        enhancer45.setStrategy(generatorStrategy50);
        enhancer41.setStrategy(generatorStrategy50);
        java.lang.Class<?> wildcardClass53 = enhancer41.getClass();
        boolean boolean54 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass53);
        enhancer22.setSuperclass((java.lang.Class) wildcardClass53);
        boolean boolean56 = enhancer22.getAttemptLoad();
        org.mockito.cglib.proxy.Callback callback57 = null;
        enhancer22.setCallback(callback57);
        java.lang.Class<?> wildcardClass59 = enhancer22.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass59);
        org.mockito.cglib.proxy.Enhancer enhancer61 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy62 = enhancer61.getStrategy();
        java.lang.ClassLoader classLoader63 = enhancer61.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter64 = null;
        enhancer61.setCallbackFilter(callbackFilter64);
        java.lang.ClassLoader classLoader66 = enhancer61.getClassLoader();
        enhancer0.setClassLoader(classLoader66);
        enhancer0.setAttemptLoad(true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(generatorStrategy23);
        org.junit.Assert.assertNotNull(generatorStrategy29);
        org.junit.Assert.assertNotNull(generatorStrategy34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(classLoader44);
        org.junit.Assert.assertNotNull(namingPolicy48);
        org.junit.Assert.assertNotNull(generatorStrategy50);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(generatorStrategy62);
        org.junit.Assert.assertNotNull(classLoader63);
        org.junit.Assert.assertNotNull(classLoader66);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        java.lang.ClassLoader classLoader16 = enhancer14.getClassLoader();
        enhancer0.setClassLoader(classLoader16);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer18.getStrategy();
        enhancer18.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback22 = null;
        enhancer18.setCallback(callback22);
        enhancer18.setUseCache(false);
        boolean boolean26 = enhancer18.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class28 = null;
        enhancer27.setSuperclass(class28);
        enhancer27.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback32 = null;
        enhancer27.setCallback(callback32);
        java.lang.Class<?> wildcardClass34 = enhancer27.getClass();
        enhancer18.setSuperclass((java.lang.Class) wildcardClass34);
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class37 = null;
        enhancer36.setSuperclass(class37);
        java.lang.ClassLoader classLoader39 = enhancer36.getClassLoader();
        enhancer18.setClassLoader(classLoader39);
        enhancer0.setClassLoader(classLoader39);
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class43 = null;
        enhancer42.setSuperclass(class43);
        java.lang.Class<?> wildcardClass45 = enhancer42.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass45);
        java.lang.Class class47 = null;
        enhancer0.setSuperclass(class47);
        org.mockito.cglib.proxy.Callback callback49 = null;
        enhancer0.setCallback(callback49);
        org.mockito.cglib.proxy.Enhancer enhancer51 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class52 = null;
        enhancer51.setSuperclass(class52);
        org.mockito.cglib.core.NamingPolicy namingPolicy54 = enhancer51.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = enhancer55.getStrategy();
        enhancer55.setSerialVersionUID((java.lang.Long) 0L);
        enhancer55.setUseFactory(false);
        java.lang.Class<?> wildcardClass61 = enhancer55.getClass();
        enhancer51.setSuperclass((java.lang.Class) wildcardClass61);
        org.mockito.cglib.proxy.Callback callback63 = null;
        enhancer51.setCallback(callback63);
        org.mockito.cglib.proxy.Callback callback65 = null;
        enhancer51.setCallback(callback65);
        java.lang.ClassLoader classLoader67 = enhancer51.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer68 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy69 = enhancer68.getNamingPolicy();
        enhancer51.setNamingPolicy(namingPolicy69);
        enhancer0.setNamingPolicy(namingPolicy69);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classLoader39);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(namingPolicy54);
        org.junit.Assert.assertNotNull(generatorStrategy56);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(classLoader67);
        org.junit.Assert.assertNotNull(namingPolicy69);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback4 = null;
        enhancer0.setCallback(callback4);
        enhancer0.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer8.getStrategy();
        enhancer8.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer8.getNamingPolicy();
        enhancer8.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer15.getStrategy();
        enhancer15.setSerialVersionUID((java.lang.Long) 0L);
        enhancer15.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer15.getStrategy();
        enhancer8.setStrategy(generatorStrategy21);
        enhancer0.setStrategy(generatorStrategy21);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class25 = null;
        enhancer24.setSuperclass(class25);
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = enhancer24.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = enhancer28.getStrategy();
        enhancer24.setStrategy(generatorStrategy29);
        enhancer24.setUseFactory(true);
        java.lang.Class<?> wildcardClass33 = enhancer24.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class35 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: createClass does not accept callbacks");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertNotNull(namingPolicy12);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(namingPolicy27);
        org.junit.Assert.assertNotNull(generatorStrategy29);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer16.getStrategy();
        enhancer16.setSerialVersionUID((java.lang.Long) 0L);
        enhancer16.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy23 = enhancer22.getStrategy();
        java.lang.Class<?> wildcardClass24 = enhancer22.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = enhancer25.getStrategy();
        java.lang.Class<?> wildcardClass27 = enhancer25.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = enhancer28.getStrategy();
        java.lang.Class<?> wildcardClass30 = enhancer28.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = enhancer31.getStrategy();
        java.lang.Class<?> wildcardClass33 = enhancer31.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = enhancer34.getStrategy();
        java.lang.Class<?> wildcardClass36 = enhancer34.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = enhancer37.getStrategy();
        java.lang.Class<?> wildcardClass39 = enhancer37.getClass();
        java.lang.Class[] classArray40 = new java.lang.Class[] { wildcardClass24, wildcardClass27, wildcardClass30, wildcardClass33, wildcardClass36, wildcardClass39 };
        enhancer16.setInterfaces(classArray40);
        org.mockito.cglib.core.NamingPolicy namingPolicy42 = enhancer16.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy42);
        java.lang.Class<?> wildcardClass44 = enhancer0.getClass();
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(generatorStrategy23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(generatorStrategy26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(generatorStrategy29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(generatorStrategy32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(generatorStrategy38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertNotNull(namingPolicy42);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        enhancer0.setAttemptLoad(true);
        boolean boolean9 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class11 = null;
        enhancer10.setSuperclass(class11);
        enhancer10.setSerialVersionUID((java.lang.Long) (-1L));
        java.lang.ClassLoader classLoader15 = enhancer10.getClassLoader();
        java.lang.Class class16 = null;
        enhancer10.setSuperclass(class16);
        enhancer10.setAttemptLoad(true);
        org.mockito.cglib.proxy.Callback callback20 = null;
        enhancer10.setCallback(callback20);
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
        org.mockito.cglib.proxy.Callback callback34 = null;
        enhancer22.setCallback(callback34);
        org.mockito.cglib.proxy.Callback callback36 = null;
        enhancer22.setCallback(callback36);
        java.lang.ClassLoader classLoader38 = enhancer22.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = enhancer39.getStrategy();
        enhancer39.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback43 = null;
        enhancer39.setCallback(callback43);
        enhancer39.setUseCache(false);
        boolean boolean47 = enhancer39.getUseCache();
        enhancer39.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = enhancer50.getStrategy();
        java.lang.ClassLoader classLoader52 = enhancer50.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter53 = null;
        enhancer50.setCallbackFilter(callbackFilter53);
        org.mockito.cglib.core.NamingPolicy namingPolicy55 = enhancer50.getNamingPolicy();
        enhancer39.setNamingPolicy(namingPolicy55);
        java.lang.Class<?> wildcardClass57 = enhancer39.getClass();
        enhancer22.setSuperclass((java.lang.Class) wildcardClass57);
        org.mockito.cglib.proxy.Callback callback59 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray60 = new org.mockito.cglib.proxy.Callback[] { callback59 };
        enhancer22.setCallbacks(callbackArray60);
        enhancer10.setCallbacks(callbackArray60);
        enhancer0.setCallbacks(callbackArray60);
        org.mockito.cglib.proxy.Enhancer enhancer64 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class65 = null;
        enhancer64.setSuperclass(class65);
        org.mockito.cglib.proxy.Callback callback67 = null;
        enhancer64.setCallback(callback67);
        boolean boolean69 = enhancer64.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer70 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy71 = enhancer70.getStrategy();
        enhancer70.setSerialVersionUID((java.lang.Long) 0L);
        enhancer70.setUseFactory(false);
        enhancer70.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer78 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy79 = enhancer78.getStrategy();
        java.lang.Class<?> wildcardClass80 = enhancer78.getClass();
        boolean boolean81 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass80);
        enhancer70.setSuperclass((java.lang.Class) wildcardClass80);
        enhancer64.setSuperclass((java.lang.Class) wildcardClass80);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNotNull(namingPolicy25);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(classLoader38);
        org.junit.Assert.assertNotNull(generatorStrategy40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(generatorStrategy51);
        org.junit.Assert.assertNotNull(classLoader52);
        org.junit.Assert.assertNotNull(namingPolicy55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(callbackArray60);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(generatorStrategy71);
        org.junit.Assert.assertNotNull(generatorStrategy79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        enhancer0.setInterceptDuringConstruction(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class22 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: createClass does not accept callbacks");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(classLoader19);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer0.getNamingPolicy();
        java.lang.Class[] classArray34 = null;
        enhancer0.setInterfaces(classArray34);
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer36.getStrategy();
        enhancer36.setSerialVersionUID((java.lang.Long) 0L);
        enhancer36.setUseFactory(false);
        java.lang.Class<?> wildcardClass42 = enhancer36.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass42);
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = enhancer44.getStrategy();
        enhancer44.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy48 = enhancer44.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy48);
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
        org.junit.Assert.assertNotNull(namingPolicy33);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(generatorStrategy45);
        org.junit.Assert.assertNotNull(namingPolicy48);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        java.lang.Class<?> wildcardClass16 = enhancer14.getClass();
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass16);
        enhancer0.setAttemptLoad(true);
        enhancer0.setAttemptLoad(false);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        enhancer0.setSerialVersionUID((java.lang.Long) 1L);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer15.getStrategy();
        java.lang.ClassLoader classLoader17 = enhancer15.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter18 = null;
        enhancer15.setCallbackFilter(callbackFilter18);
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = enhancer15.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy20);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(classLoader17);
        org.junit.Assert.assertNotNull(namingPolicy20);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = enhancer0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class29 = null;
        enhancer28.setSuperclass(class29);
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = enhancer28.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer32.getStrategy();
        enhancer32.setSerialVersionUID((java.lang.Long) 0L);
        enhancer32.setUseFactory(false);
        java.lang.Class<?> wildcardClass38 = enhancer32.getClass();
        enhancer28.setSuperclass((java.lang.Class) wildcardClass38);
        org.mockito.cglib.proxy.Callback callback40 = null;
        enhancer28.setCallback(callback40);
        org.mockito.cglib.proxy.Callback callback42 = null;
        enhancer28.setCallback(callback42);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = enhancer28.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer45 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class46 = null;
        enhancer45.setSuperclass(class46);
        org.mockito.cglib.core.NamingPolicy namingPolicy48 = enhancer45.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer49.getStrategy();
        enhancer49.setSerialVersionUID((java.lang.Long) 0L);
        enhancer49.setUseFactory(false);
        java.lang.Class<?> wildcardClass55 = enhancer49.getClass();
        enhancer45.setSuperclass((java.lang.Class) wildcardClass55);
        org.mockito.cglib.proxy.Callback callback57 = null;
        enhancer45.setCallback(callback57);
        org.mockito.cglib.proxy.Callback callback59 = null;
        enhancer45.setCallback(callback59);
        java.lang.ClassLoader classLoader61 = enhancer45.getClassLoader();
        enhancer28.setClassLoader(classLoader61);
        enhancer0.setClassLoader(classLoader61);
        org.mockito.cglib.core.NamingPolicy namingPolicy64 = null;
        enhancer0.setNamingPolicy(namingPolicy64);
        enhancer0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy68 = enhancer0.getNamingPolicy();
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
        org.junit.Assert.assertNotNull(namingPolicy26);
        org.junit.Assert.assertNotNull(namingPolicy27);
        org.junit.Assert.assertNotNull(namingPolicy31);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(generatorStrategy44);
        org.junit.Assert.assertNotNull(namingPolicy48);
        org.junit.Assert.assertNotNull(generatorStrategy50);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(classLoader61);
        org.junit.Assert.assertNotNull(namingPolicy68);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer19.getStrategy();
        java.lang.ClassLoader classLoader21 = enhancer19.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter22 = null;
        enhancer19.setCallbackFilter(callbackFilter22);
        enhancer19.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class27 = null;
        enhancer26.setSuperclass(class27);
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer29.getStrategy();
        java.lang.ClassLoader classLoader31 = enhancer29.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter32 = null;
        enhancer29.setCallbackFilter(callbackFilter32);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer29.getStrategy();
        enhancer26.setStrategy(generatorStrategy34);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer26.getStrategy();
        enhancer19.setStrategy(generatorStrategy36);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter38 = null;
        enhancer19.setCallbackFilter(callbackFilter38);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer40.getStrategy();
        enhancer40.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class45 = null;
        enhancer44.setSuperclass(class45);
        java.lang.ClassLoader classLoader47 = enhancer44.getClassLoader();
        enhancer40.setClassLoader(classLoader47);
        enhancer19.setClassLoader(classLoader47);
        enhancer0.setClassLoader(classLoader47);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = enhancer0.getStrategy();
        enhancer0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = enhancer0.getStrategy();
        enhancer0.setUseCache(false);
        org.mockito.asm.ClassVisitor classVisitor57 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertNotNull(classLoader31);
        org.junit.Assert.assertNotNull(generatorStrategy34);
        org.junit.Assert.assertNotNull(generatorStrategy36);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(classLoader47);
        org.junit.Assert.assertNotNull(generatorStrategy51);
        org.junit.Assert.assertNotNull(generatorStrategy54);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        java.lang.ClassLoader classLoader16 = enhancer14.getClassLoader();
        enhancer0.setClassLoader(classLoader16);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer18.getStrategy();
        enhancer18.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback22 = null;
        enhancer18.setCallback(callback22);
        enhancer18.setUseCache(false);
        boolean boolean26 = enhancer18.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class28 = null;
        enhancer27.setSuperclass(class28);
        enhancer27.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback32 = null;
        enhancer27.setCallback(callback32);
        java.lang.Class<?> wildcardClass34 = enhancer27.getClass();
        enhancer18.setSuperclass((java.lang.Class) wildcardClass34);
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class37 = null;
        enhancer36.setSuperclass(class37);
        java.lang.ClassLoader classLoader39 = enhancer36.getClassLoader();
        enhancer18.setClassLoader(classLoader39);
        enhancer0.setClassLoader(classLoader39);
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class43 = null;
        enhancer42.setSuperclass(class43);
        java.lang.Class<?> wildcardClass45 = enhancer42.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass45);
        enhancer0.setUseCache(true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classLoader39);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy41 = enhancer0.getNamingPolicy();
        boolean boolean42 = enhancer0.getAttemptLoad();
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
        org.junit.Assert.assertNotNull(namingPolicy41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer19.getStrategy();
        java.lang.ClassLoader classLoader21 = enhancer19.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter22 = null;
        enhancer19.setCallbackFilter(callbackFilter22);
        enhancer19.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class27 = null;
        enhancer26.setSuperclass(class27);
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer29.getStrategy();
        java.lang.ClassLoader classLoader31 = enhancer29.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter32 = null;
        enhancer29.setCallbackFilter(callbackFilter32);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer29.getStrategy();
        enhancer26.setStrategy(generatorStrategy34);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer26.getStrategy();
        enhancer19.setStrategy(generatorStrategy36);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter38 = null;
        enhancer19.setCallbackFilter(callbackFilter38);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer40.getStrategy();
        enhancer40.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class45 = null;
        enhancer44.setSuperclass(class45);
        java.lang.ClassLoader classLoader47 = enhancer44.getClassLoader();
        enhancer40.setClassLoader(classLoader47);
        enhancer19.setClassLoader(classLoader47);
        enhancer0.setClassLoader(classLoader47);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class53 = null;
        enhancer52.setSuperclass(class53);
        org.mockito.cglib.core.NamingPolicy namingPolicy55 = enhancer52.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy57 = enhancer56.getStrategy();
        enhancer56.setSerialVersionUID((java.lang.Long) 0L);
        enhancer56.setUseFactory(false);
        java.lang.Class<?> wildcardClass62 = enhancer56.getClass();
        enhancer52.setSuperclass((java.lang.Class) wildcardClass62);
        org.mockito.cglib.proxy.Callback callback64 = null;
        enhancer52.setCallback(callback64);
        enhancer52.setUseCache(true);
        java.lang.ClassLoader classLoader68 = enhancer52.getClassLoader();
        org.mockito.cglib.proxy.Callback callback69 = null;
        enhancer52.setCallback(callback69);
        java.lang.ClassLoader classLoader71 = enhancer52.getClassLoader();
        enhancer52.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer74 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class75 = null;
        enhancer74.setSuperclass(class75);
        java.lang.Class<?> wildcardClass77 = enhancer74.getClass();
        enhancer52.setSuperclass((java.lang.Class) wildcardClass77);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy79 = enhancer52.getStrategy();
        enhancer0.setStrategy(generatorStrategy79);
        org.mockito.cglib.proxy.Enhancer enhancer81 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy82 = enhancer81.getStrategy();
        enhancer81.setSerialVersionUID((java.lang.Long) 0L);
        enhancer81.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy87 = enhancer81.getStrategy();
        enhancer81.setInterceptDuringConstruction(true);
        java.lang.Class<?> wildcardClass90 = enhancer81.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass90);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertNotNull(classLoader31);
        org.junit.Assert.assertNotNull(generatorStrategy34);
        org.junit.Assert.assertNotNull(generatorStrategy36);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(classLoader47);
        org.junit.Assert.assertNotNull(generatorStrategy51);
        org.junit.Assert.assertNotNull(namingPolicy55);
        org.junit.Assert.assertNotNull(generatorStrategy57);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(classLoader68);
        org.junit.Assert.assertNotNull(classLoader71);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(generatorStrategy79);
        org.junit.Assert.assertNotNull(generatorStrategy82);
        org.junit.Assert.assertNotNull(generatorStrategy87);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class<?> wildcardClass1 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class3 = null;
        enhancer2.setSuperclass(class3);
        enhancer2.setUseCache(false);
        boolean boolean7 = enhancer2.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer8.getStrategy();
        enhancer8.setSerialVersionUID((java.lang.Long) 0L);
        enhancer8.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        java.lang.Class<?> wildcardClass16 = enhancer14.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer17.getStrategy();
        java.lang.Class<?> wildcardClass19 = enhancer17.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer20.getStrategy();
        enhancer20.setSerialVersionUID((java.lang.Long) 0L);
        enhancer20.setUseFactory(false);
        java.lang.Class<?> wildcardClass26 = enhancer20.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        enhancer27.setSerialVersionUID((java.lang.Long) 0L);
        enhancer27.setUseFactory(false);
        java.lang.Class<?> wildcardClass33 = enhancer27.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class35 = null;
        enhancer34.setSuperclass(class35);
        java.lang.ClassLoader classLoader37 = enhancer34.getClassLoader();
        java.lang.Class<?> wildcardClass38 = enhancer34.getClass();
        java.lang.Class[] classArray39 = new java.lang.Class[] { wildcardClass16, wildcardClass19, wildcardClass26, wildcardClass33, wildcardClass38 };
        enhancer8.setInterfaces(classArray39);
        boolean boolean41 = enhancer8.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy42 = enhancer8.getNamingPolicy();
        java.lang.ClassLoader classLoader43 = enhancer8.getClassLoader();
        boolean boolean44 = enhancer8.getAttemptLoad();
        org.mockito.cglib.proxy.Callback callback45 = null;
        enhancer8.setCallback(callback45);
        enhancer8.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class50 = null;
        enhancer49.setSuperclass(class50);
        org.mockito.cglib.core.NamingPolicy namingPolicy52 = enhancer49.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = enhancer53.getStrategy();
        enhancer53.setSerialVersionUID((java.lang.Long) 0L);
        enhancer53.setUseFactory(false);
        java.lang.Class<?> wildcardClass59 = enhancer53.getClass();
        enhancer49.setSuperclass((java.lang.Class) wildcardClass59);
        org.mockito.cglib.proxy.Callback callback61 = null;
        enhancer49.setCallback(callback61);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy63 = enhancer49.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer64 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy65 = enhancer64.getStrategy();
        enhancer64.setSerialVersionUID((java.lang.Long) 0L);
        enhancer64.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer70 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy71 = enhancer70.getStrategy();
        java.lang.Class<?> wildcardClass72 = enhancer70.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer73 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy74 = enhancer73.getStrategy();
        java.lang.Class<?> wildcardClass75 = enhancer73.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer76 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy77 = enhancer76.getStrategy();
        java.lang.Class<?> wildcardClass78 = enhancer76.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer79 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy80 = enhancer79.getStrategy();
        java.lang.Class<?> wildcardClass81 = enhancer79.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer82 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy83 = enhancer82.getStrategy();
        java.lang.Class<?> wildcardClass84 = enhancer82.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer85 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy86 = enhancer85.getStrategy();
        java.lang.Class<?> wildcardClass87 = enhancer85.getClass();
        java.lang.Class[] classArray88 = new java.lang.Class[] { wildcardClass72, wildcardClass75, wildcardClass78, wildcardClass81, wildcardClass84, wildcardClass87 };
        enhancer64.setInterfaces(classArray88);
        enhancer49.setInterfaces(classArray88);
        enhancer8.setInterfaces(classArray88);
        enhancer2.setInterfaces(classArray88);
        org.mockito.cglib.proxy.Callback callback93 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj94 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass1, classArray88, callback93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(classLoader37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(namingPolicy42);
        org.junit.Assert.assertNotNull(classLoader43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(namingPolicy52);
        org.junit.Assert.assertNotNull(generatorStrategy54);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(generatorStrategy63);
        org.junit.Assert.assertNotNull(generatorStrategy65);
        org.junit.Assert.assertNotNull(generatorStrategy71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(generatorStrategy74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(generatorStrategy77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(generatorStrategy80);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(generatorStrategy83);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(generatorStrategy86);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(classArray88);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class13 = null;
        enhancer12.setSuperclass(class13);
        org.mockito.cglib.proxy.Callback callback15 = null;
        enhancer12.setCallback(callback15);
        java.lang.ClassLoader classLoader17 = enhancer12.getClassLoader();
        enhancer0.setClassLoader(classLoader17);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer19.getStrategy();
        enhancer19.setSerialVersionUID((java.lang.Long) 0L);
        enhancer19.setUseFactory(false);
        java.lang.Class<?> wildcardClass25 = enhancer19.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer26.getStrategy();
        enhancer26.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback30 = null;
        enhancer26.setCallback(callback30);
        enhancer26.setUseCache(false);
        boolean boolean34 = enhancer26.getUseCache();
        org.mockito.cglib.proxy.Callback callback35 = null;
        enhancer26.setCallback(callback35);
        java.lang.Class<?> wildcardClass37 = enhancer26.getClass();
        java.lang.Class[] classArray38 = new java.lang.Class[] { wildcardClass25, wildcardClass37 };
        enhancer0.setInterfaces(classArray38);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(classLoader17);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(classArray38);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer21.getStrategy();
        enhancer21.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback25 = null;
        enhancer21.setCallback(callback25);
        enhancer21.setUseCache(false);
        boolean boolean29 = enhancer21.getUseCache();
        enhancer21.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer32.getStrategy();
        java.lang.ClassLoader classLoader34 = enhancer32.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter35 = null;
        enhancer32.setCallbackFilter(callbackFilter35);
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = enhancer32.getNamingPolicy();
        enhancer21.setNamingPolicy(namingPolicy37);
        java.lang.Class<?> wildcardClass39 = enhancer21.getClass();
        boolean boolean40 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass39);
        boolean boolean41 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass39);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(classLoader34);
        org.junit.Assert.assertNotNull(namingPolicy37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        enhancer0.setAttemptLoad(false);
        boolean boolean15 = enhancer0.getUseCache();
        enhancer0.setSerialVersionUID((java.lang.Long) 1L);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer18.getStrategy();
        java.lang.ClassLoader classLoader20 = enhancer18.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter21 = null;
        enhancer18.setCallbackFilter(callbackFilter21);
        enhancer18.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class26 = null;
        enhancer25.setSuperclass(class26);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = enhancer28.getStrategy();
        java.lang.ClassLoader classLoader30 = enhancer28.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter31 = null;
        enhancer28.setCallbackFilter(callbackFilter31);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer28.getStrategy();
        enhancer25.setStrategy(generatorStrategy33);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = enhancer25.getStrategy();
        enhancer18.setStrategy(generatorStrategy35);
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = enhancer18.getNamingPolicy();
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
        enhancer18.setInterfaces(classArray69);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertNotNull(classLoader20);
        org.junit.Assert.assertNotNull(generatorStrategy29);
        org.junit.Assert.assertNotNull(classLoader30);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertNotNull(namingPolicy37);
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
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer6.getStrategy();
        enhancer6.setSerialVersionUID((java.lang.Long) 0L);
        enhancer6.setUseFactory(false);
        enhancer6.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        java.lang.Class<?> wildcardClass16 = enhancer14.getClass();
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        enhancer6.setSuperclass((java.lang.Class) wildcardClass16);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass16);
        boolean boolean20 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader21 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback23 = null;
        enhancer22.setCallback(callback23);
        boolean boolean25 = enhancer22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = enhancer22.getStrategy();
        enhancer0.setStrategy(generatorStrategy26);
        java.lang.ClassLoader classLoader28 = null;
        enhancer0.setClassLoader(classLoader28);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(generatorStrategy26);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Callback callback2 = null;
        enhancer0.setCallback(callback2);
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class5 = null;
        enhancer4.setSuperclass(class5);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer4.getNamingPolicy();
        enhancer4.setUseCache(false);
        enhancer4.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer4.getStrategy();
        java.lang.Class<?> wildcardClass13 = generatorStrategy12.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass13);
        boolean boolean15 = enhancer0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer0.getStrategy();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy7);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(generatorStrategy16);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback4 = null;
        enhancer0.setCallback(callback4);
        enhancer0.setUseCache(false);
        boolean boolean8 = enhancer0.getUseCache();
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer11.getStrategy();
        java.lang.ClassLoader classLoader13 = enhancer11.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter14 = null;
        enhancer11.setCallbackFilter(callbackFilter14);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = enhancer11.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy16);
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy23 = enhancer22.getStrategy();
        enhancer22.setSerialVersionUID((java.lang.Long) 0L);
        enhancer22.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class29 = null;
        enhancer28.setSuperclass(class29);
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = enhancer28.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer32.getStrategy();
        enhancer28.setStrategy(generatorStrategy33);
        enhancer22.setStrategy(generatorStrategy33);
        boolean boolean36 = enhancer22.getAttemptLoad();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter37 = null;
        enhancer22.setCallbackFilter(callbackFilter37);
        boolean boolean39 = enhancer22.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class41 = null;
        enhancer40.setSuperclass(class41);
        org.mockito.cglib.core.NamingPolicy namingPolicy43 = enhancer40.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = enhancer44.getStrategy();
        enhancer40.setStrategy(generatorStrategy45);
        enhancer40.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer49.getStrategy();
        enhancer49.setSerialVersionUID((java.lang.Long) 0L);
        enhancer49.setUseFactory(false);
        enhancer49.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer57 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy58 = enhancer57.getStrategy();
        java.lang.Class<?> wildcardClass59 = enhancer57.getClass();
        boolean boolean60 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass59);
        enhancer49.setSuperclass((java.lang.Class) wildcardClass59);
        java.lang.Class<?> wildcardClass62 = enhancer49.getClass();
        enhancer40.setSuperclass((java.lang.Class) wildcardClass62);
        enhancer22.setSuperclass((java.lang.Class) wildcardClass62);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass62);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertNotNull(namingPolicy16);
        org.junit.Assert.assertNotNull(generatorStrategy23);
        org.junit.Assert.assertNotNull(namingPolicy31);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(namingPolicy43);
        org.junit.Assert.assertNotNull(generatorStrategy45);
        org.junit.Assert.assertNotNull(generatorStrategy50);
        org.junit.Assert.assertNotNull(generatorStrategy58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        java.lang.ClassLoader classLoader18 = enhancer0.getClassLoader();
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader18);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        org.mockito.cglib.proxy.CallbackFilter callbackFilter46 = null;
        enhancer0.setCallbackFilter(callbackFilter46);
        org.mockito.cglib.proxy.Callback callback48 = null;
        enhancer0.setCallback(callback48);
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
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        boolean boolean7 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Callback callback8 = null;
        enhancer0.setCallback(callback8);
        enhancer0.setInterceptDuringConstruction(false);
        boolean boolean12 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer13.getStrategy();
        enhancer13.setSerialVersionUID((java.lang.Long) 0L);
        enhancer13.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer19.getStrategy();
        java.lang.Class<?> wildcardClass21 = enhancer19.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy23 = enhancer22.getStrategy();
        java.lang.Class<?> wildcardClass24 = enhancer22.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = enhancer25.getStrategy();
        java.lang.Class<?> wildcardClass27 = enhancer25.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = enhancer28.getStrategy();
        java.lang.Class<?> wildcardClass30 = enhancer28.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = enhancer31.getStrategy();
        java.lang.Class<?> wildcardClass33 = enhancer31.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = enhancer34.getStrategy();
        java.lang.Class<?> wildcardClass36 = enhancer34.getClass();
        java.lang.Class[] classArray37 = new java.lang.Class[] { wildcardClass21, wildcardClass24, wildcardClass27, wildcardClass30, wildcardClass33, wildcardClass36 };
        enhancer13.setInterfaces(classArray37);
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = enhancer39.getStrategy();
        enhancer39.setSerialVersionUID((java.lang.Long) 0L);
        enhancer39.setAttemptLoad(false);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter45 = null;
        enhancer39.setCallbackFilter(callbackFilter45);
        java.lang.ClassLoader classLoader47 = enhancer39.getClassLoader();
        enhancer13.setClassLoader(classLoader47);
        enhancer0.setClassLoader(classLoader47);
        java.lang.Class[] classArray50 = null;
        enhancer0.setInterfaces(classArray50);
        enhancer0.setSerialVersionUID((java.lang.Long) 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(generatorStrategy23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(generatorStrategy26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(generatorStrategy29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(generatorStrategy32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(generatorStrategy40);
        org.junit.Assert.assertNotNull(classLoader47);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = enhancer0.getNamingPolicy();
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        enhancer0.setUseFactory(false);
        enhancer0.setUseFactory(false);
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy4);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertNotNull(classLoader27);
        org.junit.Assert.assertNotNull(namingPolicy31);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(namingPolicy40);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        java.lang.ClassLoader classLoader16 = enhancer14.getClassLoader();
        enhancer0.setClassLoader(classLoader16);
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        boolean boolean22 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class24 = null;
        enhancer23.setSuperclass(class24);
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = enhancer23.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        enhancer27.setSerialVersionUID((java.lang.Long) 0L);
        enhancer27.setUseFactory(false);
        java.lang.Class<?> wildcardClass33 = enhancer27.getClass();
        enhancer23.setSuperclass((java.lang.Class) wildcardClass33);
        org.mockito.cglib.proxy.Callback callback35 = null;
        enhancer23.setCallback(callback35);
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = enhancer37.getStrategy();
        java.lang.ClassLoader classLoader39 = enhancer37.getClassLoader();
        enhancer23.setClassLoader(classLoader39);
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy42 = enhancer41.getStrategy();
        java.lang.ClassLoader classLoader43 = enhancer41.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter44 = null;
        enhancer41.setCallbackFilter(callbackFilter44);
        enhancer41.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = enhancer48.getStrategy();
        enhancer48.setSerialVersionUID((java.lang.Long) 0L);
        enhancer48.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer54 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy55 = enhancer54.getStrategy();
        java.lang.Class<?> wildcardClass56 = enhancer54.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer57 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy58 = enhancer57.getStrategy();
        java.lang.Class<?> wildcardClass59 = enhancer57.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer60 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy61 = enhancer60.getStrategy();
        enhancer60.setSerialVersionUID((java.lang.Long) 0L);
        enhancer60.setUseFactory(false);
        java.lang.Class<?> wildcardClass66 = enhancer60.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer67 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy68 = enhancer67.getStrategy();
        enhancer67.setSerialVersionUID((java.lang.Long) 0L);
        enhancer67.setUseFactory(false);
        java.lang.Class<?> wildcardClass73 = enhancer67.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer74 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class75 = null;
        enhancer74.setSuperclass(class75);
        java.lang.ClassLoader classLoader77 = enhancer74.getClassLoader();
        java.lang.Class<?> wildcardClass78 = enhancer74.getClass();
        java.lang.Class[] classArray79 = new java.lang.Class[] { wildcardClass56, wildcardClass59, wildcardClass66, wildcardClass73, wildcardClass78 };
        enhancer48.setInterfaces(classArray79);
        enhancer41.setInterfaces(classArray79);
        enhancer23.setInterfaces(classArray79);
        java.lang.ClassLoader classLoader83 = enhancer23.getClassLoader();
        java.lang.ClassLoader classLoader84 = enhancer23.getClassLoader();
        enhancer0.setClassLoader(classLoader84);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj86 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(namingPolicy26);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(generatorStrategy38);
        org.junit.Assert.assertNotNull(classLoader39);
        org.junit.Assert.assertNotNull(generatorStrategy42);
        org.junit.Assert.assertNotNull(classLoader43);
        org.junit.Assert.assertNotNull(generatorStrategy49);
        org.junit.Assert.assertNotNull(generatorStrategy55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(generatorStrategy58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(generatorStrategy61);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(generatorStrategy68);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(classLoader77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(classArray79);
        org.junit.Assert.assertNotNull(classLoader83);
        org.junit.Assert.assertNotNull(classLoader84);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback4 = null;
        enhancer0.setCallback(callback4);
        enhancer0.setUseCache(false);
        enhancer0.setUseCache(false);
        enhancer0.setInterceptDuringConstruction(true);
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
        enhancer12.setUseCache(false);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter33 = null;
        enhancer12.setCallbackFilter(callbackFilter33);
        enhancer12.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = enhancer37.getStrategy();
        java.lang.ClassLoader classLoader39 = enhancer37.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter40 = null;
        enhancer37.setCallbackFilter(callbackFilter40);
        enhancer37.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class45 = null;
        enhancer44.setSuperclass(class45);
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = enhancer47.getStrategy();
        java.lang.ClassLoader classLoader49 = enhancer47.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter50 = null;
        enhancer47.setCallbackFilter(callbackFilter50);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy52 = enhancer47.getStrategy();
        enhancer44.setStrategy(generatorStrategy52);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = enhancer44.getStrategy();
        enhancer37.setStrategy(generatorStrategy54);
        java.lang.Class<?> wildcardClass56 = generatorStrategy54.getClass();
        boolean boolean57 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass56);
        enhancer12.setSuperclass((java.lang.Class) wildcardClass56);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass56);
        enhancer0.setUseCache(true);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertNotNull(namingPolicy25);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(generatorStrategy38);
        org.junit.Assert.assertNotNull(classLoader39);
        org.junit.Assert.assertNotNull(generatorStrategy48);
        org.junit.Assert.assertNotNull(classLoader49);
        org.junit.Assert.assertNotNull(generatorStrategy52);
        org.junit.Assert.assertNotNull(generatorStrategy54);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter15 = null;
        enhancer0.setCallbackFilter(callbackFilter15);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(namingPolicy14);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        org.mockito.asm.ClassVisitor classVisitor56 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor56);
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
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        boolean boolean21 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Callback callback22 = null;
        enhancer0.setCallback(callback22);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class25 = null;
        enhancer24.setSuperclass(class25);
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = enhancer24.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = enhancer28.getStrategy();
        enhancer28.setSerialVersionUID((java.lang.Long) 0L);
        enhancer28.setUseFactory(false);
        java.lang.Class<?> wildcardClass34 = enhancer28.getClass();
        enhancer24.setSuperclass((java.lang.Class) wildcardClass34);
        org.mockito.cglib.proxy.Callback callback36 = null;
        enhancer24.setCallback(callback36);
        org.mockito.cglib.proxy.Callback callback38 = null;
        enhancer24.setCallback(callback38);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter40 = null;
        enhancer24.setCallbackFilter(callbackFilter40);
        java.lang.ClassLoader classLoader42 = enhancer24.getClassLoader();
        enhancer0.setClassLoader(classLoader42);
        enhancer0.setAttemptLoad(true);
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = enhancer48.getStrategy();
        enhancer48.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback52 = null;
        enhancer48.setCallback(callback52);
        enhancer48.setUseCache(false);
        enhancer48.setUseCache(false);
        boolean boolean58 = enhancer48.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer59 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy60 = enhancer59.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer61 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy62 = enhancer61.getStrategy();
        enhancer61.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback65 = null;
        enhancer61.setCallback(callback65);
        enhancer61.setUseCache(false);
        boolean boolean69 = enhancer61.getUseCache();
        org.mockito.cglib.proxy.Callback callback70 = null;
        enhancer61.setCallback(callback70);
        java.lang.Class<?> wildcardClass72 = enhancer61.getClass();
        enhancer59.setSuperclass((java.lang.Class) wildcardClass72);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy74 = enhancer59.getStrategy();
        enhancer48.setStrategy(generatorStrategy74);
        enhancer0.setStrategy(generatorStrategy74);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(namingPolicy27);
        org.junit.Assert.assertNotNull(generatorStrategy29);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classLoader42);
        org.junit.Assert.assertNotNull(generatorStrategy49);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(namingPolicy60);
        org.junit.Assert.assertNotNull(generatorStrategy62);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(generatorStrategy74);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        boolean boolean21 = enhancer0.getAttemptLoad();
        boolean boolean22 = enhancer0.getUseCache();
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        boolean boolean21 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Callback callback22 = null;
        enhancer0.setCallback(callback22);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        enhancer24.setSerialVersionUID((java.lang.Long) 0L);
        enhancer24.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class31 = null;
        enhancer30.setSuperclass(class31);
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer30.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = enhancer34.getStrategy();
        enhancer30.setStrategy(generatorStrategy35);
        enhancer24.setStrategy(generatorStrategy35);
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer38.getStrategy();
        java.lang.Class<?> wildcardClass40 = enhancer38.getClass();
        boolean boolean41 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass40);
        enhancer24.setSuperclass((java.lang.Class) wildcardClass40);
        boolean boolean43 = enhancer24.getUseCache();
        java.lang.ClassLoader classLoader44 = enhancer24.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer45 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy46 = enhancer45.getStrategy();
        java.lang.ClassLoader classLoader47 = enhancer45.getClassLoader();
        enhancer45.setUseFactory(true);
        enhancer45.setUseFactory(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy52 = enhancer45.getNamingPolicy();
        enhancer24.setNamingPolicy(namingPolicy52);
        enhancer0.setNamingPolicy(namingPolicy52);
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
        org.mockito.cglib.core.NamingPolicy namingPolicy88 = enhancer55.getNamingPolicy();
        java.lang.Class[] classArray89 = null;
        enhancer55.setInterfaces(classArray89);
        org.mockito.cglib.proxy.Enhancer enhancer91 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy92 = enhancer91.getNamingPolicy();
        enhancer55.setNamingPolicy(namingPolicy92);
        enhancer0.setNamingPolicy(namingPolicy92);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertNotNull(namingPolicy33);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertNotNull(generatorStrategy39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(classLoader44);
        org.junit.Assert.assertNotNull(generatorStrategy46);
        org.junit.Assert.assertNotNull(classLoader47);
        org.junit.Assert.assertNotNull(namingPolicy52);
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
        org.junit.Assert.assertNotNull(namingPolicy88);
        org.junit.Assert.assertNotNull(namingPolicy92);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(namingPolicy16);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classLoader29);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer4.getStrategy();
        enhancer0.setStrategy(generatorStrategy5);
        boolean boolean7 = enhancer0.getUseCache();
        enhancer0.setAttemptLoad(true);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer0.getNamingPolicy();
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(namingPolicy12);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseCache(true);
        boolean boolean6 = enhancer0.getUseCache();
        boolean boolean7 = enhancer0.getAttemptLoad();
        boolean boolean8 = enhancer0.getUseCache();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        java.lang.ClassLoader classLoader16 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer17.getStrategy();
        enhancer17.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback21 = null;
        enhancer17.setCallback(callback21);
        enhancer17.setUseCache(false);
        boolean boolean25 = enhancer17.getUseCache();
        enhancer17.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = enhancer28.getStrategy();
        java.lang.ClassLoader classLoader30 = enhancer28.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter31 = null;
        enhancer28.setCallbackFilter(callbackFilter31);
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer28.getNamingPolicy();
        enhancer17.setNamingPolicy(namingPolicy33);
        java.lang.Class<?> wildcardClass35 = enhancer17.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass35);
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
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = enhancer37.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = enhancer52.getStrategy();
        enhancer52.setSerialVersionUID((java.lang.Long) 0L);
        enhancer52.setUseFactory(false);
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
        org.mockito.cglib.proxy.Enhancer enhancer73 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy74 = enhancer73.getStrategy();
        java.lang.Class<?> wildcardClass75 = enhancer73.getClass();
        java.lang.Class[] classArray76 = new java.lang.Class[] { wildcardClass60, wildcardClass63, wildcardClass66, wildcardClass69, wildcardClass72, wildcardClass75 };
        enhancer52.setInterfaces(classArray76);
        enhancer37.setInterfaces(classArray76);
        enhancer37.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter81 = null;
        enhancer37.setCallbackFilter(callbackFilter81);
        org.mockito.cglib.proxy.Enhancer enhancer83 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy84 = enhancer83.getStrategy();
        enhancer83.setSerialVersionUID((java.lang.Long) 0L);
        enhancer83.setUseFactory(false);
        java.lang.Class<?> wildcardClass89 = enhancer83.getClass();
        boolean boolean90 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass89);
        enhancer37.setSuperclass((java.lang.Class) wildcardClass89);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass89);
        enhancer0.setUseFactory(true);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(generatorStrategy29);
        org.junit.Assert.assertNotNull(classLoader30);
        org.junit.Assert.assertNotNull(namingPolicy33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(namingPolicy40);
        org.junit.Assert.assertNotNull(generatorStrategy42);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(generatorStrategy51);
        org.junit.Assert.assertNotNull(generatorStrategy53);
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
        org.junit.Assert.assertNotNull(generatorStrategy74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(generatorStrategy84);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        enhancer0.setAttemptLoad(false);
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
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer18.getStrategy();
        enhancer18.setSerialVersionUID((java.lang.Long) 0L);
        enhancer18.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        enhancer24.setSerialVersionUID((java.lang.Long) 0L);
        enhancer24.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer24.getStrategy();
        enhancer18.setStrategy(generatorStrategy30);
        enhancer18.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer18.getStrategy();
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
        org.mockito.cglib.proxy.Callback callback61 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray62 = new org.mockito.cglib.proxy.Callback[] { callback61 };
        enhancer35.setCallbacks(callbackArray62);
        enhancer18.setCallbacks(callbackArray62);
        enhancer18.setInterceptDuringConstruction(false);
        java.lang.Class<?> wildcardClass67 = enhancer18.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass67);
        enhancer0.setUseFactory(false);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertNotNull(generatorStrategy30);
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
        org.junit.Assert.assertNotNull(callbackArray62);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer16.getStrategy();
        enhancer16.setSerialVersionUID((java.lang.Long) 0L);
        enhancer16.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy23 = enhancer22.getStrategy();
        java.lang.Class<?> wildcardClass24 = enhancer22.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = enhancer25.getStrategy();
        java.lang.Class<?> wildcardClass27 = enhancer25.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = enhancer28.getStrategy();
        java.lang.Class<?> wildcardClass30 = enhancer28.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = enhancer31.getStrategy();
        java.lang.Class<?> wildcardClass33 = enhancer31.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = enhancer34.getStrategy();
        java.lang.Class<?> wildcardClass36 = enhancer34.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = enhancer37.getStrategy();
        java.lang.Class<?> wildcardClass39 = enhancer37.getClass();
        java.lang.Class[] classArray40 = new java.lang.Class[] { wildcardClass24, wildcardClass27, wildcardClass30, wildcardClass33, wildcardClass36, wildcardClass39 };
        enhancer16.setInterfaces(classArray40);
        org.mockito.cglib.core.NamingPolicy namingPolicy42 = enhancer16.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy42);
        java.lang.ClassLoader classLoader44 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = enhancer0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(generatorStrategy23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(generatorStrategy26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(generatorStrategy29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(generatorStrategy32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(generatorStrategy38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertNotNull(namingPolicy42);
        org.junit.Assert.assertNotNull(classLoader44);
        org.junit.Assert.assertNotNull(generatorStrategy45);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Callback callback2 = null;
        enhancer0.setCallback(callback2);
        enhancer0.setAttemptLoad(true);
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = enhancer0.getNamingPolicy();
        boolean boolean9 = enhancer0.getUseCache();
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer0.getNamingPolicy();
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer0.getStrategy();
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setUseFactory(false);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(namingPolicy12);
        org.junit.Assert.assertNotNull(generatorStrategy15);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class16 = null;
        enhancer15.setSuperclass(class16);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer18.getStrategy();
        java.lang.ClassLoader classLoader20 = enhancer18.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter21 = null;
        enhancer18.setCallbackFilter(callbackFilter21);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy23 = enhancer18.getStrategy();
        enhancer15.setStrategy(generatorStrategy23);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer15.getStrategy();
        java.lang.Class<?> wildcardClass26 = generatorStrategy25.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass26);
        org.mockito.cglib.proxy.Callback callback28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass26, callback28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertNotNull(classLoader20);
        org.junit.Assert.assertNotNull(generatorStrategy23);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = enhancer0.getNamingPolicy();
        java.lang.ClassLoader classLoader27 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class29 = null;
        enhancer28.setSuperclass(class29);
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = enhancer28.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer32.getStrategy();
        enhancer32.setSerialVersionUID((java.lang.Long) 0L);
        enhancer32.setUseFactory(false);
        java.lang.Class<?> wildcardClass38 = enhancer32.getClass();
        enhancer28.setSuperclass((java.lang.Class) wildcardClass38);
        org.mockito.cglib.proxy.Callback callback40 = null;
        enhancer28.setCallback(callback40);
        enhancer28.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback45 = null;
        enhancer44.setCallback(callback45);
        boolean boolean47 = enhancer44.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = enhancer44.getStrategy();
        enhancer28.setStrategy(generatorStrategy48);
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = enhancer50.getStrategy();
        enhancer50.setSerialVersionUID((java.lang.Long) 0L);
        enhancer50.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy57 = enhancer56.getStrategy();
        enhancer56.setSerialVersionUID((java.lang.Long) 0L);
        enhancer56.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy62 = enhancer56.getStrategy();
        enhancer50.setStrategy(generatorStrategy62);
        enhancer50.setUseCache(false);
        boolean boolean66 = enhancer50.getUseCache();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter67 = null;
        enhancer50.setCallbackFilter(callbackFilter67);
        org.mockito.cglib.proxy.Enhancer enhancer69 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class70 = null;
        enhancer69.setSuperclass(class70);
        java.lang.ClassLoader classLoader72 = enhancer69.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer73 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class74 = null;
        enhancer73.setSuperclass(class74);
        org.mockito.cglib.core.NamingPolicy namingPolicy76 = enhancer73.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer77 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy78 = enhancer77.getStrategy();
        enhancer73.setStrategy(generatorStrategy78);
        enhancer69.setStrategy(generatorStrategy78);
        java.lang.Class<?> wildcardClass81 = enhancer69.getClass();
        boolean boolean82 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass81);
        enhancer50.setSuperclass((java.lang.Class) wildcardClass81);
        boolean boolean84 = enhancer50.getAttemptLoad();
        org.mockito.cglib.proxy.Callback callback85 = null;
        enhancer50.setCallback(callback85);
        java.lang.Class<?> wildcardClass87 = enhancer50.getClass();
        enhancer28.setSuperclass((java.lang.Class) wildcardClass87);
        org.mockito.cglib.proxy.Enhancer enhancer89 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy90 = enhancer89.getStrategy();
        java.lang.ClassLoader classLoader91 = enhancer89.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter92 = null;
        enhancer89.setCallbackFilter(callbackFilter92);
        java.lang.ClassLoader classLoader94 = enhancer89.getClassLoader();
        enhancer28.setClassLoader(classLoader94);
        enhancer0.setClassLoader(classLoader94);
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
        org.junit.Assert.assertNotNull(namingPolicy26);
        org.junit.Assert.assertNotNull(classLoader27);
        org.junit.Assert.assertNotNull(namingPolicy31);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(generatorStrategy48);
        org.junit.Assert.assertNotNull(generatorStrategy51);
        org.junit.Assert.assertNotNull(generatorStrategy57);
        org.junit.Assert.assertNotNull(generatorStrategy62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(classLoader72);
        org.junit.Assert.assertNotNull(namingPolicy76);
        org.junit.Assert.assertNotNull(generatorStrategy78);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(generatorStrategy90);
        org.junit.Assert.assertNotNull(classLoader91);
        org.junit.Assert.assertNotNull(classLoader94);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = enhancer0.getNamingPolicy();
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        enhancer19.setUseCache(false);
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
        org.mockito.cglib.proxy.Callback callback34 = null;
        enhancer22.setCallback(callback34);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer22.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = enhancer37.getStrategy();
        enhancer37.setSerialVersionUID((java.lang.Long) 0L);
        enhancer37.setUseFactory(false);
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
        org.mockito.cglib.proxy.Enhancer enhancer58 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy59 = enhancer58.getStrategy();
        java.lang.Class<?> wildcardClass60 = enhancer58.getClass();
        java.lang.Class[] classArray61 = new java.lang.Class[] { wildcardClass45, wildcardClass48, wildcardClass51, wildcardClass54, wildcardClass57, wildcardClass60 };
        enhancer37.setInterfaces(classArray61);
        enhancer22.setInterfaces(classArray61);
        enhancer19.setInterfaces(classArray61);
        enhancer0.setInterfaces(classArray61);
        org.mockito.cglib.proxy.Enhancer enhancer66 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class67 = null;
        enhancer66.setSuperclass(class67);
        org.mockito.cglib.core.NamingPolicy namingPolicy69 = enhancer66.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer70 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy71 = enhancer70.getStrategy();
        enhancer70.setSerialVersionUID((java.lang.Long) 0L);
        enhancer70.setUseFactory(false);
        java.lang.Class<?> wildcardClass76 = enhancer70.getClass();
        enhancer66.setSuperclass((java.lang.Class) wildcardClass76);
        org.mockito.cglib.proxy.Callback callback78 = null;
        enhancer66.setCallback(callback78);
        org.mockito.cglib.proxy.Enhancer enhancer80 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy81 = enhancer80.getStrategy();
        java.lang.ClassLoader classLoader82 = enhancer80.getClassLoader();
        enhancer66.setClassLoader(classLoader82);
        enhancer66.setSerialVersionUID((java.lang.Long) 0L);
        boolean boolean86 = enhancer66.getUseCache();
        enhancer66.setAttemptLoad(true);
        java.lang.Class<?> wildcardClass89 = enhancer66.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass89);
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Callback callback93 = null;
        enhancer0.setCallback(callback93);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(namingPolicy16);
        org.junit.Assert.assertNotNull(namingPolicy25);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(generatorStrategy36);
        org.junit.Assert.assertNotNull(generatorStrategy38);
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
        org.junit.Assert.assertNotNull(generatorStrategy59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertNotNull(namingPolicy69);
        org.junit.Assert.assertNotNull(generatorStrategy71);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(generatorStrategy81);
        org.junit.Assert.assertNotNull(classLoader82);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        enhancer15.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class22 = null;
        enhancer21.setSuperclass(class22);
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = enhancer21.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = enhancer25.getStrategy();
        enhancer21.setStrategy(generatorStrategy26);
        enhancer15.setStrategy(generatorStrategy26);
        java.lang.ClassLoader classLoader29 = enhancer15.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer30.getStrategy();
        enhancer30.setSerialVersionUID((java.lang.Long) 0L);
        enhancer30.setAttemptLoad(false);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter36 = null;
        enhancer30.setCallbackFilter(callbackFilter36);
        java.lang.ClassLoader classLoader38 = enhancer30.getClassLoader();
        enhancer15.setClassLoader(classLoader38);
        enhancer0.setClassLoader(classLoader38);
        enhancer0.setUseCache(false);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(namingPolicy24);
        org.junit.Assert.assertNotNull(generatorStrategy26);
        org.junit.Assert.assertNotNull(classLoader29);
        org.junit.Assert.assertNotNull(generatorStrategy31);
        org.junit.Assert.assertNotNull(classLoader38);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class5 = null;
        enhancer4.setSuperclass(class5);
        java.lang.ClassLoader classLoader7 = enhancer4.getClassLoader();
        enhancer0.setClassLoader(classLoader7);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter9 = null;
        enhancer0.setCallbackFilter(callbackFilter9);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter11 = null;
        enhancer0.setCallbackFilter(callbackFilter11);
        java.lang.ClassLoader classLoader13 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter14 = null;
        enhancer0.setCallbackFilter(callbackFilter14);
        org.mockito.cglib.proxy.Callback callback16 = null;
        enhancer0.setCallback(callback16);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(classLoader13);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        org.mockito.cglib.proxy.Callback[] callbackArray21 = null;
        enhancer0.setCallbacks(callbackArray21);
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = enhancer23.getStrategy();
        enhancer23.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = enhancer23.getNamingPolicy();
        enhancer23.setSerialVersionUID((java.lang.Long) 10L);
        enhancer23.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        enhancer32.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class36 = null;
        enhancer35.setSuperclass(class36);
        org.mockito.cglib.core.NamingPolicy namingPolicy38 = enhancer35.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = enhancer39.getStrategy();
        enhancer39.setSerialVersionUID((java.lang.Long) 0L);
        enhancer39.setUseFactory(false);
        java.lang.Class<?> wildcardClass45 = enhancer39.getClass();
        enhancer35.setSuperclass((java.lang.Class) wildcardClass45);
        org.mockito.cglib.proxy.Callback callback47 = null;
        enhancer35.setCallback(callback47);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = enhancer35.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = enhancer50.getStrategy();
        enhancer50.setSerialVersionUID((java.lang.Long) 0L);
        enhancer50.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy57 = enhancer56.getStrategy();
        java.lang.Class<?> wildcardClass58 = enhancer56.getClass();
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
        java.lang.Class[] classArray74 = new java.lang.Class[] { wildcardClass58, wildcardClass61, wildcardClass64, wildcardClass67, wildcardClass70, wildcardClass73 };
        enhancer50.setInterfaces(classArray74);
        enhancer35.setInterfaces(classArray74);
        enhancer32.setInterfaces(classArray74);
        enhancer23.setInterfaces(classArray74);
        enhancer0.setInterfaces(classArray74);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy80 = enhancer0.getStrategy();
        enhancer0.setUseCache(true);
        org.mockito.asm.ClassVisitor classVisitor83 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor83);
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
        org.junit.Assert.assertNotNull(generatorStrategy24);
        org.junit.Assert.assertNotNull(namingPolicy27);
        org.junit.Assert.assertNotNull(namingPolicy38);
        org.junit.Assert.assertNotNull(generatorStrategy40);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(generatorStrategy49);
        org.junit.Assert.assertNotNull(generatorStrategy51);
        org.junit.Assert.assertNotNull(generatorStrategy57);
        org.junit.Assert.assertNotNull(wildcardClass58);
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
        org.junit.Assert.assertNotNull(classArray74);
        org.junit.Assert.assertNotNull(generatorStrategy80);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback1 = null;
        enhancer0.setCallback(callback1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter4 = null;
        enhancer0.setCallbackFilter(callbackFilter4);
        enhancer0.setAttemptLoad(false);
        boolean boolean8 = enhancer0.getUseCache();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        boolean boolean30 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass28);
        java.lang.Class[] classArray31 = null;
        java.util.List list32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass28, classArray31, list32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(classLoader11);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertNotNull(generatorStrategy24);
        org.junit.Assert.assertNotNull(generatorStrategy26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        org.mockito.cglib.proxy.Callback callback9 = null;
        enhancer0.setCallback(callback9);
        boolean boolean11 = enhancer0.getUseCache();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        java.lang.ClassLoader classLoader16 = enhancer14.getClassLoader();
        enhancer0.setClassLoader(classLoader16);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer18.getStrategy();
        java.lang.ClassLoader classLoader20 = enhancer18.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter21 = null;
        enhancer18.setCallbackFilter(callbackFilter21);
        enhancer18.setInterceptDuringConstruction(true);
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
        enhancer18.setInterfaces(classArray56);
        enhancer0.setInterfaces(classArray56);
        java.lang.ClassLoader classLoader60 = enhancer0.getClassLoader();
        enhancer0.setAttemptLoad(false);
        boolean boolean63 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Callback callback64 = null;
        enhancer0.setCallback(callback64);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertNotNull(classLoader20);
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
        org.junit.Assert.assertNotNull(classLoader60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
        java.lang.ClassLoader classLoader16 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = enhancer17.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy18);
        enhancer0.setInterceptDuringConstruction(true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(namingPolicy18);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        boolean boolean4 = enhancer0.getAttemptLoad();
        boolean boolean5 = enhancer0.getUseCache();
        java.lang.ClassLoader classLoader6 = enhancer0.getClassLoader();
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(classLoader6);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        org.mockito.cglib.proxy.CallbackFilter callbackFilter19 = null;
        enhancer0.setCallbackFilter(callbackFilter19);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer21.getStrategy();
        enhancer21.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class26 = null;
        enhancer25.setSuperclass(class26);
        java.lang.ClassLoader classLoader28 = enhancer25.getClassLoader();
        enhancer21.setClassLoader(classLoader28);
        enhancer0.setClassLoader(classLoader28);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = enhancer31.getStrategy();
        enhancer31.setSerialVersionUID((java.lang.Long) 0L);
        enhancer31.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer31.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer38.getStrategy();
        enhancer38.setSerialVersionUID((java.lang.Long) 0L);
        enhancer38.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = enhancer44.getStrategy();
        enhancer44.setSerialVersionUID((java.lang.Long) 0L);
        enhancer44.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer44.getStrategy();
        enhancer38.setStrategy(generatorStrategy50);
        enhancer38.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = enhancer38.getStrategy();
        enhancer31.setStrategy(generatorStrategy54);
        java.lang.Class<?> wildcardClass56 = generatorStrategy54.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass56);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer60 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class61 = null;
        enhancer60.setSuperclass(class61);
        org.mockito.cglib.core.NamingPolicy namingPolicy63 = enhancer60.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer64 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy65 = enhancer64.getStrategy();
        enhancer60.setStrategy(generatorStrategy65);
        enhancer60.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer69 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class70 = null;
        enhancer69.setSuperclass(class70);
        org.mockito.cglib.core.NamingPolicy namingPolicy72 = enhancer69.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer73 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy74 = enhancer73.getStrategy();
        enhancer73.setSerialVersionUID((java.lang.Long) 0L);
        enhancer73.setUseFactory(false);
        java.lang.Class<?> wildcardClass79 = enhancer73.getClass();
        enhancer69.setSuperclass((java.lang.Class) wildcardClass79);
        enhancer60.setSuperclass((java.lang.Class) wildcardClass79);
        boolean boolean82 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass79);
        boolean boolean83 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass79);
        boolean boolean84 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass79);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(classLoader12);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(classLoader28);
        org.junit.Assert.assertNotNull(generatorStrategy32);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(generatorStrategy39);
        org.junit.Assert.assertNotNull(generatorStrategy45);
        org.junit.Assert.assertNotNull(generatorStrategy50);
        org.junit.Assert.assertNotNull(generatorStrategy54);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(namingPolicy63);
        org.junit.Assert.assertNotNull(generatorStrategy65);
        org.junit.Assert.assertNotNull(namingPolicy72);
        org.junit.Assert.assertNotNull(generatorStrategy74);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy13);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(classLoader25);
        org.junit.Assert.assertNotNull(generatorStrategy26);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        boolean boolean18 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Callback callback19 = null;
        enhancer0.setCallback(callback19);
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Callback callback23 = null;
        enhancer0.setCallback(callback23);
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
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = enhancer39.getStrategy();
        java.lang.ClassLoader classLoader41 = enhancer39.getClassLoader();
        enhancer25.setClassLoader(classLoader41);
        org.mockito.cglib.proxy.Enhancer enhancer43 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = enhancer43.getStrategy();
        java.lang.ClassLoader classLoader45 = enhancer43.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter46 = null;
        enhancer43.setCallbackFilter(callbackFilter46);
        enhancer43.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = enhancer50.getStrategy();
        enhancer50.setSerialVersionUID((java.lang.Long) 0L);
        enhancer50.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy57 = enhancer56.getStrategy();
        java.lang.Class<?> wildcardClass58 = enhancer56.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer59 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy60 = enhancer59.getStrategy();
        java.lang.Class<?> wildcardClass61 = enhancer59.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer62 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy63 = enhancer62.getStrategy();
        enhancer62.setSerialVersionUID((java.lang.Long) 0L);
        enhancer62.setUseFactory(false);
        java.lang.Class<?> wildcardClass68 = enhancer62.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer69 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy70 = enhancer69.getStrategy();
        enhancer69.setSerialVersionUID((java.lang.Long) 0L);
        enhancer69.setUseFactory(false);
        java.lang.Class<?> wildcardClass75 = enhancer69.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer76 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class77 = null;
        enhancer76.setSuperclass(class77);
        java.lang.ClassLoader classLoader79 = enhancer76.getClassLoader();
        java.lang.Class<?> wildcardClass80 = enhancer76.getClass();
        java.lang.Class[] classArray81 = new java.lang.Class[] { wildcardClass58, wildcardClass61, wildcardClass68, wildcardClass75, wildcardClass80 };
        enhancer50.setInterfaces(classArray81);
        enhancer43.setInterfaces(classArray81);
        enhancer25.setInterfaces(classArray81);
        enhancer0.setInterfaces(classArray81);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(namingPolicy28);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(generatorStrategy40);
        org.junit.Assert.assertNotNull(classLoader41);
        org.junit.Assert.assertNotNull(generatorStrategy44);
        org.junit.Assert.assertNotNull(classLoader45);
        org.junit.Assert.assertNotNull(generatorStrategy51);
        org.junit.Assert.assertNotNull(generatorStrategy57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(generatorStrategy60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(generatorStrategy63);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(generatorStrategy70);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(classLoader79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(classArray81);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        boolean boolean33 = enhancer0.getUseCache();
        enhancer0.setUseFactory(false);
        org.mockito.asm.ClassVisitor classVisitor36 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        org.mockito.cglib.proxy.CallbackFilter callbackFilter15 = null;
        enhancer0.setCallbackFilter(callbackFilter15);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        java.lang.ClassLoader classLoader53 = enhancer0.getClassLoader();
        java.lang.ClassLoader classLoader54 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class56 = null;
        enhancer55.setSuperclass(class56);
        org.mockito.cglib.core.NamingPolicy namingPolicy58 = enhancer55.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer59 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy60 = enhancer59.getStrategy();
        enhancer59.setSerialVersionUID((java.lang.Long) 0L);
        enhancer59.setUseFactory(false);
        java.lang.Class<?> wildcardClass65 = enhancer59.getClass();
        enhancer55.setSuperclass((java.lang.Class) wildcardClass65);
        org.mockito.cglib.proxy.Callback callback67 = null;
        enhancer55.setCallback(callback67);
        enhancer55.setUseCache(true);
        java.lang.ClassLoader classLoader71 = enhancer55.getClassLoader();
        org.mockito.cglib.proxy.Callback callback72 = null;
        enhancer55.setCallback(callback72);
        java.lang.ClassLoader classLoader74 = enhancer55.getClassLoader();
        boolean boolean75 = enhancer55.getUseCache();
        boolean boolean76 = enhancer55.getAttemptLoad();
        org.mockito.cglib.proxy.Callback callback77 = null;
        enhancer55.setCallback(callback77);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy79 = enhancer55.getStrategy();
        enhancer0.setStrategy(generatorStrategy79);
        java.lang.ClassLoader classLoader81 = enhancer0.getClassLoader();
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
        org.junit.Assert.assertNotNull(classLoader53);
        org.junit.Assert.assertNotNull(classLoader54);
        org.junit.Assert.assertNotNull(namingPolicy58);
        org.junit.Assert.assertNotNull(generatorStrategy60);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(classLoader71);
        org.junit.Assert.assertNotNull(classLoader74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(generatorStrategy79);
        org.junit.Assert.assertNotNull(classLoader81);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        java.lang.ClassLoader classLoader16 = enhancer0.getClassLoader();
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class20 = null;
        enhancer19.setSuperclass(class20);
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = enhancer19.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = enhancer23.getStrategy();
        enhancer23.setSerialVersionUID((java.lang.Long) 0L);
        enhancer23.setUseFactory(false);
        java.lang.Class<?> wildcardClass29 = enhancer23.getClass();
        enhancer19.setSuperclass((java.lang.Class) wildcardClass29);
        org.mockito.cglib.proxy.Callback callback31 = null;
        enhancer19.setCallback(callback31);
        org.mockito.cglib.proxy.Callback callback33 = null;
        enhancer19.setCallback(callback33);
        java.lang.ClassLoader classLoader35 = enhancer19.getClassLoader();
        enhancer0.setClassLoader(classLoader35);
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer0.getStrategy();
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(namingPolicy22);
        org.junit.Assert.assertNotNull(generatorStrategy24);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classLoader35);
        org.junit.Assert.assertNotNull(generatorStrategy39);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer7.getStrategy();
        enhancer7.setSerialVersionUID((java.lang.Long) 0L);
        enhancer7.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer13.getStrategy();
        java.lang.Class<?> wildcardClass15 = enhancer13.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer16.getStrategy();
        java.lang.Class<?> wildcardClass18 = enhancer16.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer19.getStrategy();
        enhancer19.setSerialVersionUID((java.lang.Long) 0L);
        enhancer19.setUseFactory(false);
        java.lang.Class<?> wildcardClass25 = enhancer19.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer26.getStrategy();
        enhancer26.setSerialVersionUID((java.lang.Long) 0L);
        enhancer26.setUseFactory(false);
        java.lang.Class<?> wildcardClass32 = enhancer26.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class34 = null;
        enhancer33.setSuperclass(class34);
        java.lang.ClassLoader classLoader36 = enhancer33.getClassLoader();
        java.lang.Class<?> wildcardClass37 = enhancer33.getClass();
        java.lang.Class[] classArray38 = new java.lang.Class[] { wildcardClass15, wildcardClass18, wildcardClass25, wildcardClass32, wildcardClass37 };
        enhancer7.setInterfaces(classArray38);
        enhancer0.setInterfaces(classArray38);
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy42 = enhancer41.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer43 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = enhancer43.getStrategy();
        enhancer43.setSerialVersionUID((java.lang.Long) 0L);
        enhancer43.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class50 = null;
        enhancer49.setSuperclass(class50);
        org.mockito.cglib.core.NamingPolicy namingPolicy52 = enhancer49.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = enhancer53.getStrategy();
        enhancer49.setStrategy(generatorStrategy54);
        enhancer43.setStrategy(generatorStrategy54);
        enhancer41.setStrategy(generatorStrategy54);
        enhancer0.setStrategy(generatorStrategy54);
        enhancer0.setAttemptLoad(false);
        enhancer0.setAttemptLoad(false);
        boolean boolean63 = enhancer0.getAttemptLoad();
        boolean boolean64 = enhancer0.getAttemptLoad();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(classLoader36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertNotNull(generatorStrategy42);
        org.junit.Assert.assertNotNull(generatorStrategy44);
        org.junit.Assert.assertNotNull(namingPolicy52);
        org.junit.Assert.assertNotNull(generatorStrategy54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        boolean boolean26 = enhancer0.getAttemptLoad();
        boolean boolean27 = enhancer0.getAttemptLoad();
        boolean boolean28 = enhancer0.getUseCache();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy13);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(classLoader25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = enhancer44.getStrategy();
        enhancer44.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback48 = null;
        enhancer44.setCallback(callback48);
        enhancer44.setUseCache(false);
        boolean boolean52 = enhancer44.getUseCache();
        org.mockito.cglib.proxy.Callback callback53 = null;
        enhancer44.setCallback(callback53);
        enhancer44.setSerialVersionUID((java.lang.Long) 1L);
        org.mockito.cglib.proxy.Enhancer enhancer57 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class58 = null;
        enhancer57.setSuperclass(class58);
        org.mockito.cglib.core.NamingPolicy namingPolicy60 = enhancer57.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer61 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy62 = enhancer61.getStrategy();
        enhancer61.setSerialVersionUID((java.lang.Long) 0L);
        enhancer61.setUseFactory(false);
        java.lang.Class<?> wildcardClass67 = enhancer61.getClass();
        enhancer57.setSuperclass((java.lang.Class) wildcardClass67);
        org.mockito.cglib.proxy.Callback callback69 = null;
        enhancer57.setCallback(callback69);
        org.mockito.cglib.proxy.Callback callback71 = null;
        enhancer57.setCallback(callback71);
        java.lang.ClassLoader classLoader73 = enhancer57.getClassLoader();
        enhancer44.setClassLoader(classLoader73);
        enhancer0.setClassLoader(classLoader73);
        org.mockito.cglib.proxy.Callback callback76 = null;
        enhancer0.setCallback(callback76);
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
        org.junit.Assert.assertNotNull(generatorStrategy45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(namingPolicy60);
        org.junit.Assert.assertNotNull(generatorStrategy62);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(classLoader73);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        java.lang.ClassLoader classLoader3 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class5 = null;
        enhancer4.setSuperclass(class5);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer4.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer8.getStrategy();
        enhancer4.setStrategy(generatorStrategy9);
        enhancer0.setStrategy(generatorStrategy9);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        enhancer0.setUseCache(true);
        java.lang.ClassLoader classLoader15 = enhancer0.getClassLoader();
        org.junit.Assert.assertNotNull(classLoader3);
        org.junit.Assert.assertNotNull(namingPolicy7);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertNotNull(classLoader12);
        org.junit.Assert.assertNotNull(classLoader15);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        enhancer0.setUseCache(false);
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
        enhancer16.setAttemptLoad(false);
        enhancer16.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = enhancer34.getStrategy();
        enhancer34.setSerialVersionUID((java.lang.Long) 0L);
        enhancer34.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class41 = null;
        enhancer40.setSuperclass(class41);
        java.lang.ClassLoader classLoader43 = enhancer40.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class45 = null;
        enhancer44.setSuperclass(class45);
        org.mockito.cglib.core.NamingPolicy namingPolicy47 = enhancer44.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = enhancer48.getStrategy();
        enhancer44.setStrategy(generatorStrategy49);
        enhancer40.setStrategy(generatorStrategy49);
        enhancer34.setStrategy(generatorStrategy49);
        enhancer16.setStrategy(generatorStrategy49);
        enhancer0.setStrategy(generatorStrategy49);
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = enhancer55.getStrategy();
        org.mockito.cglib.proxy.Callback callback57 = null;
        enhancer55.setCallback(callback57);
        enhancer55.setAttemptLoad(true);
        enhancer55.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer63 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy64 = enhancer63.getStrategy();
        enhancer63.setSerialVersionUID((java.lang.Long) 0L);
        enhancer63.setUseFactory(false);
        enhancer63.setSerialVersionUID((java.lang.Long) 1L);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy71 = enhancer63.getStrategy();
        enhancer55.setStrategy(generatorStrategy71);
        enhancer0.setStrategy(generatorStrategy71);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy74 = enhancer0.getStrategy();
        enhancer0.setAttemptLoad(true);
        boolean boolean77 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Callback callback78 = null;
        enhancer0.setCallback(callback78);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(namingPolicy19);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertNotNull(classLoader43);
        org.junit.Assert.assertNotNull(namingPolicy47);
        org.junit.Assert.assertNotNull(generatorStrategy49);
        org.junit.Assert.assertNotNull(generatorStrategy56);
        org.junit.Assert.assertNotNull(generatorStrategy64);
        org.junit.Assert.assertNotNull(generatorStrategy71);
        org.junit.Assert.assertNotNull(generatorStrategy74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class15 = null;
        enhancer14.setSuperclass(class15);
        enhancer14.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback19 = null;
        enhancer14.setCallback(callback19);
        enhancer14.setUseFactory(false);
        java.lang.ClassLoader classLoader23 = enhancer14.getClassLoader();
        org.mockito.cglib.proxy.Callback callback24 = null;
        enhancer14.setCallback(callback24);
        boolean boolean26 = enhancer14.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer14.getStrategy();
        enhancer0.setStrategy(generatorStrategy27);
        enhancer0.setUseFactory(true);
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
        org.mockito.cglib.proxy.Enhancer enhancer57 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback58 = null;
        enhancer57.setCallback(callback58);
        enhancer57.setUseCache(false);
        enhancer57.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer64 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy65 = enhancer64.getStrategy();
        java.lang.ClassLoader classLoader66 = enhancer64.getClassLoader();
        enhancer57.setClassLoader(classLoader66);
        org.mockito.cglib.core.NamingPolicy namingPolicy68 = enhancer57.getNamingPolicy();
        enhancer31.setNamingPolicy(namingPolicy68);
        org.mockito.cglib.proxy.Enhancer enhancer70 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy71 = enhancer70.getStrategy();
        org.mockito.cglib.proxy.Callback callback72 = null;
        enhancer70.setCallback(callback72);
        enhancer70.setAttemptLoad(true);
        enhancer70.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy78 = enhancer70.getNamingPolicy();
        boolean boolean79 = enhancer70.getUseCache();
        enhancer70.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.core.NamingPolicy namingPolicy82 = enhancer70.getNamingPolicy();
        enhancer70.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy85 = enhancer70.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy86 = enhancer70.getNamingPolicy();
        enhancer31.setNamingPolicy(namingPolicy86);
        enhancer0.setNamingPolicy(namingPolicy86);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(generatorStrategy27);
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
        org.junit.Assert.assertNotNull(generatorStrategy65);
        org.junit.Assert.assertNotNull(classLoader66);
        org.junit.Assert.assertNotNull(namingPolicy68);
        org.junit.Assert.assertNotNull(generatorStrategy71);
        org.junit.Assert.assertNotNull(namingPolicy78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(namingPolicy82);
        org.junit.Assert.assertNotNull(generatorStrategy85);
        org.junit.Assert.assertNotNull(namingPolicy86);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Callback callback4 = null;
        enhancer0.setCallback(callback4);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class7 = null;
        enhancer6.setSuperclass(class7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer6.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer10.getStrategy();
        enhancer6.setStrategy(generatorStrategy11);
        enhancer6.setUseFactory(true);
        java.lang.Class<?> wildcardClass15 = enhancer6.getClass();
        boolean boolean16 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass15);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass15);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback1 = null;
        enhancer0.setCallback(callback1);
        enhancer0.setUseCache(false);
        enhancer0.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer7.getStrategy();
        java.lang.ClassLoader classLoader9 = enhancer7.getClassLoader();
        enhancer0.setClassLoader(classLoader9);
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = enhancer0.getNamingPolicy();
        boolean boolean12 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(true);
        boolean boolean15 = enhancer0.getAttemptLoad();
        enhancer0.setSerialVersionUID((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = enhancer3.getStrategy();
        java.lang.ClassLoader classLoader5 = enhancer3.getClassLoader();
        enhancer3.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer8.getStrategy();
        enhancer8.setSerialVersionUID((java.lang.Long) 0L);
        enhancer8.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        java.lang.Class<?> wildcardClass16 = enhancer14.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer17.getStrategy();
        java.lang.Class<?> wildcardClass19 = enhancer17.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer20.getStrategy();
        enhancer20.setSerialVersionUID((java.lang.Long) 0L);
        enhancer20.setUseFactory(false);
        java.lang.Class<?> wildcardClass26 = enhancer20.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        enhancer27.setSerialVersionUID((java.lang.Long) 0L);
        enhancer27.setUseFactory(false);
        java.lang.Class<?> wildcardClass33 = enhancer27.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class35 = null;
        enhancer34.setSuperclass(class35);
        java.lang.ClassLoader classLoader37 = enhancer34.getClassLoader();
        java.lang.Class<?> wildcardClass38 = enhancer34.getClass();
        java.lang.Class[] classArray39 = new java.lang.Class[] { wildcardClass16, wildcardClass19, wildcardClass26, wildcardClass33, wildcardClass38 };
        enhancer8.setInterfaces(classArray39);
        java.lang.Class<?> wildcardClass41 = enhancer8.getClass();
        enhancer3.setSuperclass((java.lang.Class) wildcardClass41);
        org.mockito.cglib.proxy.Enhancer enhancer43 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = enhancer43.getStrategy();
        enhancer43.setSerialVersionUID((java.lang.Long) 0L);
        enhancer43.setUseFactory(false);
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
        org.mockito.cglib.proxy.Enhancer enhancer64 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy65 = enhancer64.getStrategy();
        java.lang.Class<?> wildcardClass66 = enhancer64.getClass();
        java.lang.Class[] classArray67 = new java.lang.Class[] { wildcardClass51, wildcardClass54, wildcardClass57, wildcardClass60, wildcardClass63, wildcardClass66 };
        enhancer43.setInterfaces(classArray67);
        enhancer3.setInterfaces(classArray67);
        enhancer0.setInterfaces(classArray67);
        boolean boolean71 = enhancer0.getUseCache();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy4);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(classLoader37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(generatorStrategy44);
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
        org.junit.Assert.assertNotNull(generatorStrategy65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(classArray67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter17 = null;
        enhancer0.setCallbackFilter(callbackFilter17);
        org.mockito.cglib.proxy.Callback callback19 = null;
        enhancer0.setCallback(callback19);
        enhancer0.setInterceptDuringConstruction(false);
        java.lang.Class<?> wildcardClass23 = enhancer0.getClass();
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(namingPolicy16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        enhancer0.setAttemptLoad(false);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        java.lang.Class[] classArray74 = null;
        enhancer0.setInterfaces(classArray74);
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
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        enhancer0.setAttemptLoad(false);
        java.lang.ClassLoader classLoader21 = enhancer0.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class22 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: createClass does not accept callbacks");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(classLoader21);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        java.lang.Class<?> wildcardClass26 = enhancer0.getClass();
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
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy42 = enhancer41.getStrategy();
        java.lang.ClassLoader classLoader43 = enhancer41.getClassLoader();
        enhancer27.setClassLoader(classLoader43);
        enhancer27.setSerialVersionUID((java.lang.Long) 0L);
        boolean boolean47 = enhancer27.getUseCache();
        enhancer27.setUseCache(true);
        enhancer27.setUseCache(false);
        enhancer27.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer54 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy55 = enhancer54.getStrategy();
        enhancer54.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer58 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy59 = enhancer58.getStrategy();
        enhancer58.setSerialVersionUID((java.lang.Long) 0L);
        enhancer58.setUseFactory(false);
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
        org.mockito.cglib.proxy.Enhancer enhancer79 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy80 = enhancer79.getStrategy();
        java.lang.Class<?> wildcardClass81 = enhancer79.getClass();
        java.lang.Class[] classArray82 = new java.lang.Class[] { wildcardClass66, wildcardClass69, wildcardClass72, wildcardClass75, wildcardClass78, wildcardClass81 };
        enhancer58.setInterfaces(classArray82);
        org.mockito.cglib.proxy.Callback callback84 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray85 = new org.mockito.cglib.proxy.Callback[] { callback84 };
        enhancer58.setCallbacks(callbackArray85);
        enhancer54.setCallbacks(callbackArray85);
        enhancer27.setCallbacks(callbackArray85);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass26, callbackArray85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy13);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(classLoader25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(namingPolicy30);
        org.junit.Assert.assertNotNull(generatorStrategy32);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(generatorStrategy42);
        org.junit.Assert.assertNotNull(classLoader43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(generatorStrategy55);
        org.junit.Assert.assertNotNull(generatorStrategy59);
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
        org.junit.Assert.assertNotNull(generatorStrategy80);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(classArray82);
        org.junit.Assert.assertNotNull(callbackArray85);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = enhancer0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class29 = null;
        enhancer28.setSuperclass(class29);
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = enhancer28.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer32.getStrategy();
        enhancer32.setSerialVersionUID((java.lang.Long) 0L);
        enhancer32.setUseFactory(false);
        java.lang.Class<?> wildcardClass38 = enhancer32.getClass();
        enhancer28.setSuperclass((java.lang.Class) wildcardClass38);
        org.mockito.cglib.proxy.Callback callback40 = null;
        enhancer28.setCallback(callback40);
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = enhancer42.getStrategy();
        java.lang.ClassLoader classLoader44 = enhancer42.getClassLoader();
        enhancer28.setClassLoader(classLoader44);
        enhancer28.setSerialVersionUID((java.lang.Long) 0L);
        boolean boolean48 = enhancer28.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer49.getStrategy();
        enhancer49.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy53 = enhancer49.getNamingPolicy();
        boolean boolean54 = enhancer49.getAttemptLoad();
        java.lang.ClassLoader classLoader55 = enhancer49.getClassLoader();
        enhancer28.setClassLoader(classLoader55);
        enhancer0.setClassLoader(classLoader55);
        enhancer0.setAttemptLoad(true);
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
        org.junit.Assert.assertNotNull(namingPolicy26);
        org.junit.Assert.assertNotNull(namingPolicy27);
        org.junit.Assert.assertNotNull(namingPolicy31);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(generatorStrategy43);
        org.junit.Assert.assertNotNull(classLoader44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(generatorStrategy50);
        org.junit.Assert.assertNotNull(namingPolicy53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(classLoader55);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = enhancer3.getStrategy();
        java.lang.ClassLoader classLoader5 = enhancer3.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter6 = null;
        enhancer3.setCallbackFilter(callbackFilter6);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer3.getStrategy();
        enhancer0.setStrategy(generatorStrategy8);
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer10.getStrategy();
        enhancer10.setSerialVersionUID((java.lang.Long) 0L);
        enhancer10.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class17 = null;
        enhancer16.setSuperclass(class17);
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = enhancer16.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer20.getStrategy();
        enhancer16.setStrategy(generatorStrategy21);
        enhancer10.setStrategy(generatorStrategy21);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = enhancer24.getStrategy();
        java.lang.Class<?> wildcardClass26 = enhancer24.getClass();
        boolean boolean27 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass26);
        enhancer10.setSuperclass((java.lang.Class) wildcardClass26);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass26);
        org.junit.Assert.assertNotNull(generatorStrategy4);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(namingPolicy19);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer26.getStrategy();
        enhancer26.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback30 = null;
        enhancer26.setCallback(callback30);
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
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = enhancer44.getStrategy();
        enhancer32.setStrategy(generatorStrategy45);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = enhancer32.getStrategy();
        enhancer26.setStrategy(generatorStrategy47);
        enhancer26.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer51 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class52 = null;
        enhancer51.setSuperclass(class52);
        enhancer51.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer51.setUseCache(false);
        java.lang.Class<?> wildcardClass58 = enhancer51.getClass();
        enhancer26.setSuperclass((java.lang.Class) wildcardClass58);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(namingPolicy35);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(generatorStrategy45);
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback4 = null;
        enhancer0.setCallback(callback4);
        enhancer0.setUseCache(false);
        boolean boolean8 = enhancer0.getUseCache();
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Callback callback11 = null;
        enhancer0.setCallback(callback11);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter31 = null;
        enhancer0.setCallbackFilter(callbackFilter31);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(namingPolicy15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(generatorStrategy30);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy52 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter53 = null;
        enhancer0.setCallbackFilter(callbackFilter53);
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
        org.junit.Assert.assertNotNull(generatorStrategy52);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback4 = null;
        enhancer0.setCallback(callback4);
        enhancer0.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer8.getStrategy();
        enhancer8.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer8.getNamingPolicy();
        enhancer8.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer15.getStrategy();
        enhancer15.setSerialVersionUID((java.lang.Long) 0L);
        enhancer15.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer15.getStrategy();
        enhancer8.setStrategy(generatorStrategy21);
        enhancer0.setStrategy(generatorStrategy21);
        java.lang.ClassLoader classLoader24 = enhancer0.getClassLoader();
        enhancer0.setUseCache(true);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertNotNull(namingPolicy12);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(classLoader24);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        java.lang.ClassLoader classLoader3 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class5 = null;
        enhancer4.setSuperclass(class5);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer4.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer8.getStrategy();
        enhancer4.setStrategy(generatorStrategy9);
        enhancer0.setStrategy(generatorStrategy9);
        java.lang.Class<?> wildcardClass12 = enhancer0.getClass();
        boolean boolean13 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass12);
        boolean boolean14 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass12);
        boolean boolean15 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass12);
        org.junit.Assert.assertNotNull(classLoader3);
        org.junit.Assert.assertNotNull(namingPolicy7);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        java.lang.ClassLoader classLoader16 = enhancer14.getClassLoader();
        enhancer0.setClassLoader(classLoader16);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer18.getStrategy();
        enhancer18.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback22 = null;
        enhancer18.setCallback(callback22);
        enhancer18.setUseCache(false);
        boolean boolean26 = enhancer18.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class28 = null;
        enhancer27.setSuperclass(class28);
        enhancer27.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback32 = null;
        enhancer27.setCallback(callback32);
        java.lang.Class<?> wildcardClass34 = enhancer27.getClass();
        enhancer18.setSuperclass((java.lang.Class) wildcardClass34);
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class37 = null;
        enhancer36.setSuperclass(class37);
        java.lang.ClassLoader classLoader39 = enhancer36.getClassLoader();
        enhancer18.setClassLoader(classLoader39);
        enhancer0.setClassLoader(classLoader39);
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class43 = null;
        enhancer42.setSuperclass(class43);
        java.lang.Class<?> wildcardClass45 = enhancer42.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass45);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter47 = null;
        enhancer0.setCallbackFilter(callbackFilter47);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classLoader39);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer38.getStrategy();
        java.lang.ClassLoader classLoader40 = enhancer38.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter41 = null;
        enhancer38.setCallbackFilter(callbackFilter41);
        enhancer38.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer45 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class46 = null;
        enhancer45.setSuperclass(class46);
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = enhancer48.getStrategy();
        java.lang.ClassLoader classLoader50 = enhancer48.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter51 = null;
        enhancer48.setCallbackFilter(callbackFilter51);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = enhancer48.getStrategy();
        enhancer45.setStrategy(generatorStrategy53);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy55 = enhancer45.getStrategy();
        enhancer38.setStrategy(generatorStrategy55);
        enhancer38.setSerialVersionUID((java.lang.Long) 100L);
        org.mockito.cglib.proxy.Enhancer enhancer59 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class60 = null;
        enhancer59.setSuperclass(class60);
        enhancer59.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback64 = null;
        enhancer59.setCallback(callback64);
        enhancer59.setUseFactory(false);
        java.lang.ClassLoader classLoader68 = enhancer59.getClassLoader();
        org.mockito.cglib.proxy.Callback callback69 = null;
        enhancer59.setCallback(callback69);
        org.mockito.cglib.core.NamingPolicy namingPolicy71 = enhancer59.getNamingPolicy();
        enhancer38.setNamingPolicy(namingPolicy71);
        enhancer0.setNamingPolicy(namingPolicy71);
        java.lang.ClassLoader classLoader74 = enhancer0.getClassLoader();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy13);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(namingPolicy28);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertNotNull(classLoader33);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(generatorStrategy39);
        org.junit.Assert.assertNotNull(classLoader40);
        org.junit.Assert.assertNotNull(generatorStrategy49);
        org.junit.Assert.assertNotNull(classLoader50);
        org.junit.Assert.assertNotNull(generatorStrategy53);
        org.junit.Assert.assertNotNull(generatorStrategy55);
        org.junit.Assert.assertNotNull(classLoader68);
        org.junit.Assert.assertNotNull(namingPolicy71);
        org.junit.Assert.assertNotNull(classLoader74);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        org.mockito.cglib.proxy.Enhancer enhancer71 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class72 = null;
        enhancer71.setSuperclass(class72);
        org.mockito.cglib.core.NamingPolicy namingPolicy74 = enhancer71.getNamingPolicy();
        boolean boolean75 = enhancer71.getAttemptLoad();
        enhancer71.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy78 = enhancer71.getStrategy();
        java.lang.ClassLoader classLoader79 = enhancer71.getClassLoader();
        enhancer0.setClassLoader(classLoader79);
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
        org.junit.Assert.assertNotNull(namingPolicy74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(generatorStrategy78);
        org.junit.Assert.assertNotNull(classLoader79);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        java.lang.ClassLoader classLoader16 = enhancer14.getClassLoader();
        enhancer0.setClassLoader(classLoader16);
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        boolean boolean20 = enhancer0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer0.getStrategy();
        enhancer0.setInterceptDuringConstruction(true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(generatorStrategy21);
    }
}

