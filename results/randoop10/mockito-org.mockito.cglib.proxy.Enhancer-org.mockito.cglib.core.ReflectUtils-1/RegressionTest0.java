import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        int int0 = org.mockito.asm.Type.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.asm.Type.getInternalName(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        java.lang.reflect.Method method0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes(method0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.lang.Class class0 = null;
        java.lang.Class class1 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[] { class1 };
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.mockito.cglib.core.ReflectUtils.newInstance(class0, classArray2, objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        java.lang.Class class0 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray1 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks(class0, callbackArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(callbackArray1);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.lang.Class[] classArray0 = null;
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        org.junit.Assert.assertNull(strArray1);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        int int0 = org.mockito.asm.Type.INT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.getConstructor(class0, classArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.beans.PropertyDescriptor[] propertyDescriptorArray1 = org.mockito.cglib.core.ReflectUtils.getBeanSetters(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        java.lang.Class class0 = null;
        org.mockito.cglib.proxy.Callback callback1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.mockito.cglib.proxy.Enhancer.create(class0, callback1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.lang.Class class0 = null;
        java.util.List list1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list2 = org.mockito.cglib.core.ReflectUtils.addAllMethods(class0, list1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findNewInstance(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.beans.PropertyDescriptor[] propertyDescriptorArray1 = org.mockito.cglib.core.ReflectUtils.getBeanProperties(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.lang.Class[] classArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.ClassInfo classInfo1 = org.mockito.cglib.core.ReflectUtils.getClassInfo(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        java.lang.Class class0 = null;
        org.mockito.cglib.proxy.Callback callback1 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray2 = new org.mockito.cglib.proxy.Callback[] { callback1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks(class0, callbackArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(callbackArray2);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        org.mockito.cglib.proxy.CallbackFilter callbackFilter2 = null;
        org.mockito.cglib.proxy.Callback callback3 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray4 = new org.mockito.cglib.proxy.Callback[] { callback3 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.proxy.Enhancer.create(class0, classArray1, callbackFilter2, callbackArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(callbackArray4);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        int int0 = org.mockito.asm.Type.OBJECT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(SSS)S");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("hi!", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.Class[] classArray3 = new java.lang.Class[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.ReflectUtils.getNames(classArray3);
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass1, "(SSS)S", classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: (SSS)S");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(classArray5);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class<?> wildcardClass9 = methodArray8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, true);
        java.lang.Class<?> wildcardClass14 = methodArray13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray15, true, true);
        java.lang.Class<?> wildcardClass19 = methodArray18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass21 = type20.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass23 = type22.getClass();
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass9, wildcardClass14, wildcardClass19, wildcardClass21, wildcardClass23 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor25 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray24);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.reflect.Method;.<init>([Ljava.lang.reflect.Method;, [Ljava.lang.reflect.Method;, [Ljava.lang.reflect.Method;, org.mockito.asm.Type, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertNotNull(methodArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray24);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.lang.reflect.Method method0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType(method0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.mockito.cglib.core.AbstractClassGenerator abstractClassGenerator0 = org.mockito.cglib.core.AbstractClassGenerator.getCurrent();
        org.junit.Assert.assertNull(abstractClassGenerator0);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor3 = org.mockito.cglib.core.ReflectUtils.findConstructor("", classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.lang.reflect.Constructor constructor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.asm.Type.getConstructorDescriptor(constructor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        int int0 = org.mockito.asm.Type.FLOAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method9 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass4, "(SSS)S", classArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: (SSS)S");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(classArray8);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class1 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method3 = org.mockito.cglib.core.ReflectUtils.findMethod("hi!", classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo1 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray5 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray2, true, true);
        java.lang.Class<?> wildcardClass6 = methodArray5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class [Ljava.lang.reflect.Method;");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(methodArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.ReflectUtils.getSignature(member0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        int int0 = org.mockito.asm.Type.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "V" };
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method[] methodArray4 = new java.lang.reflect.Method[] { method3 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray5 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(methodArray4);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.cglib.proxy.Callback callback2 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray3 = new org.mockito.cglib.proxy.Callback[] { callback2 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass1, callbackArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(callbackArray3);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method4 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.Class; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        java.lang.Class[] classArray3 = new java.lang.Class[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.ReflectUtils.getNames(classArray3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class<?> wildcardClass9 = propertyDescriptorArray5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = enhancer0.create(classArray3, (java.lang.Object[]) propertyDescriptorArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method5 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.beans.PropertyDescriptor; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSize();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.beans.PropertyDescriptor;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setAttemptLoad(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class<?> wildcardClass9 = propertyDescriptorArray5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class [Ljava.beans.PropertyDescriptor;");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray6 = null;
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass3, classArray6, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.lang.Class[]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setAttemptLoad(false);
        enhancer0.setAttemptLoad(true);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setAttemptLoad(false);
        enhancer0.setAttemptLoad(true);
        java.lang.Class[] classArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.lang.Class[] classArray8 = new java.lang.Class[] { wildcardClass7 };
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray9, true, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4, classArray8, (java.lang.Object[]) methodArray12);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.beans.PropertyDescriptor;.<init>(org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertNotNull(methodArray12);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        int int0 = org.mockito.asm.Type.CHAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        int int0 = org.mockito.asm.Type.BOOLEAN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor3 = org.mockito.cglib.core.ReflectUtils.findConstructor("hi!", classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setAttemptLoad(false);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.lang.reflect.Method method0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.asm.Type.getMethodDescriptor(method0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        java.lang.Class[] classArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Callback[] callbackArray10 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbacks(callbackArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(callbackArray10);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray5);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter10 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray11 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass3, classArray9, callbackFilter10, callbackArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(callbackArray11);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, true);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method12 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass4, "char", classArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: char");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(classArray11);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor3 = org.mockito.cglib.core.ReflectUtils.findConstructor("void", classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.beans.PropertyDescriptor;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.cglib.proxy.Callback[] callbackArray5 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass3, callbackArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.Class; is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(callbackArray5);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 105);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("V");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.lang.reflect.Constructor constructor0 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray1 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray1, true, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray1);
        org.junit.Assert.assertNotNull(methodArray4);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.Class;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.junit.Assert.assertNotNull(type0);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        java.util.List list9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass3, classArray6, list9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(classArray8);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader9 = enhancer8.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class10 = org.mockito.cglib.core.ReflectUtils.defineClass("(SSS)S", byteArray7, classLoader9);
            org.junit.Assert.fail("Expected exception of type java.lang.reflect.InvocationTargetException; message: null");
        } catch (java.lang.reflect.InvocationTargetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, 100, 10, 1]");
        org.junit.Assert.assertNotNull(classLoader9);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass3, classArray6, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("void");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, true);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass4, classArray10, callback12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray5);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.util.List list10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass3, classArray7, list10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(classArray9);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        boolean boolean4 = enhancer1.getAttemptLoad();
        java.lang.ClassLoader classLoader5 = enhancer1.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor6 = org.mockito.cglib.core.ReflectUtils.findConstructor("", classLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(classLoader5);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        int int0 = org.mockito.asm.Type.BYTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Z");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class<?> wildcardClass9 = methodArray8.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass9);
        java.util.List list11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass9, list11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method[] methodArray3 = new java.lang.reflect.Method[] { method2 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray3);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("char");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("void");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setAttemptLoad(false);
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader8 = enhancer7.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer7.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer7.setNamingPolicy(namingPolicy10);
        boolean boolean12 = enhancer7.getAttemptLoad();
        enhancer7.setInterceptDuringConstruction(false);
        enhancer7.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = enhancer7.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, true, true);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray19);
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(namingPolicy17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.Class; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/lang/Class;" + "'", str5, "[Ljava/lang/Class;");
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        org.mockito.cglib.proxy.Callback callback5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass3, callback5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[Ljava/lang/Class;" + "'", str4, "[Ljava/lang/Class;");
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        int int0 = org.mockito.asm.Type.ARRAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class<?> wildcardClass9 = methodArray8.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass9);
        boolean boolean11 = enhancer0.getAttemptLoad();
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot subclass final class class [Ljava.lang.reflect.Method;");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray5);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.util.List list10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass3, classArray7, list10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(classArray9);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray5 = null;
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass3, classArray5, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[Ljava/lang/Class;" + "'", str4, "[Ljava/lang/Class;");
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        org.mockito.cglib.proxy.Callback callback6 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray7 = new org.mockito.cglib.proxy.Callback[] { callback6 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass3, callbackArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.Class; is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(callbackArray7);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.Class[] classArray2 = new java.lang.Class[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.ReflectUtils.getNames(classArray2);
        java.util.List list4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass1, classArray2, list4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        int int0 = org.mockito.asm.Type.VOID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        int int0 = org.mockito.asm.Type.DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("Z");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        org.mockito.cglib.proxy.Callback callback3 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray4 = new org.mockito.cglib.proxy.Callback[] { callback3 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass2, callbackArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(callbackArray4);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "double" + "'", str1, "double");
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("char");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.Class[] classArray2 = new java.lang.Class[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.ReflectUtils.getNames(classArray2);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor5 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass1, classArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(classArray4);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer0.getNamingPolicy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class6 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(namingPolicy5);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        enhancer0.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader5 = enhancer0.getClassLoader();
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray8);
        java.lang.Object[] objArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = enhancer0.create(classArray10, objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(classArray10);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray5 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray2, true, true);
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray2, false, false);
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray0, methodArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(methodArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray9);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("Z");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        org.mockito.cglib.proxy.Callback callback3 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray4 = new org.mockito.cglib.proxy.Callback[] { callback3 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass2, callbackArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(callbackArray4);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.cglib.proxy.Callback callback5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass3, callback5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.lang.Class[] classArray3 = new java.lang.Class[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.ReflectUtils.getNames(classArray3);
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray3);
        java.lang.Class<?> wildcardClass6 = classArray5.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray10);
        java.lang.Class<?> wildcardClass13 = classArray12.getClass();
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass13);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray16);
        java.lang.Class<?> wildcardClass19 = classArray18.getClass();
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass19);
        java.lang.Class[] classArray23 = new java.lang.Class[] { wildcardClass6, wildcardClass13, wildcardClass19 };
        java.util.List list24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass1, classArray23, list24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(classInfo14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(classInfo20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(classArray23);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        boolean boolean8 = enhancer0.getAttemptLoad();
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray9);
        java.lang.Class<?> wildcardClass12 = classArray11.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray15, true, true);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray15);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[Ljava/lang/Class;" + "'", str13, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertNotNull(methodArray18);
        org.junit.Assert.assertNotNull(classArray19);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.beans.PropertyDescriptor[] propertyDescriptorArray1 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray1, true, true);
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray1, false, false);
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray0, methodArray7);
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method[] methodArray10 = new java.lang.reflect.Method[] { method9 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray0, methodArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(propertyDescriptorArray1);
        org.junit.Assert.assertNotNull(methodArray4);
        org.junit.Assert.assertNotNull(methodArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray10);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("double");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray8);
        org.mockito.cglib.proxy.Callback callback11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass3, classArray10, callback11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/lang/Class;" + "'", str5, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(classArray10);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str9 = signature8.getName();
        org.mockito.asm.Type type10 = signature8.getReturnType();
        boolean boolean11 = classInfo4.equals((java.lang.Object) type10);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray12, true, true);
        java.lang.Class<?> wildcardClass16 = propertyDescriptorArray12.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        boolean boolean18 = classInfo4.equals((java.lang.Object) wildcardClass16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass20 = type19.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass20);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        enhancer22.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback25 = null;
        enhancer22.setCallback(callback25);
        java.lang.Class[] classArray27 = new java.lang.Class[] {};
        java.lang.String[] strArray28 = org.mockito.cglib.core.ReflectUtils.getNames(classArray27);
        java.lang.Class[] classArray29 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray27);
        java.lang.Class<?> wildcardClass30 = classArray29.getClass();
        enhancer22.setSuperclass((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass33 = type32.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = null;
        enhancer34.setNamingPolicy(namingPolicy35);
        boolean boolean37 = enhancer34.getAttemptLoad();
        java.lang.ClassLoader classLoader38 = enhancer34.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray39, true, true);
        java.lang.Class<?> wildcardClass43 = methodArray42.getClass();
        enhancer34.setSuperclass((java.lang.Class) wildcardClass43);
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray45, true, true);
        java.lang.Class<?> wildcardClass49 = methodArray48.getClass();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass51 = type50.getClass();
        java.lang.Class[] classArray52 = new java.lang.Class[] { wildcardClass20, wildcardClass30, wildcardClass33, wildcardClass43, wildcardClass49, wildcardClass51 };
        java.lang.Class[] classArray53 = new java.lang.Class[] {};
        java.lang.String[] strArray54 = org.mockito.cglib.core.ReflectUtils.getNames(classArray53);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass16, classArray52, (java.lang.Object[]) strArray54);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.beans.PropertyDescriptor;.<init>(org.mockito.asm.Type, [Ljava.lang.Class;, org.mockito.asm.Type, [Ljava.lang.reflect.Method;, [Ljava.lang.reflect.Method;, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(classLoader38);
        org.junit.Assert.assertNotNull(propertyDescriptorArray39);
        org.junit.Assert.assertNotNull(methodArray42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(propertyDescriptorArray45);
        org.junit.Assert.assertNotNull(methodArray48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(strArray54);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("(SSS)S");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.ReflectUtils.getNames(classArray2);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray2);
        java.lang.Class<?> wildcardClass5 = classArray4.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.lang.Class[] classArray8 = new java.lang.Class[] { wildcardClass5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method9 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod(class0, "V", classArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: V");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[Ljava/lang/Class;" + "'", str7, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(classArray8);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        boolean boolean4 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray5);
        java.lang.Class<?> wildcardClass8 = classArray7.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass8);
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray11);
        java.lang.Class<?> wildcardClass14 = classArray13.getClass();
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass14);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.VOID_TYPE;
        int int23 = type21.getOpcode((int) (short) 1);
        java.lang.String str24 = type21.getDescriptor();
        int int26 = type21.getOpcode((int) (byte) 100);
        boolean boolean27 = signature20.equals((java.lang.Object) int26);
        java.lang.String str28 = signature20.getDescriptor();
        java.lang.Class<?> wildcardClass29 = signature20.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray30, true, true);
        java.lang.Class<?> wildcardClass34 = methodArray33.getClass();
        boolean boolean35 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass34);
        boolean boolean36 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        java.lang.Class<?> wildcardClass38 = type37.getClass();
        java.lang.Class[] classArray39 = new java.lang.Class[] { wildcardClass8, wildcardClass14, wildcardClass29, wildcardClass34, wildcardClass38 };
        java.util.List list40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass3, classArray39, list40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[Ljava/lang/Class;" + "'", str10, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "V" + "'", str24, "V");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 105 + "'", int26 == 105);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(SSS)S" + "'", str28, "(SSS)S");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(propertyDescriptorArray30);
        org.junit.Assert.assertNotNull(methodArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(classArray39);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("void");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.Class;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.reflect.Method;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor11 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray8);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.reflect.Method;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(classArray10);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        boolean boolean4 = enhancer1.getAttemptLoad();
        java.lang.ClassLoader classLoader5 = enhancer1.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findMethod("(SSS)LV;", classLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(classLoader5);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.Class[] classArray2 = new java.lang.Class[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.ReflectUtils.getNames(classArray2);
        java.lang.String[] strArray4 = org.mockito.cglib.core.ReflectUtils.getNames(classArray2);
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray2);
        org.mockito.cglib.proxy.Callback callback6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass1, classArray2, callback6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.beans.PropertyDescriptor[] propertyDescriptorArray1 = org.mockito.cglib.core.ReflectUtils.getBeanGetters(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("(SSS)[Ljava/lang/Class;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        java.lang.Class[] classArray4 = new java.lang.Class[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3, classArray4, (java.lang.Object[]) classArray8);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.Class;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(classArray10);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback4 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray5 = new org.mockito.cglib.proxy.Callback[] { callback4 };
        enhancer0.setCallbacks(callbackArray5);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader8 = enhancer7.getClassLoader();
        enhancer7.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback11 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray12 = new org.mockito.cglib.proxy.Callback[] { callback11 };
        enhancer7.setCallbacks(callbackArray12);
        enhancer0.setCallbacks(callbackArray12);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray15);
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray17);
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.Class[] classArray22 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = enhancer0.create(classArray19, (java.lang.Object[]) classArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(callbackArray5);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(callbackArray12);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(classArray22);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        java.lang.String str10 = signature2.getDescriptor();
        java.lang.Class<?> wildcardClass11 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray12, true, true);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray12);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray12);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter18 = null;
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader20 = enhancer19.getClassLoader();
        enhancer19.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback23 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray24 = new org.mockito.cglib.proxy.Callback[] { callback23 };
        enhancer19.setCallbacks(callbackArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass11, classArray17, callbackFilter18, callbackArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "V" + "'", str6, "V");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 105 + "'", int8 == 105);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(SSS)S" + "'", str10, "(SSS)S");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(classLoader20);
        org.junit.Assert.assertNotNull(callbackArray24);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classLoader4);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        java.lang.Class[] classArray4 = new java.lang.Class[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray4);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3, classArray6, (java.lang.Object[]) classArray7);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.Class;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(classArray9);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, true);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method12 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass1, "double", classArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: double");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(classArray11);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray5);
        java.lang.Class<?> wildcardClass8 = classArray7.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass8);
        org.mockito.cglib.proxy.Callback callback10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass8, callback10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray7, true, true);
        java.lang.Class<?> wildcardClass11 = propertyDescriptorArray7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        boolean boolean13 = propertyDescriptor3.equals((java.lang.Object) propertyDescriptorArray12);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = enhancer1.getStrategy();
        enhancer1.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader6 = enhancer1.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor7 = org.mockito.cglib.core.ReflectUtils.findConstructor("Lorg/mockito/asm/Type;", classLoader6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertNotNull(classLoader6);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("java.lang.Class[]", "Z");
        java.lang.Class[] classArray3 = new java.lang.Class[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.ReflectUtils.getNames(classArray3);
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray3);
        java.lang.Class<?> wildcardClass6 = classArray5.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        boolean boolean9 = signature2.equals((java.lang.Object) wildcardClass6);
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray11);
        int int14 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray13);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method16 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass6, "", classArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: ");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(classArray15);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        org.mockito.cglib.proxy.Callback callback6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass3, callback6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/lang/Class;" + "'", str5, "[Ljava/lang/Class;");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setAttemptLoad(false);
        enhancer0.setAttemptLoad(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class7 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("java.lang.Class[]", "Z");
        java.lang.Class[] classArray3 = new java.lang.Class[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.ReflectUtils.getNames(classArray3);
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray3);
        java.lang.Class<?> wildcardClass6 = classArray5.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        boolean boolean9 = signature2.equals((java.lang.Object) wildcardClass6);
        java.lang.String str10 = signature2.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray11 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Z" + "'", str10, "Z");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        enhancer0.setAttemptLoad(false);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.asm.Type");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader5 = enhancer4.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = enhancer4.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer4.setNamingPolicy(namingPolicy7);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer4.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy9);
        java.lang.Class class11 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType(class11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(generatorStrategy6);
        org.junit.Assert.assertNotNull(namingPolicy9);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = enhancer1.getStrategy();
        enhancer1.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader6 = enhancer1.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor7 = org.mockito.cglib.core.ReflectUtils.findConstructor("[Ljava/lang/Class;", classLoader6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertNotNull(classLoader6);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("(SSS)[Ljava/lang/Class;");
        boolean boolean8 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "void" + "'", str2, "void");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "void" + "'", str3, "void");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setAttemptLoad(false);
        enhancer0.setAttemptLoad(true);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray9);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        enhancer12.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray17, true, true);
        java.lang.Class[] classArray21 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray17);
        enhancer12.setInterfaces(classArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = enhancer0.create(classArray9, (java.lang.Object[]) classArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(classArray21);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray1);
        java.lang.Class[] classArray3 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray1);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter4 = null;
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader6 = enhancer5.getClassLoader();
        enhancer5.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback9 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray10 = new org.mockito.cglib.proxy.Callback[] { callback9 };
        enhancer5.setCallbacks(callbackArray10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader13 = enhancer12.getClassLoader();
        enhancer12.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback16 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray17 = new org.mockito.cglib.proxy.Callback[] { callback16 };
        enhancer12.setCallbacks(callbackArray17);
        enhancer5.setCallbacks(callbackArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.mockito.cglib.proxy.Enhancer.create(class0, classArray3, callbackFilter4, callbackArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(callbackArray10);
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertNotNull(callbackArray17);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        enhancer5.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, true);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray10);
        enhancer5.setInterfaces(classArray14);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        int int22 = type20.getOpcode((int) (short) 1);
        java.lang.String str23 = type20.getDescriptor();
        int int25 = type20.getOpcode((int) (byte) 100);
        boolean boolean26 = signature19.equals((java.lang.Object) int25);
        org.mockito.asm.Type[] typeArray27 = signature19.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = enhancer0.create(classArray14, (java.lang.Object[]) typeArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "V" + "'", str23, "V");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 105 + "'", int25 == 105);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(typeArray27);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray3, true, true);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray3);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray3);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray9);
        java.lang.Class<?> wildcardClass12 = classArray11.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str17 = signature16.getName();
        org.mockito.asm.Type type18 = signature16.getReturnType();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type20, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray23);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray23);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = enhancer0.create(classArray8, (java.lang.Object[]) typeArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(methodArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(SSS)S" + "'", str24, "(SSS)S");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(SSS)S" + "'", str25, "(SSS)S");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(SSS)[Ljava/lang/Class;" + "'", str26, "(SSS)[Ljava/lang/Class;");
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("java.lang.Class[]", "Z");
        java.lang.Class[] classArray3 = new java.lang.Class[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.ReflectUtils.getNames(classArray3);
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray3);
        java.lang.Class<?> wildcardClass6 = classArray5.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        boolean boolean9 = signature2.equals((java.lang.Object) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.Class;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("(SSS)S");
        int int3 = type2.getSize();
        int int4 = type2.getSort();
        org.mockito.asm.Type[] typeArray6 = org.mockito.asm.Type.getArgumentTypes("(SSS)LV;");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("(SSS)S", type2, typeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(SSS)S' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(typeArray6);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray8, true, true);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray8);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter13 = null;
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader15 = enhancer14.getClassLoader();
        enhancer14.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback18 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray19 = new org.mockito.cglib.proxy.Callback[] { callback18 };
        enhancer14.setCallbacks(callbackArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass6, classArray12, callbackFilter13, callbackArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNotNull(callbackArray19);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        java.lang.Class class0 = null;
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        enhancer1.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, true);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        enhancer1.setInterfaces(classArray10);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.util.List list13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods(class0, classArray10, list13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setUseCache(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("java.lang.Class[]", "Z");
        java.lang.Class[] classArray3 = new java.lang.Class[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.ReflectUtils.getNames(classArray3);
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray3);
        java.lang.Class<?> wildcardClass6 = classArray5.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        boolean boolean9 = signature2.equals((java.lang.Object) wildcardClass6);
        java.util.List list10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list11 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass6, list10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        enhancer0.setUseFactory(false);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer0.getNamingPolicy();
        java.lang.Class class6 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType(class6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(namingPolicy5);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        java.lang.Class class0 = null;
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        enhancer1.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, true);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        enhancer1.setInterfaces(classArray10);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        org.mockito.cglib.proxy.Callback callback13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.mockito.cglib.proxy.Enhancer.create(class0, classArray10, callback13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        boolean boolean4 = enhancer1.getAttemptLoad();
        java.lang.ClassLoader classLoader5 = enhancer1.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findMethod("Z", classLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(classLoader5);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray5);
        java.lang.Class<?> wildcardClass8 = classArray7.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass8);
        java.lang.String str10 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        org.mockito.cglib.proxy.Callback callback11 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray12 = new org.mockito.cglib.proxy.Callback[] { callback11 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass8, callbackArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.Class; is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[Ljava/lang/Class;" + "'", str10, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(callbackArray12);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray5);
        java.lang.Class<?> wildcardClass8 = classArray7.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass8);
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray10);
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor15 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass8, classArray12);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.Class;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(classArray14);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        org.mockito.cglib.proxy.Callback callback8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass3, classArray7, callback8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(classArray7);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.proxy.Callback callback3 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray4 = new org.mockito.cglib.proxy.Callback[] { callback3 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass1, callbackArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(callbackArray4);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method9 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass1, "(SSS)LV;", classArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: (SSS)LV;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(classArray8);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = type1.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(SSS)S" + "'", str7, "(SSS)S");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(SSS)LV;" + "'", str8, "(SSS)LV;");
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("Z");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo2 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray3, true, true);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray3);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader9 = enhancer8.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer8.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = null;
        enhancer8.setNamingPolicy(namingPolicy11);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer8.getStrategy();
        java.lang.Class<?> wildcardClass14 = enhancer8.getClass();
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        java.lang.String str16 = classInfo15.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray17, true, true);
        java.lang.Class<?> wildcardClass21 = propertyDescriptorArray17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        boolean boolean23 = classInfo15.equals((java.lang.Object) propertyDescriptorArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1, classArray7, (java.lang.Object[]) propertyDescriptorArray22);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(classInfo2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(methodArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.mockito.cglib.proxy.Enhancer" + "'", str16, "org.mockito.cglib.proxy.Enhancer");
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass2);
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray3, true, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(methodArray6);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("org.mockito.cglib.proxy.Enhancer");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("Z");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader4 = enhancer3.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer3.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer3.setNamingPolicy(namingPolicy6);
        boolean boolean8 = enhancer3.getAttemptLoad();
        enhancer3.setInterceptDuringConstruction(false);
        enhancer3.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer3.getNamingPolicy();
        boolean boolean14 = enhancer3.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = null;
        enhancer15.setNamingPolicy(namingPolicy16);
        boolean boolean18 = enhancer15.getAttemptLoad();
        java.lang.ClassLoader classLoader19 = enhancer15.getClassLoader();
        enhancer3.setClassLoader(classLoader19);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        enhancer21.setAttemptLoad(false);
        enhancer21.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader29 = enhancer28.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer28.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = null;
        enhancer28.setNamingPolicy(namingPolicy31);
        boolean boolean33 = enhancer28.getAttemptLoad();
        enhancer28.setInterceptDuringConstruction(false);
        enhancer28.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy38 = enhancer28.getNamingPolicy();
        enhancer21.setNamingPolicy(namingPolicy38);
        enhancer3.setNamingPolicy(namingPolicy38);
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader42 = enhancer41.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = enhancer41.getStrategy();
        enhancer41.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader46 = enhancer41.getClassLoader();
        enhancer3.setClassLoader(classLoader46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class48 = org.mockito.cglib.core.ReflectUtils.defineClass("LV;", byteArray2, classLoader46);
            org.junit.Assert.fail("Expected exception of type java.lang.reflect.InvocationTargetException; message: null");
        } catch (java.lang.reflect.InvocationTargetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(namingPolicy13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertNotNull(classLoader29);
        org.junit.Assert.assertNotNull(generatorStrategy30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(namingPolicy38);
        org.junit.Assert.assertNotNull(classLoader42);
        org.junit.Assert.assertNotNull(generatorStrategy43);
        org.junit.Assert.assertNotNull(classLoader46);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader9 = enhancer8.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer8.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = null;
        enhancer8.setNamingPolicy(namingPolicy11);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer8.getStrategy();
        java.lang.Class<?> wildcardClass14 = enhancer8.getClass();
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, true, true);
        java.lang.Class<?> wildcardClass23 = methodArray22.getClass();
        boolean boolean24 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass26 = type25.getClass();
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        int int32 = type30.getOpcode((int) (short) 1);
        java.lang.String str33 = type30.getDescriptor();
        int int35 = type30.getOpcode((int) (byte) 100);
        boolean boolean36 = signature29.equals((java.lang.Object) int35);
        java.lang.String str37 = signature29.getDescriptor();
        java.lang.Class<?> wildcardClass38 = signature29.getClass();
        java.lang.Class[] classArray39 = new java.lang.Class[] { wildcardClass14, wildcardClass17, wildcardClass23, wildcardClass26, wildcardClass38 };
        java.lang.String[] strArray40 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        java.util.List list41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass6, classArray39, list41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "V" + "'", str33, "V");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 105 + "'", int35 == 105);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(SSS)S" + "'", str37, "(SSS)S");
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo2 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader4 = enhancer3.getClassLoader();
        enhancer3.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback7 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray8 = new org.mockito.cglib.proxy.Callback[] { callback7 };
        enhancer3.setCallbacks(callbackArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass1, callbackArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(classInfo2);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(callbackArray8);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method3 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(type2);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray5);
        java.lang.Class<?> wildcardClass8 = classArray7.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass8);
        java.lang.String str10 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.Class;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[Ljava/lang/Class;" + "'", str10, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) typeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(SSS)S" + "'", str6, "(SSS)S");
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("[Ljava/lang/reflect/Method;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = enhancer1.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = null;
        enhancer1.setNamingPolicy(namingPolicy4);
        enhancer1.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = enhancer1.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer1.setClassLoader(classLoader10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor12 = org.mockito.cglib.core.ReflectUtils.findConstructor("", classLoader10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertNotNull(namingPolicy8);
        org.junit.Assert.assertNotNull(classLoader10);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass3);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer6.setNamingPolicy(namingPolicy7);
        java.lang.ClassLoader classLoader9 = enhancer6.getClassLoader();
        org.mockito.cglib.proxy.Callback callback10 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray11 = new org.mockito.cglib.proxy.Callback[] { callback10 };
        enhancer6.setCallbacks(callbackArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass3, callbackArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.Class; is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(callbackArray11);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.lang.Class[] classArray3 = new java.lang.Class[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.ReflectUtils.getNames(classArray3);
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray3);
        int int6 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray5);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray5);
        java.util.List list9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass1, classArray5, list9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray0);
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        java.lang.reflect.Method[] methodArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        boolean boolean6 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.reflect.Method; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes(member0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get exception types of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("[Ljava/lang/Class;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray5);
        org.mockito.cglib.proxy.Callback callback8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass3, classArray5, callback8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(classArray7);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback4 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray5 = new org.mockito.cglib.proxy.Callback[] { callback4 };
        enhancer0.setCallbacks(callbackArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(callbackArray5);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        boolean boolean8 = enhancer0.getAttemptLoad();
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray9);
        java.lang.Class<?> wildcardClass12 = classArray11.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass12);
        boolean boolean15 = enhancer0.getUseCache();
        enhancer0.setUseCache(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class18 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[Ljava/lang/Class;" + "'", str13, "[Ljava/lang/Class;");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = null;
        enhancer3.setNamingPolicy(namingPolicy4);
        boolean boolean6 = enhancer3.getAttemptLoad();
        java.lang.ClassLoader classLoader7 = enhancer3.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer3.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer9.setNamingPolicy(namingPolicy10);
        enhancer9.setAttemptLoad(false);
        enhancer9.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader17 = enhancer16.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer16.getStrategy();
        enhancer16.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader21 = enhancer16.getClassLoader();
        enhancer9.setClassLoader(classLoader21);
        enhancer3.setClassLoader(classLoader21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class24 = org.mockito.cglib.core.ReflectUtils.defineClass("java.beans.PropertyDescriptor[name=I]", byteArray2, classLoader21);
            org.junit.Assert.fail("Expected exception of type java.lang.reflect.InvocationTargetException; message: null");
        } catch (java.lang.reflect.InvocationTargetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(classLoader17);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(classLoader21);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor8 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass3, classArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.Class;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, true);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method12 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass4, "(Ljava/lang/Cloneable;Ljava/io/Serializable;)V", classArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: (Ljava/lang/Cloneable;Ljava/io/Serializable;)V");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        boolean boolean4 = enhancer1.getAttemptLoad();
        java.lang.ClassLoader classLoader5 = enhancer1.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader7 = enhancer6.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer6.getStrategy();
        enhancer6.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader11 = enhancer6.getClassLoader();
        enhancer1.setClassLoader(classLoader11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor13 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.lang.Object", classLoader11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(classLoader11);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        enhancer1.setAttemptLoad(false);
        enhancer1.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader9 = enhancer8.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer8.getStrategy();
        enhancer8.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader13 = enhancer8.getClassLoader();
        enhancer1.setClassLoader(classLoader13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor15 = org.mockito.cglib.core.ReflectUtils.findConstructor("()D", classLoader13);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(classLoader13);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("Z");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, true);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray4);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray4);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, false, true);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method14 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass2, "[Ljava/lang/Class;", classArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: [Ljava/lang/Class;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(methodArray7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(classArray13);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray5);
        java.lang.Class<?> wildcardClass8 = classArray7.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass8);
        java.lang.String str10 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = null;
        enhancer11.setNamingPolicy(namingPolicy12);
        enhancer11.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray16, true, true);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray16);
        enhancer11.setInterfaces(classArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray23, true, true);
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray23);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray23);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray23, false, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass8, classArray20, (java.lang.Object[]) methodArray31);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.Class;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[Ljava/lang/Class;" + "'", str10, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(propertyDescriptorArray23);
        org.junit.Assert.assertNotNull(methodArray26);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(methodArray31);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.util.List list2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list3 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass1, list2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setUseCache(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo2 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, true);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method9 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass1, "()D", classArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: ()D");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(classInfo2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(methodArray7);
        org.junit.Assert.assertNotNull(classArray8);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("org.mockito.cglib.proxy.Enhancer");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray3, true, true);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray3);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter9 = null;
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader11 = enhancer10.getClassLoader();
        enhancer10.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback14 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray15 = new org.mockito.cglib.proxy.Callback[] { callback14 };
        enhancer10.setCallbacks(callbackArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass1, classArray8, callbackFilter9, callbackArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(methodArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(classLoader11);
        org.junit.Assert.assertNotNull(callbackArray15);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        java.lang.Class[] classArray4 = new java.lang.Class[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray4);
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter9 = null;
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader11 = enhancer10.getClassLoader();
        enhancer10.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback14 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray15 = new org.mockito.cglib.proxy.Callback[] { callback14 };
        enhancer10.setCallbacks(callbackArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass3, classArray6, callbackFilter9, callbackArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(classLoader11);
        org.junit.Assert.assertNotNull(callbackArray15);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass11);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.asm.Type");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method4 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.Class; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        java.lang.String str10 = signature2.getDescriptor();
        java.lang.Class<?> wildcardClass11 = signature2.getClass();
        org.mockito.cglib.proxy.Callback callback12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass11, callback12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "V" + "'", str6, "V");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 105 + "'", int8 == 105);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(SSS)S" + "'", str10, "(SSS)S");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.beans.PropertyDescriptor; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.Class; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[Ljava/lang/Class;" + "'", str4, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        boolean boolean6 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.reflect.Method;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer6.setNamingPolicy(namingPolicy7);
        java.lang.ClassLoader classLoader9 = enhancer6.getClassLoader();
        org.mockito.cglib.proxy.Callback callback10 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray11 = new org.mockito.cglib.proxy.Callback[] { callback10 };
        enhancer6.setCallbacks(callbackArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass4, callbackArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.reflect.Method; is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(callbackArray11);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(true);
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        boolean boolean7 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = enhancer1.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = null;
        enhancer1.setNamingPolicy(namingPolicy4);
        boolean boolean6 = enhancer1.getAttemptLoad();
        enhancer1.setInterceptDuringConstruction(false);
        enhancer1.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = enhancer1.getNamingPolicy();
        boolean boolean12 = enhancer1.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = null;
        enhancer13.setNamingPolicy(namingPolicy14);
        boolean boolean16 = enhancer13.getAttemptLoad();
        java.lang.ClassLoader classLoader17 = enhancer13.getClassLoader();
        enhancer1.setClassLoader(classLoader17);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = null;
        enhancer19.setNamingPolicy(namingPolicy20);
        enhancer19.setAttemptLoad(false);
        enhancer19.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader27 = enhancer26.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer26.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = null;
        enhancer26.setNamingPolicy(namingPolicy29);
        boolean boolean31 = enhancer26.getAttemptLoad();
        enhancer26.setInterceptDuringConstruction(false);
        enhancer26.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = enhancer26.getNamingPolicy();
        enhancer19.setNamingPolicy(namingPolicy36);
        enhancer1.setNamingPolicy(namingPolicy36);
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader40 = enhancer39.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer39.getStrategy();
        enhancer39.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader44 = enhancer39.getClassLoader();
        enhancer1.setClassLoader(classLoader44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method46 = org.mockito.cglib.core.ReflectUtils.findMethod("double", classLoader44);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(namingPolicy11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(classLoader17);
        org.junit.Assert.assertNotNull(classLoader27);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(namingPolicy36);
        org.junit.Assert.assertNotNull(classLoader40);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(classLoader44);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("(SSS)S");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type6, type7, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray9);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("(Ljava/lang/Cloneable;Ljava/io/Serializable;)LZ;", type2, typeArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(Ljava/lang/Cloneable;Ljava/io/Serializable;)LZ;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(SSS)S" + "'", str10, "(SSS)S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(SSS)LV;" + "'", str11, "(SSS)LV;");
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=I]", "[Ljava/lang/Class;");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class<?> wildcardClass9 = methodArray8.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray11, true, true);
        java.lang.Class<?> wildcardClass15 = propertyDescriptorArray11.getClass();
        boolean boolean16 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class [Ljava.beans.PropertyDescriptor;");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(type17);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        java.lang.Class[] classArray4 = new java.lang.Class[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        org.mockito.cglib.proxy.Callback callback8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass3, classArray4, callback8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method3 = org.mockito.cglib.core.ReflectUtils.findMethod("LZ;", classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Callback callback4 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray5 = new org.mockito.cglib.proxy.Callback[] { callback4 };
        enhancer0.setCallbacks(callbackArray5);
        java.lang.Class[] classArray7 = null;
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader9 = enhancer8.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer8.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = null;
        enhancer8.setNamingPolicy(namingPolicy11);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer8.getStrategy();
        java.lang.Class<?> wildcardClass14 = enhancer8.getClass();
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, true, true);
        java.lang.Class<?> wildcardClass23 = methodArray22.getClass();
        boolean boolean24 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass26 = type25.getClass();
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        int int32 = type30.getOpcode((int) (short) 1);
        java.lang.String str33 = type30.getDescriptor();
        int int35 = type30.getOpcode((int) (byte) 100);
        boolean boolean36 = signature29.equals((java.lang.Object) int35);
        java.lang.String str37 = signature29.getDescriptor();
        java.lang.Class<?> wildcardClass38 = signature29.getClass();
        java.lang.Class[] classArray39 = new java.lang.Class[] { wildcardClass14, wildcardClass17, wildcardClass23, wildcardClass26, wildcardClass38 };
        java.lang.String[] strArray40 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = enhancer0.create(classArray7, (java.lang.Object[]) strArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader3);
        org.junit.Assert.assertNotNull(callbackArray5);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "V" + "'", str33, "V");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 105 + "'", int35 == 105);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(SSS)S" + "'", str37, "(SSS)S");
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class<?> wildcardClass9 = methodArray8.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass16);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray17, false, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass9, classArray14, (java.lang.Object[]) propertyDescriptorArray17);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.reflect.Method;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(methodArray20);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class<?> wildcardClass9 = methodArray8.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray11, true, true);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray11);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(classArray15);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(false);
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("java.lang.Class[]", "Z");
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader4 = enhancer3.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer3.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer3.setNamingPolicy(namingPolicy6);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer3.getStrategy();
        java.lang.Class<?> wildcardClass9 = enhancer3.getClass();
        boolean boolean10 = signature2.equals((java.lang.Object) enhancer3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray11 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(true);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("void", method8, method9);
        propertyDescriptor10.setExpert(false);
        propertyDescriptor10.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor15 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor10);
        propertyDescriptor10.setName("Z");
        boolean boolean18 = propertyDescriptor10.isBound();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "void" + "'", str6, "void");
        org.junit.Assert.assertNull(propertyEditor15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        boolean boolean8 = enhancer0.getAttemptLoad();
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray9);
        java.lang.Class<?> wildcardClass12 = classArray11.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass12);
        boolean boolean15 = enhancer0.getUseCache();
        enhancer0.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader19 = enhancer18.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer18.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = null;
        enhancer18.setNamingPolicy(namingPolicy21);
        enhancer18.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.core.NamingPolicy namingPolicy25 = enhancer18.getNamingPolicy();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray26, true, true);
        java.lang.Class[] classArray30 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray26);
        int int31 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray30);
        enhancer18.setInterfaces(classArray30);
        java.lang.String[] strArray33 = org.mockito.cglib.core.ReflectUtils.getNames(classArray30);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[Ljava/lang/Class;" + "'", str13, "[Ljava/lang/Class;");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNotNull(namingPolicy25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getName();
        boolean boolean8 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setValue("char", (java.lang.Object) "char");
        java.util.Enumeration<java.lang.String> strEnumeration12 = propertyDescriptor3.attributeNames();
        boolean boolean13 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "void" + "'", str6, "void");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "void" + "'", str7, "void");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strEnumeration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.mockito.cglib.core.ReflectUtils.newInstance(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(true);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("void", method8, method9);
        propertyDescriptor10.setExpert(false);
        propertyDescriptor10.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor15 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor10);
        boolean boolean16 = propertyDescriptor10.isPreferred();
        boolean boolean17 = propertyDescriptor10.isConstrained();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "void" + "'", str6, "void");
        org.junit.Assert.assertNull(propertyEditor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = enhancer0.getNamingPolicy();
        boolean boolean11 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader13 = enhancer12.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer12.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = null;
        enhancer12.setNamingPolicy(namingPolicy15);
        boolean boolean17 = enhancer12.getAttemptLoad();
        enhancer12.setInterceptDuringConstruction(false);
        enhancer12.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = null;
        enhancer22.setNamingPolicy(namingPolicy23);
        enhancer22.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray27, true, true);
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray27);
        enhancer22.setInterfaces(classArray31);
        enhancer12.setInterfaces(classArray31);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray27);
        org.junit.Assert.assertNotNull(methodArray30);
        org.junit.Assert.assertNotNull(classArray31);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        boolean boolean6 = classInfo4.equals((java.lang.Object) (-1.0f));
        java.lang.String str7 = classInfo4.toString();
        java.lang.String str8 = classInfo4.toString();
        int int9 = classInfo4.getModifiers();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        enhancer10.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback13 = null;
        enhancer10.setCallback(callback13);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray15);
        java.lang.Class<?> wildcardClass18 = classArray17.getClass();
        enhancer10.setSuperclass((java.lang.Class) wildcardClass18);
        boolean boolean20 = classInfo4.equals((java.lang.Object) wildcardClass18);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader22 = enhancer21.getClassLoader();
        enhancer21.setUseFactory(true);
        enhancer21.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = null;
        enhancer27.setNamingPolicy(namingPolicy28);
        java.lang.ClassLoader classLoader30 = enhancer27.getClassLoader();
        org.mockito.cglib.proxy.Callback callback31 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray32 = new org.mockito.cglib.proxy.Callback[] { callback31 };
        enhancer27.setCallbacks(callbackArray32);
        enhancer21.setCallbacks(callbackArray32);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass18, callbackArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.Class; is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Class[]" + "'", str7, "java.lang.Class[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Class[]" + "'", str8, "java.lang.Class[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1041 + "'", int9 == 1041);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(classLoader22);
        org.junit.Assert.assertNotNull(classLoader30);
        org.junit.Assert.assertNotNull(callbackArray32);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=(SSS)[Ljava/lang/Class;; expert]");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = null;
        enhancer3.setNamingPolicy(namingPolicy4);
        boolean boolean6 = enhancer3.getAttemptLoad();
        java.lang.ClassLoader classLoader7 = enhancer3.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray8, true, true);
        java.lang.Class<?> wildcardClass12 = methodArray11.getClass();
        enhancer3.setSuperclass((java.lang.Class) wildcardClass12);
        java.lang.String str14 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class [Ljava.lang.reflect.Method;");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[Ljava/lang/reflect/Method;" + "'", str14, "[Ljava/lang/reflect/Method;");
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setUseCache(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Callback callback8 = null;
        enhancer0.setCallback(callback8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class10 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: createClass does not accept callbacks");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type[] typeArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("()D", type1, typeArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "V" + "'", str2, "V");
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        boolean boolean8 = enhancer0.getAttemptLoad();
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray9);
        java.lang.Class<?> wildcardClass12 = classArray11.getClass();
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class [Ljava.lang.Class;");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(classInfo13);
        org.junit.Assert.assertNotNull(type14);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        boolean boolean4 = enhancer1.getAttemptLoad();
        java.lang.ClassLoader classLoader5 = enhancer1.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader7 = enhancer6.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer6.getStrategy();
        enhancer6.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader11 = enhancer6.getClassLoader();
        enhancer1.setClassLoader(classLoader11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor13 = org.mockito.cglib.core.ReflectUtils.findConstructor("", classLoader11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(classLoader11);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("org.mockito.cglib.proxy.Enhancer", method1, method2);
        boolean boolean4 = propertyDescriptor3.isExpert();
        java.lang.String str5 = propertyDescriptor3.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.beans.PropertyDescriptor[name=org.mockito.cglib.proxy.Enhancer]" + "'", str5, "java.beans.PropertyDescriptor[name=org.mockito.cglib.proxy.Enhancer]");
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, true);
        java.lang.Class<?> wildcardClass8 = methodArray7.getClass();
        java.lang.String str9 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class [Ljava.lang.reflect.Method;");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(methodArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[Ljava/lang/reflect/Method;" + "'", str9, "[Ljava/lang/reflect/Method;");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        enhancer0.setInterceptDuringConstruction(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        boolean boolean4 = enhancer1.getAttemptLoad();
        java.lang.ClassLoader classLoader5 = enhancer1.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = enhancer1.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = null;
        enhancer7.setNamingPolicy(namingPolicy8);
        enhancer7.setAttemptLoad(false);
        enhancer7.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader15 = enhancer14.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer14.getStrategy();
        enhancer14.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader19 = enhancer14.getClassLoader();
        enhancer7.setClassLoader(classLoader19);
        enhancer1.setClassLoader(classLoader19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method22 = org.mockito.cglib.core.ReflectUtils.findMethod("(SSS)LV;", classLoader19);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(generatorStrategy6);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(classLoader19);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        java.lang.Class class0 = null;
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = enhancer1.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = null;
        enhancer1.setNamingPolicy(namingPolicy4);
        enhancer1.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = enhancer1.getNamingPolicy();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray9, true, true);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray9);
        int int14 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray13);
        enhancer1.setInterfaces(classArray13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray16, true, true);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray16);
        java.lang.Class[] classArray21 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray16);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray16, false, true);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray16);
        enhancer1.setInterfaces(classArray25);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter27 = null;
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader29 = enhancer28.getClassLoader();
        enhancer28.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback32 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray33 = new org.mockito.cglib.proxy.Callback[] { callback32 };
        enhancer28.setCallbacks(callbackArray33);
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader36 = enhancer35.getClassLoader();
        enhancer35.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback39 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray40 = new org.mockito.cglib.proxy.Callback[] { callback39 };
        enhancer35.setCallbacks(callbackArray40);
        enhancer28.setCallbacks(callbackArray40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = org.mockito.cglib.proxy.Enhancer.create(class0, classArray25, callbackFilter27, callbackArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertNotNull(namingPolicy8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(methodArray24);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(classLoader29);
        org.junit.Assert.assertNotNull(callbackArray33);
        org.junit.Assert.assertNotNull(classLoader36);
        org.junit.Assert.assertNotNull(callbackArray40);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method12 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "Lorg/mockito/asm/Type;", classArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: Lorg/mockito/asm/Type;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[Ljava/lang/Class;" + "'", str4, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(classArray11);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.lang.reflect.Constructor constructor0 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray1 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray1, true, true);
        java.lang.Class<?> wildcardClass5 = propertyDescriptorArray1.getClass();
        boolean boolean6 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) propertyDescriptorArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray1);
        org.junit.Assert.assertNotNull(methodArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setPreferred(true);
        propertyDescriptor3.setShortDescription("LV;");
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=(SSS)[Ljava/lang/Class;; expert]", obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader3 = enhancer2.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = enhancer2.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = null;
        enhancer2.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer2.getStrategy();
        java.lang.Class<?> wildcardClass8 = enhancer2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        java.lang.String str10 = classInfo9.toString();
        org.mockito.asm.Type[] typeArray11 = classInfo9.getInterfaces();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("java.lang.Object", type1, typeArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type13 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(classLoader3);
        org.junit.Assert.assertNotNull(generatorStrategy4);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classInfo9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.mockito.cglib.proxy.Enhancer" + "'", str10, "org.mockito.cglib.proxy.Enhancer");
        org.junit.Assert.assertNotNull(typeArray11);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=(SSS)[Ljava/lang/Class;; expert]");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans.PropertyDescriptor[name=");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = enhancer0.getNamingPolicy();
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        int int14 = type12.getOpcode((int) (short) 1);
        java.lang.String str15 = type12.getDescriptor();
        int int17 = type12.getOpcode((int) (byte) 100);
        boolean boolean18 = signature11.equals((java.lang.Object) int17);
        org.mockito.asm.Type[] typeArray19 = signature11.getArgumentTypes();
        org.mockito.asm.Type type20 = signature11.getReturnType();
        java.lang.Class[] classArray21 = new java.lang.Class[] {};
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray21);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray21);
        java.lang.Class<?> wildcardClass24 = classArray23.getClass();
        org.mockito.cglib.core.ClassInfo classInfo25 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass24);
        boolean boolean27 = classInfo25.equals((java.lang.Object) (-1.0f));
        java.lang.String str28 = classInfo25.toString();
        int int29 = classInfo25.getModifiers();
        java.lang.Class[] classArray30 = new java.lang.Class[] {};
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray30);
        java.lang.Class<?> wildcardClass33 = classArray32.getClass();
        org.mockito.cglib.core.ClassInfo classInfo34 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass33);
        boolean boolean36 = classInfo34.equals((java.lang.Object) (-1.0f));
        int int37 = classInfo34.getModifiers();
        org.mockito.asm.Type type38 = classInfo34.getSuperType();
        java.lang.String str39 = type38.getClassName();
        java.lang.Class[] classArray41 = new java.lang.Class[] {};
        java.lang.String[] strArray42 = org.mockito.cglib.core.ReflectUtils.getNames(classArray41);
        java.lang.Class[] classArray43 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray41);
        java.lang.Class<?> wildcardClass44 = classArray43.getClass();
        org.mockito.cglib.core.ClassInfo classInfo45 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass44);
        boolean boolean47 = classInfo45.equals((java.lang.Object) (-1.0f));
        java.lang.String str48 = classInfo45.toString();
        org.mockito.asm.Type type49 = classInfo45.getSuperType();
        int int50 = type49.getSize();
        java.lang.Class[] classArray51 = new java.lang.Class[] {};
        java.lang.String[] strArray52 = org.mockito.cglib.core.ReflectUtils.getNames(classArray51);
        java.lang.Class[] classArray53 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray51);
        java.lang.Class<?> wildcardClass54 = classArray53.getClass();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass54);
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str59 = signature58.getName();
        org.mockito.asm.Type type60 = signature58.getReturnType();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray65 = new org.mockito.asm.Type[] { type62, type63, type64 };
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type61, typeArray65);
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type60, typeArray65);
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray65);
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("", type49, typeArray65);
        org.mockito.cglib.proxy.Enhancer enhancer70 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy71 = null;
        enhancer70.setNamingPolicy(namingPolicy71);
        boolean boolean73 = enhancer70.getAttemptLoad();
        java.lang.Object[] objArray74 = new java.lang.Object[] { type8, signature11, classInfo25, type38, type49, enhancer70 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj75 = enhancer0.create(classArray7, objArray74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(namingPolicy4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "V" + "'", str15, "V");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 105 + "'", int17 == 105);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(classInfo25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang.Class[]" + "'", str28, "java.lang.Class[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1041 + "'", int29 == 1041);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(classInfo34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1041 + "'", int37 == 1041);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.lang.Object" + "'", str39, "java.lang.Object");
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(classInfo45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang.Class[]" + "'", str48, "java.lang.Class[]");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "(SSS)S" + "'", str66, "(SSS)S");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(SSS)S" + "'", str67, "(SSS)S");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "(SSS)[Ljava/lang/Class;" + "'", str68, "(SSS)[Ljava/lang/Class;");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(objArray74);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        java.lang.ClassLoader classLoader4 = enhancer1.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor5 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.lang.Object", classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader4);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str9 = signature8.getName();
        org.mockito.asm.Type type10 = signature8.getReturnType();
        boolean boolean11 = classInfo4.equals((java.lang.Object) type10);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray12, true, true);
        java.lang.Class<?> wildcardClass16 = propertyDescriptorArray12.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        boolean boolean18 = classInfo4.equals((java.lang.Object) wildcardClass16);
        boolean boolean19 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = null;
        enhancer20.setNamingPolicy(namingPolicy21);
        enhancer20.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader26 = enhancer25.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer25.getStrategy();
        enhancer20.setStrategy(generatorStrategy27);
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader30 = enhancer29.getClassLoader();
        enhancer29.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback33 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray34 = new org.mockito.cglib.proxy.Callback[] { callback33 };
        enhancer29.setCallbacks(callbackArray34);
        enhancer20.setCallbacks(callbackArray34);
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader38 = enhancer37.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer37.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = null;
        enhancer37.setNamingPolicy(namingPolicy40);
        boolean boolean42 = enhancer37.getAttemptLoad();
        enhancer37.setInterceptDuringConstruction(false);
        enhancer37.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy47 = enhancer37.getNamingPolicy();
        boolean boolean48 = enhancer37.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy49 = enhancer37.getNamingPolicy();
        enhancer20.setNamingPolicy(namingPolicy49);
        org.mockito.cglib.proxy.Enhancer enhancer51 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader52 = enhancer51.getClassLoader();
        enhancer51.setUseFactory(true);
        enhancer51.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer57 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy58 = null;
        enhancer57.setNamingPolicy(namingPolicy58);
        java.lang.ClassLoader classLoader60 = enhancer57.getClassLoader();
        org.mockito.cglib.proxy.Callback callback61 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray62 = new org.mockito.cglib.proxy.Callback[] { callback61 };
        enhancer57.setCallbacks(callbackArray62);
        enhancer51.setCallbacks(callbackArray62);
        enhancer20.setCallbacks(callbackArray62);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass16, callbackArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.beans.PropertyDescriptor; is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(classLoader26);
        org.junit.Assert.assertNotNull(generatorStrategy27);
        org.junit.Assert.assertNotNull(classLoader30);
        org.junit.Assert.assertNotNull(callbackArray34);
        org.junit.Assert.assertNotNull(classLoader38);
        org.junit.Assert.assertNotNull(generatorStrategy39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(namingPolicy47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(namingPolicy49);
        org.junit.Assert.assertNotNull(classLoader52);
        org.junit.Assert.assertNotNull(classLoader60);
        org.junit.Assert.assertNotNull(callbackArray62);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader7 = enhancer6.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer6.getStrategy();
        enhancer6.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader11 = enhancer6.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class12 = org.mockito.cglib.core.ReflectUtils.defineClass("Ljava/lang/Class;", byteArray5, classLoader11);
            org.junit.Assert.fail("Expected exception of type java.lang.reflect.InvocationTargetException; message: null");
        } catch (java.lang.reflect.InvocationTargetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100, 100, 0]");
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(classLoader11);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.lang.Class class0 = null;
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        enhancer1.setUseFactory(true);
        enhancer1.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = null;
        enhancer7.setNamingPolicy(namingPolicy8);
        java.lang.ClassLoader classLoader10 = enhancer7.getClassLoader();
        org.mockito.cglib.proxy.Callback callback11 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray12 = new org.mockito.cglib.proxy.Callback[] { callback11 };
        enhancer7.setCallbacks(callbackArray12);
        enhancer1.setCallbacks(callbackArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks(class0, callbackArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(callbackArray12);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.cglib.proxy.Callback callback6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass3, callback6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[Ljava/lang/Class;" + "'", str4, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, true);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        org.mockito.cglib.proxy.Callback callback13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass3, classArray10, callback13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[Ljava/lang/Class;" + "'", str4, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("Z");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.util.List list3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list4 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass2, list3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader7 = enhancer6.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer6.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = null;
        enhancer6.setNamingPolicy(namingPolicy9);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer6.getStrategy();
        java.lang.Class<?> wildcardClass12 = enhancer6.getClass();
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray17, true, true);
        java.lang.Class<?> wildcardClass21 = methodArray20.getClass();
        boolean boolean22 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass24 = type23.getClass();
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        int int30 = type28.getOpcode((int) (short) 1);
        java.lang.String str31 = type28.getDescriptor();
        int int33 = type28.getOpcode((int) (byte) 100);
        boolean boolean34 = signature27.equals((java.lang.Object) int33);
        java.lang.String str35 = signature27.getDescriptor();
        java.lang.Class<?> wildcardClass36 = signature27.getClass();
        java.lang.Class[] classArray37 = new java.lang.Class[] { wildcardClass12, wildcardClass15, wildcardClass21, wildcardClass24, wildcardClass36 };
        java.lang.String[] strArray38 = org.mockito.cglib.core.ReflectUtils.getNames(classArray37);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter39 = null;
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy41 = null;
        enhancer40.setNamingPolicy(namingPolicy41);
        enhancer40.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer45 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader46 = enhancer45.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = enhancer45.getStrategy();
        enhancer40.setStrategy(generatorStrategy47);
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader50 = enhancer49.getClassLoader();
        enhancer49.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback53 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray54 = new org.mockito.cglib.proxy.Callback[] { callback53 };
        enhancer49.setCallbacks(callbackArray54);
        enhancer40.setCallbacks(callbackArray54);
        org.mockito.cglib.proxy.Enhancer enhancer57 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader58 = enhancer57.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy59 = enhancer57.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy60 = null;
        enhancer57.setNamingPolicy(namingPolicy60);
        boolean boolean62 = enhancer57.getAttemptLoad();
        enhancer57.setInterceptDuringConstruction(false);
        enhancer57.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy67 = enhancer57.getNamingPolicy();
        boolean boolean68 = enhancer57.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy69 = enhancer57.getNamingPolicy();
        enhancer40.setNamingPolicy(namingPolicy69);
        org.mockito.cglib.proxy.Enhancer enhancer71 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader72 = enhancer71.getClassLoader();
        enhancer71.setUseFactory(true);
        enhancer71.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer77 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy78 = null;
        enhancer77.setNamingPolicy(namingPolicy78);
        java.lang.ClassLoader classLoader80 = enhancer77.getClassLoader();
        org.mockito.cglib.proxy.Callback callback81 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray82 = new org.mockito.cglib.proxy.Callback[] { callback81 };
        enhancer77.setCallbacks(callbackArray82);
        enhancer71.setCallbacks(callbackArray82);
        enhancer40.setCallbacks(callbackArray82);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj86 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass3, classArray37, callbackFilter39, callbackArray82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[Ljava/lang/Class;" + "'", str4, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(classInfo13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classInfo16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "V" + "'", str31, "V");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 105 + "'", int33 == 105);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(SSS)S" + "'", str35, "(SSS)S");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(classLoader46);
        org.junit.Assert.assertNotNull(generatorStrategy47);
        org.junit.Assert.assertNotNull(classLoader50);
        org.junit.Assert.assertNotNull(callbackArray54);
        org.junit.Assert.assertNotNull(classLoader58);
        org.junit.Assert.assertNotNull(generatorStrategy59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(namingPolicy67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(namingPolicy69);
        org.junit.Assert.assertNotNull(classLoader72);
        org.junit.Assert.assertNotNull(classLoader80);
        org.junit.Assert.assertNotNull(callbackArray82);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray1);
        java.lang.Class[] classArray3 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray1);
        int int4 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray3);
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter6 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray7 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.mockito.cglib.proxy.Enhancer.create(class0, classArray5, callbackFilter6, callbackArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(callbackArray7);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback4 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray5 = new org.mockito.cglib.proxy.Callback[] { callback4 };
        enhancer0.setCallbacks(callbackArray5);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader8 = enhancer7.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer7.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer7.setNamingPolicy(namingPolicy10);
        enhancer7.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = enhancer7.getNamingPolicy();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray15, true, true);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray15);
        int int20 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        enhancer7.setInterfaces(classArray19);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(callbackArray5);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertNotNull(namingPolicy14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertNotNull(methodArray18);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        java.lang.Class<?> wildcardClass2 = type0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass2);
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader5 = enhancer4.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = enhancer4.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer4.setNamingPolicy(namingPolicy7);
        enhancer4.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = enhancer4.getNamingPolicy();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray12, true, true);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray12);
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        enhancer4.setInterfaces(classArray16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, false, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass2, classArray16, (java.lang.Object[]) propertyDescriptorArray19);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(classInfo3);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(generatorStrategy6);
        org.junit.Assert.assertNotNull(namingPolicy11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(methodArray25);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass3, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[Ljava/lang/Class;" + "'", str4, "[Ljava/lang/Class;");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/lang/Class;" + "'", str5, "[Ljava/lang/Class;");
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("java.lang.Class[]", "Z");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = enhancer0.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, true);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray4);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(methodArray7);
        org.junit.Assert.assertNotNull(classArray8);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader6 = enhancer5.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer5.getStrategy();
        enhancer0.setStrategy(generatorStrategy7);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer9.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback13 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray14 = new org.mockito.cglib.proxy.Callback[] { callback13 };
        enhancer9.setCallbacks(callbackArray14);
        enhancer0.setCallbacks(callbackArray14);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader18 = enhancer17.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer17.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = null;
        enhancer17.setNamingPolicy(namingPolicy20);
        boolean boolean22 = enhancer17.getAttemptLoad();
        enhancer17.setInterceptDuringConstruction(false);
        enhancer17.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = enhancer17.getNamingPolicy();
        boolean boolean28 = enhancer17.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = enhancer17.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy29);
        java.lang.Class[] classArray31 = new java.lang.Class[] {};
        java.lang.String[] strArray32 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        java.lang.Class[] classArray33 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray31);
        java.lang.Class<?> wildcardClass34 = classArray33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo35 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type36 = classInfo35.getSuperType();
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str40 = signature39.getName();
        org.mockito.asm.Type type41 = signature39.getReturnType();
        boolean boolean42 = classInfo35.equals((java.lang.Object) type41);
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray43, true, true);
        java.lang.Class<?> wildcardClass47 = propertyDescriptorArray43.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass47);
        boolean boolean49 = classInfo35.equals((java.lang.Object) wildcardClass47);
        java.beans.PropertyDescriptor[] propertyDescriptorArray50 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray50, true, true);
        java.lang.Class<?> wildcardClass54 = propertyDescriptorArray50.getClass();
        boolean boolean55 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass54);
        java.lang.String str58 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass54);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass54);
        java.lang.Class[] classArray60 = new java.lang.Class[] { wildcardClass47, wildcardClass54 };
        org.mockito.cglib.proxy.Enhancer enhancer61 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader62 = enhancer61.getClassLoader();
        enhancer61.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback65 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray66 = new org.mockito.cglib.proxy.Callback[] { callback65 };
        enhancer61.setCallbacks(callbackArray66);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj68 = enhancer0.create(classArray60, (java.lang.Object[]) callbackArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(callbackArray14);
        org.junit.Assert.assertNotNull(classLoader18);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(namingPolicy27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(namingPolicy29);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classInfo35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray43);
        org.junit.Assert.assertNotNull(methodArray46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(propertyDescriptorArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray50);
        org.junit.Assert.assertNotNull(methodArray53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[Ljava/beans/PropertyDescriptor;" + "'", str58, "[Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(classLoader62);
        org.junit.Assert.assertNotNull(callbackArray66);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("LZ;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = enhancer1.getStrategy();
        enhancer1.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader6 = enhancer1.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor7 = org.mockito.cglib.core.ReflectUtils.findConstructor("(SSS)S", classLoader6);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertNotNull(classLoader6);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass3, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.Class; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.util.List list10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass3, classArray6, list10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = enhancer0.getNamingPolicy();
        boolean boolean11 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer0.getNamingPolicy();
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(namingPolicy12);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        byte[] byteArray1 = new byte[] {};
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader3 = enhancer2.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = enhancer2.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = null;
        enhancer2.setNamingPolicy(namingPolicy5);
        enhancer2.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer2.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader11 = enhancer10.getClassLoader();
        enhancer2.setClassLoader(classLoader11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class13 = org.mockito.cglib.core.ReflectUtils.defineClass("java.lang.Class[]", byteArray1, classLoader11);
            org.junit.Assert.fail("Expected exception of type java.lang.reflect.InvocationTargetException; message: null");
        } catch (java.lang.reflect.InvocationTargetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(classLoader3);
        org.junit.Assert.assertNotNull(generatorStrategy4);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(classLoader11);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = enhancer0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter13 = null;
        enhancer0.setCallbackFilter(callbackFilter13);
        enhancer0.setInterceptDuringConstruction(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class17 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(namingPolicy12);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer9.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback13 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray14 = new org.mockito.cglib.proxy.Callback[] { callback13 };
        enhancer9.setCallbacks(callbackArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass4, callbackArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.beans.PropertyDescriptor; is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[Ljava/beans/PropertyDescriptor;" + "'", str8, "[Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(callbackArray14);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        boolean boolean8 = enhancer0.getAttemptLoad();
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray9);
        java.lang.Class<?> wildcardClass12 = classArray11.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass12);
        boolean boolean15 = enhancer0.getUseCache();
        enhancer0.setInterceptDuringConstruction(false);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray18, true, true);
        java.lang.Class<?> wildcardClass22 = propertyDescriptorArray18.getClass();
        boolean boolean23 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class [Ljava.beans.PropertyDescriptor;");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[Ljava/lang/Class;" + "'", str13, "[Ljava/lang/Class;");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray5);
        java.lang.Class<?> wildcardClass8 = classArray7.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass8);
        java.util.List list10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list11 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass8, list10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("Z");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = null;
        enhancer3.setNamingPolicy(namingPolicy4);
        enhancer3.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray8, true, true);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray8);
        enhancer3.setInterfaces(classArray12);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str18 = signature17.getName();
        org.mockito.asm.Type type19 = signature17.getReturnType();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass2, classArray12, (java.lang.Object[]) typeArray20);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray1);
        java.lang.Class[] classArray3 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray1);
        java.lang.Class<?> wildcardClass4 = classArray3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type[] typeArray6 = classInfo5.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) typeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(typeArray6);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("D");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setValue("java.lang.Class[]", (java.lang.Object) "org/mockito/asm/Type");
        java.lang.reflect.Method method11 = null;
        propertyDescriptor3.setReadMethod(method11);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.proxy.Callback callback4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass3, callback4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer0.getNamingPolicy();
        boolean boolean6 = enhancer0.getUseCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(namingPolicy5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(true);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        java.lang.Class<?> wildcardClass9 = classArray8.getClass();
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = classInfo10.getSuperType();
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str15 = signature14.getName();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        boolean boolean17 = classInfo10.equals((java.lang.Object) type16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray18, true, true);
        java.lang.Class<?> wildcardClass22 = propertyDescriptorArray18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass22);
        boolean boolean24 = classInfo10.equals((java.lang.Object) wildcardClass22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class [Ljava.beans.PropertyDescriptor;");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classInfo10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(propertyDescriptorArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(type25);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader6 = enhancer5.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer5.getStrategy();
        enhancer5.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader10 = enhancer5.getClassLoader();
        enhancer0.setClassLoader(classLoader10);
        boolean boolean12 = enhancer0.getAttemptLoad();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class13 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) 1 };
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        boolean boolean8 = enhancer5.getAttemptLoad();
        java.lang.ClassLoader classLoader9 = enhancer5.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader11 = enhancer10.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer10.getStrategy();
        enhancer10.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader15 = enhancer10.getClassLoader();
        enhancer5.setClassLoader(classLoader15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class17 = org.mockito.cglib.core.ReflectUtils.defineClass("", byteArray4, classLoader15);
            org.junit.Assert.fail("Expected exception of type java.lang.reflect.InvocationTargetException; message: null");
        } catch (java.lang.reflect.InvocationTargetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(classLoader11);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(classLoader15);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.mockito.asm.Type type1 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        int int6 = type4.getOpcode((int) (short) 1);
        java.lang.String str7 = type4.getDescriptor();
        int int9 = type4.getOpcode((int) (byte) 100);
        boolean boolean11 = type4.equals((java.lang.Object) 'a');
        int int12 = type4.getSort();
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray13);
        java.lang.Class<?> wildcardClass16 = classArray15.getClass();
        org.mockito.cglib.core.ClassInfo classInfo17 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        boolean boolean19 = classInfo17.equals((java.lang.Object) (-1.0f));
        java.lang.String str20 = classInfo17.toString();
        int int21 = classInfo17.getModifiers();
        org.mockito.asm.Type type22 = classInfo17.getSuperType();
        org.mockito.asm.Type type23 = classInfo17.getType();
        org.mockito.asm.Type[] typeArray24 = classInfo17.getInterfaces();
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type3, typeArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("[Ljava/lang/reflect/Method;", type1, typeArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "V" + "'", str7, "V");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 105 + "'", int9 == 105);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(classInfo17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.Class[]" + "'", str20, "java.lang.Class[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1041 + "'", int21 == 1041);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(Ljava/lang/Cloneable;Ljava/io/Serializable;)V" + "'", str25, "(Ljava/lang/Cloneable;Ljava/io/Serializable;)V");
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getName();
        boolean boolean8 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setValue("char", (java.lang.Object) "char");
        boolean boolean12 = propertyDescriptor3.isHidden();
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("java.lang.Class[]", "Z");
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader17 = enhancer16.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = enhancer16.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = null;
        enhancer16.setNamingPolicy(namingPolicy19);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = enhancer16.getStrategy();
        java.lang.Class<?> wildcardClass22 = enhancer16.getClass();
        boolean boolean23 = signature15.equals((java.lang.Object) enhancer16);
        boolean boolean24 = propertyDescriptor3.equals((java.lang.Object) boolean23);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "void" + "'", str6, "void");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "void" + "'", str7, "void");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(classLoader17);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.reflect.Method; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.Class;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class[] classArray1 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str9 = signature8.getName();
        org.mockito.asm.Type type10 = signature8.getReturnType();
        boolean boolean11 = classInfo4.equals((java.lang.Object) type10);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray12, true, true);
        java.lang.Class<?> wildcardClass16 = propertyDescriptorArray12.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        boolean boolean18 = classInfo4.equals((java.lang.Object) wildcardClass16);
        java.util.List list19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list20 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass16, list19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass6);
        java.util.List list9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list10 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass6, list9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("java.lang.Class[]", "Z");
        java.lang.Class[] classArray3 = new java.lang.Class[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.ReflectUtils.getNames(classArray3);
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray3);
        java.lang.Class<?> wildcardClass6 = classArray5.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        boolean boolean9 = signature2.equals((java.lang.Object) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("()D", "[Ljava/lang/Class;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()D' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 1);
        java.lang.String str3 = type0.getDescriptor();
        int int5 = type0.getOpcode((int) (byte) 100);
        boolean boolean7 = type0.equals((java.lang.Object) 'a');
        int int9 = type0.getOpcode(0);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "V" + "'", str3, "V");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 105 + "'", int5 == 105);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("java.lang.Class[]", "Z");
        java.lang.Class[] classArray3 = new java.lang.Class[] {};
        java.lang.String[] strArray4 = org.mockito.cglib.core.ReflectUtils.getNames(classArray3);
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray3);
        java.lang.Class<?> wildcardClass6 = classArray5.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        boolean boolean9 = signature2.equals((java.lang.Object) wildcardClass6);
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray10);
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter15 = null;
        org.mockito.cglib.proxy.Callback callback16 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray17 = new org.mockito.cglib.proxy.Callback[] { callback16 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass6, classArray12, callbackFilter15, callbackArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(callbackArray17);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("V");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type2 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("(Ljava/lang/Cloneable;Ljava/io/Serializable;)LZ;");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.reflect.Method; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/lang/reflect/Method;" + "'", str5, "[Ljava/lang/reflect/Method;");
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class<?> wildcardClass9 = methodArray8.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass9);
        boolean boolean11 = enhancer0.getAttemptLoad();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(Ljava/lang/Cloneable;Ljava/io/Serializable;)V", "[Ljava/lang/Class;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(Ljava/lang/Cloneable;Ljava/io/Serializable;)V' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer6.setNamingPolicy(namingPolicy7);
        java.lang.ClassLoader classLoader9 = enhancer6.getClassLoader();
        org.mockito.cglib.proxy.Callback callback10 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray11 = new org.mockito.cglib.proxy.Callback[] { callback10 };
        enhancer6.setCallbacks(callbackArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass3, callbackArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.Class; is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(callbackArray11);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader4 = enhancer3.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer3.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer3.setNamingPolicy(namingPolicy6);
        enhancer3.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = enhancer3.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader12 = enhancer11.getClassLoader();
        enhancer3.setClassLoader(classLoader12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class14 = org.mockito.cglib.core.ReflectUtils.defineClass("Ljava/lang/Class;", byteArray2, classLoader12);
            org.junit.Assert.fail("Expected exception of type java.lang.reflect.InvocationTargetException; message: null");
        } catch (java.lang.reflect.InvocationTargetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertNotNull(classLoader12);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getName();
        boolean boolean8 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setHidden(true);
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray11);
        java.lang.Class<?> wildcardClass14 = classArray13.getClass();
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        boolean boolean17 = classInfo15.equals((java.lang.Object) (-1.0f));
        java.lang.String str18 = classInfo15.toString();
        int int19 = classInfo15.getModifiers();
        org.mockito.asm.Type type20 = classInfo15.getSuperType();
        org.mockito.asm.Type type21 = classInfo15.getType();
        org.mockito.asm.Type[] typeArray22 = classInfo15.getInterfaces();
        boolean boolean23 = propertyDescriptor3.equals((java.lang.Object) classInfo15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "void" + "'", str6, "void");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "void" + "'", str7, "void");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.Class[]" + "'", str18, "java.lang.Class[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1041 + "'", int19 == 1041);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader9 = enhancer8.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer8.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = null;
        enhancer8.setNamingPolicy(namingPolicy11);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer8.getStrategy();
        java.lang.Class<?> wildcardClass14 = enhancer8.getClass();
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, true, true);
        java.lang.Class<?> wildcardClass23 = methodArray22.getClass();
        boolean boolean24 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass26 = type25.getClass();
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        int int32 = type30.getOpcode((int) (short) 1);
        java.lang.String str33 = type30.getDescriptor();
        int int35 = type30.getOpcode((int) (byte) 100);
        boolean boolean36 = signature29.equals((java.lang.Object) int35);
        java.lang.String str37 = signature29.getDescriptor();
        java.lang.Class<?> wildcardClass38 = signature29.getClass();
        java.lang.Class[] classArray39 = new java.lang.Class[] { wildcardClass14, wildcardClass17, wildcardClass23, wildcardClass26, wildcardClass38 };
        java.lang.String[] strArray40 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method41 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass4, "V", classArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: V");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "V" + "'", str33, "V");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 105 + "'", int35 == 105);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(SSS)S" + "'", str37, "(SSS)S");
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class<?> wildcardClass9 = methodArray8.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader13 = enhancer12.getClassLoader();
        enhancer12.setUseFactory(true);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray16);
        enhancer12.setInterfaces(classArray18);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray18);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter21 = null;
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = null;
        enhancer22.setNamingPolicy(namingPolicy23);
        enhancer22.setAttemptLoad(false);
        enhancer22.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy30 = null;
        enhancer29.setNamingPolicy(namingPolicy30);
        java.lang.ClassLoader classLoader32 = enhancer29.getClassLoader();
        org.mockito.cglib.proxy.Callback callback33 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray34 = new org.mockito.cglib.proxy.Callback[] { callback33 };
        enhancer29.setCallbacks(callbackArray34);
        enhancer22.setCallbacks(callbackArray34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass9, classArray20, callbackFilter21, callbackArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(classLoader32);
        org.junit.Assert.assertNotNull(callbackArray34);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class<?> wildcardClass9 = methodArray8.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray12, true, true);
        java.lang.Class<?> wildcardClass16 = propertyDescriptorArray12.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray17, false, true);
        java.lang.Class[] classArray21 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray20);
        org.mockito.cglib.proxy.Callback callback22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass9, classArray21, callback22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(classArray21);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass6, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classInfo7);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("[Ljava/beans/PropertyDescriptor;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = enhancer0.getNamingPolicy();
        boolean boolean11 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer0.getNamingPolicy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class13 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(namingPolicy12);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader6 = enhancer5.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer5.getStrategy();
        enhancer0.setStrategy(generatorStrategy7);
        java.lang.ClassLoader classLoader9 = enhancer0.getClassLoader();
        enhancer0.setSerialVersionUID((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(classLoader9);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("()LV;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        boolean boolean6 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray8, true, true);
        java.lang.Class<?> wildcardClass12 = propertyDescriptorArray8.getClass();
        boolean boolean13 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        boolean boolean16 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass12);
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray17);
        java.lang.Class<?> wildcardClass20 = classArray19.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        enhancer23.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback26 = null;
        enhancer23.setCallback(callback26);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        java.lang.String[] strArray29 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        java.lang.Class[] classArray30 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray28);
        java.lang.Class<?> wildcardClass31 = classArray30.getClass();
        enhancer23.setSuperclass((java.lang.Class) wildcardClass31);
        java.lang.String str33 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass35 = type34.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass35);
        java.lang.String str37 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass35);
        java.lang.Class[] classArray38 = new java.lang.Class[] { wildcardClass12, wildcardClass20, wildcardClass31, wildcardClass35 };
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray39, true, true);
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray39, false, true);
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray39, false, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4, classArray38, (java.lang.Object[]) methodArray48);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.reflect.Method;.<init>([Ljava.beans.PropertyDescriptor;, [Ljava.lang.Class;, [Ljava.lang.Class;, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[Ljava/lang/reflect/Method;" + "'", str7, "[Ljava/lang/reflect/Method;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[Ljava/lang/Class;" + "'", str21, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[Ljava/lang/Class;" + "'", str33, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(propertyDescriptorArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str37, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertNotNull(propertyDescriptorArray39);
        org.junit.Assert.assertNotNull(methodArray42);
        org.junit.Assert.assertNotNull(methodArray45);
        org.junit.Assert.assertNotNull(methodArray48);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type6 = type5.getElementType();
        java.lang.String str7 = type6.getClassName();
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[Ljava/lang/Class;" + "'", str4, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Class" + "'", str7, "java.lang.Class");
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader6 = enhancer5.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer5.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = null;
        enhancer5.setNamingPolicy(namingPolicy8);
        boolean boolean10 = enhancer5.getAttemptLoad();
        enhancer5.setInterceptDuringConstruction(false);
        enhancer5.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = enhancer5.getNamingPolicy();
        boolean boolean16 = enhancer5.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = enhancer5.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = null;
        enhancer18.setNamingPolicy(namingPolicy19);
        java.lang.ClassLoader classLoader21 = enhancer18.getClassLoader();
        enhancer5.setClassLoader(classLoader21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class23 = org.mockito.cglib.core.ReflectUtils.defineClass("java.beans.PropertyDescriptor[name=(SSS)[Ljava/lang/Class;]", byteArray4, classLoader21);
            org.junit.Assert.fail("Expected exception of type java.lang.reflect.InvocationTargetException; message: null");
        } catch (java.lang.reflect.InvocationTargetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 1, 10]");
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(namingPolicy15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(namingPolicy17);
        org.junit.Assert.assertNotNull(classLoader21);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Ljava/lang/Cloneable;Ljava/io/Serializable;)V", method1, method2);
        java.lang.reflect.Method method4 = propertyDescriptor3.getReadMethod();
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = enhancer1.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = null;
        enhancer1.setNamingPolicy(namingPolicy4);
        boolean boolean6 = enhancer1.getAttemptLoad();
        enhancer1.setInterceptDuringConstruction(false);
        enhancer1.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = enhancer1.getNamingPolicy();
        boolean boolean12 = enhancer1.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = null;
        enhancer13.setNamingPolicy(namingPolicy14);
        boolean boolean16 = enhancer13.getAttemptLoad();
        java.lang.ClassLoader classLoader17 = enhancer13.getClassLoader();
        enhancer1.setClassLoader(classLoader17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor19 = org.mockito.cglib.core.ReflectUtils.findConstructor("", classLoader17);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(namingPolicy11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(classLoader17);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classInfo6);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("[Ljava/beans/PropertyDescriptor;", method1, method2);
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader5 = enhancer4.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = enhancer4.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer4.setNamingPolicy(namingPolicy7);
        boolean boolean9 = enhancer4.getAttemptLoad();
        enhancer4.setInterceptDuringConstruction(false);
        enhancer4.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = enhancer4.getNamingPolicy();
        boolean boolean15 = enhancer4.getAttemptLoad();
        boolean boolean16 = enhancer4.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        boolean boolean20 = enhancer17.getAttemptLoad();
        java.lang.ClassLoader classLoader21 = enhancer17.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer17.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = null;
        enhancer23.setNamingPolicy(namingPolicy24);
        enhancer23.setAttemptLoad(false);
        enhancer23.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader31 = enhancer30.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = enhancer30.getStrategy();
        enhancer30.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader35 = enhancer30.getClassLoader();
        enhancer23.setClassLoader(classLoader35);
        enhancer17.setClassLoader(classLoader35);
        enhancer4.setClassLoader(classLoader35);
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader40 = enhancer39.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer39.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy42 = null;
        enhancer39.setNamingPolicy(namingPolicy42);
        boolean boolean44 = enhancer39.getAttemptLoad();
        enhancer39.setInterceptDuringConstruction(false);
        enhancer39.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy49 = enhancer39.getNamingPolicy();
        boolean boolean50 = enhancer39.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer51 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy52 = null;
        enhancer51.setNamingPolicy(namingPolicy52);
        boolean boolean54 = enhancer51.getAttemptLoad();
        java.lang.ClassLoader classLoader55 = enhancer51.getClassLoader();
        enhancer39.setClassLoader(classLoader55);
        enhancer4.setClassLoader(classLoader55);
        org.mockito.cglib.core.NamingPolicy namingPolicy58 = enhancer4.getNamingPolicy();
        boolean boolean59 = propertyDescriptor3.equals((java.lang.Object) namingPolicy58);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(generatorStrategy6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(namingPolicy14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(classLoader21);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(classLoader31);
        org.junit.Assert.assertNotNull(generatorStrategy32);
        org.junit.Assert.assertNotNull(classLoader35);
        org.junit.Assert.assertNotNull(classLoader40);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(namingPolicy49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(classLoader55);
        org.junit.Assert.assertNotNull(namingPolicy58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback4 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray5 = new org.mockito.cglib.proxy.Callback[] { callback4 };
        enhancer0.setCallbacks(callbackArray5);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader8 = enhancer7.getClassLoader();
        enhancer7.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback11 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray12 = new org.mockito.cglib.proxy.Callback[] { callback11 };
        enhancer7.setCallbacks(callbackArray12);
        enhancer0.setCallbacks(callbackArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) callbackArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(callbackArray5);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(callbackArray12);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader6 = enhancer5.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer5.getStrategy();
        enhancer0.setStrategy(generatorStrategy7);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer9.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback13 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray14 = new org.mockito.cglib.proxy.Callback[] { callback13 };
        enhancer9.setCallbacks(callbackArray14);
        enhancer0.setCallbacks(callbackArray14);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader18 = enhancer17.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer17.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = null;
        enhancer17.setNamingPolicy(namingPolicy20);
        boolean boolean22 = enhancer17.getAttemptLoad();
        enhancer17.setInterceptDuringConstruction(false);
        enhancer17.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = enhancer17.getNamingPolicy();
        boolean boolean28 = enhancer17.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = enhancer17.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray31, true, true);
        java.lang.Class<?> wildcardClass35 = methodArray34.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class37 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: createClass does not accept callbacks");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(callbackArray14);
        org.junit.Assert.assertNotNull(classLoader18);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(namingPolicy27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(namingPolicy29);
        org.junit.Assert.assertNotNull(propertyDescriptorArray31);
        org.junit.Assert.assertNotNull(methodArray34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = null;
        enhancer7.setNamingPolicy(namingPolicy8);
        enhancer7.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray12, true, true);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray12);
        enhancer7.setInterfaces(classArray16);
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter19 = null;
        org.mockito.cglib.proxy.Callback callback20 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray21 = new org.mockito.cglib.proxy.Callback[] { callback20 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass4, classArray16, callbackFilter19, callbackArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[Ljava/lang/reflect/Method;" + "'", str6, "[Ljava/lang/reflect/Method;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(callbackArray21);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method3 = org.mockito.cglib.core.ReflectUtils.findMethod("short", classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(true);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("void", method8, method9);
        propertyDescriptor10.setExpert(false);
        propertyDescriptor10.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor15 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor10);
        java.lang.reflect.Method method16 = propertyDescriptor10.getWriteMethod();
        java.util.Enumeration<java.lang.String> strEnumeration17 = propertyDescriptor10.attributeNames();
        boolean boolean18 = propertyDescriptor10.isBound();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "void" + "'", str6, "void");
        org.junit.Assert.assertNull(propertyEditor15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strEnumeration17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader6 = enhancer5.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer5.getStrategy();
        enhancer0.setStrategy(generatorStrategy7);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer9.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback13 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray14 = new org.mockito.cglib.proxy.Callback[] { callback13 };
        enhancer9.setCallbacks(callbackArray14);
        enhancer0.setCallbacks(callbackArray14);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray17, true, true);
        java.lang.Class<?> wildcardClass21 = methodArray20.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass21);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class [Ljava.lang.reflect.Method;");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(callbackArray14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classInfo22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[Ljava/lang/reflect/Method;" + "'", str23, "[Ljava/lang/reflect/Method;");
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Callback callback4 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray5 = new org.mockito.cglib.proxy.Callback[] { callback4 };
        enhancer0.setCallbacks(callbackArray5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray7, true, true);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray11);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader3);
        org.junit.Assert.assertNotNull(callbackArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(classArray13);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        java.util.List list4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list5 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass1, list4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str3, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.proxy.Callback callback8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass4, callback8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        boolean boolean4 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, true);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method13 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass1, "V", classArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: V");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = enhancer1.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = null;
        enhancer1.setNamingPolicy(namingPolicy4);
        boolean boolean6 = enhancer1.getAttemptLoad();
        enhancer1.setInterceptDuringConstruction(false);
        enhancer1.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = enhancer1.getNamingPolicy();
        boolean boolean12 = enhancer1.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = null;
        enhancer13.setNamingPolicy(namingPolicy14);
        boolean boolean16 = enhancer13.getAttemptLoad();
        java.lang.ClassLoader classLoader17 = enhancer13.getClassLoader();
        enhancer1.setClassLoader(classLoader17);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = null;
        enhancer19.setNamingPolicy(namingPolicy20);
        enhancer19.setAttemptLoad(false);
        enhancer19.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader27 = enhancer26.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer26.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = null;
        enhancer26.setNamingPolicy(namingPolicy29);
        boolean boolean31 = enhancer26.getAttemptLoad();
        enhancer26.setInterceptDuringConstruction(false);
        enhancer26.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = enhancer26.getNamingPolicy();
        enhancer19.setNamingPolicy(namingPolicy36);
        enhancer1.setNamingPolicy(namingPolicy36);
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader40 = enhancer39.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer39.getStrategy();
        enhancer39.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader44 = enhancer39.getClassLoader();
        enhancer1.setClassLoader(classLoader44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor46 = org.mockito.cglib.core.ReflectUtils.findConstructor("(SSS)LV;", classLoader44);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(namingPolicy11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(classLoader17);
        org.junit.Assert.assertNotNull(classLoader27);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(namingPolicy36);
        org.junit.Assert.assertNotNull(classLoader40);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(classLoader44);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        java.lang.Class class0 = null;
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        enhancer1.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback5 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray6 = new org.mockito.cglib.proxy.Callback[] { callback5 };
        enhancer1.setCallbacks(callbackArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks(class0, callbackArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(callbackArray6);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setValue("java.lang.Class[]", (java.lang.Object) "org/mockito/asm/Type");
        boolean boolean11 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader8 = enhancer7.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer7.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer7.setNamingPolicy(namingPolicy10);
        boolean boolean12 = enhancer7.getAttemptLoad();
        enhancer7.setInterceptDuringConstruction(false);
        enhancer7.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        enhancer17.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, true);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray22);
        enhancer17.setInterfaces(classArray26);
        enhancer7.setInterfaces(classArray26);
        java.lang.reflect.Constructor constructor29 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass6, classArray26);
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader31 = enhancer30.getClassLoader();
        enhancer30.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback34 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray35 = new org.mockito.cglib.proxy.Callback[] { callback34 };
        enhancer30.setCallbacks(callbackArray35);
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader38 = enhancer37.getClassLoader();
        enhancer37.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback41 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray42 = new org.mockito.cglib.proxy.Callback[] { callback41 };
        enhancer37.setCallbacks(callbackArray42);
        enhancer30.setCallbacks(callbackArray42);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass6, callbackArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(constructor29);
        org.junit.Assert.assertNotNull(classLoader31);
        org.junit.Assert.assertNotNull(callbackArray35);
        org.junit.Assert.assertNotNull(classLoader38);
        org.junit.Assert.assertNotNull(callbackArray42);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("[Ljava/lang/Class;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray5);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass10);
        java.lang.String str12 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray13, true, true);
        java.lang.Class<?> wildcardClass17 = propertyDescriptorArray13.getClass();
        boolean boolean18 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.Class<?> wildcardClass25 = propertyDescriptorArray21.getClass();
        boolean boolean26 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass25);
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy30 = null;
        enhancer29.setNamingPolicy(namingPolicy30);
        boolean boolean32 = enhancer29.getAttemptLoad();
        java.lang.ClassLoader classLoader33 = enhancer29.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray34, true, true);
        java.lang.Class<?> wildcardClass38 = methodArray37.getClass();
        enhancer29.setSuperclass((java.lang.Class) wildcardClass38);
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray40, true, true);
        java.lang.Class<?> wildcardClass44 = methodArray43.getClass();
        org.mockito.cglib.core.ClassInfo classInfo45 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass44);
        java.lang.String str46 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass44);
        java.beans.PropertyDescriptor[] propertyDescriptorArray47 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray50 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray47, true, true);
        java.lang.Class<?> wildcardClass51 = propertyDescriptorArray47.getClass();
        boolean boolean52 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass51);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass51);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass51);
        java.lang.String str55 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass51);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass51);
        java.lang.Class[] classArray57 = new java.lang.Class[] { wildcardClass10, wildcardClass17, wildcardClass25, wildcardClass38, wildcardClass44, wildcardClass51 };
        java.lang.String[] strArray58 = org.mockito.cglib.core.ReflectUtils.getNames(classArray57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4, classArray7, (java.lang.Object[]) classArray57);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.reflect.Method;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str12, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertNotNull(methodArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(classLoader33);
        org.junit.Assert.assertNotNull(propertyDescriptorArray34);
        org.junit.Assert.assertNotNull(methodArray37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(propertyDescriptorArray40);
        org.junit.Assert.assertNotNull(methodArray43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(classInfo45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[Ljava/lang/reflect/Method;" + "'", str46, "[Ljava/lang/reflect/Method;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray47);
        org.junit.Assert.assertNotNull(methodArray50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[Ljava/beans/PropertyDescriptor;" + "'", str55, "[Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertNotNull(strArray58);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        org.mockito.cglib.proxy.Callback callback6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass4, callback6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/beans/PropertyDescriptor;" + "'", str5, "[Ljava/beans/PropertyDescriptor;");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method9 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.beans.PropertyDescriptor; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[Ljava/beans/PropertyDescriptor;" + "'", str8, "[Ljava/beans/PropertyDescriptor;");
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader8 = enhancer7.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer7.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer7.setNamingPolicy(namingPolicy10);
        boolean boolean12 = enhancer7.getAttemptLoad();
        enhancer7.setInterceptDuringConstruction(false);
        enhancer7.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        enhancer17.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, true);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray22);
        enhancer17.setInterfaces(classArray26);
        enhancer7.setInterfaces(classArray26);
        java.lang.reflect.Constructor constructor29 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass6, classArray26);
        org.mockito.cglib.core.MethodInfo methodInfo30 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29);
        org.mockito.cglib.core.MethodInfo methodInfo31 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29);
        int int32 = methodInfo31.getModifiers();
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(constructor29);
        org.junit.Assert.assertNotNull(methodInfo30);
        org.junit.Assert.assertNotNull(methodInfo31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setBound(false);
        boolean boolean8 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method9 = null;
        propertyDescriptor3.setReadMethod(method9);
        boolean boolean11 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("(Ljava/lang/Cloneable;Ljava/io/Serializable;)LZ;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(true);
        boolean boolean4 = enhancer0.getUseCache();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray5);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray5);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, false, true);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray5);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(classArray14);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=(SSS)[Ljava/lang/Class;]");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader8 = enhancer7.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer7.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer7.setNamingPolicy(namingPolicy10);
        boolean boolean12 = enhancer7.getAttemptLoad();
        enhancer7.setInterceptDuringConstruction(false);
        enhancer7.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        enhancer17.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, true);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray22);
        enhancer17.setInterfaces(classArray26);
        enhancer7.setInterfaces(classArray26);
        java.lang.reflect.Constructor constructor29 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass6, classArray26);
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = null;
        enhancer30.setNamingPolicy(namingPolicy31);
        enhancer30.setAttemptLoad(false);
        enhancer30.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy38 = null;
        enhancer37.setNamingPolicy(namingPolicy38);
        java.lang.ClassLoader classLoader40 = enhancer37.getClassLoader();
        org.mockito.cglib.proxy.Callback callback41 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray42 = new org.mockito.cglib.proxy.Callback[] { callback41 };
        enhancer37.setCallbacks(callbackArray42);
        enhancer30.setCallbacks(callbackArray42);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass6, callbackArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(constructor29);
        org.junit.Assert.assertNotNull(classLoader40);
        org.junit.Assert.assertNotNull(callbackArray42);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        enhancer1.setAttemptLoad(false);
        enhancer1.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader9 = enhancer8.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer8.getStrategy();
        enhancer8.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader13 = enhancer8.getClassLoader();
        enhancer1.setClassLoader(classLoader13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor15 = org.mockito.cglib.core.ReflectUtils.findConstructor("(SSS)V", classLoader13);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(classLoader13);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray6);
        java.lang.String str9 = type1.toString();
        java.lang.String str10 = type1.getClassName();
        int int12 = type1.getOpcode(0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type13 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(SSS)S" + "'", str7, "(SSS)S");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(SSS)LV;" + "'", str8, "(SSS)LV;");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LV;" + "'", str9, "LV;");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "V" + "'", str10, "V");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("()LV;", "java.beans.PropertyDescriptor[name=void]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()LV;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        byte[] byteArray1 = new byte[] {};
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer2.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer2.getAttemptLoad();
        java.lang.ClassLoader classLoader6 = enhancer2.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer2.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = null;
        enhancer8.setNamingPolicy(namingPolicy9);
        enhancer8.setAttemptLoad(false);
        enhancer8.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader16 = enhancer15.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer15.getStrategy();
        enhancer15.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader20 = enhancer15.getClassLoader();
        enhancer8.setClassLoader(classLoader20);
        enhancer2.setClassLoader(classLoader20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class23 = org.mockito.cglib.core.ReflectUtils.defineClass("[Ljava/lang/reflect/Method;", byteArray1, classLoader20);
            org.junit.Assert.fail("Expected exception of type java.lang.reflect.InvocationTargetException; message: null");
        } catch (java.lang.reflect.InvocationTargetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(classLoader20);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.lang.Class[]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        java.util.List list4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list5 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass1, list4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str3, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        enhancer1.setAttemptLoad(false);
        enhancer1.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader9 = enhancer8.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer8.getStrategy();
        enhancer8.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader13 = enhancer8.getClassLoader();
        enhancer1.setClassLoader(classLoader13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor15 = org.mockito.cglib.core.ReflectUtils.findConstructor("Lorg/mockito/cglib/proxy/Enhancer;", classLoader13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(classLoader13);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        boolean boolean10 = propertyDescriptor3.equals((java.lang.Object) classArray7);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass3, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class<?> wildcardClass9 = methodArray8.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        enhancer12.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback15 = null;
        enhancer12.setCallback(callback15);
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray17);
        java.lang.Class<?> wildcardClass20 = classArray19.getClass();
        enhancer12.setSuperclass((java.lang.Class) wildcardClass20);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader23 = enhancer22.getClassLoader();
        enhancer22.setUseFactory(true);
        enhancer22.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = null;
        enhancer28.setNamingPolicy(namingPolicy29);
        java.lang.ClassLoader classLoader31 = enhancer28.getClassLoader();
        org.mockito.cglib.proxy.Callback callback32 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray33 = new org.mockito.cglib.proxy.Callback[] { callback32 };
        enhancer28.setCallbacks(callbackArray33);
        enhancer22.setCallbacks(callbackArray33);
        enhancer12.setCallbacks(callbackArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass9, callbackArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.reflect.Method; is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[Ljava/lang/reflect/Method;" + "'", str11, "[Ljava/lang/reflect/Method;");
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(classLoader23);
        org.junit.Assert.assertNotNull(classLoader31);
        org.junit.Assert.assertNotNull(callbackArray33);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) 1 };
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = null;
        enhancer8.setNamingPolicy(namingPolicy9);
        java.lang.ClassLoader classLoader11 = enhancer8.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class12 = org.mockito.cglib.core.ReflectUtils.defineClass("java/lang/Object", byteArray7, classLoader11);
            org.junit.Assert.fail("Expected exception of type java.lang.reflect.InvocationTargetException; message: null");
        } catch (java.lang.reflect.InvocationTargetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 1, 100, -1, 1]");
        org.junit.Assert.assertNotNull(classLoader11);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer0.getNamingPolicy();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray8, true, true);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray8);
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        enhancer0.setInterfaces(classArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(namingPolicy7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method9 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "V", classArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: V");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(Ljava/lang/Cloneable;Ljava/io/Serializable;)V", "org.mockito.cglib.proxy.Enhancer");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(Ljava/lang/Cloneable;Ljava/io/Serializable;)V' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/beans/PropertyDescriptor;" + "'", str5, "[Ljava/beans/PropertyDescriptor;");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.lang.Class class0 = null;
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        enhancer1.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, true);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        enhancer1.setInterfaces(classArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray10);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter13 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray14 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.mockito.cglib.proxy.Enhancer.create(class0, classArray10, callbackFilter13, callbackArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(callbackArray14);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray8);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        enhancer12.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray17, true, true);
        java.lang.Class[] classArray21 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray17);
        enhancer12.setInterfaces(classArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.ReflectUtils.getNames(classArray21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass25 = type24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass25);
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray26, true, true);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = enhancer0.create(classArray10, (java.lang.Object[]) methodArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(methodArray30);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo2 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method3 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(classInfo2);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class<?> wildcardClass9 = methodArray8.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray11, true, true);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray11);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray11);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        enhancer17.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback20 = null;
        enhancer17.setCallback(callback20);
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        java.lang.String[] strArray23 = org.mockito.cglib.core.ReflectUtils.getNames(classArray22);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray22);
        java.lang.Class<?> wildcardClass25 = classArray24.getClass();
        enhancer17.setSuperclass((java.lang.Class) wildcardClass25);
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader28 = enhancer27.getClassLoader();
        enhancer27.setUseFactory(true);
        enhancer27.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = null;
        enhancer33.setNamingPolicy(namingPolicy34);
        java.lang.ClassLoader classLoader36 = enhancer33.getClassLoader();
        org.mockito.cglib.proxy.Callback callback37 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray38 = new org.mockito.cglib.proxy.Callback[] { callback37 };
        enhancer33.setCallbacks(callbackArray38);
        enhancer27.setCallbacks(callbackArray38);
        enhancer17.setCallbacks(callbackArray38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass9, classArray16, (java.lang.Object[]) callbackArray38);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.reflect.Method;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(classLoader28);
        org.junit.Assert.assertNotNull(classLoader36);
        org.junit.Assert.assertNotNull(callbackArray38);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback4 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray5 = new org.mockito.cglib.proxy.Callback[] { callback4 };
        enhancer0.setCallbacks(callbackArray5);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader8 = enhancer7.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer7.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer7.setNamingPolicy(namingPolicy10);
        enhancer7.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = enhancer7.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(callbackArray5);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertNotNull(namingPolicy14);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("[Ljava/lang/Class;");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type5, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray8);
        boolean boolean11 = type1.equals((java.lang.Object) type3);
        int int13 = type1.getOpcode(3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(SSS)S" + "'", str9, "(SSS)S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(SSS)LV;" + "'", str10, "(SSS)LV;");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader7 = enhancer6.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer6.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = null;
        enhancer6.setNamingPolicy(namingPolicy9);
        enhancer6.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer6.getNamingPolicy();
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, true, true);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray14);
        int int19 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray18);
        enhancer6.setInterfaces(classArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor21 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray18);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.beans.PropertyDescriptor;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(namingPolicy13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.util.List list11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass3, classArray9, list11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader6 = enhancer5.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer5.getStrategy();
        enhancer0.setStrategy(generatorStrategy7);
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(generatorStrategy7);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader8 = enhancer7.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer7.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer7.setNamingPolicy(namingPolicy10);
        boolean boolean12 = enhancer7.getAttemptLoad();
        enhancer7.setInterceptDuringConstruction(false);
        enhancer7.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        enhancer17.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, true);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray22);
        enhancer17.setInterfaces(classArray26);
        enhancer7.setInterfaces(classArray26);
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray26);
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        java.util.List list31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass3, classArray26, list31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/lang/Class;" + "'", str5, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("", method1, method2);
            org.junit.Assert.fail("Expected exception of type java.beans.IntrospectionException; message: bad property name");
        } catch (java.beans.IntrospectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.util.List list3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list4 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass1, list3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        enhancer0.setUseFactory(false);
        boolean boolean5 = enhancer0.getUseCache();
        enhancer0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = enhancer0.getNamingPolicy();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass10);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader15 = enhancer14.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer14.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = null;
        enhancer14.setNamingPolicy(namingPolicy17);
        boolean boolean19 = enhancer14.getAttemptLoad();
        enhancer14.setInterceptDuringConstruction(false);
        enhancer14.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy25 = null;
        enhancer24.setNamingPolicy(namingPolicy25);
        enhancer24.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray29, true, true);
        java.lang.Class[] classArray33 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray29);
        enhancer24.setInterfaces(classArray33);
        enhancer14.setInterfaces(classArray33);
        int int36 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray33);
        org.mockito.cglib.proxy.Callback callback37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass10, classArray33, callback37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(namingPolicy8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classInfo11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray29);
        org.junit.Assert.assertNotNull(methodArray32);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("short");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer9.setUseFactory(true);
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray13);
        enhancer9.setInterfaces(classArray15);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter17 = null;
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = null;
        enhancer18.setNamingPolicy(namingPolicy19);
        enhancer18.setAttemptLoad(false);
        enhancer18.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = null;
        enhancer25.setNamingPolicy(namingPolicy26);
        java.lang.ClassLoader classLoader28 = enhancer25.getClassLoader();
        org.mockito.cglib.proxy.Callback callback29 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray30 = new org.mockito.cglib.proxy.Callback[] { callback29 };
        enhancer25.setCallbacks(callbackArray30);
        enhancer18.setCallbacks(callbackArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass4, classArray15, callbackFilter17, callbackArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[Ljava/beans/PropertyDescriptor;" + "'", str8, "[Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(classLoader28);
        org.junit.Assert.assertNotNull(callbackArray30);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.lang.Class");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("Ljava/lang/Class;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method5 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.reflect.Method; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        java.lang.Class class0 = null;
        java.util.List list1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list2 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces(class0, list1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        boolean boolean6 = classInfo4.equals((java.lang.Object) (-1.0f));
        java.lang.String str7 = classInfo4.toString();
        java.lang.String str8 = classInfo4.toString();
        int int9 = classInfo4.getModifiers();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        enhancer10.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback13 = null;
        enhancer10.setCallback(callback13);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray15);
        java.lang.Class<?> wildcardClass18 = classArray17.getClass();
        enhancer10.setSuperclass((java.lang.Class) wildcardClass18);
        boolean boolean20 = classInfo4.equals((java.lang.Object) wildcardClass18);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader22 = enhancer21.getClassLoader();
        enhancer21.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback25 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray26 = new org.mockito.cglib.proxy.Callback[] { callback25 };
        enhancer21.setCallbacks(callbackArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass18, callbackArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.Class; is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Class[]" + "'", str7, "java.lang.Class[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.Class[]" + "'", str8, "java.lang.Class[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1041 + "'", int9 == 1041);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(classLoader22);
        org.junit.Assert.assertNotNull(callbackArray26);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.lang.Class");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader8 = enhancer7.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer7.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer7.setNamingPolicy(namingPolicy10);
        boolean boolean12 = enhancer7.getAttemptLoad();
        enhancer7.setInterceptDuringConstruction(false);
        enhancer7.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        enhancer17.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, true);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray22);
        enhancer17.setInterfaces(classArray26);
        enhancer7.setInterfaces(classArray26);
        java.lang.reflect.Constructor constructor29 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass6, classArray26);
        org.mockito.cglib.core.MethodInfo methodInfo30 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29);
        org.mockito.cglib.core.MethodInfo methodInfo31 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor29);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor29);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader38 = enhancer37.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer37.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = null;
        enhancer37.setNamingPolicy(namingPolicy40);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy42 = enhancer37.getStrategy();
        java.lang.Class<?> wildcardClass43 = enhancer37.getClass();
        org.mockito.cglib.core.ClassInfo classInfo44 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass43);
        java.lang.String str45 = classInfo44.toString();
        org.mockito.asm.Type[] typeArray46 = classInfo44.getInterfaces();
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("java.lang.Object", type36, typeArray46);
        java.lang.Class[] classArray48 = new java.lang.Class[] {};
        java.lang.String[] strArray49 = org.mockito.cglib.core.ReflectUtils.getNames(classArray48);
        java.lang.Class[] classArray50 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray48);
        java.lang.Class<?> wildcardClass51 = classArray50.getClass();
        org.mockito.cglib.core.ClassInfo classInfo52 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass51);
        boolean boolean54 = classInfo52.equals((java.lang.Object) (-1.0f));
        java.lang.String str55 = classInfo52.toString();
        int int56 = classInfo52.getModifiers();
        org.mockito.asm.Type type57 = classInfo52.getSuperType();
        org.mockito.asm.Type type58 = classInfo52.getType();
        org.mockito.asm.Type[] typeArray59 = classInfo52.getInterfaces();
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("V", type36, typeArray59);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj61 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor29, (java.lang.Object[]) typeArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(constructor29);
        org.junit.Assert.assertNotNull(methodInfo30);
        org.junit.Assert.assertNotNull(methodInfo31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(classLoader38);
        org.junit.Assert.assertNotNull(generatorStrategy39);
        org.junit.Assert.assertNotNull(generatorStrategy42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(classInfo44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "org.mockito.cglib.proxy.Enhancer" + "'", str45, "org.mockito.cglib.proxy.Enhancer");
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classInfo52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "java.lang.Class[]" + "'", str55, "java.lang.Class[]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1041 + "'", int56 == 1041);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(typeArray59);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = null;
        enhancer3.setNamingPolicy(namingPolicy4);
        enhancer3.setAttemptLoad(false);
        enhancer3.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader11 = enhancer10.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer10.getStrategy();
        enhancer10.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader15 = enhancer10.getClassLoader();
        enhancer3.setClassLoader(classLoader15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class17 = org.mockito.cglib.core.ReflectUtils.defineClass("Lorg/mockito/cglib/proxy/Enhancer;", byteArray2, classLoader15);
            org.junit.Assert.fail("Expected exception of type java.lang.reflect.InvocationTargetException; message: null");
        } catch (java.lang.reflect.InvocationTargetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(classLoader11);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(classLoader15);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        enhancer0.setUseFactory(false);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray5);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(classArray9);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.String str8 = type7.getInternalName();
        boolean boolean10 = type7.equals((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[Ljava/beans/PropertyDescriptor;" + "'", str8, "[Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        boolean boolean4 = enhancer1.getAttemptLoad();
        java.lang.ClassLoader classLoader5 = enhancer1.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader7 = enhancer6.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer6.getStrategy();
        enhancer6.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader11 = enhancer6.getClassLoader();
        enhancer1.setClassLoader(classLoader11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method13 = org.mockito.cglib.core.ReflectUtils.findMethod("[Ljava/beans/PropertyDescriptor;", classLoader11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(generatorStrategy8);
        org.junit.Assert.assertNotNull(classLoader11);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("()V", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()V' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = enhancer1.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = null;
        enhancer1.setNamingPolicy(namingPolicy4);
        boolean boolean6 = enhancer1.getAttemptLoad();
        enhancer1.setInterceptDuringConstruction(false);
        enhancer1.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = enhancer1.getNamingPolicy();
        boolean boolean12 = enhancer1.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = null;
        enhancer13.setNamingPolicy(namingPolicy14);
        boolean boolean16 = enhancer13.getAttemptLoad();
        java.lang.ClassLoader classLoader17 = enhancer13.getClassLoader();
        enhancer1.setClassLoader(classLoader17);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = null;
        enhancer19.setNamingPolicy(namingPolicy20);
        enhancer19.setAttemptLoad(false);
        enhancer19.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader27 = enhancer26.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = enhancer26.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = null;
        enhancer26.setNamingPolicy(namingPolicy29);
        boolean boolean31 = enhancer26.getAttemptLoad();
        enhancer26.setInterceptDuringConstruction(false);
        enhancer26.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = enhancer26.getNamingPolicy();
        enhancer19.setNamingPolicy(namingPolicy36);
        enhancer1.setNamingPolicy(namingPolicy36);
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = null;
        enhancer39.setNamingPolicy(namingPolicy40);
        boolean boolean42 = enhancer39.getAttemptLoad();
        java.lang.ClassLoader classLoader43 = enhancer39.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = enhancer39.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer45 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy46 = null;
        enhancer45.setNamingPolicy(namingPolicy46);
        enhancer45.setAttemptLoad(false);
        enhancer45.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader53 = enhancer52.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = enhancer52.getStrategy();
        enhancer52.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader57 = enhancer52.getClassLoader();
        enhancer45.setClassLoader(classLoader57);
        enhancer39.setClassLoader(classLoader57);
        enhancer1.setClassLoader(classLoader57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method61 = org.mockito.cglib.core.ReflectUtils.findMethod("(SSS)S", classLoader57);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(namingPolicy11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(classLoader17);
        org.junit.Assert.assertNotNull(classLoader27);
        org.junit.Assert.assertNotNull(generatorStrategy28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(namingPolicy36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(classLoader43);
        org.junit.Assert.assertNotNull(generatorStrategy44);
        org.junit.Assert.assertNotNull(classLoader53);
        org.junit.Assert.assertNotNull(generatorStrategy54);
        org.junit.Assert.assertNotNull(classLoader57);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class<?> wildcardClass9 = propertyDescriptorArray5.getClass();
        boolean boolean10 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class [Ljava.beans.PropertyDescriptor;");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = enhancer1.getStrategy();
        enhancer1.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader6 = enhancer1.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor7 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=(SSS)[Ljava/lang/Class;]", classLoader6);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans.PropertyDescriptor[name=");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertNotNull(classLoader6);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setAttemptLoad(false);
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = null;
        enhancer7.setNamingPolicy(namingPolicy8);
        enhancer7.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader13 = enhancer12.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer12.getStrategy();
        enhancer7.setStrategy(generatorStrategy14);
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader17 = enhancer16.getClassLoader();
        enhancer16.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback20 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray21 = new org.mockito.cglib.proxy.Callback[] { callback20 };
        enhancer16.setCallbacks(callbackArray21);
        enhancer7.setCallbacks(callbackArray21);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader25 = enhancer24.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = enhancer24.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = null;
        enhancer24.setNamingPolicy(namingPolicy27);
        boolean boolean29 = enhancer24.getAttemptLoad();
        enhancer24.setInterceptDuringConstruction(false);
        enhancer24.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = enhancer24.getNamingPolicy();
        boolean boolean35 = enhancer24.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = enhancer24.getNamingPolicy();
        enhancer7.setNamingPolicy(namingPolicy36);
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray38, true, true);
        java.lang.Class<?> wildcardClass42 = methodArray41.getClass();
        enhancer7.setSuperclass((java.lang.Class) wildcardClass42);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class [Ljava.lang.reflect.Method;");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertNotNull(classLoader17);
        org.junit.Assert.assertNotNull(callbackArray21);
        org.junit.Assert.assertNotNull(classLoader25);
        org.junit.Assert.assertNotNull(generatorStrategy26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(namingPolicy34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(namingPolicy36);
        org.junit.Assert.assertNotNull(propertyDescriptorArray38);
        org.junit.Assert.assertNotNull(methodArray41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class<?> wildcardClass9 = methodArray8.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass9);
        boolean boolean11 = enhancer0.getAttemptLoad();
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot subclass final class class [Ljava.lang.reflect.Method;");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=void]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer9.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback13 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray14 = new org.mockito.cglib.proxy.Callback[] { callback13 };
        enhancer9.setCallbacks(callbackArray14);
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader17 = enhancer16.getClassLoader();
        enhancer16.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback20 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray21 = new org.mockito.cglib.proxy.Callback[] { callback20 };
        enhancer16.setCallbacks(callbackArray21);
        enhancer9.setCallbacks(callbackArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass6, callbackArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(callbackArray14);
        org.junit.Assert.assertNotNull(classLoader17);
        org.junit.Assert.assertNotNull(callbackArray21);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method5 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.Class; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray1);
        java.lang.Class[] classArray3 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor4 = org.mockito.cglib.core.ReflectUtils.getConstructor(class0, classArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(classArray3);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader5 = enhancer4.getClassLoader();
        enhancer4.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback8 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray9 = new org.mockito.cglib.proxy.Callback[] { callback8 };
        enhancer4.setCallbacks(callbackArray9);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader12 = enhancer11.getClassLoader();
        enhancer11.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback15 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray16 = new org.mockito.cglib.proxy.Callback[] { callback15 };
        enhancer11.setCallbacks(callbackArray16);
        enhancer4.setCallbacks(callbackArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass1, callbackArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(callbackArray9);
        org.junit.Assert.assertNotNull(classLoader12);
        org.junit.Assert.assertNotNull(callbackArray16);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(SSS)S");
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader3 = enhancer2.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = enhancer2.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = null;
        enhancer2.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer2.getStrategy();
        java.lang.Class<?> wildcardClass8 = enhancer2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass8);
        boolean boolean10 = type1.equals((java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type11 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(classLoader3);
        org.junit.Assert.assertNotNull(generatorStrategy4);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        boolean boolean6 = classInfo4.equals((java.lang.Object) (-1.0f));
        java.lang.String str7 = classInfo4.toString();
        org.mockito.asm.Type type8 = classInfo4.getSuperType();
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        java.util.List list10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list11 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass9, list10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Class[]" + "'", str7, "java.lang.Class[]");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, true);
        java.lang.Class<?> wildcardClass8 = propertyDescriptorArray4.getClass();
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray12, true, true);
        java.lang.Class<?> wildcardClass16 = propertyDescriptorArray12.getClass();
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = null;
        enhancer20.setNamingPolicy(namingPolicy21);
        boolean boolean23 = enhancer20.getAttemptLoad();
        java.lang.ClassLoader classLoader24 = enhancer20.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray25, true, true);
        java.lang.Class<?> wildcardClass29 = methodArray28.getClass();
        enhancer20.setSuperclass((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray31, true, true);
        java.lang.Class<?> wildcardClass35 = methodArray34.getClass();
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass35);
        java.lang.String str37 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray38, true, true);
        java.lang.Class<?> wildcardClass42 = propertyDescriptorArray38.getClass();
        boolean boolean43 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        java.lang.String str46 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        java.lang.Class[] classArray48 = new java.lang.Class[] { wildcardClass1, wildcardClass8, wildcardClass16, wildcardClass29, wildcardClass35, wildcardClass42 };
        java.lang.String[] strArray49 = org.mockito.cglib.core.ReflectUtils.getNames(classArray48);
        java.lang.String[] strArray50 = org.mockito.cglib.core.ReflectUtils.getNames(classArray48);
        java.lang.String[] strArray51 = org.mockito.cglib.core.ReflectUtils.getNames(classArray48);
        java.lang.reflect.Method[] methodArray52 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray51, methodArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str3, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(methodArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(classLoader24);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertNotNull(methodArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(propertyDescriptorArray31);
        org.junit.Assert.assertNotNull(methodArray34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(classInfo36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[Ljava/lang/reflect/Method;" + "'", str37, "[Ljava/lang/reflect/Method;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray38);
        org.junit.Assert.assertNotNull(methodArray41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[Ljava/beans/PropertyDescriptor;" + "'", str46, "[Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        org.mockito.asm.Type[] typeArray7 = signature2.getArgumentTypes();
        java.lang.String str8 = signature2.getDescriptor();
        java.lang.String str9 = signature2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(SSS)S" + "'", str6, "(SSS)S");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(SSS)S" + "'", str8, "(SSS)S");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(SSS)S" + "'", str9, "(SSS)S");
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = null;
        enhancer3.setNamingPolicy(namingPolicy4);
        enhancer3.setUseCache(true);
        enhancer3.setSerialVersionUID((java.lang.Long) 10L);
        enhancer3.setUseFactory(true);
        java.lang.ClassLoader classLoader12 = enhancer3.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class13 = org.mockito.cglib.core.ReflectUtils.defineClass("I", byteArray2, classLoader12);
            org.junit.Assert.fail("Expected exception of type java.lang.reflect.InvocationTargetException; message: null");
        } catch (java.lang.reflect.InvocationTargetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(classLoader12);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader9 = enhancer8.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = enhancer8.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = null;
        enhancer8.setNamingPolicy(namingPolicy11);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer8.getStrategy();
        java.lang.Class<?> wildcardClass14 = enhancer8.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader16 = enhancer15.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer15.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer15.setNamingPolicy(namingPolicy18);
        boolean boolean20 = enhancer15.getAttemptLoad();
        enhancer15.setInterceptDuringConstruction(false);
        enhancer15.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = null;
        enhancer25.setNamingPolicy(namingPolicy26);
        enhancer25.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray30, true, true);
        java.lang.Class[] classArray34 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray30);
        enhancer25.setInterfaces(classArray34);
        enhancer15.setInterfaces(classArray34);
        java.lang.reflect.Constructor constructor37 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass14, classArray34);
        enhancer0.setInterfaces(classArray34);
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader40 = enhancer39.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = enhancer39.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy42 = null;
        enhancer39.setNamingPolicy(namingPolicy42);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = enhancer39.getStrategy();
        java.lang.Class<?> wildcardClass45 = enhancer39.getClass();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass45);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(generatorStrategy10);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray30);
        org.junit.Assert.assertNotNull(methodArray33);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(constructor37);
        org.junit.Assert.assertNotNull(classLoader40);
        org.junit.Assert.assertNotNull(generatorStrategy41);
        org.junit.Assert.assertNotNull(generatorStrategy44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(type46);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.Class;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/lang/Class;" + "'", str5, "[Ljava/lang/Class;");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray5);
        java.lang.Class<?> wildcardClass8 = classArray7.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass8);
        java.lang.String str10 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        org.mockito.cglib.proxy.Callback callback11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass8, callback11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[Ljava/lang/Class;" + "'", str10, "[Ljava/lang/Class;");
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        boolean boolean4 = enhancer1.getAttemptLoad();
        java.lang.ClassLoader classLoader5 = enhancer1.getClassLoader();
        enhancer1.setAttemptLoad(false);
        enhancer1.setSerialVersionUID((java.lang.Long) 10L);
        java.lang.ClassLoader classLoader10 = enhancer1.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method11 = org.mockito.cglib.core.ReflectUtils.findMethod("[Ljava/lang/Class;", classLoader10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(classLoader10);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = enhancer0.getNamingPolicy();
        boolean boolean11 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer0.getNamingPolicy();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader16 = enhancer15.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer15.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer15.setNamingPolicy(namingPolicy18);
        enhancer15.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = enhancer15.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy22);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(namingPolicy12);
        org.junit.Assert.assertNotNull(classLoader16);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(namingPolicy22);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=I]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 37");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        boolean boolean8 = enhancer0.getAttemptLoad();
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray9);
        java.lang.Class<?> wildcardClass12 = classArray11.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass12);
        boolean boolean15 = enhancer0.getUseCache();
        enhancer0.setUseCache(true);
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot subclass final class class [Ljava.lang.Class;");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[Ljava/lang/Class;" + "'", str13, "[Ljava/lang/Class;");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader6 = enhancer5.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer5.getStrategy();
        enhancer0.setStrategy(generatorStrategy7);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer9.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback13 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray14 = new org.mockito.cglib.proxy.Callback[] { callback13 };
        enhancer9.setCallbacks(callbackArray14);
        enhancer0.setCallbacks(callbackArray14);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader18 = enhancer17.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer17.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = null;
        enhancer17.setNamingPolicy(namingPolicy20);
        boolean boolean22 = enhancer17.getAttemptLoad();
        enhancer17.setInterceptDuringConstruction(false);
        enhancer17.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = enhancer17.getNamingPolicy();
        boolean boolean28 = enhancer17.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = enhancer17.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray31, true, true);
        java.lang.Class<?> wildcardClass35 = methodArray34.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass35);
        org.mockito.cglib.proxy.Callback[] callbackArray37 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass35, callbackArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.reflect.Method; is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(callbackArray14);
        org.junit.Assert.assertNotNull(classLoader18);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(namingPolicy27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(namingPolicy29);
        org.junit.Assert.assertNotNull(propertyDescriptorArray31);
        org.junit.Assert.assertNotNull(methodArray34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(callbackArray37);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.Class; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        java.lang.String str10 = signature2.getDescriptor();
        java.lang.Class<?> wildcardClass11 = signature2.getClass();
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method17 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass11, "", classArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: ");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "V" + "'", str6, "V");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 105 + "'", int8 == 105);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(SSS)S" + "'", str10, "(SSS)S");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        boolean boolean3 = enhancer0.getUseCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        boolean boolean8 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader12 = enhancer11.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer11.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = null;
        enhancer11.setNamingPolicy(namingPolicy14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer11.getStrategy();
        java.lang.Class<?> wildcardClass17 = enhancer11.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader19 = enhancer18.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer18.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = null;
        enhancer18.setNamingPolicy(namingPolicy21);
        boolean boolean23 = enhancer18.getAttemptLoad();
        enhancer18.setInterceptDuringConstruction(false);
        enhancer18.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = null;
        enhancer28.setNamingPolicy(namingPolicy29);
        enhancer28.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray33, true, true);
        java.lang.Class[] classArray37 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray33);
        enhancer28.setInterfaces(classArray37);
        enhancer18.setInterfaces(classArray37);
        java.lang.reflect.Constructor constructor40 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass17, classArray37);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(classLoader12);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertNotNull(generatorStrategy16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classLoader19);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray33);
        org.junit.Assert.assertNotNull(methodArray36);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(constructor40);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(true);
        enhancer0.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer6.setNamingPolicy(namingPolicy7);
        java.lang.ClassLoader classLoader9 = enhancer6.getClassLoader();
        org.mockito.cglib.proxy.Callback callback10 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray11 = new org.mockito.cglib.proxy.Callback[] { callback10 };
        enhancer6.setCallbacks(callbackArray11);
        enhancer0.setCallbacks(callbackArray11);
        enhancer0.setUseFactory(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class16 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: createClass does not accept callbacks");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(callbackArray11);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray1);
        java.lang.Class[] classArray3 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray1);
        java.lang.Class<?> wildcardClass4 = classArray3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        boolean boolean7 = classInfo5.equals((java.lang.Object) (-1.0f));
        int int8 = classInfo5.getModifiers();
        org.mockito.asm.Type type9 = classInfo5.getSuperType();
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int13 = type11.getOpcode(100);
        int int14 = type11.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader18 = enhancer17.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer17.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = null;
        enhancer17.setNamingPolicy(namingPolicy20);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = enhancer17.getStrategy();
        java.lang.Class<?> wildcardClass23 = enhancer17.getClass();
        org.mockito.cglib.core.ClassInfo classInfo24 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        java.lang.String str25 = classInfo24.toString();
        org.mockito.asm.Type[] typeArray26 = classInfo24.getInterfaces();
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("java.lang.Object", type16, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=(SSS)[Ljava/lang/Class;]", type9, typeArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'java.beans.PropertyDescriptor[name=(SSS)[Ljava/lang/Class;]' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1041 + "'", int8 == 1041);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.Object" + "'", str10, "java.lang.Object");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 103 + "'", int13 == 103);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(classLoader18);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertNotNull(generatorStrategy22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classInfo24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.mockito.cglib.proxy.Enhancer" + "'", str25, "org.mockito.cglib.proxy.Enhancer");
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "()D" + "'", str28, "()D");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray5);
        java.lang.Class<?> wildcardClass8 = classArray7.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass8);
        java.lang.String str10 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass8);
        org.mockito.cglib.proxy.Callback callback12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass8, callback12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[Ljava/lang/Class;" + "'", str10, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getName();
        boolean boolean8 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setValue("char", (java.lang.Object) "char");
        boolean boolean12 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setShortDescription("()D");
        java.lang.String str15 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "void" + "'", str6, "void");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "void" + "'", str7, "void");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.beans.PropertyDescriptor[name=void; shortDescription=()D; values={char=char}]" + "'", str15, "java.beans.PropertyDescriptor[name=void; shortDescription=()D; values={char=char}]");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java/lang/Object");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        boolean boolean8 = enhancer0.getAttemptLoad();
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray9);
        java.lang.Class<?> wildcardClass12 = classArray11.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.Class;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[Ljava/lang/Class;" + "'", str13, "[Ljava/lang/Class;");
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        enhancer0.setAttemptLoad(false);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray9);
        java.lang.Class<?> wildcardClass12 = classArray11.getClass();
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass12);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = null;
        enhancer18.setNamingPolicy(namingPolicy19);
        enhancer18.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray23, true, true);
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray23);
        enhancer18.setInterfaces(classArray27);
        java.lang.Class[] classArray29 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray27);
        org.mockito.cglib.proxy.Callback callback30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass12, classArray27, callback30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(classInfo13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray23);
        org.junit.Assert.assertNotNull(methodArray26);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(classArray29);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader3 = enhancer2.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = enhancer2.getStrategy();
        enhancer0.setStrategy(generatorStrategy4);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer6.setNamingPolicy(namingPolicy7);
        enhancer6.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray11, true, true);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray11);
        enhancer6.setInterfaces(classArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray18, true, true);
        java.lang.Class<?> wildcardClass22 = methodArray21.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = enhancer0.create(classArray17, (java.lang.Object[]) propertyDescriptorArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(classLoader3);
        org.junit.Assert.assertNotNull(generatorStrategy4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(propertyDescriptorArray23);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("()S");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = enhancer0.getNamingPolicy();
        boolean boolean11 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer0.getNamingPolicy();
        java.lang.ClassLoader classLoader13 = enhancer0.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, true, true);
        java.lang.Class<?> wildcardClass18 = propertyDescriptorArray14.getClass();
        boolean boolean19 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass18);
        boolean boolean22 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass18);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class [Ljava.beans.PropertyDescriptor;");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(namingPolicy12);
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java/lang/Object");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
        java.lang.String str11 = signature2.toString();
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        boolean boolean18 = classInfo16.equals((java.lang.Object) (-1.0f));
        java.lang.String str19 = classInfo16.toString();
        java.lang.String str20 = classInfo16.toString();
        org.mockito.asm.Type type21 = classInfo16.getSuperType();
        java.lang.String str22 = classInfo16.toString();
        boolean boolean23 = signature2.equals((java.lang.Object) classInfo16);
        java.lang.String str24 = signature2.getName();
        org.mockito.asm.Type type25 = signature2.getReturnType();
        java.lang.String str26 = signature2.getName();
        java.lang.String str27 = signature2.getName();
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "V" + "'", str6, "V");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 105 + "'", int8 == 105);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(SSS)S" + "'", str11, "(SSS)S");
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.Class[]" + "'", str19, "java.lang.Class[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.Class[]" + "'", str20, "java.lang.Class[]");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.Class[]" + "'", str22, "java.lang.Class[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("()D");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback4 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray5 = new org.mockito.cglib.proxy.Callback[] { callback4 };
        enhancer0.setCallbacks(callbackArray5);
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer9.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = null;
        enhancer9.setNamingPolicy(namingPolicy12);
        boolean boolean14 = enhancer9.getAttemptLoad();
        enhancer9.setInterceptDuringConstruction(false);
        enhancer9.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = null;
        enhancer19.setNamingPolicy(namingPolicy20);
        enhancer19.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray24, true, true);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray24);
        enhancer19.setInterfaces(classArray28);
        enhancer9.setInterfaces(classArray28);
        int int31 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        java.lang.String[] strArray32 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader34 = enhancer33.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = enhancer33.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = null;
        enhancer33.setNamingPolicy(namingPolicy36);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = enhancer33.getStrategy();
        java.lang.Class<?> wildcardClass39 = enhancer33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo40 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass42 = type41.getClass();
        org.mockito.cglib.core.ClassInfo classInfo43 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass42);
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray47 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray44, true, true);
        java.lang.Class<?> wildcardClass48 = methodArray47.getClass();
        boolean boolean49 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass51 = type50.getClass();
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type55 = org.mockito.asm.Type.VOID_TYPE;
        int int57 = type55.getOpcode((int) (short) 1);
        java.lang.String str58 = type55.getDescriptor();
        int int60 = type55.getOpcode((int) (byte) 100);
        boolean boolean61 = signature54.equals((java.lang.Object) int60);
        java.lang.String str62 = signature54.getDescriptor();
        java.lang.Class<?> wildcardClass63 = signature54.getClass();
        java.lang.Class[] classArray64 = new java.lang.Class[] { wildcardClass39, wildcardClass42, wildcardClass48, wildcardClass51, wildcardClass63 };
        java.lang.String[] strArray65 = org.mockito.cglib.core.ReflectUtils.getNames(classArray64);
        java.lang.String[] strArray66 = new java.lang.String[] {};
        java.beans.PropertyDescriptor[] propertyDescriptorArray67 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray70 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray67, true, true);
        java.lang.reflect.Method[] methodArray73 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray67, false, false);
        java.lang.reflect.Method[] methodArray74 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray66, methodArray73);
        java.lang.reflect.Method[] methodArray75 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray65, methodArray74);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj76 = enhancer0.create(classArray28, (java.lang.Object[]) strArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(callbackArray5);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertNotNull(methodArray27);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(classLoader34);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertNotNull(generatorStrategy38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(classInfo40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(classInfo43);
        org.junit.Assert.assertNotNull(propertyDescriptorArray44);
        org.junit.Assert.assertNotNull(methodArray47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 6 + "'", int57 == 6);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "V" + "'", str58, "V");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 105 + "'", int60 == 105);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "(SSS)S" + "'", str62, "(SSS)S");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(propertyDescriptorArray67);
        org.junit.Assert.assertNotNull(methodArray70);
        org.junit.Assert.assertNotNull(methodArray73);
        org.junit.Assert.assertNotNull(methodArray74);
        org.junit.Assert.assertNotNull(methodArray75);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("[Ljava/lang/Class;");
        int int2 = type1.getSize();
        int int4 = type1.getOpcode(100);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 104 + "'", int4 == 104);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("(SSS)Ljava/lang/Object;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.util.List list3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list4 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass1, list3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        java.lang.Object obj5 = propertyDescriptor3.getValue("Lhi!;");
        propertyDescriptor3.setHidden(true);
        propertyDescriptor3.setPreferred(false);
        propertyDescriptor3.setHidden(true);
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setReadMethod(method12);
        java.lang.String str14 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.beans.PropertyDescriptor[name=void; hidden]" + "'", str14, "java.beans.PropertyDescriptor[name=void; hidden]");
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("Lorg/mockito/cglib/proxy/Enhancer;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        boolean boolean3 = enhancer0.getUseCache();
        java.lang.Class class4 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType(class4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(true);
        java.lang.Class[] classArray4 = new java.lang.Class[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray4);
        enhancer0.setInterfaces(classArray6);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = null;
        enhancer8.setNamingPolicy(namingPolicy9);
        enhancer8.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray13, true, true);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray13);
        enhancer8.setInterfaces(classArray17);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray17);
        int int20 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass6, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classInfo7);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = enhancer0.getNamingPolicy();
        boolean boolean11 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer0.getNamingPolicy();
        enhancer0.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(namingPolicy12);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        boolean boolean6 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray7, true, true);
        java.lang.Class<?> wildcardClass11 = propertyDescriptorArray7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray12, false, true);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor17 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray16);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.reflect.Method;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(classArray16);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        boolean boolean6 = classInfo4.equals((java.lang.Object) (-1.0f));
        java.lang.String str7 = classInfo4.toString();
        org.mockito.asm.Type type8 = classInfo4.getSuperType();
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader11 = enhancer10.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer10.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer10.setNamingPolicy(namingPolicy13);
        boolean boolean15 = enhancer10.getAttemptLoad();
        enhancer10.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Callback callback18 = null;
        enhancer10.setCallback(callback18);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = null;
        enhancer20.setNamingPolicy(namingPolicy21);
        enhancer20.setAttemptLoad(false);
        enhancer20.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = null;
        enhancer27.setNamingPolicy(namingPolicy28);
        java.lang.ClassLoader classLoader30 = enhancer27.getClassLoader();
        org.mockito.cglib.proxy.Callback callback31 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray32 = new org.mockito.cglib.proxy.Callback[] { callback31 };
        enhancer27.setCallbacks(callbackArray32);
        enhancer20.setCallbacks(callbackArray32);
        enhancer10.setCallbacks(callbackArray32);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass9, callbackArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Class[]" + "'", str7, "java.lang.Class[]");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classLoader11);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(classLoader30);
        org.junit.Assert.assertNotNull(callbackArray32);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        enhancer0.setUseFactory(true);
        boolean boolean4 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Callback callback5 = null;
        enhancer0.setCallback(callback5);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.Class<?> wildcardClass10 = classArray9.getClass();
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass10);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass10);
        boolean boolean14 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class [Ljava.lang.Class;");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classInfo11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str4 = signature3.getName();
        org.mockito.asm.Type type5 = signature3.getReturnType();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("Z");
        int int15 = type14.getSize();
        java.lang.String str16 = type14.getClassName();
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray17);
        java.lang.Class<?> wildcardClass20 = classArray19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        boolean boolean23 = classInfo21.equals((java.lang.Object) (-1.0f));
        java.lang.String str24 = classInfo21.toString();
        int int25 = classInfo21.getModifiers();
        org.mockito.asm.Type type26 = classInfo21.getSuperType();
        org.mockito.asm.Type type27 = classInfo21.getType();
        org.mockito.asm.Type[] typeArray28 = classInfo21.getInterfaces();
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray28);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("()D", type5, typeArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()D' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(SSS)S" + "'", str11, "(SSS)S");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(SSS)S" + "'", str12, "(SSS)S");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Z" + "'", str16, "Z");
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(classInfo21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.Class[]" + "'", str24, "java.lang.Class[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1041 + "'", int25 == 1041);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(Ljava/lang/Cloneable;Ljava/io/Serializable;)LZ;" + "'", str29, "(Ljava/lang/Cloneable;Ljava/io/Serializable;)LZ;");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader4 = enhancer0.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class<?> wildcardClass9 = methodArray8.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass13 = type12.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass13);
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray16, true, true);
        java.lang.Class<?> wildcardClass20 = propertyDescriptorArray16.getClass();
        boolean boolean21 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray24, true, true);
        java.lang.Class<?> wildcardClass28 = propertyDescriptorArray24.getClass();
        boolean boolean29 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass28);
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = null;
        enhancer32.setNamingPolicy(namingPolicy33);
        boolean boolean35 = enhancer32.getAttemptLoad();
        java.lang.ClassLoader classLoader36 = enhancer32.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, true, true);
        java.lang.Class<?> wildcardClass41 = methodArray40.getClass();
        enhancer32.setSuperclass((java.lang.Class) wildcardClass41);
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray43, true, true);
        java.lang.Class<?> wildcardClass47 = methodArray46.getClass();
        org.mockito.cglib.core.ClassInfo classInfo48 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass47);
        java.lang.String str49 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass47);
        java.beans.PropertyDescriptor[] propertyDescriptorArray50 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray50, true, true);
        java.lang.Class<?> wildcardClass54 = propertyDescriptorArray50.getClass();
        boolean boolean55 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass54);
        java.lang.String str58 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass54);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass54);
        java.lang.Class[] classArray60 = new java.lang.Class[] { wildcardClass13, wildcardClass20, wildcardClass28, wildcardClass41, wildcardClass47, wildcardClass54 };
        java.lang.String[] strArray61 = org.mockito.cglib.core.ReflectUtils.getNames(classArray60);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor62 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass9, classArray60);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.reflect.Method;.<init>(org.mockito.asm.Type, [Ljava.beans.PropertyDescriptor;, [Ljava.beans.PropertyDescriptor;, [Ljava.lang.reflect.Method;, [Ljava.lang.reflect.Method;, [Ljava.beans.PropertyDescriptor;)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(classLoader4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[Ljava/lang/reflect/Method;" + "'", str11, "[Ljava/lang/reflect/Method;");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str15, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertNotNull(methodArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(propertyDescriptorArray31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(classLoader36);
        org.junit.Assert.assertNotNull(propertyDescriptorArray37);
        org.junit.Assert.assertNotNull(methodArray40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(propertyDescriptorArray43);
        org.junit.Assert.assertNotNull(methodArray46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(classInfo48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[Ljava/lang/reflect/Method;" + "'", str49, "[Ljava/lang/reflect/Method;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray50);
        org.junit.Assert.assertNotNull(methodArray53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[Ljava/beans/PropertyDescriptor;" + "'", str58, "[Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(strArray61);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        enhancer0.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader9 = enhancer8.getClassLoader();
        enhancer0.setClassLoader(classLoader9);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader12 = enhancer11.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer11.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = null;
        enhancer11.setNamingPolicy(namingPolicy14);
        boolean boolean16 = enhancer11.getAttemptLoad();
        enhancer11.setInterceptDuringConstruction(false);
        enhancer11.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = enhancer11.getNamingPolicy();
        boolean boolean22 = enhancer11.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = null;
        enhancer23.setNamingPolicy(namingPolicy24);
        boolean boolean26 = enhancer23.getAttemptLoad();
        java.lang.ClassLoader classLoader27 = enhancer23.getClassLoader();
        enhancer11.setClassLoader(classLoader27);
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy30 = null;
        enhancer29.setNamingPolicy(namingPolicy30);
        enhancer29.setAttemptLoad(false);
        enhancer29.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader37 = enhancer36.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy38 = enhancer36.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy39 = null;
        enhancer36.setNamingPolicy(namingPolicy39);
        boolean boolean41 = enhancer36.getAttemptLoad();
        enhancer36.setInterceptDuringConstruction(false);
        enhancer36.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy46 = enhancer36.getNamingPolicy();
        enhancer29.setNamingPolicy(namingPolicy46);
        enhancer11.setNamingPolicy(namingPolicy46);
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader50 = enhancer49.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = enhancer49.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy52 = null;
        enhancer49.setNamingPolicy(namingPolicy52);
        enhancer49.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.core.NamingPolicy namingPolicy56 = enhancer49.getNamingPolicy();
        java.beans.PropertyDescriptor[] propertyDescriptorArray57 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray60 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray57, true, true);
        java.lang.Class[] classArray61 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray57);
        int int62 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray61);
        enhancer49.setInterfaces(classArray61);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy64 = enhancer49.getStrategy();
        enhancer11.setStrategy(generatorStrategy64);
        enhancer0.setStrategy(generatorStrategy64);
        org.mockito.cglib.proxy.Enhancer enhancer67 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader68 = enhancer67.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy69 = enhancer67.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy70 = null;
        enhancer67.setNamingPolicy(namingPolicy70);
        boolean boolean72 = enhancer67.getAttemptLoad();
        enhancer67.setInterceptDuringConstruction(false);
        boolean boolean75 = enhancer67.getAttemptLoad();
        java.lang.Class[] classArray76 = new java.lang.Class[] {};
        java.lang.String[] strArray77 = org.mockito.cglib.core.ReflectUtils.getNames(classArray76);
        java.lang.Class[] classArray78 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray76);
        java.lang.Class<?> wildcardClass79 = classArray78.getClass();
        java.lang.String str80 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass79);
        enhancer67.setSuperclass((java.lang.Class) wildcardClass79);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class [Ljava.lang.Class;");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(namingPolicy7);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(classLoader12);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(namingPolicy21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(classLoader27);
        org.junit.Assert.assertNotNull(classLoader37);
        org.junit.Assert.assertNotNull(generatorStrategy38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(namingPolicy46);
        org.junit.Assert.assertNotNull(classLoader50);
        org.junit.Assert.assertNotNull(generatorStrategy51);
        org.junit.Assert.assertNotNull(namingPolicy56);
        org.junit.Assert.assertNotNull(propertyDescriptorArray57);
        org.junit.Assert.assertNotNull(methodArray60);
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(generatorStrategy64);
        org.junit.Assert.assertNotNull(classLoader68);
        org.junit.Assert.assertNotNull(generatorStrategy69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(classArray78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "[Ljava/lang/Class;" + "'", str80, "[Ljava/lang/Class;");
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.cglib.proxy.Callback[] callbackArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass1, callbackArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.reflect.Method; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classInfo5);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1 };
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = null;
        enhancer4.setNamingPolicy(namingPolicy5);
        boolean boolean7 = enhancer4.getAttemptLoad();
        java.lang.ClassLoader classLoader8 = enhancer4.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = enhancer9.getStrategy();
        enhancer9.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader14 = enhancer9.getClassLoader();
        enhancer4.setClassLoader(classLoader14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class16 = org.mockito.cglib.core.ReflectUtils.defineClass("(SSS)V", byteArray3, classLoader14);
            org.junit.Assert.fail("Expected exception of type java.lang.reflect.InvocationTargetException; message: null");
        } catch (java.lang.reflect.InvocationTargetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(classLoader14);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0 };
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader5 = enhancer4.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = enhancer4.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = null;
        enhancer7.setNamingPolicy(namingPolicy8);
        enhancer7.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader13 = enhancer12.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer12.getStrategy();
        enhancer7.setStrategy(generatorStrategy14);
        java.lang.ClassLoader classLoader16 = enhancer7.getClassLoader();
        enhancer4.setClassLoader(classLoader16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class18 = org.mockito.cglib.core.ReflectUtils.defineClass("org.mockito.cglib.proxy.Enhancer", byteArray3, classLoader16);
            org.junit.Assert.fail("Expected exception of type java.lang.reflect.InvocationTargetException; message: null");
        } catch (java.lang.reflect.InvocationTargetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0]");
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(generatorStrategy6);
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertNotNull(classLoader16);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getName();
        boolean boolean8 = propertyDescriptor3.isExpert();
        java.lang.String str9 = propertyDescriptor3.getName();
        propertyDescriptor3.setDisplayName("(SSS)S");
        boolean boolean12 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "void" + "'", str6, "void");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "void" + "'", str7, "void");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "void" + "'", str9, "void");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(SSS)LV;");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader6 = enhancer5.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = enhancer5.getStrategy();
        enhancer0.setStrategy(generatorStrategy7);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer9.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback13 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray14 = new org.mockito.cglib.proxy.Callback[] { callback13 };
        enhancer9.setCallbacks(callbackArray14);
        enhancer0.setCallbacks(callbackArray14);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader18 = enhancer17.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer17.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = null;
        enhancer17.setNamingPolicy(namingPolicy20);
        boolean boolean22 = enhancer17.getAttemptLoad();
        enhancer17.setInterceptDuringConstruction(false);
        enhancer17.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = enhancer17.getNamingPolicy();
        boolean boolean28 = enhancer17.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = enhancer17.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy29);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader32 = enhancer31.getClassLoader();
        enhancer31.setUseFactory(true);
        enhancer31.setSerialVersionUID((java.lang.Long) (-1L));
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy38 = null;
        enhancer37.setNamingPolicy(namingPolicy38);
        java.lang.ClassLoader classLoader40 = enhancer37.getClassLoader();
        org.mockito.cglib.proxy.Callback callback41 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray42 = new org.mockito.cglib.proxy.Callback[] { callback41 };
        enhancer37.setCallbacks(callbackArray42);
        enhancer31.setCallbacks(callbackArray42);
        enhancer0.setCallbacks(callbackArray42);
        enhancer0.setInterceptDuringConstruction(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class48 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: createClass does not accept callbacks");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(generatorStrategy7);
        org.junit.Assert.assertNotNull(classLoader10);
        org.junit.Assert.assertNotNull(callbackArray14);
        org.junit.Assert.assertNotNull(classLoader18);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(namingPolicy27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(namingPolicy29);
        org.junit.Assert.assertNotNull(classLoader32);
        org.junit.Assert.assertNotNull(classLoader40);
        org.junit.Assert.assertNotNull(callbackArray42);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=void; shortDescription=()D; values={char=char}]");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans.PropertyDescriptor[name=void; shortDescription=");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("[Ljava/lang/reflect/Method;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.lang.Class");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader6 = enhancer5.getClassLoader();
        enhancer5.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback9 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray10 = new org.mockito.cglib.proxy.Callback[] { callback9 };
        enhancer5.setCallbacks(callbackArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass1, callbackArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(callbackArray10);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = enhancer1.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = null;
        enhancer1.setNamingPolicy(namingPolicy4);
        enhancer1.setSerialVersionUID((java.lang.Long) 10L);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = enhancer1.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader10 = enhancer9.getClassLoader();
        enhancer1.setClassLoader(classLoader10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor12 = org.mockito.cglib.core.ReflectUtils.findConstructor("hi!", classLoader10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertNotNull(namingPolicy8);
        org.junit.Assert.assertNotNull(classLoader10);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(true);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("void", method8, method9);
        propertyDescriptor10.setExpert(false);
        propertyDescriptor10.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor15 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor10);
        java.lang.reflect.Method method16 = propertyDescriptor10.getWriteMethod();
        java.lang.String str17 = propertyDescriptor10.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "void" + "'", str6, "void");
        org.junit.Assert.assertNull(propertyEditor15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.beans.PropertyDescriptor[name=(SSS)[Ljava/lang/Class;]" + "'", str17, "java.beans.PropertyDescriptor[name=(SSS)[Ljava/lang/Class;]");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader8 = enhancer7.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer7.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer7.setNamingPolicy(namingPolicy10);
        boolean boolean12 = enhancer7.getAttemptLoad();
        enhancer7.setInterceptDuringConstruction(false);
        enhancer7.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        enhancer17.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, true);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray22);
        enhancer17.setInterfaces(classArray26);
        enhancer7.setInterfaces(classArray26);
        java.lang.reflect.Constructor constructor29 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass6, classArray26);
        org.mockito.cglib.core.MethodInfo methodInfo30 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29);
        org.mockito.cglib.core.MethodInfo methodInfo31 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor29);
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader34 = enhancer33.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = enhancer33.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = null;
        enhancer33.setNamingPolicy(namingPolicy36);
        boolean boolean38 = enhancer33.getAttemptLoad();
        enhancer33.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Callback callback41 = null;
        enhancer33.setCallback(callback41);
        org.mockito.cglib.proxy.Enhancer enhancer43 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy44 = null;
        enhancer43.setNamingPolicy(namingPolicy44);
        enhancer43.setAttemptLoad(false);
        enhancer43.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy51 = null;
        enhancer50.setNamingPolicy(namingPolicy51);
        java.lang.ClassLoader classLoader53 = enhancer50.getClassLoader();
        org.mockito.cglib.proxy.Callback callback54 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray55 = new org.mockito.cglib.proxy.Callback[] { callback54 };
        enhancer50.setCallbacks(callbackArray55);
        enhancer43.setCallbacks(callbackArray55);
        enhancer33.setCallbacks(callbackArray55);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor29, (java.lang.Object[]) callbackArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(generatorStrategy9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(constructor29);
        org.junit.Assert.assertNotNull(methodInfo30);
        org.junit.Assert.assertNotNull(methodInfo31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(classLoader34);
        org.junit.Assert.assertNotNull(generatorStrategy35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(classLoader53);
        org.junit.Assert.assertNotNull(callbackArray55);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.lang.Object", method1, method2);
        java.lang.Object obj5 = propertyDescriptor3.getValue("[Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader9 = enhancer8.getClassLoader();
        enhancer8.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback12 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray13 = new org.mockito.cglib.proxy.Callback[] { callback12 };
        enhancer8.setCallbacks(callbackArray13);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter15 = null;
        enhancer8.setCallbackFilter(callbackFilter15);
        org.mockito.cglib.proxy.Callback callback17 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray18 = new org.mockito.cglib.proxy.Callback[] { callback17 };
        enhancer8.setCallbacks(callbackArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass4, callbackArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.beans.PropertyDescriptor; is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(callbackArray13);
        org.junit.Assert.assertNotNull(callbackArray18);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setUseCache(true);
        enhancer0.setUseFactory(false);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.asm.Type");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = enhancer1.getStrategy();
        enhancer1.setInterceptDuringConstruction(false);
        java.lang.ClassLoader classLoader6 = enhancer1.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor7 = org.mockito.cglib.core.ReflectUtils.findConstructor("()D", classLoader6);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertNotNull(classLoader6);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("(SSS)LV;", classLoader1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = enhancer0.getNamingPolicy();
        boolean boolean11 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = null;
        enhancer13.setNamingPolicy(namingPolicy14);
        java.lang.ClassLoader classLoader16 = enhancer13.getClassLoader();
        enhancer0.setClassLoader(classLoader16);
        org.mockito.cglib.proxy.Callback callback18 = null;
        enhancer0.setCallback(callback18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(namingPolicy12);
        org.junit.Assert.assertNotNull(classLoader16);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        boolean boolean8 = enhancer5.getAttemptLoad();
        java.lang.ClassLoader classLoader9 = enhancer5.getClassLoader();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, true);
        java.lang.Class<?> wildcardClass14 = methodArray13.getClass();
        enhancer5.setSuperclass((java.lang.Class) wildcardClass14);
        boolean boolean16 = enhancer5.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer5.getStrategy();
        enhancer0.setStrategy(generatorStrategy17);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = null;
        enhancer19.setNamingPolicy(namingPolicy20);
        boolean boolean22 = enhancer19.getAttemptLoad();
        java.lang.ClassLoader classLoader23 = enhancer19.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = enhancer19.getStrategy();
        enhancer0.setStrategy(generatorStrategy24);
        org.mockito.asm.ClassVisitor classVisitor26 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(classLoader23);
        org.junit.Assert.assertNotNull(generatorStrategy24);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = enhancer0.getNamingPolicy();
        boolean boolean11 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        enhancer13.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback16 = null;
        enhancer13.setCallback(callback16);
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray18);
        java.lang.Class<?> wildcardClass21 = classArray20.getClass();
        enhancer13.setSuperclass((java.lang.Class) wildcardClass21);
        boolean boolean23 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass21);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class [Ljava.lang.Class;");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        boolean boolean5 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass3);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader7 = enhancer6.getClassLoader();
        enhancer6.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback10 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray11 = new org.mockito.cglib.proxy.Callback[] { callback10 };
        enhancer6.setCallbacks(callbackArray11);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader14 = enhancer13.getClassLoader();
        enhancer13.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback17 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray18 = new org.mockito.cglib.proxy.Callback[] { callback17 };
        enhancer13.setCallbacks(callbackArray18);
        enhancer6.setCallbacks(callbackArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass3, callbackArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.Class; is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader7);
        org.junit.Assert.assertNotNull(callbackArray11);
        org.junit.Assert.assertNotNull(classLoader14);
        org.junit.Assert.assertNotNull(callbackArray18);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        enhancer0.setUseFactory(false);
        boolean boolean5 = enhancer0.getUseCache();
        enhancer0.setUseCache(false);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray8, true, true);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray8);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray16, true, true);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray16, false, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray16, false, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = enhancer0.create(classArray12, (java.lang.Object[]) propertyDescriptorArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(methodArray25);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback3 = null;
        enhancer0.setCallback(callback3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray5);
        java.lang.Class<?> wildcardClass8 = classArray7.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass8);
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass8);
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader13 = enhancer12.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = enhancer12.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = null;
        enhancer12.setNamingPolicy(namingPolicy15);
        boolean boolean17 = enhancer12.getAttemptLoad();
        enhancer12.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Callback callback20 = null;
        enhancer12.setCallback(callback20);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = null;
        enhancer22.setNamingPolicy(namingPolicy23);
        enhancer22.setAttemptLoad(false);
        enhancer22.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy30 = null;
        enhancer29.setNamingPolicy(namingPolicy30);
        java.lang.ClassLoader classLoader32 = enhancer29.getClassLoader();
        org.mockito.cglib.proxy.Callback callback33 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray34 = new org.mockito.cglib.proxy.Callback[] { callback33 };
        enhancer29.setCallbacks(callbackArray34);
        enhancer22.setCallbacks(callbackArray34);
        enhancer12.setCallbacks(callbackArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass8, callbackArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.Class; is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[Ljava/lang/Class;" + "'", str10, "[Ljava/lang/Class;");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[Ljava/lang/Class;" + "'", str11, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertNotNull(generatorStrategy14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(classLoader32);
        org.junit.Assert.assertNotNull(callbackArray34);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        boolean boolean2 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass1);
        java.util.List list3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list4 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass1, list3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        boolean boolean1 = enhancer0.getUseCache();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        boolean boolean8 = enhancer0.getAttemptLoad();
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray9);
        java.lang.Class<?> wildcardClass12 = classArray11.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method15 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.Class; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[Ljava/lang/Class;" + "'", str13, "[Ljava/lang/Class;");
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setInterceptDuringConstruction(false);
        boolean boolean8 = enhancer0.getAttemptLoad();
        enhancer0.setUseFactory(true);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass(classVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass3, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/lang/Class;" + "'", str5, "[Ljava/lang/Class;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[Ljava/lang/Class;" + "'", str7, "[Ljava/lang/Class;");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer6.setNamingPolicy(namingPolicy7);
        enhancer6.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray11, true, true);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray11);
        enhancer6.setInterfaces(classArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor18 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass3, classArray17);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.Class;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(classArray17);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.cglib.proxy.Callback[] callbackArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass6, callbackArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNotNull(generatorStrategy2);
        org.junit.Assert.assertNotNull(generatorStrategy5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classInfo7);
    }
}

