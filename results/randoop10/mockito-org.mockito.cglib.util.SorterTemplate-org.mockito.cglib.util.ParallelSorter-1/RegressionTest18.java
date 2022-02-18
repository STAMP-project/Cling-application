import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

    public static boolean debug = false;

    @Test
    public void test9001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9001");
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
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator23 = new org.mockito.cglib.util.ParallelSorter.Generator();
        java.lang.ClassLoader classLoader24 = null;
        generator23.setClassLoader(classLoader24);
        java.lang.ClassLoader classLoader26 = null;
        generator23.setClassLoader(classLoader26);
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = generator23.getNamingPolicy();
        generator22.setNamingPolicy(namingPolicy28);
        org.mockito.cglib.util.ParallelSorter.Generator generator30 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator30.setUseCache(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator33 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator34 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator34.setUseCache(true);
        boolean boolean37 = generator34.getAttemptLoad();
        boolean boolean38 = generator34.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = generator34.getStrategy();
        generator33.setStrategy(generatorStrategy39);
        org.mockito.cglib.util.ParallelSorter.Generator generator41 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator41.setUseCache(true);
        boolean boolean44 = generator41.getAttemptLoad();
        boolean boolean45 = generator41.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy46 = generator41.getStrategy();
        generator33.setStrategy(generatorStrategy46);
        generator30.setStrategy(generatorStrategy46);
        generator22.setStrategy(generatorStrategy46);
        org.mockito.cglib.util.ParallelSorter.Generator generator50 = new org.mockito.cglib.util.ParallelSorter.Generator();
        java.lang.ClassLoader classLoader51 = null;
        generator50.setClassLoader(classLoader51);
        org.mockito.cglib.util.ParallelSorter.Generator generator53 = new org.mockito.cglib.util.ParallelSorter.Generator();
        java.lang.ClassLoader classLoader54 = null;
        generator53.setClassLoader(classLoader54);
        java.util.Comparator<java.lang.String> strComparator57 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator58 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator59 = strComparator57.thenComparing(strComparator58);
        java.util.Comparator<java.lang.String> strComparator60 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator61 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator62 = strComparator60.thenComparing(strComparator61);
        java.util.Comparator<java.lang.String> strComparator63 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator64 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator65 = strComparator63.thenComparing(strComparator64);
        boolean boolean66 = strComparator61.equals((java.lang.Object) strComparator65);
        java.lang.Object[] objArray68 = new java.lang.Object[] { '4', strComparator58, strComparator61, 0.0d };
        generator53.setArrays(objArray68);
        generator50.setArrays(objArray68);
        generator22.setArrays(objArray68);
        generator0.setArrays(objArray68);
        boolean boolean73 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader74 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy75 = generator0.getNamingPolicy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(namingPolicy5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertNotNull(namingPolicy28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(generatorStrategy39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(generatorStrategy46);
        org.junit.Assert.assertNotNull(strComparator57);
        org.junit.Assert.assertNotNull(strComparator58);
        org.junit.Assert.assertNotNull(strComparator59);
        org.junit.Assert.assertNotNull(strComparator60);
        org.junit.Assert.assertNotNull(strComparator61);
        org.junit.Assert.assertNotNull(strComparator62);
        org.junit.Assert.assertNotNull(strComparator63);
        org.junit.Assert.assertNotNull(strComparator64);
        org.junit.Assert.assertNotNull(strComparator65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[4, INSTANCE, INSTANCE, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[4, INSTANCE, INSTANCE, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(classLoader74);
        org.junit.Assert.assertNotNull(namingPolicy75);
    }

    @Test
    public void test9002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9002");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        java.lang.ClassLoader classLoader2 = null;
        generator1.setClassLoader(classLoader2);
        java.lang.ClassLoader classLoader4 = null;
        generator1.setClassLoader(classLoader4);
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator1.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy6);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        boolean boolean10 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator14 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator15 = new org.mockito.cglib.util.ParallelSorter.Generator();
        java.lang.ClassLoader classLoader16 = null;
        generator15.setClassLoader(classLoader16);
        java.lang.ClassLoader classLoader18 = null;
        generator15.setClassLoader(classLoader18);
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = generator15.getNamingPolicy();
        generator14.setNamingPolicy(namingPolicy20);
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = generator14.getNamingPolicy();
        boolean boolean23 = generator14.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = null;
        generator14.setStrategy(generatorStrategy24);
        boolean boolean26 = generator14.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator14.getStrategy();
        generator14.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy30 = generator14.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy30);
        org.mockito.cglib.util.ParallelSorter.Generator generator32 = new org.mockito.cglib.util.ParallelSorter.Generator();
        java.lang.ClassLoader classLoader33 = null;
        generator32.setClassLoader(classLoader33);
        java.util.Comparator<java.lang.String> strComparator36 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator37 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator38 = strComparator36.thenComparing(strComparator37);
        java.util.Comparator<java.lang.String> strComparator39 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator40 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator41 = strComparator39.thenComparing(strComparator40);
        java.util.Comparator<java.lang.String> strComparator42 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator43 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator44 = strComparator42.thenComparing(strComparator43);
        boolean boolean45 = strComparator40.equals((java.lang.Object) strComparator44);
        java.lang.Object[] objArray47 = new java.lang.Object[] { '4', strComparator37, strComparator40, 0.0d };
        generator32.setArrays(objArray47);
        java.lang.ClassLoader classLoader49 = null;
        generator32.setClassLoader(classLoader49);
        org.mockito.cglib.util.ParallelSorter.Generator generator51 = new org.mockito.cglib.util.ParallelSorter.Generator();
        java.lang.ClassLoader classLoader52 = null;
        generator51.setClassLoader(classLoader52);
        java.lang.ClassLoader classLoader54 = null;
        generator51.setClassLoader(classLoader54);
        org.mockito.cglib.core.NamingPolicy namingPolicy56 = generator51.getNamingPolicy();
        generator32.setNamingPolicy(namingPolicy56);
        boolean boolean58 = generator32.getUseCache();
        java.lang.ClassLoader classLoader59 = generator32.getClassLoader();
        java.lang.ClassLoader classLoader60 = generator32.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy61 = generator32.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy61);
        boolean boolean63 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        boolean boolean66 = generator0.getAttemptLoad();
        org.junit.Assert.assertNotNull(namingPolicy6);
        org.junit.Assert.assertNotNull(namingPolicy8);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(namingPolicy11);
        org.junit.Assert.assertNotNull(namingPolicy20);
        org.junit.Assert.assertNotNull(namingPolicy22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(namingPolicy30);
        org.junit.Assert.assertNotNull(strComparator36);
        org.junit.Assert.assertNotNull(strComparator37);
        org.junit.Assert.assertNotNull(strComparator38);
        org.junit.Assert.assertNotNull(strComparator39);
        org.junit.Assert.assertNotNull(strComparator40);
        org.junit.Assert.assertNotNull(strComparator41);
        org.junit.Assert.assertNotNull(strComparator42);
        org.junit.Assert.assertNotNull(strComparator43);
        org.junit.Assert.assertNotNull(strComparator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[4, INSTANCE, INSTANCE, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[4, INSTANCE, INSTANCE, 0.0]");
        org.junit.Assert.assertNotNull(namingPolicy56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(classLoader59);
        org.junit.Assert.assertNotNull(classLoader60);
        org.junit.Assert.assertNotNull(namingPolicy61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test9003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9003");
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
        org.mockito.cglib.core.NamingPolicy namingPolicy38 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy39 = null;
        generator0.setNamingPolicy(namingPolicy39);
        org.mockito.asm.ClassVisitor classVisitor41 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(classLoader17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(generatorStrategy24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(generatorStrategy31);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertNotNull(namingPolicy38);
    }

    @Test
    public void test9004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9004");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator11 = new org.mockito.cglib.util.ParallelSorter.Generator();
        java.lang.ClassLoader classLoader12 = null;
        generator11.setClassLoader(classLoader12);
        java.lang.ClassLoader classLoader14 = null;
        generator11.setClassLoader(classLoader14);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = generator11.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy16);
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator22.setUseCache(true);
        boolean boolean25 = generator22.getAttemptLoad();
        boolean boolean26 = generator22.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator22.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = generator22.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = generator22.getStrategy();
        boolean boolean30 = generator22.getAttemptLoad();
        boolean boolean31 = generator22.getAttemptLoad();
        java.lang.ClassLoader classLoader32 = generator22.getClassLoader();
        generator22.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = generator22.getStrategy();
        generator0.setStrategy(generatorStrategy35);
        org.mockito.cglib.util.ParallelSorter.Generator generator37 = new org.mockito.cglib.util.ParallelSorter.Generator();
        java.lang.ClassLoader classLoader38 = null;
        generator37.setClassLoader(classLoader38);
        java.lang.ClassLoader classLoader40 = null;
        generator37.setClassLoader(classLoader40);
        generator37.setAttemptLoad(true);
        boolean boolean44 = generator37.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = generator37.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy45);
        org.mockito.cglib.core.NamingPolicy namingPolicy47 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader48 = generator0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy49 = generator0.getNamingPolicy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(namingPolicy16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertNotNull(generatorStrategy29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(classLoader32);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(namingPolicy45);
        org.junit.Assert.assertNotNull(namingPolicy47);
        org.junit.Assert.assertNotNull(classLoader48);
        org.junit.Assert.assertNotNull(namingPolicy49);
    }

    @Test
    public void test9005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9005");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = generator0.getStrategy();
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
        generator0.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator6 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator7 = new org.mockito.cglib.util.ParallelSorter.Generator();
        java.lang.ClassLoader classLoader8 = null;
        generator7.setClassLoader(classLoader8);
        java.lang.ClassLoader classLoader10 = null;
        generator7.setClassLoader(classLoader10);
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = generator7.getNamingPolicy();
        generator6.setNamingPolicy(namingPolicy12);
        boolean boolean14 = generator6.getUseCache();
        boolean boolean15 = generator6.getUseCache();
        java.util.Comparator<java.lang.String> strComparator16 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator17 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator18 = strComparator16.thenComparing(strComparator17);
        java.util.Comparator<java.lang.String> strComparator19 = strComparator16.reversed();
        java.util.Comparator<java.lang.String> strComparator20 = strComparator19.reversed();
        org.mockito.cglib.util.ParallelSorter.Generator generator21 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        java.lang.ClassLoader classLoader23 = null;
        generator22.setClassLoader(classLoader23);
        java.lang.ClassLoader classLoader25 = null;
        generator22.setClassLoader(classLoader25);
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = generator22.getNamingPolicy();
        generator21.setNamingPolicy(namingPolicy27);
        boolean boolean29 = strComparator19.equals((java.lang.Object) generator21);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = generator21.getStrategy();
        generator6.setStrategy(generatorStrategy30);
        boolean boolean32 = generator6.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = generator6.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator34 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator34.setUseCache(true);
        boolean boolean37 = generator34.getAttemptLoad();
        boolean boolean38 = generator34.getUseCache();
        org.mockito.cglib.util.ParallelSorter.Generator generator39 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator39.setUseCache(true);
        boolean boolean42 = generator39.getAttemptLoad();
        boolean boolean43 = generator39.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = generator39.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = generator39.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy46 = generator39.getStrategy();
        generator34.setStrategy(generatorStrategy46);
        org.mockito.cglib.util.ParallelSorter.Generator generator48 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator48.setUseCache(true);
        boolean boolean51 = generator48.getAttemptLoad();
        boolean boolean52 = generator48.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = generator48.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator54 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator54.setUseCache(true);
        boolean boolean57 = generator54.getAttemptLoad();
        boolean boolean58 = generator54.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy59 = generator54.getStrategy();
        generator48.setStrategy(generatorStrategy59);
        java.lang.ClassLoader classLoader61 = generator48.getClassLoader();
        generator48.setUseCache(false);
        org.mockito.cglib.util.ParallelSorter.Generator generator64 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator64.setUseCache(true);
        boolean boolean67 = generator64.getAttemptLoad();
        boolean boolean68 = generator64.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy69 = generator64.getStrategy();
        org.mockito.cglib.util.ParallelSorter.Generator generator70 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator70.setUseCache(true);
        boolean boolean73 = generator70.getAttemptLoad();
        boolean boolean74 = generator70.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy75 = generator70.getStrategy();
        generator64.setStrategy(generatorStrategy75);
        java.lang.ClassLoader classLoader77 = generator64.getClassLoader();
        generator48.setClassLoader(classLoader77);
        generator34.setClassLoader(classLoader77);
        org.mockito.cglib.core.NamingPolicy namingPolicy80 = generator34.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator81 = new org.mockito.cglib.util.ParallelSorter.Generator();
        java.lang.ClassLoader classLoader82 = null;
        generator81.setClassLoader(classLoader82);
        boolean boolean84 = generator81.getAttemptLoad();
        boolean boolean85 = generator81.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy86 = generator81.getStrategy();
        generator81.setUseCache(false);
        java.lang.ClassLoader classLoader89 = generator81.getClassLoader();
        generator34.setClassLoader(classLoader89);
        generator6.setClassLoader(classLoader89);
        org.mockito.cglib.core.NamingPolicy namingPolicy92 = generator6.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy92);
        java.lang.Class<?> wildcardClass94 = namingPolicy92.getClass();
        org.junit.Assert.assertNotNull(generatorStrategy1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(classLoader3);
        org.junit.Assert.assertNotNull(namingPolicy12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertNotNull(strComparator17);
        org.junit.Assert.assertNotNull(strComparator18);
        org.junit.Assert.assertNotNull(strComparator19);
        org.junit.Assert.assertNotNull(strComparator20);
        org.junit.Assert.assertNotNull(namingPolicy27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(namingPolicy33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(generatorStrategy44);
        org.junit.Assert.assertNotNull(generatorStrategy45);
        org.junit.Assert.assertNotNull(generatorStrategy46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(generatorStrategy53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(generatorStrategy59);
        org.junit.Assert.assertNotNull(classLoader61);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(generatorStrategy69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(generatorStrategy75);
        org.junit.Assert.assertNotNull(classLoader77);
        org.junit.Assert.assertNotNull(namingPolicy80);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(generatorStrategy86);
        org.junit.Assert.assertNotNull(classLoader89);
        org.junit.Assert.assertNotNull(namingPolicy92);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test9006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9006");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        java.lang.ClassLoader classLoader1 = null;
        generator0.setClassLoader(classLoader1);
        java.lang.ClassLoader classLoader3 = null;
        generator0.setClassLoader(classLoader3);
        generator0.setAttemptLoad(true);
        boolean boolean7 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader9 = generator0.getClassLoader();
        org.mockito.cglib.util.ParallelSorter.Generator generator10 = new org.mockito.cglib.util.ParallelSorter.Generator();
        java.lang.ClassLoader classLoader11 = null;
        generator10.setClassLoader(classLoader11);
        org.mockito.cglib.util.ParallelSorter.Generator generator13 = new org.mockito.cglib.util.ParallelSorter.Generator();
        java.lang.ClassLoader classLoader14 = null;
        generator13.setClassLoader(classLoader14);
        java.util.Comparator<java.lang.String> strComparator17 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator18 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator19 = strComparator17.thenComparing(strComparator18);
        java.util.Comparator<java.lang.String> strComparator20 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator21 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator22 = strComparator20.thenComparing(strComparator21);
        java.util.Comparator<java.lang.String> strComparator23 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator24 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator25 = strComparator23.thenComparing(strComparator24);
        boolean boolean26 = strComparator21.equals((java.lang.Object) strComparator25);
        java.lang.Object[] objArray28 = new java.lang.Object[] { '4', strComparator18, strComparator21, 0.0d };
        generator13.setArrays(objArray28);
        generator10.setArrays(objArray28);
        generator0.setArrays(objArray28);
        generator0.setUseCache(true);
        boolean boolean34 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = generator0.getStrategy();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(namingPolicy8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(strComparator17);
        org.junit.Assert.assertNotNull(strComparator18);
        org.junit.Assert.assertNotNull(strComparator19);
        org.junit.Assert.assertNotNull(strComparator20);
        org.junit.Assert.assertNotNull(strComparator21);
        org.junit.Assert.assertNotNull(strComparator22);
        org.junit.Assert.assertNotNull(strComparator23);
        org.junit.Assert.assertNotNull(strComparator24);
        org.junit.Assert.assertNotNull(strComparator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[4, INSTANCE, INSTANCE, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[4, INSTANCE, INSTANCE, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(generatorStrategy35);
    }

    @Test
    public void test9007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9007");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator1 = new org.mockito.cglib.util.ParallelSorter.Generator();
        java.lang.ClassLoader classLoader2 = null;
        generator1.setClassLoader(classLoader2);
        java.lang.ClassLoader classLoader4 = null;
        generator1.setClassLoader(classLoader4);
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator1.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy6);
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator0.getStrategy();
        org.junit.Assert.assertNotNull(namingPolicy6);
        org.junit.Assert.assertNotNull(generatorStrategy10);
    }

    @Test
    public void test9008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9008");
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
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy23 = null;
        generator0.setStrategy(generatorStrategy23);
        generator0.setUseCache(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(generatorStrategy20);
    }

    @Test
    public void test9009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9009");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator0.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator7 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator8.getStrategy();
        generator7.setStrategy(generatorStrategy13);
        org.mockito.cglib.util.ParallelSorter.Generator generator15 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator15.setUseCache(true);
        boolean boolean18 = generator15.getAttemptLoad();
        boolean boolean19 = generator15.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator15.getStrategy();
        generator7.setStrategy(generatorStrategy20);
        org.mockito.cglib.util.ParallelSorter.Generator generator22 = new org.mockito.cglib.util.ParallelSorter.Generator();
        java.lang.ClassLoader classLoader23 = null;
        generator22.setClassLoader(classLoader23);
        java.util.Comparator<java.lang.String> strComparator26 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator27 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator28 = strComparator26.thenComparing(strComparator27);
        java.util.Comparator<java.lang.String> strComparator29 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator30 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator31 = strComparator29.thenComparing(strComparator30);
        java.util.Comparator<java.lang.String> strComparator32 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator33 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator34 = strComparator32.thenComparing(strComparator33);
        boolean boolean35 = strComparator30.equals((java.lang.Object) strComparator34);
        java.lang.Object[] objArray37 = new java.lang.Object[] { '4', strComparator27, strComparator30, 0.0d };
        generator22.setArrays(objArray37);
        generator7.setArrays(objArray37);
        generator0.setArrays(objArray37);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = generator0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.util.ParallelSorter parallelSorter42 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.lang.Character is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(namingPolicy6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(strComparator26);
        org.junit.Assert.assertNotNull(strComparator27);
        org.junit.Assert.assertNotNull(strComparator28);
        org.junit.Assert.assertNotNull(strComparator29);
        org.junit.Assert.assertNotNull(strComparator30);
        org.junit.Assert.assertNotNull(strComparator31);
        org.junit.Assert.assertNotNull(strComparator32);
        org.junit.Assert.assertNotNull(strComparator33);
        org.junit.Assert.assertNotNull(strComparator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[4, INSTANCE, INSTANCE, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[4, INSTANCE, INSTANCE, 0.0]");
        org.junit.Assert.assertNotNull(generatorStrategy41);
    }

    @Test
    public void test9010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9010");
        org.mockito.cglib.util.ParallelSorter.Generator generator0 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator0.setUseCache(true);
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        boolean boolean9 = generator0.getUseCache();
        boolean boolean10 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        boolean boolean13 = generator0.getUseCache();
        boolean boolean14 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader15 = generator0.getClassLoader();
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(namingPolicy7);
        org.junit.Assert.assertNotNull(namingPolicy8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(classLoader15);
    }

    @Test
    public void test9011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9011");
        java.util.Comparator<java.lang.String> strComparator0 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator1 = java.util.Comparator.naturalOrder();
        java.util.Comparator<java.lang.String> strComparator2 = strComparator0.thenComparing(strComparator1);
        java.util.Comparator<java.lang.String> strComparator3 = strComparator0.reversed();
        java.util.Comparator<java.lang.String> strComparator4 = strComparator3.reversed();
        java.util.Comparator<java.lang.String> strComparator5 = strComparator4.reversed();
        java.lang.Object obj6 = null;
        boolean boolean7 = strComparator5.equals(obj6);
        org.mockito.cglib.util.ParallelSorter.Generator generator8 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator8.setUseCache(true);
        boolean boolean11 = generator8.getAttemptLoad();
        boolean boolean12 = generator8.getUseCache();
        generator8.setAttemptLoad(true);
        boolean boolean15 = generator8.getUseCache();
        generator8.setAttemptLoad(true);
        java.lang.ClassLoader classLoader18 = generator8.getClassLoader();
        boolean boolean19 = generator8.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator8.getStrategy();
        boolean boolean21 = generator8.getAttemptLoad();
        boolean boolean22 = strComparator5.equals((java.lang.Object) generator8);
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator8.generateClass(classVisitor23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparator0);
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertNotNull(strComparator2);
        org.junit.Assert.assertNotNull(strComparator3);
        org.junit.Assert.assertNotNull(strComparator4);
        org.junit.Assert.assertNotNull(strComparator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(classLoader18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test9012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9012");
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
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator0.getStrategy();
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(generatorStrategy19);
    }

    @Test
    public void test9013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test9013");
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
        org.mockito.cglib.util.ParallelSorter.Generator generator35 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator35.setUseCache(true);
        boolean boolean38 = generator35.getAttemptLoad();
        boolean boolean39 = generator35.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = generator35.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator41 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator41.setUseCache(true);
        boolean boolean44 = generator41.getAttemptLoad();
        boolean boolean45 = generator41.getUseCache();
        generator41.setAttemptLoad(true);
        org.mockito.cglib.util.ParallelSorter.Generator generator48 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = generator48.getStrategy();
        generator41.setStrategy(generatorStrategy49);
        org.mockito.cglib.util.ParallelSorter.Generator generator51 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator51.setUseCache(true);
        java.lang.ClassLoader classLoader54 = generator51.getClassLoader();
        generator41.setClassLoader(classLoader54);
        generator35.setClassLoader(classLoader54);
        org.mockito.cglib.util.ParallelSorter.Generator generator57 = new org.mockito.cglib.util.ParallelSorter.Generator();
        org.mockito.cglib.util.ParallelSorter.Generator generator58 = new org.mockito.cglib.util.ParallelSorter.Generator();
        java.lang.ClassLoader classLoader59 = null;
        generator58.setClassLoader(classLoader59);
        java.lang.ClassLoader classLoader61 = null;
        generator58.setClassLoader(classLoader61);
        org.mockito.cglib.core.NamingPolicy namingPolicy63 = generator58.getNamingPolicy();
        generator57.setNamingPolicy(namingPolicy63);
        boolean boolean65 = generator57.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy66 = generator57.getNamingPolicy();
        org.mockito.cglib.util.ParallelSorter.Generator generator67 = new org.mockito.cglib.util.ParallelSorter.Generator();
        generator67.setUseCache(true);
        boolean boolean70 = generator67.getAttemptLoad();
        boolean boolean71 = generator67.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy72 = generator67.getStrategy();
        generator57.setStrategy(generatorStrategy72);
        generator35.setStrategy(generatorStrategy72);
        generator0.setStrategy(generatorStrategy72);
        boolean boolean76 = generator0.getUseCache();
        boolean boolean77 = generator0.getAttemptLoad();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(classLoader29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(generatorStrategy34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(namingPolicy40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(generatorStrategy49);
        org.junit.Assert.assertNotNull(classLoader54);
        org.junit.Assert.assertNotNull(namingPolicy63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(namingPolicy66);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(generatorStrategy72);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }
}

