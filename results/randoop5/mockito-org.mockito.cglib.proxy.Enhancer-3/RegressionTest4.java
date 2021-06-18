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
        org.mockito.cglib.proxy.Callback callback31 = null;
        enhancer17.setCallback(callback31);
        java.lang.ClassLoader classLoader33 = enhancer17.getClassLoader();
        enhancer0.setClassLoader(classLoader33);
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = enhancer0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = enhancer0.getNamingPolicy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(namingPolicy20);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(classLoader33);
        org.junit.Assert.assertNotNull(namingPolicy35);
        org.junit.Assert.assertNotNull(namingPolicy36);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        enhancer0.setUseCache(false);
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer7.getStrategy();
        java.lang.ClassLoader classLoader9 = enhancer7.getClassLoader();
        enhancer7.setUseFactory(true);
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
        java.lang.Class<?> wildcardClass45 = enhancer12.getClass();
        enhancer7.setSuperclass((java.lang.Class) wildcardClass45);
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = enhancer47.getStrategy();
        enhancer47.setSerialVersionUID((java.lang.Long) 0L);
        enhancer47.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = enhancer53.getStrategy();
        java.lang.Class<?> wildcardClass55 = enhancer53.getClass();
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
        java.lang.Class[] classArray71 = new java.lang.Class[] { wildcardClass55, wildcardClass58, wildcardClass61, wildcardClass64, wildcardClass67, wildcardClass70 };
        enhancer47.setInterfaces(classArray71);
        enhancer7.setInterfaces(classArray71);
        org.mockito.cglib.proxy.Callback callback74 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj75 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass6, classArray71, callback74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(classLoader9);
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
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(generatorStrategy48);
        org.junit.Assert.assertNotNull(generatorStrategy54);
        org.junit.Assert.assertNotNull(wildcardClass55);
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
        org.junit.Assert.assertNotNull(classArray71);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        java.lang.ClassLoader classLoader29 = enhancer27.getClassLoader();
        enhancer13.setClassLoader(classLoader29);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = enhancer31.getStrategy();
        enhancer31.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback35 = null;
        enhancer31.setCallback(callback35);
        enhancer31.setUseCache(false);
        boolean boolean39 = enhancer31.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class41 = null;
        enhancer40.setSuperclass(class41);
        enhancer40.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback45 = null;
        enhancer40.setCallback(callback45);
        java.lang.Class<?> wildcardClass47 = enhancer40.getClass();
        enhancer31.setSuperclass((java.lang.Class) wildcardClass47);
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class50 = null;
        enhancer49.setSuperclass(class50);
        java.lang.ClassLoader classLoader52 = enhancer49.getClassLoader();
        enhancer31.setClassLoader(classLoader52);
        enhancer13.setClassLoader(classLoader52);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy55 = enhancer13.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy57 = enhancer56.getStrategy();
        org.mockito.cglib.proxy.Callback callback58 = null;
        enhancer56.setCallback(callback58);
        enhancer56.setAttemptLoad(true);
        enhancer56.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy64 = enhancer56.getNamingPolicy();
        java.lang.ClassLoader classLoader65 = enhancer56.getClassLoader();
        enhancer13.setClassLoader(classLoader65);
        enhancer0.setClassLoader(classLoader65);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy11);
        org.junit.Assert.assertNotNull(namingPolicy12);
        org.junit.Assert.assertNotNull(namingPolicy16);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(classLoader29);
        org.junit.Assert.assertNotNull(generatorStrategy32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(classLoader52);
        org.junit.Assert.assertNotNull(generatorStrategy55);
        org.junit.Assert.assertNotNull(generatorStrategy57);
        org.junit.Assert.assertNotNull(namingPolicy64);
        org.junit.Assert.assertNotNull(classLoader65);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        boolean boolean31 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Callback callback32 = null;
        enhancer0.setCallback(callback32);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 1L);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(generatorStrategy13);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        org.mockito.asm.ClassVisitor classVisitor44 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor44);
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
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass11 = generatorStrategy10.getClass();
        boolean boolean12 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass11);
        org.mockito.cglib.proxy.Callback[] callbackArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass11, callbackArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.DefaultGeneratorStrategy is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy4);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Callback callback2 = null;
        enhancer0.setCallback(callback2);
        enhancer0.setAttemptLoad(true);
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = enhancer0.getNamingPolicy();
        boolean boolean9 = enhancer0.getUseCache();
        enhancer0.setUseFactory(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer13.getStrategy();
        java.lang.ClassLoader classLoader15 = enhancer13.getClassLoader();
        enhancer13.setUseFactory(true);
        enhancer13.setUseFactory(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer13.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer21.getStrategy();
        enhancer21.setSerialVersionUID((java.lang.Long) 0L);
        enhancer21.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class28 = null;
        enhancer27.setSuperclass(class28);
        java.lang.ClassLoader classLoader30 = enhancer27.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class32 = null;
        enhancer31.setSuperclass(class32);
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = enhancer31.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer35.getStrategy();
        enhancer31.setStrategy(generatorStrategy36);
        enhancer27.setStrategy(generatorStrategy36);
        enhancer21.setStrategy(generatorStrategy36);
        enhancer21.setUseCache(false);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter42 = null;
        enhancer21.setCallbackFilter(callbackFilter42);
        enhancer21.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = enhancer46.getStrategy();
        java.lang.ClassLoader classLoader48 = enhancer46.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter49 = null;
        enhancer46.setCallbackFilter(callbackFilter49);
        enhancer46.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class54 = null;
        enhancer53.setSuperclass(class54);
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy57 = enhancer56.getStrategy();
        java.lang.ClassLoader classLoader58 = enhancer56.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter59 = null;
        enhancer56.setCallbackFilter(callbackFilter59);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy61 = enhancer56.getStrategy();
        enhancer53.setStrategy(generatorStrategy61);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy63 = enhancer53.getStrategy();
        enhancer46.setStrategy(generatorStrategy63);
        org.mockito.cglib.core.NamingPolicy namingPolicy65 = enhancer46.getNamingPolicy();
        enhancer21.setNamingPolicy(namingPolicy65);
        enhancer13.setNamingPolicy(namingPolicy65);
        org.mockito.cglib.proxy.Enhancer enhancer68 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy69 = enhancer68.getStrategy();
        java.lang.ClassLoader classLoader70 = enhancer68.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter71 = null;
        enhancer68.setCallbackFilter(callbackFilter71);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy73 = enhancer68.getStrategy();
        java.lang.ClassLoader classLoader74 = enhancer68.getClassLoader();
        enhancer13.setClassLoader(classLoader74);
        java.lang.ClassLoader classLoader76 = enhancer13.getClassLoader();
        enhancer0.setClassLoader(classLoader76);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(classLoader30);
        org.junit.Assert.assertNotNull(namingPolicy34);
        org.junit.Assert.assertNotNull(generatorStrategy36);
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(classLoader48);
        org.junit.Assert.assertNotNull(generatorStrategy57);
        org.junit.Assert.assertNotNull(classLoader58);
        org.junit.Assert.assertNotNull(generatorStrategy61);
        org.junit.Assert.assertNotNull(generatorStrategy63);
        org.junit.Assert.assertNotNull(namingPolicy65);
        org.junit.Assert.assertNotNull(generatorStrategy69);
        org.junit.Assert.assertNotNull(classLoader70);
        org.junit.Assert.assertNotNull(generatorStrategy73);
        org.junit.Assert.assertNotNull(classLoader74);
        org.junit.Assert.assertNotNull(classLoader76);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Callback[] callbackArray9 = null;
        enhancer0.setCallbacks(callbackArray9);
        enhancer0.setInterceptDuringConstruction(true);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy4);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        enhancer0.setAttemptLoad(false);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(namingPolicy12);
        org.junit.Assert.assertNotNull(generatorStrategy15);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = enhancer0.getNamingPolicy();
        boolean boolean5 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader6 = enhancer0.getClassLoader();
        java.lang.ClassLoader classLoader7 = enhancer0.getClassLoader();
        enhancer0.setUseCache(false);
        boolean boolean10 = enhancer0.getAttemptLoad();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(namingPolicy4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class2 = null;
        enhancer1.setSuperclass(class2);
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = enhancer1.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = enhancer5.getStrategy();
        enhancer5.setSerialVersionUID((java.lang.Long) 0L);
        enhancer5.setUseFactory(false);
        java.lang.Class<?> wildcardClass11 = enhancer5.getClass();
        enhancer1.setSuperclass((java.lang.Class) wildcardClass11);
        org.mockito.cglib.proxy.Callback callback13 = null;
        enhancer1.setCallback(callback13);
        org.mockito.cglib.proxy.Callback callback15 = null;
        enhancer1.setCallback(callback15);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer1.getStrategy();
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
        org.mockito.cglib.proxy.Callback callback32 = null;
        enhancer18.setCallback(callback32);
        java.lang.ClassLoader classLoader34 = enhancer18.getClassLoader();
        enhancer1.setClassLoader(classLoader34);
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = enhancer1.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy36);
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer38.getStrategy();
        java.lang.ClassLoader classLoader40 = enhancer38.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter41 = null;
        enhancer38.setCallbackFilter(callbackFilter41);
        org.mockito.cglib.core.NamingPolicy namingPolicy43 = enhancer38.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = enhancer44.getStrategy();
        enhancer44.setSerialVersionUID((java.lang.Long) 0L);
        enhancer44.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = enhancer50.getStrategy();
        java.lang.Class<?> wildcardClass52 = enhancer50.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = enhancer53.getStrategy();
        java.lang.Class<?> wildcardClass55 = enhancer53.getClass();
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
        java.lang.Class[] classArray68 = new java.lang.Class[] { wildcardClass52, wildcardClass55, wildcardClass58, wildcardClass61, wildcardClass64, wildcardClass67 };
        enhancer44.setInterfaces(classArray68);
        org.mockito.cglib.proxy.Callback callback70 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray71 = new org.mockito.cglib.proxy.Callback[] { callback70 };
        enhancer44.setCallbacks(callbackArray71);
        enhancer38.setCallbacks(callbackArray71);
        enhancer0.setCallbacks(callbackArray71);
        org.junit.Assert.assertNotNull(namingPolicy4);
        org.junit.Assert.assertNotNull(generatorStrategy6);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(namingPolicy21);
        org.junit.Assert.assertNotNull(generatorStrategy23);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(classLoader34);
        org.junit.Assert.assertNotNull(namingPolicy36);
        org.junit.Assert.assertNotNull(generatorStrategy39);
        org.junit.Assert.assertNotNull(classLoader40);
        org.junit.Assert.assertNotNull(namingPolicy43);
        org.junit.Assert.assertNotNull(generatorStrategy45);
        org.junit.Assert.assertNotNull(generatorStrategy51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(generatorStrategy54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(generatorStrategy57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(generatorStrategy60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(generatorStrategy63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(generatorStrategy66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(classArray68);
        org.junit.Assert.assertNotNull(callbackArray71);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        java.lang.Class class29 = null;
        enhancer28.setSuperclass(class29);
        enhancer28.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback33 = null;
        enhancer28.setCallback(callback33);
        enhancer28.setUseFactory(false);
        java.lang.ClassLoader classLoader37 = enhancer28.getClassLoader();
        org.mockito.cglib.proxy.Callback callback38 = null;
        enhancer28.setCallback(callback38);
        boolean boolean40 = enhancer28.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        enhancer41.setUseCache(false);
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
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy58 = enhancer44.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer59 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy60 = enhancer59.getStrategy();
        enhancer59.setSerialVersionUID((java.lang.Long) 0L);
        enhancer59.setUseFactory(false);
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
        org.mockito.cglib.proxy.Enhancer enhancer80 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy81 = enhancer80.getStrategy();
        java.lang.Class<?> wildcardClass82 = enhancer80.getClass();
        java.lang.Class[] classArray83 = new java.lang.Class[] { wildcardClass67, wildcardClass70, wildcardClass73, wildcardClass76, wildcardClass79, wildcardClass82 };
        enhancer59.setInterfaces(classArray83);
        enhancer44.setInterfaces(classArray83);
        enhancer41.setInterfaces(classArray83);
        enhancer28.setInterfaces(classArray83);
        org.mockito.cglib.core.NamingPolicy namingPolicy88 = enhancer28.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy88);
        java.lang.Class<?> wildcardClass90 = enhancer0.getClass();
        boolean boolean91 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass90);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertNotNull(generatorStrategy24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(namingPolicy26);
        org.junit.Assert.assertNotNull(classLoader37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(namingPolicy47);
        org.junit.Assert.assertNotNull(generatorStrategy49);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(generatorStrategy58);
        org.junit.Assert.assertNotNull(generatorStrategy60);
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
        org.junit.Assert.assertNotNull(generatorStrategy81);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(classArray83);
        org.junit.Assert.assertNotNull(namingPolicy88);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = enhancer0.getNamingPolicy();
        enhancer0.setUseCache(false);
        enhancer0.setAttemptLoad(true);
        enhancer0.setUseCache(false);
        org.junit.Assert.assertNotNull(namingPolicy3);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        org.mockito.cglib.proxy.Callback callback72 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj73 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass70, callback72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertNotNull(generatorStrategy37);
        org.junit.Assert.assertNotNull(namingPolicy45);
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(classLoader60);
        org.junit.Assert.assertNotNull(generatorStrategy65);
        org.junit.Assert.assertNotNull(classLoader66);
        org.junit.Assert.assertNotNull(generatorStrategy69);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        org.mockito.cglib.proxy.Callback callback13 = null;
        enhancer0.setCallback(callback13);
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = enhancer0.getNamingPolicy();
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
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = enhancer44.getStrategy();
        enhancer44.setSerialVersionUID((java.lang.Long) 0L);
        enhancer44.setAttemptLoad(false);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter50 = null;
        enhancer44.setCallbackFilter(callbackFilter50);
        java.lang.ClassLoader classLoader52 = enhancer44.getClassLoader();
        enhancer18.setClassLoader(classLoader52);
        java.lang.Class<?> wildcardClass54 = enhancer18.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass54);
        java.lang.ClassLoader classLoader56 = enhancer0.getClassLoader();
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy12);
        org.junit.Assert.assertNotNull(namingPolicy17);
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
        org.junit.Assert.assertNotNull(generatorStrategy45);
        org.junit.Assert.assertNotNull(classLoader52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(classLoader56);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        enhancer14.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = enhancer14.getNamingPolicy();
        org.mockito.cglib.proxy.Callback callback19 = null;
        enhancer14.setCallback(callback19);
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
        enhancer21.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = enhancer21.getNamingPolicy();
        enhancer14.setNamingPolicy(namingPolicy37);
        enhancer0.setNamingPolicy(namingPolicy37);
        java.lang.ClassLoader classLoader40 = enhancer0.getClassLoader();
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(namingPolicy18);
        org.junit.Assert.assertNotNull(namingPolicy24);
        org.junit.Assert.assertNotNull(generatorStrategy26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(namingPolicy37);
        org.junit.Assert.assertNotNull(classLoader40);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer18.getStrategy();
        enhancer18.setSerialVersionUID((java.lang.Long) 0L);
        enhancer18.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class25 = null;
        enhancer24.setSuperclass(class25);
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = enhancer24.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = enhancer28.getStrategy();
        enhancer24.setStrategy(generatorStrategy29);
        enhancer18.setStrategy(generatorStrategy29);
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer32.getStrategy();
        java.lang.Class<?> wildcardClass34 = enhancer32.getClass();
        boolean boolean35 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass34);
        enhancer18.setSuperclass((java.lang.Class) wildcardClass34);
        boolean boolean37 = enhancer18.getUseCache();
        java.lang.ClassLoader classLoader38 = enhancer18.getClassLoader();
        enhancer0.setClassLoader(classLoader38);
        java.lang.ClassLoader classLoader40 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter42 = null;
        enhancer0.setCallbackFilter(callbackFilter42);
        java.lang.ClassLoader classLoader44 = enhancer0.getClassLoader();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(namingPolicy17);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertNotNull(namingPolicy27);
        org.junit.Assert.assertNotNull(generatorStrategy29);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(classLoader38);
        org.junit.Assert.assertNotNull(classLoader40);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(classLoader44);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setUseCache(false);
        enhancer0.setInterceptDuringConstruction(false);
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
        enhancer11.setAttemptLoad(false);
        boolean boolean30 = enhancer11.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer11.getStrategy();
        enhancer0.setStrategy(generatorStrategy31);
        org.mockito.cglib.proxy.Callback callback33 = null;
        enhancer0.setCallback(callback33);
        boolean boolean35 = enhancer0.getUseCache();
        org.junit.Assert.assertNotNull(namingPolicy14);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(namingPolicy27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(generatorStrategy31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
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
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        boolean boolean27 = enhancer0.getAttemptLoad();
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = enhancer30.getStrategy();
        enhancer30.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = enhancer30.getNamingPolicy();
        enhancer30.setSerialVersionUID((java.lang.Long) 10L);
        enhancer30.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        enhancer39.setUseCache(false);
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
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = enhancer42.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer57 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy58 = enhancer57.getStrategy();
        enhancer57.setSerialVersionUID((java.lang.Long) 0L);
        enhancer57.setUseFactory(false);
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
        org.mockito.cglib.proxy.Enhancer enhancer78 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy79 = enhancer78.getStrategy();
        java.lang.Class<?> wildcardClass80 = enhancer78.getClass();
        java.lang.Class[] classArray81 = new java.lang.Class[] { wildcardClass65, wildcardClass68, wildcardClass71, wildcardClass74, wildcardClass77, wildcardClass80 };
        enhancer57.setInterfaces(classArray81);
        enhancer42.setInterfaces(classArray81);
        enhancer39.setInterfaces(classArray81);
        enhancer30.setInterfaces(classArray81);
        enhancer0.setInterfaces(classArray81);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(namingPolicy22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(generatorStrategy31);
        org.junit.Assert.assertNotNull(namingPolicy34);
        org.junit.Assert.assertNotNull(namingPolicy45);
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(generatorStrategy56);
        org.junit.Assert.assertNotNull(generatorStrategy58);
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
        org.junit.Assert.assertNotNull(generatorStrategy79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(classArray81);
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
        java.lang.Class<?> wildcardClass19 = generatorStrategy17.getClass();
        boolean boolean20 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass19);
        boolean boolean21 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass19);
        boolean boolean22 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass19);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(classLoader12);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer40.getStrategy();
        enhancer40.setSerialVersionUID((java.lang.Long) 0L);
        enhancer40.setUseFactory(false);
        java.lang.Class<?> wildcardClass46 = enhancer40.getClass();
        enhancer36.setSuperclass((java.lang.Class) wildcardClass46);
        org.mockito.cglib.proxy.Callback callback48 = null;
        enhancer36.setCallback(callback48);
        org.mockito.cglib.proxy.Callback callback50 = null;
        enhancer36.setCallback(callback50);
        java.lang.ClassLoader classLoader52 = enhancer36.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy53 = enhancer36.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy53);
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
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(classLoader52);
        org.junit.Assert.assertNotNull(namingPolicy53);
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
        enhancer0.setUseFactory(true);
        enhancer0.setUseCache(true);
        java.lang.ClassLoader classLoader31 = null;
        enhancer0.setClassLoader(classLoader31);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(namingPolicy22);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        java.lang.Class class36 = null;
        enhancer35.setSuperclass(class36);
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer38.getStrategy();
        java.lang.ClassLoader classLoader40 = enhancer38.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter41 = null;
        enhancer38.setCallbackFilter(callbackFilter41);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = enhancer38.getStrategy();
        enhancer35.setStrategy(generatorStrategy43);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = enhancer35.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = enhancer46.getStrategy();
        enhancer46.setSerialVersionUID((java.lang.Long) 0L);
        enhancer46.setUseFactory(false);
        enhancer46.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer54 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy55 = enhancer54.getStrategy();
        java.lang.Class<?> wildcardClass56 = enhancer54.getClass();
        boolean boolean57 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass56);
        enhancer46.setSuperclass((java.lang.Class) wildcardClass56);
        enhancer35.setSuperclass((java.lang.Class) wildcardClass56);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass56);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader63 = enhancer0.getClassLoader();
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
        org.junit.Assert.assertNotNull(generatorStrategy39);
        org.junit.Assert.assertNotNull(classLoader40);
        org.junit.Assert.assertNotNull(generatorStrategy43);
        org.junit.Assert.assertNotNull(generatorStrategy45);
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(generatorStrategy55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(classLoader63);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter3 = null;
        enhancer0.setCallbackFilter(callbackFilter3);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        boolean boolean9 = enhancer0.getAttemptLoad();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        java.lang.ClassLoader classLoader2 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class4 = null;
        enhancer3.setSuperclass(class4);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer6.getStrategy();
        java.lang.ClassLoader classLoader8 = enhancer6.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter9 = null;
        enhancer6.setCallbackFilter(callbackFilter9);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer6.getStrategy();
        enhancer3.setStrategy(generatorStrategy11);
        enhancer0.setStrategy(generatorStrategy11);
        boolean boolean14 = enhancer0.getUseCache();
        enhancer0.setInterceptDuringConstruction(false);
        java.lang.Class<?> wildcardClass17 = enhancer0.getClass();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer11.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer13.getStrategy();
        enhancer13.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback17 = null;
        enhancer13.setCallback(callback17);
        enhancer13.setUseCache(false);
        boolean boolean21 = enhancer13.getUseCache();
        org.mockito.cglib.proxy.Callback callback22 = null;
        enhancer13.setCallback(callback22);
        java.lang.Class<?> wildcardClass24 = enhancer13.getClass();
        enhancer11.setSuperclass((java.lang.Class) wildcardClass24);
        java.lang.Class[] classArray26 = new java.lang.Class[] { wildcardClass24 };
        enhancer0.setInterfaces(classArray26);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = enhancer28.getStrategy();
        enhancer28.setSerialVersionUID((java.lang.Long) 0L);
        enhancer28.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = enhancer34.getStrategy();
        enhancer34.setSerialVersionUID((java.lang.Long) 0L);
        enhancer34.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = enhancer34.getStrategy();
        enhancer28.setStrategy(generatorStrategy40);
        enhancer28.setUseCache(false);
        boolean boolean44 = enhancer28.getUseCache();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter45 = null;
        enhancer28.setCallbackFilter(callbackFilter45);
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class48 = null;
        enhancer47.setSuperclass(class48);
        java.lang.ClassLoader classLoader50 = enhancer47.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer51 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class52 = null;
        enhancer51.setSuperclass(class52);
        org.mockito.cglib.core.NamingPolicy namingPolicy54 = enhancer51.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = enhancer55.getStrategy();
        enhancer51.setStrategy(generatorStrategy56);
        enhancer47.setStrategy(generatorStrategy56);
        java.lang.Class<?> wildcardClass59 = enhancer47.getClass();
        boolean boolean60 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass59);
        enhancer28.setSuperclass((java.lang.Class) wildcardClass59);
        boolean boolean62 = enhancer28.getAttemptLoad();
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
        org.mockito.cglib.proxy.Enhancer enhancer74 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy75 = enhancer74.getStrategy();
        enhancer74.setSerialVersionUID((java.lang.Long) 0L);
        enhancer74.setUseFactory(false);
        enhancer74.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer82 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy83 = enhancer82.getStrategy();
        java.lang.Class<?> wildcardClass84 = enhancer82.getClass();
        boolean boolean85 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass84);
        enhancer74.setSuperclass((java.lang.Class) wildcardClass84);
        enhancer63.setSuperclass((java.lang.Class) wildcardClass84);
        enhancer28.setSuperclass((java.lang.Class) wildcardClass84);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass84);
        org.mockito.cglib.proxy.Callback callback90 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj91 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass84, callback90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(namingPolicy12);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(generatorStrategy29);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertNotNull(generatorStrategy40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(classLoader50);
        org.junit.Assert.assertNotNull(namingPolicy54);
        org.junit.Assert.assertNotNull(generatorStrategy56);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(generatorStrategy67);
        org.junit.Assert.assertNotNull(classLoader68);
        org.junit.Assert.assertNotNull(generatorStrategy71);
        org.junit.Assert.assertNotNull(generatorStrategy73);
        org.junit.Assert.assertNotNull(generatorStrategy75);
        org.junit.Assert.assertNotNull(generatorStrategy83);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        org.mockito.cglib.proxy.CallbackFilter callbackFilter35 = null;
        enhancer0.setCallbackFilter(callbackFilter35);
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = enhancer37.getStrategy();
        java.lang.ClassLoader classLoader39 = enhancer37.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter40 = null;
        enhancer37.setCallbackFilter(callbackFilter40);
        enhancer37.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter44 = null;
        enhancer37.setCallbackFilter(callbackFilter44);
        org.mockito.cglib.core.NamingPolicy namingPolicy46 = enhancer37.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy46);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter48 = null;
        enhancer0.setCallbackFilter(callbackFilter48);
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
        org.junit.Assert.assertNotNull(generatorStrategy38);
        org.junit.Assert.assertNotNull(classLoader39);
        org.junit.Assert.assertNotNull(namingPolicy46);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        boolean boolean2 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = enhancer3.getStrategy();
        enhancer3.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer3.setCallback(callback7);
        enhancer3.setUseCache(false);
        boolean boolean11 = enhancer3.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class13 = null;
        enhancer12.setSuperclass(class13);
        enhancer12.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Callback callback17 = null;
        enhancer12.setCallback(callback17);
        java.lang.Class<?> wildcardClass19 = enhancer12.getClass();
        enhancer3.setSuperclass((java.lang.Class) wildcardClass19);
        boolean boolean21 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass19);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass19);
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = enhancer0.getNamingPolicy();
        enhancer0.setAttemptLoad(true);
        java.lang.Class<?> wildcardClass26 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer27.getStrategy();
        enhancer27.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = enhancer27.getNamingPolicy();
        org.mockito.cglib.proxy.Callback callback32 = null;
        enhancer27.setCallback(callback32);
        enhancer27.setAttemptLoad(true);
        boolean boolean36 = enhancer27.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class38 = null;
        enhancer37.setSuperclass(class38);
        enhancer37.setSerialVersionUID((java.lang.Long) (-1L));
        java.lang.ClassLoader classLoader42 = enhancer37.getClassLoader();
        java.lang.Class class43 = null;
        enhancer37.setSuperclass(class43);
        enhancer37.setAttemptLoad(true);
        org.mockito.cglib.proxy.Callback callback47 = null;
        enhancer37.setCallback(callback47);
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
        org.mockito.cglib.proxy.Callback callback63 = null;
        enhancer49.setCallback(callback63);
        java.lang.ClassLoader classLoader65 = enhancer49.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer66 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy67 = enhancer66.getStrategy();
        enhancer66.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback70 = null;
        enhancer66.setCallback(callback70);
        enhancer66.setUseCache(false);
        boolean boolean74 = enhancer66.getUseCache();
        enhancer66.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.proxy.Enhancer enhancer77 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy78 = enhancer77.getStrategy();
        java.lang.ClassLoader classLoader79 = enhancer77.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter80 = null;
        enhancer77.setCallbackFilter(callbackFilter80);
        org.mockito.cglib.core.NamingPolicy namingPolicy82 = enhancer77.getNamingPolicy();
        enhancer66.setNamingPolicy(namingPolicy82);
        java.lang.Class<?> wildcardClass84 = enhancer66.getClass();
        enhancer49.setSuperclass((java.lang.Class) wildcardClass84);
        org.mockito.cglib.proxy.Callback callback86 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray87 = new org.mockito.cglib.proxy.Callback[] { callback86 };
        enhancer49.setCallbacks(callbackArray87);
        enhancer37.setCallbacks(callbackArray87);
        enhancer27.setCallbacks(callbackArray87);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass26, callbackArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(generatorStrategy4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(namingPolicy23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(namingPolicy31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(classLoader42);
        org.junit.Assert.assertNotNull(namingPolicy52);
        org.junit.Assert.assertNotNull(generatorStrategy54);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(classLoader65);
        org.junit.Assert.assertNotNull(generatorStrategy67);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(generatorStrategy78);
        org.junit.Assert.assertNotNull(classLoader79);
        org.junit.Assert.assertNotNull(namingPolicy82);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(callbackArray87);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy92 = enhancer0.getNamingPolicy();
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
        org.junit.Assert.assertNotNull(namingPolicy92);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setUseCache(false);
        boolean boolean5 = enhancer0.getUseCache();
        enhancer0.setUseCache(true);
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer10.getStrategy();
        enhancer10.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class15 = null;
        enhancer14.setSuperclass(class15);
        java.lang.ClassLoader classLoader17 = enhancer14.getClassLoader();
        enhancer10.setClassLoader(classLoader17);
        enhancer0.setClassLoader(classLoader17);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter20 = null;
        enhancer0.setCallbackFilter(callbackFilter20);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(classLoader17);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        org.mockito.cglib.proxy.Callback callback62 = null;
        enhancer0.setCallback(callback62);
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
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        java.lang.ClassLoader classLoader5 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class7 = null;
        enhancer6.setSuperclass(class7);
        enhancer6.setSerialVersionUID((java.lang.Long) (-1L));
        enhancer6.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class14 = null;
        enhancer13.setSuperclass(class14);
        enhancer13.setSerialVersionUID((java.lang.Long) (-1L));
        java.lang.ClassLoader classLoader18 = enhancer13.getClassLoader();
        enhancer6.setClassLoader(classLoader18);
        enhancer0.setClassLoader(classLoader18);
        enhancer0.setAttemptLoad(false);
        enhancer0.setUseFactory(false);
        enhancer0.setUseFactory(false);
        enhancer0.setUseCache(false);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(classLoader18);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        boolean boolean2 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        java.lang.ClassLoader classLoader5 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = enhancer0.getStrategy();
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(generatorStrategy6);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Callback callback1 = null;
        enhancer0.setCallback(callback1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter4 = null;
        enhancer0.setCallbackFilter(callbackFilter4);
        enhancer0.setUseFactory(false);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        boolean boolean10 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader11 = enhancer0.getClassLoader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(classLoader11);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class<?> wildcardClass1 = enhancer0.getClass();
        boolean boolean2 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass1);
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class4 = null;
        enhancer3.setSuperclass(class4);
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = enhancer3.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer7.getStrategy();
        enhancer7.setSerialVersionUID((java.lang.Long) 0L);
        enhancer7.setUseFactory(false);
        java.lang.Class<?> wildcardClass13 = enhancer7.getClass();
        enhancer3.setSuperclass((java.lang.Class) wildcardClass13);
        org.mockito.cglib.proxy.Callback callback15 = null;
        enhancer3.setCallback(callback15);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer3.getStrategy();
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
        enhancer3.setInterfaces(classArray42);
        enhancer3.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter47 = null;
        enhancer3.setCallbackFilter(callbackFilter47);
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer49.getStrategy();
        enhancer49.setSerialVersionUID((java.lang.Long) 0L);
        enhancer49.setUseFactory(false);
        java.lang.Class<?> wildcardClass55 = enhancer49.getClass();
        boolean boolean56 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass55);
        enhancer3.setSuperclass((java.lang.Class) wildcardClass55);
        org.mockito.cglib.proxy.Enhancer enhancer58 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy59 = enhancer58.getStrategy();
        enhancer58.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.core.NamingPolicy namingPolicy62 = enhancer58.getNamingPolicy();
        enhancer58.setSerialVersionUID((java.lang.Long) 10L);
        enhancer58.setUseFactory(false);
        enhancer58.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Enhancer enhancer69 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy70 = enhancer69.getStrategy();
        enhancer69.setSerialVersionUID((java.lang.Long) 0L);
        enhancer69.setUseFactory(false);
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
        org.mockito.cglib.proxy.Enhancer enhancer87 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy88 = enhancer87.getStrategy();
        java.lang.Class<?> wildcardClass89 = enhancer87.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer90 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy91 = enhancer90.getStrategy();
        java.lang.Class<?> wildcardClass92 = enhancer90.getClass();
        java.lang.Class[] classArray93 = new java.lang.Class[] { wildcardClass77, wildcardClass80, wildcardClass83, wildcardClass86, wildcardClass89, wildcardClass92 };
        enhancer69.setInterfaces(classArray93);
        enhancer58.setInterfaces(classArray93);
        enhancer3.setInterfaces(classArray93);
        java.util.List list97 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass1, classArray93, list97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(namingPolicy6);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(generatorStrategy17);
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
        org.junit.Assert.assertNotNull(generatorStrategy50);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(generatorStrategy59);
        org.junit.Assert.assertNotNull(namingPolicy62);
        org.junit.Assert.assertNotNull(generatorStrategy70);
        org.junit.Assert.assertNotNull(generatorStrategy76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(generatorStrategy79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(generatorStrategy82);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(generatorStrategy85);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(generatorStrategy88);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(generatorStrategy91);
        org.junit.Assert.assertNotNull(wildcardClass92);
        org.junit.Assert.assertNotNull(classArray93);
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
        org.mockito.cglib.proxy.CallbackFilter callbackFilter7 = null;
        enhancer0.setCallbackFilter(callbackFilter7);
        boolean boolean9 = enhancer0.getAttemptLoad();
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer0.getStrategy();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(generatorStrategy12);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer0.getNamingPolicy();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(namingPolicy12);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        enhancer0.setInterceptDuringConstruction(false);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(classLoader21);
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
        org.mockito.cglib.proxy.Callback callback26 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray27 = new org.mockito.cglib.proxy.Callback[] { callback26 };
        enhancer0.setCallbacks(callbackArray27);
        java.lang.ClassLoader classLoader29 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Callback callback30 = null;
        enhancer0.setCallback(callback30);
        boolean boolean32 = enhancer0.getUseCache();
        enhancer0.setUseFactory(true);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        enhancer0.setUseCache(false);
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
        boolean boolean11 = enhancer0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class14 = null;
        enhancer13.setSuperclass(class14);
        enhancer13.setUseCache(false);
        boolean boolean18 = enhancer13.getUseCache();
        enhancer13.setUseCache(true);
        java.lang.ClassLoader classLoader21 = enhancer13.getClassLoader();
        enhancer0.setClassLoader(classLoader21);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(namingPolicy12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(classLoader21);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 0L);
        org.mockito.cglib.proxy.Callback callback4 = null;
        enhancer0.setCallback(callback4);
        enhancer0.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer8.getStrategy();
        java.lang.ClassLoader classLoader10 = enhancer8.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter11 = null;
        enhancer8.setCallbackFilter(callbackFilter11);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer8.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer14.getStrategy();
        enhancer14.setSerialVersionUID((java.lang.Long) 0L);
        enhancer14.setUseFactory(false);
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
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer35.getStrategy();
        java.lang.Class<?> wildcardClass37 = enhancer35.getClass();
        java.lang.Class[] classArray38 = new java.lang.Class[] { wildcardClass22, wildcardClass25, wildcardClass28, wildcardClass31, wildcardClass34, wildcardClass37 };
        enhancer14.setInterfaces(classArray38);
        org.mockito.cglib.proxy.Callback callback40 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray41 = new org.mockito.cglib.proxy.Callback[] { callback40 };
        enhancer14.setCallbacks(callbackArray41);
        enhancer8.setCallbacks(callbackArray41);
        enhancer0.setCallbacks(callbackArray41);
        java.lang.ClassLoader classLoader45 = enhancer0.getClassLoader();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(namingPolicy13);
        org.junit.Assert.assertNotNull(generatorStrategy15);
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
        org.junit.Assert.assertNotNull(generatorStrategy36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertNotNull(callbackArray41);
        org.junit.Assert.assertNotNull(classLoader45);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        enhancer0.setSuperclass(class1);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = enhancer5.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer7.getStrategy();
        enhancer7.setSerialVersionUID((java.lang.Long) 0L);
        enhancer7.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class14 = null;
        enhancer13.setSuperclass(class14);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = enhancer13.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer17.getStrategy();
        enhancer13.setStrategy(generatorStrategy18);
        enhancer7.setStrategy(generatorStrategy18);
        enhancer5.setStrategy(generatorStrategy18);
        enhancer0.setStrategy(generatorStrategy18);
        enhancer0.setUseFactory(true);
        org.junit.Assert.assertNotNull(generatorStrategy6);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(namingPolicy16);
        org.junit.Assert.assertNotNull(generatorStrategy18);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        java.lang.Class[] classArray21 = null;
        enhancer0.setInterfaces(classArray21);
        org.mockito.cglib.proxy.Callback callback23 = null;
        enhancer0.setCallback(callback23);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer26.getStrategy();
        java.lang.ClassLoader classLoader28 = enhancer26.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter29 = null;
        enhancer26.setCallbackFilter(callbackFilter29);
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = enhancer26.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer32.getStrategy();
        enhancer32.setSerialVersionUID((java.lang.Long) 0L);
        enhancer32.setUseFactory(false);
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer38.getStrategy();
        java.lang.Class<?> wildcardClass40 = enhancer38.getClass();
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
        java.lang.Class[] classArray56 = new java.lang.Class[] { wildcardClass40, wildcardClass43, wildcardClass46, wildcardClass49, wildcardClass52, wildcardClass55 };
        enhancer32.setInterfaces(classArray56);
        org.mockito.cglib.proxy.Callback callback58 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray59 = new org.mockito.cglib.proxy.Callback[] { callback58 };
        enhancer32.setCallbacks(callbackArray59);
        enhancer26.setCallbacks(callbackArray59);
        java.lang.ClassLoader classLoader62 = null;
        enhancer26.setClassLoader(classLoader62);
        boolean boolean64 = enhancer26.getAttemptLoad();
        enhancer26.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy67 = enhancer26.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy67);
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(namingPolicy13);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(classLoader25);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(classLoader28);
        org.junit.Assert.assertNotNull(namingPolicy31);
        org.junit.Assert.assertNotNull(generatorStrategy33);
        org.junit.Assert.assertNotNull(generatorStrategy39);
        org.junit.Assert.assertNotNull(wildcardClass40);
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
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertNotNull(callbackArray59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(namingPolicy67);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        enhancer0.setUseCache(true);
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer72 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy73 = enhancer72.getStrategy();
        enhancer72.setSerialVersionUID((java.lang.Long) 0L);
        enhancer72.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer78 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy79 = enhancer78.getStrategy();
        enhancer78.setSerialVersionUID((java.lang.Long) 0L);
        enhancer78.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy84 = enhancer78.getStrategy();
        enhancer72.setStrategy(generatorStrategy84);
        enhancer0.setStrategy(generatorStrategy84);
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
        org.junit.Assert.assertNotNull(generatorStrategy73);
        org.junit.Assert.assertNotNull(generatorStrategy79);
        org.junit.Assert.assertNotNull(generatorStrategy84);
    }
}

