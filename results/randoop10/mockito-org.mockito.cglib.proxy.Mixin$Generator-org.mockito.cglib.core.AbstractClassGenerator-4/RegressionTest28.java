import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28 {

    public static boolean debug = false;

    @Test
    public void test14001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14001");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        java.lang.ClassLoader classLoader2 = null;
        generator0.setClassLoader(classLoader2);
        boolean boolean4 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator6.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator6.getStrategy();
        generator6.setStyle((int) (byte) 0);
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean13 = generator12.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator12.getStrategy();
        generator6.setStrategy(generatorStrategy14);
        boolean boolean16 = namingPolicy5.equals((java.lang.Object) generator6);
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = generator6.getNamingPolicy();
        java.lang.Object obj18 = null;
        boolean boolean19 = namingPolicy17.equals(obj18);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(namingPolicy5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(namingPolicy17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test14002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14002");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = null;
        generator0.setStrategy(generatorStrategy2);
        java.lang.ClassLoader classLoader4 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) 10 };
        org.mockito.cglib.proxy.Mixin mixin7 = org.mockito.cglib.proxy.Mixin.createBean(classLoader4, objArray6);
        org.mockito.cglib.proxy.Mixin mixin8 = org.mockito.cglib.proxy.Mixin.createBean(objArray6);
        java.lang.Class[] classArray9 = org.mockito.cglib.proxy.Mixin.getClasses(objArray6);
        org.mockito.cglib.proxy.Mixin mixin10 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray9);
        org.mockito.cglib.proxy.Mixin mixin11 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray9);
        generator0.setClasses(classArray9);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = null;
        generator0.setStrategy(generatorStrategy13);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator23 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean24 = generator23.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = null;
        generator23.setStrategy(generatorStrategy25);
        generator23.setAttemptLoad(false);
        java.lang.ClassLoader classLoader29 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] { (byte) 10 };
        org.mockito.cglib.proxy.Mixin mixin32 = org.mockito.cglib.proxy.Mixin.createBean(classLoader29, objArray31);
        generator23.setDelegates(objArray31);
        org.mockito.cglib.proxy.Mixin mixin34 = generator23.create();
        org.mockito.cglib.proxy.Mixin.Generator generator35 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean36 = generator35.getUseCache();
        java.lang.ClassLoader classLoader37 = null;
        generator35.setClassLoader(classLoader37);
        boolean boolean39 = generator35.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = null;
        generator35.setNamingPolicy(namingPolicy40);
        org.mockito.cglib.proxy.Mixin.Generator generator42 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean43 = generator42.getUseCache();
        generator42.setUseCache(true);
        boolean boolean46 = generator42.getUseCache();
        generator42.setUseCache(true);
        java.lang.Object[] objArray51 = new java.lang.Object[] { generator35, true, (byte) -1, 100.0f };
        org.mockito.cglib.proxy.Mixin mixin52 = org.mockito.cglib.proxy.Mixin.create(objArray51);
        org.mockito.cglib.proxy.Mixin mixin53 = mixin34.newInstance(objArray51);
        generator0.setDelegates(objArray51);
        boolean boolean55 = generator0.getAttemptLoad();
        boolean boolean56 = generator0.getAttemptLoad();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10]");
        org.junit.Assert.assertNotNull(mixin7);
        org.junit.Assert.assertNotNull(mixin8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(mixin10);
        org.junit.Assert.assertNotNull(mixin11);
        org.junit.Assert.assertNotNull(generatorStrategy15);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10]");
        org.junit.Assert.assertNotNull(mixin32);
        org.junit.Assert.assertNotNull(mixin34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(mixin52);
        org.junit.Assert.assertNotNull(mixin53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test14003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14003");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        java.lang.ClassLoader classLoader2 = null;
        generator0.setClassLoader(classLoader2);
        boolean boolean4 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = null;
        generator0.setStrategy(generatorStrategy6);
        generator0.setAttemptLoad(true);
        generator0.setUseCache(false);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean14 = generator13.getUseCache();
        java.lang.ClassLoader classLoader15 = null;
        generator13.setClassLoader(classLoader15);
        boolean boolean17 = generator13.getAttemptLoad();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (byte) 10, 'a', (-1L), 10.0d, (short) 100, 'a' };
        java.lang.Class[] classArray25 = org.mockito.cglib.proxy.Mixin.getClasses(objArray24);
        generator13.setClasses(classArray25);
        java.lang.ClassLoader classLoader27 = null;
        java.lang.Object[] objArray29 = new java.lang.Object[] { (byte) 10 };
        org.mockito.cglib.proxy.Mixin mixin30 = org.mockito.cglib.proxy.Mixin.createBean(classLoader27, objArray29);
        org.mockito.cglib.proxy.Mixin mixin31 = org.mockito.cglib.proxy.Mixin.createBean(objArray29);
        java.lang.Class[] classArray32 = org.mockito.cglib.proxy.Mixin.getClasses(objArray29);
        org.mockito.cglib.proxy.Mixin.Generator generator33 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean34 = generator33.getUseCache();
        boolean boolean35 = generator33.getUseCache();
        java.lang.Object[] objArray37 = new java.lang.Object[] { generator33, true };
        org.mockito.cglib.proxy.Mixin mixin38 = org.mockito.cglib.proxy.Mixin.createBean(objArray37);
        org.mockito.cglib.proxy.Mixin mixin39 = org.mockito.cglib.proxy.Mixin.create(classArray32, objArray37);
        org.mockito.cglib.proxy.Mixin mixin40 = org.mockito.cglib.proxy.Mixin.create(classArray25, objArray37);
        generator0.setDelegates((java.lang.Object[]) classArray25);
        org.mockito.cglib.proxy.Mixin mixin42 = generator0.create();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = generator0.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(namingPolicy5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, a, -1, 10.0, 100, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, a, -1, 10.0, 100, a]");
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10]");
        org.junit.Assert.assertNotNull(mixin30);
        org.junit.Assert.assertNotNull(mixin31);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(mixin38);
        org.junit.Assert.assertNotNull(mixin39);
        org.junit.Assert.assertNotNull(mixin40);
        org.junit.Assert.assertNotNull(mixin42);
        org.junit.Assert.assertNotNull(generatorStrategy43);
        org.junit.Assert.assertNotNull(generatorStrategy44);
    }

    @Test
    public void test14004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14004");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        java.lang.ClassLoader classLoader7 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10 };
        org.mockito.cglib.proxy.Mixin mixin10 = org.mockito.cglib.proxy.Mixin.createBean(classLoader7, objArray9);
        generator0.setDelegates(objArray9);
        java.lang.ClassLoader classLoader12 = null;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 10, 'a', (-1L), 10.0d, (short) 100, 'a' };
        java.lang.Class[] classArray20 = org.mockito.cglib.proxy.Mixin.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean(classLoader12, (java.lang.Object[]) classArray20);
        generator0.setClasses(classArray20);
        java.lang.Object[] objArray23 = null;
        generator0.setDelegates(objArray23);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator26 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean27 = generator26.getUseCache();
        java.lang.ClassLoader classLoader28 = null;
        generator26.setClassLoader(classLoader28);
        boolean boolean30 = generator26.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = null;
        generator26.setNamingPolicy(namingPolicy31);
        java.lang.ClassLoader classLoader33 = null;
        generator26.setClassLoader(classLoader33);
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = generator26.getNamingPolicy();
        boolean boolean36 = generator26.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator37 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean38 = generator37.getUseCache();
        generator37.setUseCache(true);
        boolean boolean41 = generator37.getUseCache();
        java.lang.ClassLoader classLoader42 = null;
        generator37.setClassLoader(classLoader42);
        generator37.setStyle(2);
        generator37.setAttemptLoad(false);
        boolean boolean48 = generator37.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator49 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean50 = generator49.getUseCache();
        generator49.setUseCache(true);
        boolean boolean53 = generator49.getUseCache();
        generator49.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator56 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean57 = generator56.getUseCache();
        java.lang.ClassLoader classLoader58 = null;
        generator56.setClassLoader(classLoader58);
        boolean boolean60 = generator56.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy61 = generator56.getNamingPolicy();
        generator49.setNamingPolicy(namingPolicy61);
        generator37.setNamingPolicy(namingPolicy61);
        generator26.setNamingPolicy(namingPolicy61);
        generator0.setNamingPolicy(namingPolicy61);
        generator0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Mixin mixin68 = generator0.create();
        org.mockito.cglib.core.NamingPolicy namingPolicy69 = generator0.getNamingPolicy();
        org.mockito.asm.ClassVisitor classVisitor70 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10]");
        org.junit.Assert.assertNotNull(mixin10);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, a, -1, 10.0, 100, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, a, -1, 10.0, 100, a]");
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(mixin21);
        org.junit.Assert.assertNotNull(generatorStrategy25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(namingPolicy35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(namingPolicy61);
        org.junit.Assert.assertNotNull(mixin68);
        org.junit.Assert.assertNotNull(namingPolicy69);
    }

    @Test
    public void test14005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14005");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        generator0.setUseCache(true);
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        java.lang.ClassLoader classLoader7 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10 };
        org.mockito.cglib.proxy.Mixin mixin10 = org.mockito.cglib.proxy.Mixin.createBean(classLoader7, objArray9);
        generator0.setDelegates(objArray9);
        java.lang.ClassLoader classLoader12 = null;
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 10, 'a', (-1L), 10.0d, (short) 100, 'a' };
        java.lang.Class[] classArray20 = org.mockito.cglib.proxy.Mixin.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean(classLoader12, (java.lang.Object[]) classArray20);
        generator0.setClasses(classArray20);
        boolean boolean23 = generator0.getUseCache();
        generator0.setStyle((int) (byte) 0);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = null;
        generator0.setStrategy(generatorStrategy26);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        boolean boolean32 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator34 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean35 = generator34.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = null;
        generator34.setStrategy(generatorStrategy36);
        java.lang.ClassLoader classLoader38 = null;
        java.lang.Object[] objArray40 = new java.lang.Object[] { (byte) 10 };
        org.mockito.cglib.proxy.Mixin mixin41 = org.mockito.cglib.proxy.Mixin.createBean(classLoader38, objArray40);
        org.mockito.cglib.proxy.Mixin mixin42 = org.mockito.cglib.proxy.Mixin.createBean(objArray40);
        java.lang.Class[] classArray43 = org.mockito.cglib.proxy.Mixin.getClasses(objArray40);
        org.mockito.cglib.proxy.Mixin mixin44 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray43);
        org.mockito.cglib.proxy.Mixin mixin45 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray43);
        generator34.setClasses(classArray43);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = null;
        generator34.setStrategy(generatorStrategy47);
        org.mockito.cglib.proxy.Mixin.Generator generator49 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy50 = generator49.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator51 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean52 = generator51.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = generator51.getStrategy();
        generator49.setStrategy(generatorStrategy53);
        generator34.setStrategy(generatorStrategy53);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = generator34.getStrategy();
        boolean boolean57 = namingPolicy33.equals((java.lang.Object) generator34);
        boolean boolean58 = generator34.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin mixin59 = generator34.create();
        java.lang.ClassLoader classLoader60 = generator34.getClassLoader();
        java.lang.ClassLoader classLoader61 = generator34.getClassLoader();
        boolean boolean62 = generator34.getAttemptLoad();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10]");
        org.junit.Assert.assertNotNull(mixin10);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, a, -1, 10.0, 100, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, a, -1, 10.0, 100, a]");
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(mixin21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(namingPolicy33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10]");
        org.junit.Assert.assertNotNull(mixin41);
        org.junit.Assert.assertNotNull(mixin42);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(mixin44);
        org.junit.Assert.assertNotNull(mixin45);
        org.junit.Assert.assertNotNull(namingPolicy50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(generatorStrategy53);
        org.junit.Assert.assertNotNull(generatorStrategy56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(mixin59);
        org.junit.Assert.assertNotNull(classLoader60);
        org.junit.Assert.assertNotNull(classLoader61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test14006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14006");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = null;
        generator0.setStrategy(generatorStrategy2);
        generator0.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean8 = generator7.getUseCache();
        generator7.setUseCache(true);
        generator7.setUseCache(true);
        java.lang.ClassLoader classLoader13 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { (byte) 10 };
        org.mockito.cglib.proxy.Mixin mixin16 = org.mockito.cglib.proxy.Mixin.createBean(classLoader13, objArray15);
        org.mockito.cglib.proxy.Mixin mixin17 = org.mockito.cglib.proxy.Mixin.createBean(objArray15);
        java.lang.Class[] classArray18 = org.mockito.cglib.proxy.Mixin.getClasses(objArray15);
        org.mockito.cglib.proxy.Mixin mixin19 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray18);
        java.lang.Class<?> wildcardClass20 = mixin19.getClass();
        java.lang.ClassLoader classLoader21 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] { (byte) 10 };
        org.mockito.cglib.proxy.Mixin mixin24 = org.mockito.cglib.proxy.Mixin.createBean(classLoader21, objArray23);
        org.mockito.cglib.proxy.Mixin mixin25 = org.mockito.cglib.proxy.Mixin.createBean(objArray23);
        java.lang.Class[] classArray26 = org.mockito.cglib.proxy.Mixin.getClasses(objArray23);
        org.mockito.cglib.proxy.Mixin mixin27 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray26);
        org.mockito.cglib.proxy.Mixin.Generator generator28 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean29 = generator28.getUseCache();
        java.lang.ClassLoader classLoader30 = null;
        generator28.setClassLoader(classLoader30);
        boolean boolean32 = generator28.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = null;
        generator28.setNamingPolicy(namingPolicy33);
        org.mockito.cglib.proxy.Mixin.Generator generator35 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean36 = generator35.getUseCache();
        generator35.setUseCache(true);
        boolean boolean39 = generator35.getUseCache();
        generator35.setUseCache(true);
        java.lang.Object[] objArray44 = new java.lang.Object[] { generator28, true, (byte) -1, 100.0f };
        org.mockito.cglib.proxy.Mixin mixin45 = org.mockito.cglib.proxy.Mixin.create(objArray44);
        org.mockito.cglib.proxy.Mixin mixin46 = mixin27.newInstance(objArray44);
        java.lang.Class<?> wildcardClass47 = mixin46.getClass();
        java.lang.Class[] classArray48 = new java.lang.Class[] { wildcardClass20, wildcardClass47 };
        generator7.setClasses(classArray48);
        org.mockito.cglib.proxy.Mixin mixin50 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray48);
        generator0.setClasses(classArray48);
        boolean boolean52 = generator0.getAttemptLoad();
        boolean boolean53 = generator0.getAttemptLoad();
        boolean boolean54 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy55 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader56 = generator0.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin57 = generator0.create();
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.reflect.InvocationTargetException-->null");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(namingPolicy6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10]");
        org.junit.Assert.assertNotNull(mixin16);
        org.junit.Assert.assertNotNull(mixin17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(mixin19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10]");
        org.junit.Assert.assertNotNull(mixin24);
        org.junit.Assert.assertNotNull(mixin25);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(mixin27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(mixin45);
        org.junit.Assert.assertNotNull(mixin46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertNotNull(mixin50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(namingPolicy55);
        org.junit.Assert.assertNotNull(classLoader56);
    }
}

