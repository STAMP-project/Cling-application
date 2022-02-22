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
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.ReflectUtils.getSignature(member0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
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
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
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
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        int int0 = org.mockito.asm.Type.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
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
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
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
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
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
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.lang.Class class0 = null;
        java.lang.Class class1 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[] { class1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor3 = org.mockito.cglib.core.ReflectUtils.getConstructor(class0, classArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray2);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        int int0 = org.mockito.cglib.proxy.Mixin.STYLE_INTERFACES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
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
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        int int0 = org.mockito.asm.Type.BYTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        int int0 = org.mockito.asm.Type.OBJECT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
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
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int0 = org.mockito.asm.Type.VOID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
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
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
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
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
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
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
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
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
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
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        boolean boolean4 = signature2.equals((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
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
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray3 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(methodArray4);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
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
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin2 = org.mockito.cglib.proxy.Mixin.create(classArray0, objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class[] classArray1 = org.mockito.cglib.proxy.Mixin.getClasses(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
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
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
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
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        int int0 = org.mockito.asm.Type.DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray5 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray5);
        generator0.setDelegates((java.lang.Object[]) methodArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin8 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(methodArray5);
        org.junit.Assert.assertNotNull(methodArray6);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.mockito.cglib.core.AbstractClassGenerator abstractClassGenerator0 = org.mockito.cglib.core.AbstractClassGenerator.getCurrent();
        org.junit.Assert.assertNull(abstractClassGenerator0);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.lang.Class class0 = null;
        java.lang.Class class1 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[] { class1 };
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray5 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance(class0, classArray2, (java.lang.Object[]) methodArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(methodArray5);
        org.junit.Assert.assertNotNull(methodArray6);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("Z");
        java.lang.String str2 = type1.getDescriptor();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LZ;" + "'", str2, "LZ;");
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        int int0 = org.mockito.cglib.proxy.Mixin.STYLE_BEANS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("boolean", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("LZ;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.Class class3 = null;
        java.lang.Class[] classArray4 = new java.lang.Class[] { class3 };
        generator0.setClasses(classArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray4);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("boolean", "LZ;");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
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
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        java.lang.Class class0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray9 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray9);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor13 = org.mockito.cglib.core.ReflectUtils.getConstructor(class0, classArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        java.lang.ClassLoader classLoader0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin2 = org.mockito.cglib.proxy.Mixin.createBean(classLoader0, objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.Class class3 = null;
        java.lang.Class[] classArray4 = new java.lang.Class[] { class3 };
        generator0.setClasses(classArray4);
        // The following exception was thrown during execution in test generation
        try {
            generator0.setStyle(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mixin style: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray4);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray9 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray9);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray16 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray16);
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(methodArray18);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Z");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
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
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        int int0 = org.mockito.asm.Type.BOOLEAN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String[] strArray7 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray10 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray10);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray11);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray11);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray23 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray23);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1, classArray13, (java.lang.Object[]) methodArray24);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(methodArray24);
        org.junit.Assert.assertNotNull(methodArray25);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.Class class3 = null;
        java.lang.Class[] classArray4 = new java.lang.Class[] { class3 };
        generator0.setClasses(classArray4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray4);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        java.lang.ClassLoader classLoader0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray9 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray9);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray16 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray16);
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin19 = org.mockito.cglib.proxy.Mixin.createBean(classLoader0, (java.lang.Object[]) methodArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(methodArray18);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        int int0 = org.mockito.asm.Type.FLOAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("I");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        int int0 = org.mockito.asm.Type.INT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        // The following exception was thrown during execution in test generation
        try {
            generator0.setStyle(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mixin style: 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type6, type7, type8, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray10);
        boolean boolean12 = namingPolicy1.equals((java.lang.Object) signature11);
        java.lang.String[] strArray20 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray23 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray23);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray24);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray24);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray30 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray29, methodArray30);
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray30);
        org.mockito.cglib.core.Predicate predicate33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = namingPolicy1.getClassName("Z", "", (java.lang.Object) methodArray32, predicate33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(methodArray24);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(methodArray30);
        org.junit.Assert.assertNotNull(methodArray31);
        org.junit.Assert.assertNotNull(methodArray32);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method5 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.String; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.cglib.proxy.Mixin.Generator generator1 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator1.setUseCache(false);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray6 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray6);
        generator1.setDelegates((java.lang.Object[]) methodArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(methodArray6);
        org.junit.Assert.assertNotNull(methodArray7);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method3 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 1 };
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = org.mockito.cglib.core.ReflectUtils.defineClass("org/mockito/asm/Type", byteArray3, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 1]");
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        boolean boolean4 = signature2.equals((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) methodArray8);
        boolean boolean11 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNull(propertyEditor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.Class class3 = null;
        java.lang.Class[] classArray4 = new java.lang.Class[] { class3 };
        generator0.setClasses(classArray4);
        java.lang.String[] strArray11 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray15);
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray21 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray21);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray22);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray22);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin25 = org.mockito.cglib.proxy.Mixin.create(classArray4, (java.lang.Object[]) strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(methodArray24);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray9 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray9);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray16 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray17);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(methodArray19);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.lang.String[] strArray11 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method18 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass4, "[Ljava/lang/String;", classArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: [Ljava/lang/String;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(classArray17);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor11 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray10);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.String;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(classArray10);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.String;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass2);
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray3, true, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) propertyDescriptorArray3);
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
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin1 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either classes or delegates must be set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(false);
        // The following exception was thrown during execution in test generation
        try {
            generator0.setStyle((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mixin style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray9 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray9);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray16 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray17);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(methodArray19);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        int int0 = org.mockito.asm.Type.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray3);
        java.lang.String[] strArray10 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray13 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray13);
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray14);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray14);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin18 = org.mockito.cglib.proxy.Mixin.create(classArray4, (java.lang.Object[]) strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        int int0 = org.mockito.asm.Type.ARRAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        propertyDescriptor3.setConstrained(false);
        boolean boolean8 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
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
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        int int0 = org.mockito.asm.Type.CHAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.lang.String[] strArray5 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray9);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray13, true, true);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray13, false, true);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray13, true, true);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin23 = org.mockito.cglib.proxy.Mixin.create(classArray11, (java.lang.Object[]) propertyDescriptorArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(methodArray22);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.String;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/lang/String;" + "'", str5, "[Ljava/lang/String;");
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin3 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either classes or delegates must be set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(namingPolicy2);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("org/mockito/asm/Type", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("boolean", method6, method7);
        propertyDescriptor8.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor12 = propertyDescriptor8.createPropertyEditor((java.lang.Object) true);
        java.lang.reflect.Method method13 = null;
        propertyDescriptor8.setReadMethod(method13);
        propertyDescriptor8.setValue("B", (java.lang.Object) "Z");
        org.mockito.cglib.core.Predicate predicate18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = namingPolicy2.getClassName("boolean", "B", (java.lang.Object) propertyDescriptor8, predicate18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(namingPolicy2);
        org.junit.Assert.assertNull(propertyEditor12);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean8 = propertyDescriptor3.equals((java.lang.Object) 2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "boolean" + "'", str6, "boolean");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("hi!", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        java.lang.String str7 = type5.toString();
        java.lang.String str8 = type5.toString();
        java.lang.Class<?> wildcardClass9 = type5.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        java.lang.Class[] classArray12 = new java.lang.Class[] { wildcardClass4, wildcardClass9, wildcardClass11 };
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator13.setUseCache(false);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type18, type19, type20, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type17, typeArray22);
        generator13.setDelegates((java.lang.Object[]) typeArray22);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin25 = org.mockito.cglib.proxy.Mixin.create(classArray12, (java.lang.Object[]) typeArray22);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.reflect.InvocationTargetException-->null");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "I" + "'", str6, "I");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "I" + "'", str7, "I");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "I" + "'", str8, "I");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.lang.Class[] classArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor6 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method5 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor7 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        java.lang.reflect.Method method8 = null;
        propertyDescriptor3.setReadMethod(method8);
        propertyDescriptor3.setValue("B", (java.lang.Object) "Z");
        java.lang.reflect.Method method13 = propertyDescriptor3.getReadMethod();
        java.lang.String str14 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(propertyEditor7);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]" + "'", str14, "java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]");
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj6 = propertyDescriptor3.getValue("LZ;");
        propertyDescriptor3.setPreferred(true);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("Z");
        java.lang.String str11 = type10.getClassName();
        boolean boolean12 = propertyDescriptor3.equals((java.lang.Object) type10);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Z" + "'", str11, "Z");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
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
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        boolean boolean5 = propertyDescriptor3.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) methodArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = propertyEditor10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNull(propertyEditor10);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        byte[] byteArray1 = null;
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.mockito.cglib.core.ReflectUtils.defineClass("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]", byteArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration7 = propertyDescriptor3.attributeNames();
        boolean boolean9 = propertyDescriptor3.equals((java.lang.Object) "[Ljava/lang/String;");
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "boolean" + "'", str6, "boolean");
        org.junit.Assert.assertNotNull(strEnumeration7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
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
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.lang.String[] strArray10 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray13 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray13);
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray14);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray14);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor18 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray16);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.String;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.lang.ClassLoader classLoader0 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray1 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray1, true, true);
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray1, false, true);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin8 = org.mockito.cglib.proxy.Mixin.createBean(classLoader0, (java.lang.Object[]) propertyDescriptorArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray1);
        org.junit.Assert.assertNotNull(methodArray4);
        org.junit.Assert.assertNotNull(methodArray7);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator6.setUseCache(false);
        java.lang.Class class9 = null;
        java.lang.Class[] classArray10 = new java.lang.Class[] { class9 };
        generator6.setClasses(classArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor12 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray10);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.String;.<init>(null)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/lang/String;" + "'", str5, "[Ljava/lang/String;");
        org.junit.Assert.assertNotNull(classArray10);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(generatorStrategy13);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin3 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either classes or delegates must be set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor7 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        java.lang.reflect.Method method8 = null;
        propertyDescriptor3.setReadMethod(method8);
        propertyDescriptor3.setHidden(false);
        boolean boolean12 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNull(propertyEditor7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("[Ljava/lang/String;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.String; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("B", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str3 = signature2.getName();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.lang.String[] strArray11 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method18 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass4, "void", classArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: void");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(classArray17);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        propertyDescriptor3.setConstrained(false);
        java.lang.String str8 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.beans.PropertyDescriptor[name=boolean]" + "'", str8, "java.beans.PropertyDescriptor[name=boolean]");
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class9 = org.mockito.cglib.core.ReflectUtils.defineClass("java.beans.PropertyDescriptor[name=boolean]", byteArray7, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 0, 10, 1, -1]");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSort();
        java.lang.String str5 = type1.getDescriptor();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "boolean" + "'", str3, "boolean");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Z" + "'", str5, "Z");
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin2 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either classes or delegates must be set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
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
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.lang.String[] strArray9 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray12 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray12);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray13);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray13);
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.Object[] objArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1, classArray15, objArray17);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str3 = signature2.getName();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class9 = org.mockito.cglib.core.ReflectUtils.defineClass("V", byteArray7, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 1, -1, 1]");
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor7 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        propertyDescriptor3.setHidden(false);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        boolean boolean11 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNull(propertyEditor7);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("hi!(JFIF)V");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("boolean", method3, method4);
        propertyDescriptor5.setDisplayName("Z");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        propertyDescriptor5.setValue("boolean", (java.lang.Object) type9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type13, type14, type15, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("(JFIF)J", type1, typeArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JFIF)J' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(JFIF)J" + "'", str19, "(JFIF)J");
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(namingPolicy2);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("B(JFIF)V", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj6 = propertyDescriptor3.getValue("LZ;");
        boolean boolean7 = propertyDescriptor3.isHidden();
        java.lang.String str8 = propertyDescriptor3.getName();
        java.lang.reflect.Method method9 = propertyDescriptor3.getWriteMethod();
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor3.attributeNames();
        boolean boolean11 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "I" + "'", str8, "I");
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(strEnumeration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("V", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method3 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        boolean boolean13 = generator0.getUseCache();
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
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
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, true);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, false, true);
        java.lang.Class[] classArray13 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor14 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray13);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(classArray13);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, false, true);
        java.lang.Class[] classArray7 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) propertyDescriptorArray0);
        java.lang.String[] strArray13 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray16 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray16);
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin19 = org.mockito.cglib.proxy.Mixin.create(classArray7, (java.lang.Object[]) methodArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(methodArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(methodArray18);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
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
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin3 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either classes or delegates must be set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(generatorStrategy2);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(generatorStrategy12);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("Z");
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
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) type5);
        java.lang.String str7 = type5.getDescriptor();
        boolean boolean8 = namingPolicy1.equals((java.lang.Object) str7);
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("(JFIF)Z");
        org.mockito.cglib.core.Predicate predicate13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = namingPolicy1.getClassName("Z(JFIF)V", "Lorg/mockito/asm/Type;", (java.lang.Object) typeArray12, predicate13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(typeArray12);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(JFIF)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.reflect.Method method8 = propertyDescriptor3.getReadMethod();
        java.lang.String str9 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.beans.PropertyDescriptor[name=boolean]" + "'", str9, "java.beans.PropertyDescriptor[name=boolean]");
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("double");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.String[] strArray8 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        generator0.setClasses(classArray14);
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("boolean", method18, method19);
        propertyDescriptor20.setDisplayName("Z");
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        propertyDescriptor20.setValue("boolean", (java.lang.Object) type24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type28, type29, type30, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("hi!", type27, typeArray32);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray32);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin35 = org.mockito.cglib.proxy.Mixin.create(classArray14, (java.lang.Object[]) typeArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JFIF)J" + "'", str34, "(JFIF)J");
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray5 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray5);
        generator0.setDelegates((java.lang.Object[]) methodArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin8 = org.mockito.cglib.proxy.Mixin.create((java.lang.Object[]) methodArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(methodArray5);
        org.junit.Assert.assertNotNull(methodArray6);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, false, true);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin7 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) propertyDescriptorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(methodArray6);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.lang.ClassLoader classLoader0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray9 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray9);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray16 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray17);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin20 = org.mockito.cglib.proxy.Mixin.createBean(classLoader0, (java.lang.Object[]) methodArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(methodArray19);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        boolean boolean7 = propertyDescriptor3.equals((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, false, true);
        java.lang.Class[] classArray7 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) propertyDescriptorArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin8 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) propertyDescriptorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray0);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(methodArray6);
        org.junit.Assert.assertNotNull(classArray7);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        java.lang.ClassLoader classLoader3 = null;
        generator0.setClassLoader(classLoader3);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray10 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray11);
        org.mockito.cglib.core.Predicate predicate13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = namingPolicy5.getClassName("short", "", (java.lang.Object) methodArray11, predicate13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(namingPolicy5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator6.setUseCache(false);
        java.lang.String[] strArray14 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray17 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray17);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray18);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray18);
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        generator6.setClasses(classArray20);
        java.lang.String[] strArray23 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.String[] strArray29 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray32 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray32);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray29, methodArray33);
        java.lang.Class[] classArray35 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4, classArray20, (java.lang.Object[]) methodArray33);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.String;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(methodArray18);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(methodArray32);
        org.junit.Assert.assertNotNull(methodArray33);
        org.junit.Assert.assertNotNull(methodArray34);
        org.junit.Assert.assertNotNull(classArray35);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, false, true);
        java.lang.Class[] classArray12 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) propertyDescriptorArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin13 = org.mockito.cglib.proxy.Mixin.create(classArray4, (java.lang.Object[]) classArray12);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.reflect.InvocationTargetException-->null");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) methodArray8);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator13.setUseCache(false);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type18, type19, type20, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type17, typeArray22);
        generator13.setDelegates((java.lang.Object[]) typeArray22);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("Z", type12, typeArray22);
        java.lang.String str26 = signature25.toString();
        boolean boolean27 = propertyDescriptor3.equals((java.lang.Object) str26);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNull(propertyEditor10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Z(JFIF)V" + "'", str26, "Z(JFIF)V");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        boolean boolean13 = generator0.getUseCache();
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor7 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        propertyDescriptor3.setConstrained(false);
        java.lang.Object obj10 = null;
        boolean boolean11 = propertyDescriptor3.equals(obj10);
        org.junit.Assert.assertNull(propertyEditor7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.String; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/lang/String;" + "'", str5, "[Ljava/lang/String;");
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj6 = propertyDescriptor3.getValue("LZ;");
        boolean boolean7 = propertyDescriptor3.isHidden();
        java.lang.String str8 = propertyDescriptor3.getName();
        boolean boolean9 = propertyDescriptor3.isHidden();
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyDescriptor3.setValue("Z(JFIF)V", obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "I" + "'", str8, "I");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        boolean boolean13 = generator0.getAttemptLoad();
        java.lang.String[] strArray19 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray22 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray22);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray23);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray23);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray25);
        generator0.setClasses(classArray25);
        java.lang.String[] strArray33 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray36 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray35, methodArray36);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray33, methodArray37);
        java.lang.Class[] classArray39 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray37);
        java.lang.String[] strArray40 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray43 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray43);
        java.lang.Class[] classArray45 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray44);
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray40, methodArray44);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin47 = org.mockito.cglib.proxy.Mixin.create(classArray25, (java.lang.Object[]) strArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(methodArray24);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(methodArray36);
        org.junit.Assert.assertNotNull(methodArray37);
        org.junit.Assert.assertNotNull(methodArray38);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(methodArray43);
        org.junit.Assert.assertNotNull(methodArray44);
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertNotNull(methodArray46);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        java.lang.ClassLoader classLoader3 = null;
        generator0.setClassLoader(classLoader3);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        boolean boolean7 = namingPolicy5.equals((java.lang.Object) "I");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean9 = namingPolicy5.equals((java.lang.Object) type8);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.cglib.core.Predicate predicate14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = namingPolicy5.getClassName("Z", "V", (java.lang.Object) str13, predicate14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(namingPolicy5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I" + "'", str13, "I");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("(JFIF)Z", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(JFIF)V");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str3 = signature2.getName();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin7 = org.mockito.cglib.proxy.Mixin.create((java.lang.Object[]) propertyDescriptorArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray3);
        java.lang.String[] strArray10 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray13 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray13);
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray14);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray14);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray20 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray20);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray20);
        java.lang.String[] strArray28 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray31 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray31);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray32);
        java.lang.Class[] classArray34 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray32);
        java.lang.String[] strArray35 = org.mockito.cglib.core.ReflectUtils.getNames(classArray34);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray38 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray39);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray35, methodArray39);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray39);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin43 = org.mockito.cglib.proxy.Mixin.create(classArray4, (java.lang.Object[]) methodArray42);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.reflect.InvocationTargetException-->null");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(methodArray31);
        org.junit.Assert.assertNotNull(methodArray32);
        org.junit.Assert.assertNotNull(methodArray33);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(methodArray38);
        org.junit.Assert.assertNotNull(methodArray39);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertNotNull(methodArray41);
        org.junit.Assert.assertNotNull(methodArray42);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(namingPolicy2);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("double");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor7 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        java.lang.reflect.Method method8 = null;
        propertyDescriptor3.setReadMethod(method8);
        boolean boolean10 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setPreferred(false);
        propertyDescriptor3.setShortDescription("");
        propertyDescriptor3.setName("[Ljava/lang/String;");
        org.mockito.cglib.proxy.Mixin.Generator generator17 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator17.setUseCache(false);
        java.lang.String[] strArray25 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray28 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray28);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray25, methodArray29);
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray29);
        java.lang.String[] strArray32 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        generator17.setClasses(classArray31);
        boolean boolean34 = generator17.getAttemptLoad();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray37 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray37);
        java.lang.Class<?> wildcardClass39 = strArray36.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass39);
        generator17.setDelegates((java.lang.Object[]) propertyDescriptorArray40);
        boolean boolean42 = propertyDescriptor3.equals((java.lang.Object) propertyDescriptorArray40);
        org.junit.Assert.assertNull(propertyEditor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(methodArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(methodArray30);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodArray37);
        org.junit.Assert.assertNotNull(methodArray38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(propertyDescriptorArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) methodArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin11 = org.mockito.cglib.proxy.Mixin.create((java.lang.Object[]) methodArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNull(propertyEditor10);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray3);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray7 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray7);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin14 = org.mockito.cglib.proxy.Mixin.create(classArray4, (java.lang.Object[]) methodArray11);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.reflect.InvocationTargetException-->null");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("D", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin1 = org.mockito.cglib.proxy.Mixin.create(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either classes or delegates must be set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str6 = signature5.getName();
        java.lang.Class<?> wildcardClass7 = signature5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray12 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray12);
        java.lang.Class<?> wildcardClass14 = strArray11.getClass();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        java.lang.String str18 = type16.toString();
        java.lang.String str19 = type16.toString();
        java.lang.Class<?> wildcardClass20 = type16.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        java.lang.Class[] classArray22 = new java.lang.Class[] { wildcardClass7, wildcardClass14, wildcardClass20 };
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass24 = type23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1, classArray22, (java.lang.Object[]) propertyDescriptorArray25);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(org.mockito.cglib.core.Signature, [Ljava.lang.String;, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "I" + "'", str17, "I");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "I" + "'", str18, "I");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "I" + "'", str19, "I");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org/mockito/asm/Type" + "'", str21, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        java.lang.ClassLoader classLoader3 = null;
        generator0.setClassLoader(classLoader3);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        boolean boolean7 = namingPolicy5.equals((java.lang.Object) "I");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean9 = namingPolicy5.equals((java.lang.Object) type8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = type8.getInternalName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(namingPolicy5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("I");
        java.lang.String str2 = type1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LI;" + "'", str2, "LI;");
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.String; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/lang/String;" + "'", str5, "[Ljava/lang/String;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("(JFIF)J");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str3 = signature2.getName();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode(9);
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.util.List list5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list6 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setBound(true);
        boolean boolean6 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor7 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        propertyDescriptor3.setHidden(false);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setConstrained(false);
        java.lang.String str13 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(propertyEditor7);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.beans.PropertyDescriptor[name=boolean; displayName=Z]" + "'", str13, "java.beans.PropertyDescriptor[name=boolean; displayName=Z]");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        int int0 = org.mockito.cglib.proxy.Mixin.STYLE_EVERYTHING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        java.lang.ClassLoader classLoader0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray3 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray3);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray7 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray7);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray11);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin15 = org.mockito.cglib.proxy.Mixin.createBean(classLoader0, (java.lang.Object[]) methodArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(methodArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(methodArray14);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj6 = propertyDescriptor3.getValue("LZ;");
        boolean boolean7 = propertyDescriptor3.isHidden();
        java.lang.String str8 = propertyDescriptor3.getName();
        java.lang.reflect.Method method9 = propertyDescriptor3.getWriteMethod();
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor3.attributeNames();
        java.lang.String str11 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "I" + "'", str8, "I");
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(strEnumeration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.beans.PropertyDescriptor[name=I]" + "'", str11, "java.beans.PropertyDescriptor[name=I]");
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 1 };
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = org.mockito.cglib.core.ReflectUtils.defineClass("hi!(JFIF)V", byteArray3, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 1]");
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.lang.ClassLoader classLoader0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray9 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray9);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin14 = org.mockito.cglib.proxy.Mixin.createBean(classLoader0, (java.lang.Object[]) classArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(classArray13);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.lang.ClassLoader classLoader0 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray1 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray1, true, true);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin5 = org.mockito.cglib.proxy.Mixin.createBean(classLoader0, (java.lang.Object[]) methodArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray1);
        org.junit.Assert.assertNotNull(methodArray4);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        java.lang.String str4 = type2.getClassName();
        java.lang.String str5 = type2.getClassName();
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "double" + "'", str4, "double");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "double" + "'", str5, "double");
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.String[] strArray8 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        generator0.setClasses(classArray14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = generator0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin18 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.Class class3 = null;
        java.lang.Class[] classArray4 = new java.lang.Class[] { class3 };
        generator0.setClasses(classArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray4);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.String[] strArray8 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        generator0.setClasses(classArray14);
        boolean boolean17 = generator0.getAttemptLoad();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.ClassLoader classLoader18 = generator0.getClassLoader();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) -1 };
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class6 = org.mockito.cglib.core.ReflectUtils.defineClass("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]", byteArray4, classLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 10, -1]");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray9 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray9);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray16 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray16);
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(methodArray18);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray3);
        int int5 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray4);
        java.lang.String[] strArray11 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray15);
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin19 = org.mockito.cglib.proxy.Mixin.create(classArray4, (java.lang.Object[]) classArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.String str4 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.beans.PropertyDescriptor[name=boolean]" + "'", str4, "java.beans.PropertyDescriptor[name=boolean]");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setBound(true);
        boolean boolean6 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("I", method9, method10);
        java.lang.Class<?> wildcardClass12 = propertyDescriptor11.getPropertyEditorClass();
        java.lang.Object obj14 = propertyDescriptor11.getValue("LZ;");
        boolean boolean15 = propertyDescriptor11.isHidden();
        java.lang.String str16 = propertyDescriptor11.getName();
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) str16);
        java.lang.String str18 = propertyDescriptor3.getShortDescription();
        boolean boolean19 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "I" + "'", str16, "I");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "boolean" + "'", str18, "boolean");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator5.getNamingPolicy();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean8 = namingPolicy6.equals((java.lang.Object) type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) type10);
        java.lang.String str12 = type10.getDescriptor();
        boolean boolean13 = namingPolicy6.equals((java.lang.Object) str12);
        org.mockito.cglib.core.Predicate predicate14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = namingPolicy2.getClassName("short", "(JFIF)V", (java.lang.Object) boolean13, predicate14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(namingPolicy2);
        org.junit.Assert.assertNotNull(namingPolicy6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray3 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray3);
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray0, methodArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(methodArray4);
        org.junit.Assert.assertNotNull(classArray5);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator5.getNamingPolicy();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean8 = namingPolicy6.equals((java.lang.Object) type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) type10);
        java.lang.String str12 = type10.getDescriptor();
        boolean boolean13 = namingPolicy6.equals((java.lang.Object) str12);
        generator3.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type17, type18, type19, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray21);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        boolean boolean24 = namingPolicy6.equals((java.lang.Object) type23);
        generator0.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type30, type31, type32, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type29, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("B", type27, typeArray34);
        org.mockito.asm.Type[] typeArray37 = signature36.getArgumentTypes();
        boolean boolean39 = signature36.equals((java.lang.Object) (short) 1);
        java.lang.String str40 = signature36.getName();
        org.mockito.asm.Type[] typeArray41 = signature36.getArgumentTypes();
        generator0.setDelegates((java.lang.Object[]) typeArray41);
        org.mockito.asm.ClassVisitor classVisitor43 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(namingPolicy2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(namingPolicy6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "B" + "'", str40, "B");
        org.junit.Assert.assertNotNull(typeArray41);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class6 = org.mockito.cglib.core.ReflectUtils.defineClass("void", byteArray4, classLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 10]");
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.Class class3 = null;
        java.lang.Class[] classArray4 = new java.lang.Class[] { class3 };
        generator0.setClasses(classArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin6 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray4);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setName("(JFIF)Z");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        boolean boolean11 = propertyDescriptor3.equals((java.lang.Object) propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("[Ljava/lang/String;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("java.beans.PropertyDescriptor[name=boolean]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 43");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type3, type4, type5, type6 };
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray7);
        org.mockito.asm.Type type9 = signature8.getReturnType();
        java.lang.String str10 = type9.getClassName();
        org.mockito.cglib.proxy.Mixin.Generator generator11 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean12 = generator11.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator13.getNamingPolicy();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean16 = namingPolicy14.equals((java.lang.Object) type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) type18);
        java.lang.String str20 = type18.getDescriptor();
        boolean boolean21 = namingPolicy14.equals((java.lang.Object) str20);
        generator11.setNamingPolicy(namingPolicy14);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray25 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray25);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray29);
        java.lang.String[] strArray37 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray40 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray39, methodArray40);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray41);
        java.lang.Class[] classArray43 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray41);
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray41);
        generator11.setDelegates((java.lang.Object[]) methodArray44);
        generator11.setAttemptLoad(false);
        boolean boolean48 = type9.equals((java.lang.Object) false);
        java.lang.reflect.Method method50 = null;
        java.lang.reflect.Method method51 = null;
        java.beans.PropertyDescriptor propertyDescriptor52 = new java.beans.PropertyDescriptor("boolean", method50, method51);
        propertyDescriptor52.setDisplayName("Z");
        org.mockito.asm.Type type56 = org.mockito.asm.Type.LONG_TYPE;
        propertyDescriptor52.setValue("boolean", (java.lang.Object) type56);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type60, type61, type62, type63 };
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("hi!", type59, typeArray64);
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type56, typeArray64);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("(JFIF)Z", type9, typeArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JFIF)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "void" + "'", str10, "void");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(namingPolicy14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Z" + "'", str20, "Z");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(methodArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(methodArray30);
        org.junit.Assert.assertNotNull(methodArray31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodArray40);
        org.junit.Assert.assertNotNull(methodArray41);
        org.junit.Assert.assertNotNull(methodArray42);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(methodArray44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "(JFIF)J" + "'", str66, "(JFIF)J");
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray3);
        int int5 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray4);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("boolean", method7, method8);
        propertyDescriptor9.setDisplayName("Z");
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.beans.PropertyEditor propertyEditor16 = propertyDescriptor9.createPropertyEditor((java.lang.Object) methodArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin17 = org.mockito.cglib.proxy.Mixin.create(classArray4, (java.lang.Object[]) methodArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNull(propertyEditor16);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class9 = org.mockito.cglib.core.ReflectUtils.defineClass("hi!", byteArray7, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 0, -1, 100, 0]");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        int int4 = type1.getOpcode(8);
        int int5 = type1.getSize();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = org.mockito.cglib.core.ReflectUtils.defineClass("(JFIF)J", byteArray3, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1]");
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj6 = propertyDescriptor3.getValue("LZ;");
        java.lang.String str7 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.beans.PropertyDescriptor[name=I]" + "'", str7, "java.beans.PropertyDescriptor[name=I]");
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("double");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
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
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray18 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray18);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray30);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray30);
        generator0.setDelegates((java.lang.Object[]) methodArray33);
        java.lang.String[] strArray40 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray43 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray43);
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray40, methodArray44);
        java.lang.Class[] classArray46 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray44);
        int int47 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray46);
        generator0.setClasses(classArray46);
        int int49 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray46);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass51 = type50.getClass();
        java.lang.String str52 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass51);
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass51);
        java.lang.Class[] classArray54 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray53);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin55 = org.mockito.cglib.proxy.Mixin.create(classArray46, (java.lang.Object[]) classArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodArray18);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(methodArray30);
        org.junit.Assert.assertNotNull(methodArray31);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(methodArray33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(methodArray43);
        org.junit.Assert.assertNotNull(methodArray44);
        org.junit.Assert.assertNotNull(methodArray45);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "org/mockito/asm/Type" + "'", str52, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray53);
        org.junit.Assert.assertNotNull(classArray54);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        java.lang.String str7 = propertyDescriptor3.getName();
        propertyDescriptor3.setName("I");
        java.lang.String str10 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "boolean" + "'", str6, "boolean");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "boolean" + "'", str7, "boolean");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.beans.PropertyDescriptor[name=I]" + "'", str10, "java.beans.PropertyDescriptor[name=I]");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/lang/String;" + "'", str5, "[Ljava/lang/String;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("Z(JFIF)V");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) methodArray8);
        java.lang.Object obj12 = propertyDescriptor3.getValue("[Ljava/lang/String;");
        propertyDescriptor3.setDisplayName("(JFIF)V");
        propertyDescriptor3.setBound(false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNull(propertyEditor10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1 };
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = org.mockito.cglib.core.ReflectUtils.defineClass("Z", byteArray3, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1]");
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("LI;", "LI;");
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getAttemptLoad();
        boolean boolean5 = signature2.equals((java.lang.Object) generator3);
        java.lang.String[] strArray11 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray15);
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray21 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray21);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray32 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray32);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray29, methodArray33);
        java.lang.Class[] classArray35 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray33);
        java.lang.String[] strArray36 = org.mockito.cglib.core.ReflectUtils.getNames(classArray35);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray39 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray38, methodArray39);
        java.lang.Class[] classArray41 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray40);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray40);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray40);
        java.lang.Class[] classArray44 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray18);
        generator3.setClasses(classArray44);
        // The following exception was thrown during execution in test generation
        try {
            generator3.setStyle((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mixin style: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(methodArray32);
        org.junit.Assert.assertNotNull(methodArray33);
        org.junit.Assert.assertNotNull(methodArray34);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodArray39);
        org.junit.Assert.assertNotNull(methodArray40);
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertNotNull(methodArray42);
        org.junit.Assert.assertNotNull(methodArray43);
        org.junit.Assert.assertNotNull(classArray44);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration7 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setExpert(true);
        boolean boolean10 = propertyDescriptor3.isHidden();
        org.mockito.cglib.proxy.Mixin.Generator generator11 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean12 = generator11.getUseCache();
        boolean boolean13 = propertyDescriptor3.equals((java.lang.Object) generator11);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "boolean" + "'", str6, "boolean");
        org.junit.Assert.assertNotNull(strEnumeration7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type6, type7, type8, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray10);
        boolean boolean12 = namingPolicy1.equals((java.lang.Object) signature11);
        java.lang.String str13 = signature11.toString();
        java.lang.String str14 = signature11.getName();
        java.lang.Class<?> wildcardClass15 = signature11.getClass();
        java.util.List list16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list17 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass15, list16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!(JFIF)V" + "'", str13, "hi!(JFIF)V");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        boolean boolean4 = signature2.equals((java.lang.Object) 0L);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator5.setUseCache(false);
        boolean boolean8 = signature2.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray9 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=I]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 37");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("double", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertNotNull(generatorStrategy4);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        boolean boolean13 = generator0.getAttemptLoad();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray16 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray16);
        java.lang.Class<?> wildcardClass18 = strArray15.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        generator0.setDelegates((java.lang.Object[]) propertyDescriptorArray20);
        org.mockito.asm.ClassVisitor classVisitor22 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean13 = generator12.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator12.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(namingPolicy14);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration7 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setExpert(true);
        boolean boolean10 = propertyDescriptor3.isHidden();
        java.lang.String str11 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "boolean" + "'", str6, "boolean");
        org.junit.Assert.assertNotNull(strEnumeration7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.beans.PropertyDescriptor[name=boolean; expert]" + "'", str11, "java.beans.PropertyDescriptor[name=boolean; expert]");
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=boolean; displayName=Z]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 58");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray6 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray6);
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin9 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) methodArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(methodArray6);
        org.junit.Assert.assertNotNull(methodArray7);
        org.junit.Assert.assertNotNull(methodArray8);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class4 = org.mockito.cglib.core.ReflectUtils.defineClass("B", byteArray2, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            generator0.setStyle(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mixin style: 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(generatorStrategy3);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        generator0.setStyle(2);
        boolean boolean15 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator16 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean17 = generator16.getAttemptLoad();
        boolean boolean18 = generator16.getUseCache();
        java.lang.ClassLoader classLoader19 = null;
        generator16.setClassLoader(classLoader19);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = generator16.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy21);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        int int26 = type25.getSort();
        org.mockito.cglib.core.Predicate predicate27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = namingPolicy21.getClassName("", "(JFIF)J", (java.lang.Object) type25, predicate27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(namingPolicy21);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!(JFIF)V", "LZ;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'hi!(JFIF)V' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        propertyDescriptor3.setDisplayName("void");
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, false, true);
        java.lang.Class[] classArray12 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) propertyDescriptorArray5);
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin14 = org.mockito.cglib.proxy.Mixin.create(classArray4, (java.lang.Object[]) classArray12);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.reflect.InvocationTargetException-->null");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator5.getNamingPolicy();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean8 = namingPolicy6.equals((java.lang.Object) type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) type10);
        java.lang.String str12 = type10.getDescriptor();
        boolean boolean13 = namingPolicy6.equals((java.lang.Object) str12);
        generator3.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type17, type18, type19, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray21);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        boolean boolean24 = namingPolicy6.equals((java.lang.Object) type23);
        generator0.setNamingPolicy(namingPolicy6);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("LI;", "LI;");
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean30 = generator29.getAttemptLoad();
        boolean boolean31 = signature28.equals((java.lang.Object) generator29);
        java.lang.String[] strArray37 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray40 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray39, methodArray40);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray41);
        java.lang.Class[] classArray43 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray41);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray43);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray47 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray46, methodArray47);
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray44, methodArray47);
        java.lang.String[] strArray55 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray58 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray59 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray57, methodArray58);
        java.lang.reflect.Method[] methodArray60 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray55, methodArray59);
        java.lang.Class[] classArray61 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray59);
        java.lang.String[] strArray62 = org.mockito.cglib.core.ReflectUtils.getNames(classArray61);
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray65 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray66 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray64, methodArray65);
        java.lang.Class[] classArray67 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray66);
        java.lang.reflect.Method[] methodArray68 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray62, methodArray66);
        java.lang.reflect.Method[] methodArray69 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray44, methodArray66);
        java.lang.Class[] classArray70 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray44);
        generator29.setClasses(classArray70);
        generator0.setClasses(classArray70);
        org.mockito.asm.Type type74 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type76 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type77 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type78 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type79 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type80 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray81 = new org.mockito.asm.Type[] { type77, type78, type79, type80 };
        org.mockito.cglib.core.Signature signature82 = new org.mockito.cglib.core.Signature("hi!", type76, typeArray81);
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("B", type74, typeArray81);
        org.mockito.asm.Type[] typeArray84 = signature83.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin85 = org.mockito.cglib.proxy.Mixin.create(classArray70, (java.lang.Object[]) typeArray84);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(namingPolicy2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(namingPolicy6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodArray40);
        org.junit.Assert.assertNotNull(methodArray41);
        org.junit.Assert.assertNotNull(methodArray42);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(methodArray47);
        org.junit.Assert.assertNotNull(methodArray48);
        org.junit.Assert.assertNotNull(methodArray49);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(methodArray58);
        org.junit.Assert.assertNotNull(methodArray59);
        org.junit.Assert.assertNotNull(methodArray60);
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(methodArray65);
        org.junit.Assert.assertNotNull(methodArray66);
        org.junit.Assert.assertNotNull(classArray67);
        org.junit.Assert.assertNotNull(methodArray68);
        org.junit.Assert.assertNotNull(methodArray69);
        org.junit.Assert.assertNotNull(classArray70);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertNotNull(type78);
        org.junit.Assert.assertNotNull(type79);
        org.junit.Assert.assertNotNull(type80);
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertNotNull(typeArray84);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor7 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        propertyDescriptor3.setHidden(false);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setConstrained(false);
        java.lang.Class<?> wildcardClass13 = propertyDescriptor3.getPropertyType();
        propertyDescriptor3.setName("(JFIF)Z");
        org.mockito.cglib.proxy.Mixin.Generator generator16 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean17 = generator16.getAttemptLoad();
        boolean boolean18 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator16.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator16.getStrategy();
        generator16.setStyle(2);
        java.beans.PropertyEditor propertyEditor23 = propertyDescriptor3.createPropertyEditor((java.lang.Object) generator16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin24 = generator16.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either classes or delegates must be set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyEditor7);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertNotNull(generatorStrategy20);
        org.junit.Assert.assertNull(propertyEditor23);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("LI;", "LI;");
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean10 = generator9.getAttemptLoad();
        boolean boolean11 = signature8.equals((java.lang.Object) generator9);
        java.lang.String[] strArray17 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray20 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray20);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray21);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray21);
        java.lang.String[] strArray24 = org.mockito.cglib.core.ReflectUtils.getNames(classArray23);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray27 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray27);
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray27);
        java.lang.String[] strArray35 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray38 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray38);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray35, methodArray39);
        java.lang.Class[] classArray41 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray39);
        java.lang.String[] strArray42 = org.mockito.cglib.core.ReflectUtils.getNames(classArray41);
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray45 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray44, methodArray45);
        java.lang.Class[] classArray47 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray46);
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray46);
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray46);
        java.lang.Class[] classArray50 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray24);
        generator9.setClasses(classArray50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method52 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass1, "LZ;", classArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: LZ;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str3, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodArray27);
        org.junit.Assert.assertNotNull(methodArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(methodArray38);
        org.junit.Assert.assertNotNull(methodArray39);
        org.junit.Assert.assertNotNull(methodArray40);
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(methodArray45);
        org.junit.Assert.assertNotNull(methodArray46);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(methodArray48);
        org.junit.Assert.assertNotNull(methodArray49);
        org.junit.Assert.assertNotNull(classArray50);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
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
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("LZ;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("LI;", "LI;");
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getAttemptLoad();
        boolean boolean5 = signature2.equals((java.lang.Object) generator3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin6 = generator3.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either classes or delegates must be set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyType();
        java.lang.reflect.Method method5 = null;
        propertyDescriptor3.setWriteMethod(method5);
        boolean boolean7 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj6 = propertyDescriptor3.getValue("LZ;");
        boolean boolean7 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) methodArray8);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin12 = org.mockito.cglib.proxy.Mixin.create((java.lang.Object[]) methodArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNull(propertyEditor10);
        org.junit.Assert.assertNotNull(classArray11);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyType();
        java.lang.reflect.Method method5 = null;
        propertyDescriptor3.setWriteMethod(method5);
        boolean boolean7 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        generator0.setAttemptLoad(false);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin6 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either classes or delegates must be set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(generatorStrategy3);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj6 = propertyDescriptor3.getValue("LZ;");
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray10 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray10);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray14);
        java.lang.String[] strArray22 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray25 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray25);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray26);
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray26);
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) strArray9);
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("boolean", method32, method33);
        java.lang.Class<?> wildcardClass35 = propertyDescriptor34.getPropertyEditorClass();
        java.lang.String str36 = propertyDescriptor34.getName();
        java.lang.String str37 = propertyDescriptor34.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration38 = propertyDescriptor34.attributeNames();
        propertyDescriptor34.setExpert(true);
        boolean boolean41 = propertyDescriptor34.isPreferred();
        boolean boolean42 = propertyDescriptor3.equals((java.lang.Object) boolean41);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(methodArray26);
        org.junit.Assert.assertNotNull(methodArray27);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "boolean" + "'", str36, "boolean");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "boolean" + "'", str37, "boolean");
        org.junit.Assert.assertNotNull(strEnumeration38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("I");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("[Ljava/lang/String;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 19");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        generator0.setUseCache(false);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(namingPolicy2);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        byte[] byteArray1 = null;
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.mockito.cglib.core.ReflectUtils.defineClass("S", byteArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
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
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) methodArray8);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray8);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass13 = type12.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin17 = org.mockito.cglib.proxy.Mixin.create(classArray11, (java.lang.Object[]) propertyDescriptorArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNull(propertyEditor10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/Type" + "'", str14, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str3 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor7 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.String;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("boolean", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        java.lang.ClassLoader classLoader8 = null;
        generator0.setClassLoader(classLoader8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin10 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either classes or delegates must be set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean8 = generator7.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator9.getNamingPolicy();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean12 = namingPolicy10.equals((java.lang.Object) type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) type14);
        java.lang.String str16 = type14.getDescriptor();
        boolean boolean17 = namingPolicy10.equals((java.lang.Object) str16);
        generator7.setNamingPolicy(namingPolicy10);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray21 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray21);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray25 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray25);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray25);
        java.lang.String[] strArray33 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray36 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray35, methodArray36);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray33, methodArray37);
        java.lang.Class[] classArray39 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray37);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray37);
        generator7.setDelegates((java.lang.Object[]) methodArray40);
        java.lang.String[] strArray47 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray50 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray49, methodArray50);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray47, methodArray51);
        java.lang.Class[] classArray53 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray51);
        int int54 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray53);
        generator7.setClasses(classArray53);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor56 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray53);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str6, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Z" + "'", str16, "Z");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(methodArray26);
        org.junit.Assert.assertNotNull(methodArray27);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(methodArray36);
        org.junit.Assert.assertNotNull(methodArray37);
        org.junit.Assert.assertNotNull(methodArray38);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(methodArray40);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(methodArray50);
        org.junit.Assert.assertNotNull(methodArray51);
        org.junit.Assert.assertNotNull(methodArray52);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("V");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class8 = org.mockito.cglib.core.ReflectUtils.defineClass("hi!(JFIF)V", byteArray6, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 100, -1, 1]");
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        java.lang.String str4 = classInfo3.toString();
        java.lang.String str5 = classInfo3.toString();
        org.mockito.asm.Type type6 = classInfo3.getSuperType();
        org.mockito.asm.Type[] typeArray7 = classInfo3.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin8 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) typeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(classInfo3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.mockito.asm.Type" + "'", str4, "org.mockito.asm.Type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.mockito.asm.Type" + "'", str5, "org.mockito.asm.Type");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(typeArray7);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("short", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray18 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray18);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray30);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray30);
        generator0.setDelegates((java.lang.Object[]) methodArray33);
        java.lang.Class[] classArray35 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray33);
        java.lang.Object[] objArray36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin37 = org.mockito.cglib.proxy.Mixin.create(classArray35, objArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodArray18);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(methodArray30);
        org.junit.Assert.assertNotNull(methodArray31);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(methodArray33);
        org.junit.Assert.assertNotNull(classArray35);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=boolean; values={java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]=false}; constrained]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray9 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray9);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) classArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass6);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray8);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor11 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass1, classArray9);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str3, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
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
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(JFIF)L(JFIF)V;", "(JFIF)V");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JFIF)L(JFIF)V;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor7 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        java.lang.reflect.Method method8 = null;
        propertyDescriptor3.setReadMethod(method8);
        boolean boolean10 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setPreferred(false);
        propertyDescriptor3.setShortDescription("");
        java.lang.String str15 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(propertyEditor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.beans.PropertyDescriptor[name=boolean; displayName=Z; shortDescription=]" + "'", str15, "java.beans.PropertyDescriptor[name=boolean; displayName=Z; shortDescription=]");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj6 = propertyDescriptor3.getValue("LZ;");
        boolean boolean7 = propertyDescriptor3.isHidden();
        java.lang.String str8 = propertyDescriptor3.getName();
        boolean boolean9 = propertyDescriptor3.isHidden();
        boolean boolean10 = propertyDescriptor3.isExpert();
        boolean boolean12 = propertyDescriptor3.equals((java.lang.Object) "[Ljava/lang/String;");
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "I" + "'", str8, "I");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.String[] strArray8 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        generator0.setClasses(classArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.ClassLoader classLoader17 = generator0.getClassLoader();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=I]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.reflect.Method method4 = propertyDescriptor3.getReadMethod();
        java.lang.String str5 = propertyDescriptor3.getName();
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=boolean]");
        java.lang.String str8 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "I" + "'", str5, "I");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.beans.PropertyDescriptor[name=I; shortDescription=java.beans.PropertyDescriptor[name=boolean]]" + "'", str8, "java.beans.PropertyDescriptor[name=I; shortDescription=java.beans.PropertyDescriptor[name=boolean]]");
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator5.getNamingPolicy();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean8 = namingPolicy6.equals((java.lang.Object) type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) type10);
        java.lang.String str12 = type10.getDescriptor();
        boolean boolean13 = namingPolicy6.equals((java.lang.Object) str12);
        generator3.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type17, type18, type19, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray21);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        boolean boolean24 = namingPolicy6.equals((java.lang.Object) type23);
        generator0.setNamingPolicy(namingPolicy6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin26 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either classes or delegates must be set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(namingPolicy2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(namingPolicy6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("LZ;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("(JFIF)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj6 = propertyDescriptor3.getValue("LZ;");
        propertyDescriptor3.setPreferred(true);
        propertyDescriptor3.setConstrained(true);
        java.lang.reflect.Method method11 = propertyDescriptor3.getWriteMethod();
        boolean boolean12 = propertyDescriptor3.isExpert();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        int int14 = type13.getSize();
        boolean boolean15 = propertyDescriptor3.equals((java.lang.Object) type13);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("(JFIF)Z");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin2 = org.mockito.cglib.proxy.Mixin.create((java.lang.Object[]) typeArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        boolean boolean8 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        org.mockito.cglib.core.ClassGenerator classGenerator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = generatorStrategy9.generate(classGenerator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(generatorStrategy9);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray7 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method10 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass1, "(JFIF)V", classArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: (JFIF)V");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(classArray9);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.lang.Class class0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass3 = type2.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod(class0, "(JFIF)Z", classArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: (JFIF)Z");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classArray6);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.String; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.reflect.Method method8 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setPreferred(false);
        boolean boolean11 = propertyDescriptor3.isHidden();
        boolean boolean12 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class4 = org.mockito.cglib.core.ReflectUtils.defineClass("short", byteArray2, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method8 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass4, "LI;", classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: LI;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setReadMethod(method6);
        boolean boolean8 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        generator0.setStyle(2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin7 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either classes or delegates must be set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertNotNull(generatorStrategy4);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        java.lang.Class class0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray10 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray10);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray11);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray11);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method16 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod(class0, "LZ;", classArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: LZ;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("LI;", "LI;");
        org.mockito.cglib.proxy.Mixin.Generator generator11 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean12 = generator11.getAttemptLoad();
        boolean boolean13 = signature10.equals((java.lang.Object) generator11);
        java.lang.String[] strArray19 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray22 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray22);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray23);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray23);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray29);
        java.lang.String[] strArray37 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray40 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray39, methodArray40);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray41);
        java.lang.Class[] classArray43 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray41);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray43);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray47 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray46, methodArray47);
        java.lang.Class[] classArray49 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray48);
        java.lang.reflect.Method[] methodArray50 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray44, methodArray48);
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray48);
        java.lang.Class[] classArray52 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray26);
        generator11.setClasses(classArray52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor54 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray52);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str6, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(methodArray24);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(methodArray30);
        org.junit.Assert.assertNotNull(methodArray31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodArray40);
        org.junit.Assert.assertNotNull(methodArray41);
        org.junit.Assert.assertNotNull(methodArray42);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(methodArray47);
        org.junit.Assert.assertNotNull(methodArray48);
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertNotNull(methodArray50);
        org.junit.Assert.assertNotNull(methodArray51);
        org.junit.Assert.assertNotNull(classArray52);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        propertyDescriptor3.setConstrained(true);
        propertyDescriptor3.setExpert(true);
        propertyDescriptor3.setExpert(false);
        boolean boolean12 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator10 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator10.setUseCache(false);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type15, type16, type17, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type14, typeArray19);
        generator10.setDelegates((java.lang.Object[]) typeArray19);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("Z", type9, typeArray19);
        java.lang.String str23 = signature22.toString();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("boolean", method25, method26);
        java.lang.Class<?> wildcardClass28 = propertyDescriptor27.getPropertyEditorClass();
        java.lang.String str29 = propertyDescriptor27.getName();
        propertyDescriptor27.setConstrained(false);
        java.util.Enumeration<java.lang.String> strEnumeration32 = propertyDescriptor27.attributeNames();
        boolean boolean33 = signature22.equals((java.lang.Object) strEnumeration32);
        org.mockito.asm.Type[] typeArray34 = signature22.getArgumentTypes();
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        int int37 = type36.getSort();
        java.lang.String str38 = type36.getClassName();
        boolean boolean39 = type6.equals((java.lang.Object) str38);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.mockito.asm.Type" + "'", str7, "org.mockito.asm.Type");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Z(JFIF)V" + "'", str23, "Z(JFIF)V");
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "boolean" + "'", str29, "boolean");
        org.junit.Assert.assertNotNull(strEnumeration32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(JFIF)Lorg/mockito/asm/Type;" + "'", str35, "(JFIF)Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "void" + "'", str38, "void");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("void", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type6, type7, type8, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray10);
        boolean boolean12 = namingPolicy1.equals((java.lang.Object) signature11);
        java.lang.String str13 = signature11.toString();
        java.lang.String str14 = signature11.getName();
        java.lang.Class<?> wildcardClass15 = signature11.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator17 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator17.setUseCache(false);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type22, type23, type24, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type21, typeArray26);
        generator17.setDelegates((java.lang.Object[]) typeArray26);
        boolean boolean29 = generator17.getUseCache();
        generator17.setStyle(2);
        boolean boolean32 = generator17.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator33 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean34 = generator33.getAttemptLoad();
        boolean boolean35 = generator33.getUseCache();
        java.lang.ClassLoader classLoader36 = null;
        generator33.setClassLoader(classLoader36);
        org.mockito.cglib.core.NamingPolicy namingPolicy38 = generator33.getNamingPolicy();
        generator17.setNamingPolicy(namingPolicy38);
        java.lang.String[] strArray45 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray48 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray47, methodArray48);
        java.lang.reflect.Method[] methodArray50 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray49);
        java.lang.Class[] classArray51 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray49);
        generator17.setClasses(classArray51);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method53 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass15, "(JFIF)J", classArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: (JFIF)J");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!(JFIF)V" + "'", str13, "hi!(JFIF)V");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(namingPolicy38);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(methodArray48);
        org.junit.Assert.assertNotNull(methodArray49);
        org.junit.Assert.assertNotNull(methodArray50);
        org.junit.Assert.assertNotNull(classArray51);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj6 = propertyDescriptor3.getValue("LZ;");
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray10 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray10);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray14);
        java.lang.String[] strArray22 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray25 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray25);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray26);
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray26);
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) strArray9);
        java.lang.String str31 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setPreferred(false);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(methodArray26);
        org.junit.Assert.assertNotNull(methodArray27);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "I" + "'", str31, "I");
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(classInfo3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Z(JFIF)V", "[Ljava/lang/String;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'Z(JFIF)V' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.Class class3 = null;
        java.lang.Class[] classArray4 = new java.lang.Class[] { class3 };
        generator0.setClasses(classArray4);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getAttemptLoad();
        boolean boolean8 = generator6.getUseCache();
        java.lang.ClassLoader classLoader9 = null;
        generator6.setClassLoader(classLoader9);
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = generator6.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy12);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator14.setUseCache(false);
        generator14.setAttemptLoad(true);
        boolean boolean19 = generator14.getAttemptLoad();
        generator14.setAttemptLoad(true);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = generatorStrategy12.generate((org.mockito.cglib.core.ClassGenerator) generator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(namingPolicy11);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        boolean boolean13 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator0.getNamingPolicy();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin15 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either classes or delegates must be set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(namingPolicy14);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/lang/String;" + "'", str5, "[Ljava/lang/String;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) methodArray8);
        propertyDescriptor3.setExpert(true);
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator13.setUseCache(false);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type18, type19, type20, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type17, typeArray22);
        generator13.setDelegates((java.lang.Object[]) typeArray22);
        boolean boolean25 = generator13.getUseCache();
        boolean boolean26 = propertyDescriptor3.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNull(propertyEditor10);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.cglib.proxy.Mixin.Generator generator1 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator1.setUseCache(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray12 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray12);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray13);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray13);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        generator1.setClasses(classArray15);
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) classArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
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
        org.junit.Assert.assertNotNull(classInfo3);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method3 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.reflect.Method method8 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setPreferred(false);
        java.lang.Class<?> wildcardClass11 = propertyDescriptor3.getPropertyType();
        boolean boolean12 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.String;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[Ljava/lang/String;" + "'", str7, "[Ljava/lang/String;");
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.String[] strArray8 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        generator0.setClasses(classArray14);
        boolean boolean17 = generator0.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator18.setUseCache(false);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray23 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray23);
        generator18.setDelegates((java.lang.Object[]) methodArray24);
        generator0.setDelegates((java.lang.Object[]) methodArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.ClassLoader classLoader27 = generator0.getClassLoader();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(methodArray24);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj6 = propertyDescriptor3.getValue("LZ;");
        boolean boolean7 = propertyDescriptor3.isHidden();
        java.lang.String str8 = propertyDescriptor3.getName();
        boolean boolean9 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setExpert(false);
        java.lang.String str12 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "I" + "'", str8, "I");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.beans.PropertyDescriptor[name=I]" + "'", str12, "java.beans.PropertyDescriptor[name=I]");
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj6 = propertyDescriptor3.getValue("LZ;");
        boolean boolean7 = propertyDescriptor3.isHidden();
        java.lang.String str8 = propertyDescriptor3.getName();
        java.lang.reflect.Method method9 = propertyDescriptor3.getWriteMethod();
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setConstrained(false);
        java.lang.Class<?> wildcardClass13 = propertyDescriptor3.getPropertyEditorClass();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "I" + "'", str8, "I");
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(strEnumeration10);
        org.junit.Assert.assertNull(wildcardClass13);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        propertyDescriptor3.setConstrained(true);
        boolean boolean8 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.reflect.Method method4 = propertyDescriptor3.getReadMethod();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.String str6 = propertyDescriptor3.getDisplayName();
        java.lang.String str7 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "I" + "'", str5, "I");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "I" + "'", str6, "I");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.beans.PropertyDescriptor[name=I]" + "'", str7, "java.beans.PropertyDescriptor[name=I]");
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        java.lang.ClassLoader classLoader0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray9 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray9);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin14 = org.mockito.cglib.proxy.Mixin.createBean(classLoader0, (java.lang.Object[]) classArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode(9);
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method5 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        java.lang.String[] strArray7 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray10 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray10);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray11);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray11);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        generator0.setDelegates((java.lang.Object[]) classArray13);
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classInfo5);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        propertyDescriptor3.setHidden(false);
        boolean boolean8 = propertyDescriptor3.isExpert();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type13, type14, type15, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("B", type10, typeArray17);
        java.beans.PropertyEditor propertyEditor20 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type10);
        java.lang.String str21 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNull(propertyEditor20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.beans.PropertyDescriptor[name=boolean]" + "'", str21, "java.beans.PropertyDescriptor[name=boolean]");
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}](JFIF)S", "int");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}](JFIF)S' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(JFIF)L(JFIF)V;", "LI;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JFIF)L(JFIF)V;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj6 = propertyDescriptor3.getValue("LZ;");
        propertyDescriptor3.setPreferred(true);
        propertyDescriptor3.setExpert(false);
        boolean boolean11 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("int", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        java.lang.ClassLoader classLoader5 = null;
        generator0.setClassLoader(classLoader5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(namingPolicy2);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode(9);
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator6.setUseCache(false);
        java.lang.Class class9 = null;
        java.lang.Class[] classArray10 = new java.lang.Class[] { class9 };
        generator6.setClasses(classArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor12 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray10);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(null)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classArray10);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.util.List list5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list6 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass1, list5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyType();
        java.lang.reflect.Method method5 = null;
        propertyDescriptor3.setWriteMethod(method5);
        boolean boolean7 = propertyDescriptor3.isHidden();
        java.lang.String str8 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.beans.PropertyDescriptor[name=boolean]" + "'", str8, "java.beans.PropertyDescriptor[name=boolean]");
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator8 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator8.getNamingPolicy();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean11 = namingPolicy9.equals((java.lang.Object) type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) type13);
        java.lang.String str15 = type13.getDescriptor();
        boolean boolean16 = namingPolicy9.equals((java.lang.Object) str15);
        generator6.setNamingPolicy(namingPolicy9);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray20 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray20);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray24 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray24);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray24);
        java.lang.String[] strArray32 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray35 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray36);
        java.lang.Class[] classArray38 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray36);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray36);
        generator6.setDelegates((java.lang.Object[]) methodArray39);
        java.lang.Class[] classArray41 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray39);
        generator0.setDelegates((java.lang.Object[]) classArray41);
        java.lang.String[] strArray43 = org.mockito.cglib.core.ReflectUtils.getNames(classArray41);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin44 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) strArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(methodArray24);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(methodArray26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(methodArray35);
        org.junit.Assert.assertNotNull(methodArray36);
        org.junit.Assert.assertNotNull(methodArray37);
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertNotNull(methodArray39);
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertNotNull(strArray43);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str3, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj6 = propertyDescriptor3.getValue("LZ;");
        propertyDescriptor3.setPreferred(true);
        propertyDescriptor3.setConstrained(true);
        java.lang.reflect.Method method11 = propertyDescriptor3.getWriteMethod();
        boolean boolean12 = propertyDescriptor3.isExpert();
        boolean boolean13 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("(JFIF)LZ;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        boolean boolean5 = namingPolicy1.equals((java.lang.Object) 10);
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("boolean", method9, method10);
        propertyDescriptor11.setDisplayName("Z");
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray16 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray16);
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor11.createPropertyEditor((java.lang.Object) methodArray16);
        java.lang.Object obj20 = propertyDescriptor11.getValue("[Ljava/lang/String;");
        org.mockito.cglib.core.Predicate predicate21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = namingPolicy1.getClassName("java.beans.PropertyDescriptor[name=boolean; displayName=Z]", "java.beans.PropertyDescriptor[name=boolean; values={(JFIF)Z=false}; constrained]", (java.lang.Object) propertyDescriptor11, predicate21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNull(propertyEditor18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type4, type5, type6, type7 };
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("B", type1, typeArray8);
        org.mockito.asm.Type type11 = signature10.getReturnType();
        org.mockito.asm.Type[] typeArray12 = signature10.getArgumentTypes();
        org.mockito.cglib.proxy.Mixin mixin13 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) typeArray12);
        java.lang.Object[] objArray14 = null;
        org.mockito.cglib.proxy.Mixin mixin15 = mixin13.newInstance(objArray14);
        java.lang.Class<?> wildcardClass16 = mixin13.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(mixin13);
        org.junit.Assert.assertNotNull(mixin15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("V");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode(9);
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        boolean boolean4 = signature2.equals((java.lang.Object) 0L);
        java.lang.String str5 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str6, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("LI;", "LI;");
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getAttemptLoad();
        boolean boolean5 = signature2.equals((java.lang.Object) generator3);
        java.lang.String[] strArray11 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray15);
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray21 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray21);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray32 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray32);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray29, methodArray33);
        java.lang.Class[] classArray35 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray33);
        java.lang.String[] strArray36 = org.mockito.cglib.core.ReflectUtils.getNames(classArray35);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray39 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray38, methodArray39);
        java.lang.Class[] classArray41 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray40);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray40);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray40);
        java.lang.Class[] classArray44 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray18);
        generator3.setClasses(classArray44);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str48 = type47.getClassName();
        java.lang.reflect.Method method50 = null;
        java.lang.reflect.Method method51 = null;
        java.beans.PropertyDescriptor propertyDescriptor52 = new java.beans.PropertyDescriptor("boolean", method50, method51);
        propertyDescriptor52.setDisplayName("Z");
        org.mockito.asm.Type type56 = org.mockito.asm.Type.LONG_TYPE;
        propertyDescriptor52.setValue("boolean", (java.lang.Object) type56);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type60, type61, type62, type63 };
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("hi!", type59, typeArray64);
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type56, typeArray64);
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("double", type47, typeArray64);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin68 = org.mockito.cglib.proxy.Mixin.create(classArray44, (java.lang.Object[]) typeArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(methodArray32);
        org.junit.Assert.assertNotNull(methodArray33);
        org.junit.Assert.assertNotNull(methodArray34);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodArray39);
        org.junit.Assert.assertNotNull(methodArray40);
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertNotNull(methodArray42);
        org.junit.Assert.assertNotNull(methodArray43);
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "boolean" + "'", str48, "boolean");
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "(JFIF)J" + "'", str66, "(JFIF)J");
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass1, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        propertyDescriptor3.setValue("boolean", (java.lang.Object) type7);
        propertyDescriptor3.setDisplayName("java.beans.PropertyDescriptor[name=boolean; displayName=Z]");
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode(9);
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.lang.String[] strArray11 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray15);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method19 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass4, "java.beans.PropertyDescriptor[name=boolean]", classArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: java.beans.PropertyDescriptor[name=boolean]");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(classArray18);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean6 = generator5.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator7.getNamingPolicy();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean10 = namingPolicy8.equals((java.lang.Object) type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) type12);
        java.lang.String str14 = type12.getDescriptor();
        boolean boolean15 = namingPolicy8.equals((java.lang.Object) str14);
        generator5.setNamingPolicy(namingPolicy8);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = generator5.getStrategy();
        boolean boolean18 = generator5.getAttemptLoad();
        java.lang.String[] strArray24 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray27 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray27);
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray28);
        java.lang.Class[] classArray30 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray28);
        int int31 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray30);
        generator5.setClasses(classArray30);
        java.lang.Class[] classArray33 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) classArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor34 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass1, classArray30);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(namingPolicy8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodArray27);
        org.junit.Assert.assertNotNull(methodArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(classArray33);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        boolean boolean5 = namingPolicy1.equals((java.lang.Object) 10);
        org.mockito.cglib.proxy.Mixin.Generator generator8 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean9 = generator8.getAttemptLoad();
        boolean boolean10 = generator8.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = generator8.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator8.getStrategy();
        boolean boolean13 = generator8.getAttemptLoad();
        org.mockito.cglib.core.Predicate predicate14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = namingPolicy1.getClassName("(JFIF)J", "void", (java.lang.Object) generator8, predicate14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(generatorStrategy11);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
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
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor7 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        java.lang.reflect.Method method8 = null;
        propertyDescriptor3.setReadMethod(method8);
        boolean boolean10 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setPreferred(false);
        propertyDescriptor3.setShortDescription("");
        propertyDescriptor3.setName("[Ljava/lang/String;");
        java.lang.String str17 = propertyDescriptor3.getName();
        java.lang.Object obj19 = propertyDescriptor3.getValue("Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNull(propertyEditor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[Ljava/lang/String;" + "'", str17, "[Ljava/lang/String;");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration7 = propertyDescriptor3.attributeNames();
        java.util.Enumeration<java.lang.String> strEnumeration8 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("boolean", method10, method11);
        propertyDescriptor12.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor16 = propertyDescriptor12.createPropertyEditor((java.lang.Object) true);
        java.lang.reflect.Method method17 = null;
        propertyDescriptor12.setReadMethod(method17);
        java.beans.PropertyEditor propertyEditor19 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor12);
        propertyDescriptor12.setExpert(true);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "boolean" + "'", str6, "boolean");
        org.junit.Assert.assertNotNull(strEnumeration7);
        org.junit.Assert.assertNotNull(strEnumeration8);
        org.junit.Assert.assertNull(propertyEditor16);
        org.junit.Assert.assertNull(propertyEditor19);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("hi!(JFIF)V", classLoader1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->hi!");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = signature14.toString();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("boolean", method17, method18);
        java.lang.Class<?> wildcardClass20 = propertyDescriptor19.getPropertyEditorClass();
        java.lang.String str21 = propertyDescriptor19.getName();
        propertyDescriptor19.setConstrained(false);
        java.util.Enumeration<java.lang.String> strEnumeration24 = propertyDescriptor19.attributeNames();
        boolean boolean25 = signature14.equals((java.lang.Object) strEnumeration24);
        org.mockito.asm.Type[] typeArray26 = signature14.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin27 = org.mockito.cglib.proxy.Mixin.create((java.lang.Object[]) typeArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z(JFIF)V" + "'", str15, "Z(JFIF)V");
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "boolean" + "'", str21, "boolean");
        org.junit.Assert.assertNotNull(strEnumeration24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(typeArray26);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor7 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        java.lang.reflect.Method method8 = null;
        propertyDescriptor3.setReadMethod(method8);
        propertyDescriptor3.setBound(false);
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=I]", obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(propertyEditor7);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.lang.ClassLoader classLoader0 = null;
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("LI;", "LI;");
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean5 = generator4.getAttemptLoad();
        boolean boolean6 = signature3.equals((java.lang.Object) generator4);
        java.lang.String[] strArray12 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray15 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray15);
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray16);
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray22 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray22);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray22);
        java.lang.String[] strArray30 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray33 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray33);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray34);
        java.lang.Class[] classArray36 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray34);
        java.lang.String[] strArray37 = org.mockito.cglib.core.ReflectUtils.getNames(classArray36);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray40 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray39, methodArray40);
        java.lang.Class[] classArray42 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray41);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray41);
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray41);
        java.lang.Class[] classArray45 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray19);
        generator4.setClasses(classArray45);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin47 = org.mockito.cglib.proxy.Mixin.createBean(classLoader0, (java.lang.Object[]) classArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(methodArray24);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(methodArray33);
        org.junit.Assert.assertNotNull(methodArray34);
        org.junit.Assert.assertNotNull(methodArray35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodArray40);
        org.junit.Assert.assertNotNull(methodArray41);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(methodArray43);
        org.junit.Assert.assertNotNull(methodArray44);
        org.junit.Assert.assertNotNull(classArray45);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("D");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 72");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        java.lang.ClassLoader classLoader3 = null;
        generator0.setClassLoader(classLoader3);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        boolean boolean7 = generator0.getUseCache();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin8 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either classes or delegates must be set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(namingPolicy5);
        org.junit.Assert.assertNotNull(generatorStrategy6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 10 };
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = org.mockito.cglib.core.ReflectUtils.defineClass("S", byteArray3, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 10]");
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        propertyDescriptor3.setConstrained(true);
        propertyDescriptor3.setConstrained(false);
        boolean boolean10 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        boolean boolean6 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        java.lang.ClassLoader classLoader0 = null;
        org.mockito.cglib.proxy.Mixin.Generator generator1 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator1.setUseCache(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray12 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray12);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray13);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray13);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        generator1.setClasses(classArray15);
        boolean boolean18 = generator1.getAttemptLoad();
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray21 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray21);
        java.lang.Class<?> wildcardClass23 = strArray20.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass23);
        generator1.setDelegates((java.lang.Object[]) propertyDescriptorArray24);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray24, false, false);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin29 = org.mockito.cglib.proxy.Mixin.createBean(classLoader0, (java.lang.Object[]) methodArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertNotNull(methodArray28);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray3);
        int int5 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray4);
        java.lang.Class<?> wildcardClass6 = classArray4.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator8 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean9 = generator8.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator8.getNamingPolicy();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("boolean", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getPropertyEditorClass();
        java.lang.String str16 = propertyDescriptor14.getName();
        propertyDescriptor14.setConstrained(false);
        java.lang.String str19 = propertyDescriptor14.getShortDescription();
        boolean boolean20 = namingPolicy10.equals((java.lang.Object) str19);
        java.lang.String[] strArray26 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray30);
        java.lang.Class[] classArray33 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray32);
        boolean boolean34 = namingPolicy10.equals((java.lang.Object) classArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method35 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass6, "hi!", classArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: hi!");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "boolean" + "'", str16, "boolean");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "boolean" + "'", str19, "boolean");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(methodArray30);
        org.junit.Assert.assertNotNull(methodArray31);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("D");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.String; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=boolean; displayName=Z; shortDescription=]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("B", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode(9);
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator8 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator8.getNamingPolicy();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean11 = namingPolicy9.equals((java.lang.Object) type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) type13);
        java.lang.String str15 = type13.getDescriptor();
        boolean boolean16 = namingPolicy9.equals((java.lang.Object) str15);
        generator6.setNamingPolicy(namingPolicy9);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = generator6.getStrategy();
        boolean boolean19 = generator6.getAttemptLoad();
        java.lang.String[] strArray25 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray28 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray28);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray25, methodArray29);
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray29);
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        generator6.setClasses(classArray31);
        java.lang.Class[] classArray34 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) classArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor35 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray31);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(generatorStrategy18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(methodArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(methodArray30);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(classArray34);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean19 = generator18.getAttemptLoad();
        boolean boolean20 = generator18.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator18.getStrategy();
        generator0.setStrategy(generatorStrategy21);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy23 = generator0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin24 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(generatorStrategy13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(generatorStrategy21);
        org.junit.Assert.assertNotNull(generatorStrategy23);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getName();
        java.lang.Class<?> wildcardClass5 = signature2.getClass();
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass5, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) -1 };
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class7 = org.mockito.cglib.core.ReflectUtils.defineClass("int", byteArray5, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10, 100, -1]");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        int int4 = type0.getOpcode((-1));
        int int5 = type0.getSort();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        propertyDescriptor3.setShortDescription("Lorg/mockito/asm/Type;");
        propertyDescriptor3.setBound(true);
        java.lang.String str8 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setConstrained(false);
        java.lang.String str11 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.beans.PropertyDescriptor[name=I; shortDescription=Lorg/mockito/asm/Type;; bound]" + "'", str11, "java.beans.PropertyDescriptor[name=I; shortDescription=Lorg/mockito/asm/Type;; bound]");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray7, true, true);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray7, false, true);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method15 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass4, "java.beans.PropertyDescriptor[name=I; shortDescription=Lorg/mockito/asm/Type;; bound]", classArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: java.beans.PropertyDescriptor[name=I; shortDescription=Lorg/mockito/asm/Type;; bound]");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/lang/String;" + "'", str5, "[Ljava/lang/String;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(classArray14);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration7 = propertyDescriptor3.attributeNames();
        java.util.Enumeration<java.lang.String> strEnumeration8 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("boolean", method10, method11);
        java.lang.Class<?> wildcardClass13 = propertyDescriptor12.getPropertyEditorClass();
        java.lang.String str14 = propertyDescriptor12.getName();
        java.lang.String str15 = propertyDescriptor12.getShortDescription();
        propertyDescriptor12.setShortDescription("B");
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = new java.beans.PropertyDescriptor[] { propertyDescriptor3, propertyDescriptor12 };
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray18, true, true);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin22 = org.mockito.cglib.proxy.Mixin.create((java.lang.Object[]) propertyDescriptorArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "boolean" + "'", str6, "boolean");
        org.junit.Assert.assertNotNull(strEnumeration7);
        org.junit.Assert.assertNotNull(strEnumeration8);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "boolean" + "'", str14, "boolean");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "boolean" + "'", str15, "boolean");
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(methodArray21);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray3);
        java.lang.ClassLoader classLoader5 = null;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type10, type11, type12, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("B", type7, typeArray14);
        org.mockito.asm.Type[] typeArray17 = signature16.getArgumentTypes();
        org.mockito.cglib.proxy.Mixin mixin18 = org.mockito.cglib.proxy.Mixin.createBean(classLoader5, (java.lang.Object[]) typeArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin19 = org.mockito.cglib.proxy.Mixin.create(classArray4, (java.lang.Object[]) typeArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(mixin18);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        java.lang.String str2 = type1.toString();
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("boolean", method4, method5);
        java.lang.Class<?> wildcardClass7 = propertyDescriptor6.getPropertyEditorClass();
        java.lang.String str8 = propertyDescriptor6.getName();
        java.lang.String str9 = propertyDescriptor6.getShortDescription();
        propertyDescriptor6.setShortDescription("B");
        boolean boolean12 = type1.equals((java.lang.Object) "B");
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Z" + "'", str2, "Z");
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "boolean" + "'", str8, "boolean");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "boolean" + "'", str9, "boolean");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray18 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray18);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray30);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray30);
        generator0.setDelegates((java.lang.Object[]) methodArray33);
        generator0.setAttemptLoad(false);
        java.lang.String[] strArray42 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray45 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray44, methodArray45);
        java.lang.reflect.Method[] methodArray47 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray46);
        java.lang.Class[] classArray48 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray46);
        int int49 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray48);
        generator0.setClasses(classArray48);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray53 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray52, methodArray53);
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray57 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray58 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray56, methodArray57);
        java.lang.reflect.Method[] methodArray59 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray52, methodArray57);
        java.lang.String[] strArray65 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray67 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray68 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray69 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray67, methodArray68);
        java.lang.reflect.Method[] methodArray70 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray65, methodArray69);
        java.lang.Class[] classArray71 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray69);
        java.lang.reflect.Method[] methodArray72 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray52, methodArray69);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin73 = org.mockito.cglib.proxy.Mixin.create(classArray48, (java.lang.Object[]) strArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodArray18);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(methodArray30);
        org.junit.Assert.assertNotNull(methodArray31);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(methodArray33);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(methodArray45);
        org.junit.Assert.assertNotNull(methodArray46);
        org.junit.Assert.assertNotNull(methodArray47);
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(methodArray53);
        org.junit.Assert.assertNotNull(methodArray54);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(methodArray57);
        org.junit.Assert.assertNotNull(methodArray58);
        org.junit.Assert.assertNotNull(methodArray59);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(methodArray68);
        org.junit.Assert.assertNotNull(methodArray69);
        org.junit.Assert.assertNotNull(methodArray70);
        org.junit.Assert.assertNotNull(classArray71);
        org.junit.Assert.assertNotNull(methodArray72);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.reflect.Method method8 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setPreferred(false);
        java.lang.Object obj12 = propertyDescriptor3.getValue("java.beans.PropertyDescriptor[name=boolean; values={java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]=false}; constrained]");
        boolean boolean13 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type4, type5 };
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray6);
        java.lang.Class<?> wildcardClass8 = signature7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode(9);
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.util.List list5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list6 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.util.List list5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list6 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str3 = signature2.getName();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.cglib.proxy.Mixin.Generator generator8 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean9 = generator8.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator10 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = generator10.getNamingPolicy();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean13 = namingPolicy11.equals((java.lang.Object) type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean16 = type14.equals((java.lang.Object) type15);
        java.lang.String str17 = type15.getDescriptor();
        boolean boolean18 = namingPolicy11.equals((java.lang.Object) str17);
        generator8.setNamingPolicy(namingPolicy11);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray22 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray22);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray26 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray25, methodArray26);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray26);
        java.lang.String[] strArray34 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray37 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray37);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray38);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray38);
        generator8.setDelegates((java.lang.Object[]) methodArray41);
        generator8.setAttemptLoad(false);
        java.lang.String[] strArray50 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray53 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray52, methodArray53);
        java.lang.reflect.Method[] methodArray55 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray50, methodArray54);
        java.lang.Class[] classArray56 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray54);
        int int57 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray56);
        generator8.setClasses(classArray56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor59 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray56);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(namingPolicy11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z" + "'", str17, "Z");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(methodArray26);
        org.junit.Assert.assertNotNull(methodArray27);
        org.junit.Assert.assertNotNull(methodArray28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodArray37);
        org.junit.Assert.assertNotNull(methodArray38);
        org.junit.Assert.assertNotNull(methodArray39);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertNotNull(methodArray41);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(methodArray53);
        org.junit.Assert.assertNotNull(methodArray54);
        org.junit.Assert.assertNotNull(methodArray55);
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        java.lang.String[] strArray7 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray10 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray10);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray11);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray11);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        generator0.setDelegates((java.lang.Object[]) classArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin17 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.reflect.Method method8 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setPreferred(false);
        java.lang.Class<?> wildcardClass11 = propertyDescriptor3.getPropertyType();
        boolean boolean12 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        propertyDescriptor3.setValue("boolean", (java.lang.Object) type7);
        boolean boolean9 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = classInfo3.getType();
        int int6 = type4.getOpcode(2);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(classInfo3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin13 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either classes or delegates must be set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(generatorStrategy12);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 0 };
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class8 = org.mockito.cglib.core.ReflectUtils.defineClass("LI;", byteArray6, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 100, 100, 0]");
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode(9);
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Z" + "'", str1, "Z");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.util.List list5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list6 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass1, list5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray18 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray18);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray30);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray30);
        generator0.setDelegates((java.lang.Object[]) methodArray33);
        java.lang.String[] strArray40 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray43 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray43);
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray40, methodArray44);
        java.lang.Class[] classArray46 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray44);
        int int47 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray46);
        generator0.setClasses(classArray46);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin49 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodArray18);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(methodArray30);
        org.junit.Assert.assertNotNull(methodArray31);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(methodArray33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(methodArray43);
        org.junit.Assert.assertNotNull(methodArray44);
        org.junit.Assert.assertNotNull(methodArray45);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(JFIF)J");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean5 = generator4.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator4.getNamingPolicy();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("boolean", method8, method9);
        java.lang.Class<?> wildcardClass11 = propertyDescriptor10.getPropertyEditorClass();
        java.lang.String str12 = propertyDescriptor10.getName();
        propertyDescriptor10.setConstrained(false);
        java.lang.String str15 = propertyDescriptor10.getShortDescription();
        boolean boolean16 = namingPolicy6.equals((java.lang.Object) str15);
        generator0.setNamingPolicy(namingPolicy6);
        org.mockito.cglib.proxy.Mixin.Generator generator20 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean21 = generator20.getAttemptLoad();
        boolean boolean22 = generator20.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy23 = generator20.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = generator20.getStrategy();
        generator20.setStyle(2);
        generator20.setStyle(2);
        generator20.setUseCache(false);
        org.mockito.cglib.core.Predicate predicate31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = namingPolicy6.getClassName("Z", "V", (java.lang.Object) false, predicate31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(namingPolicy6);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "boolean" + "'", str12, "boolean");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "boolean" + "'", str15, "boolean");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(generatorStrategy23);
        org.junit.Assert.assertNotNull(generatorStrategy24);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        java.lang.ClassLoader classLoader5 = null;
        generator0.setClassLoader(classLoader5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin7 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either classes or delegates must be set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(namingPolicy2);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) methodArray8);
        java.lang.Object obj12 = propertyDescriptor3.getValue("[Ljava/lang/String;");
        boolean boolean13 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setPreferred(true);
        propertyDescriptor3.setShortDescription("(JFIF)V");
        java.lang.String str18 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNull(propertyEditor10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.beans.PropertyDescriptor[name=boolean; displayName=Z; shortDescription=(JFIF)V; preferred]" + "'", str18, "java.beans.PropertyDescriptor[name=boolean; displayName=Z; shortDescription=(JFIF)V; preferred]");
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor7 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        java.lang.reflect.Method method8 = null;
        propertyDescriptor3.setReadMethod(method8);
        boolean boolean10 = propertyDescriptor3.isHidden();
        java.lang.String str11 = propertyDescriptor3.getDisplayName();
        java.lang.String str12 = propertyDescriptor3.getDisplayName();
        java.lang.String str13 = propertyDescriptor3.getShortDescription();
        boolean boolean14 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("I", method16, method17);
        java.lang.Class<?> wildcardClass19 = propertyDescriptor18.getPropertyEditorClass();
        java.lang.Object obj21 = propertyDescriptor18.getValue("LZ;");
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray25 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray25);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray29);
        java.lang.String[] strArray37 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray40 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray39, methodArray40);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray41);
        java.lang.Class[] classArray43 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray41);
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray41);
        propertyDescriptor18.setValue("org/mockito/asm/Type", (java.lang.Object) strArray24);
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray48 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray47, methodArray48);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray52 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray51, methodArray52);
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray47, methodArray52);
        java.lang.String[] strArray60 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray63 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray62, methodArray63);
        java.lang.reflect.Method[] methodArray65 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray60, methodArray64);
        java.lang.Class[] classArray66 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray64);
        java.lang.reflect.Method[] methodArray67 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray47, methodArray64);
        java.lang.String[] strArray69 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray70 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray71 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray69, methodArray70);
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray74 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray75 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray73, methodArray74);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray69, methodArray75);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray47, methodArray76);
        java.lang.reflect.Method[] methodArray78 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray77);
        boolean boolean79 = propertyDescriptor3.equals((java.lang.Object) strArray24);
        org.junit.Assert.assertNull(propertyEditor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Z" + "'", str11, "Z");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Z" + "'", str13, "Z");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(methodArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(methodArray30);
        org.junit.Assert.assertNotNull(methodArray31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodArray40);
        org.junit.Assert.assertNotNull(methodArray41);
        org.junit.Assert.assertNotNull(methodArray42);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(methodArray44);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(methodArray48);
        org.junit.Assert.assertNotNull(methodArray49);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(methodArray52);
        org.junit.Assert.assertNotNull(methodArray53);
        org.junit.Assert.assertNotNull(methodArray54);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(methodArray63);
        org.junit.Assert.assertNotNull(methodArray64);
        org.junit.Assert.assertNotNull(methodArray65);
        org.junit.Assert.assertNotNull(classArray66);
        org.junit.Assert.assertNotNull(methodArray67);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(methodArray70);
        org.junit.Assert.assertNotNull(methodArray71);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(methodArray74);
        org.junit.Assert.assertNotNull(methodArray75);
        org.junit.Assert.assertNotNull(methodArray76);
        org.junit.Assert.assertNotNull(methodArray77);
        org.junit.Assert.assertNotNull(methodArray78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.String str6 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.beans.PropertyDescriptor[name=void]" + "'", str6, "java.beans.PropertyDescriptor[name=void]");
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str6, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(classInfo8);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        org.mockito.asm.Type type11 = signature10.getReturnType();
        java.lang.String str12 = signature10.getName();
        org.mockito.asm.Type[] typeArray13 = signature10.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("(JFIF)LZ;", type1, typeArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JFIF)LZ;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "double" + "'", str2, "double");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(typeArray13);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(generatorStrategy3);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator0.getNamingPolicy();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        int int12 = type11.getSort();
        java.lang.String str13 = type11.getClassName();
        boolean boolean15 = type11.equals((java.lang.Object) "");
        org.mockito.cglib.core.Predicate predicate16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = namingPolicy8.getClassName("org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=boolean; expert]", (java.lang.Object) boolean15, predicate16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(namingPolicy8);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "void" + "'", str13, "void");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin14 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(generatorStrategy13);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=boolean; displayName=Z; shortDescription=]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.String[] strArray8 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        generator0.setClasses(classArray14);
        boolean boolean17 = generator0.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator18.setUseCache(false);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray23 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray23);
        generator18.setDelegates((java.lang.Object[]) methodArray24);
        generator0.setDelegates((java.lang.Object[]) methodArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin27 = org.mockito.cglib.proxy.Mixin.create((java.lang.Object[]) methodArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(methodArray24);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.String[] strArray8 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        generator0.setClasses(classArray14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = generator0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.ClassLoader classLoader18 = generator0.getClassLoader();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.lang.Class[] classArray10 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) methodArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method11 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass1, "[Ljava/lang/String;", classArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: [Ljava/lang/String;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(classArray10);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin4 = generator0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Either classes or delegates must be set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(generatorStrategy3);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("LZ;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}](JFIF)S", "[Ljava/lang/String;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}](JFIF)S' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.String[] strArray8 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        generator0.setClasses(classArray14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, false, true);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin26 = org.mockito.cglib.proxy.Mixin.create(classArray14, (java.lang.Object[]) propertyDescriptorArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org/mockito/asm/Type" + "'", str19, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(methodArray25);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        propertyDescriptor3.setHidden(false);
        java.lang.String str10 = propertyDescriptor3.getShortDescription();
        java.lang.Class<?> wildcardClass11 = propertyDescriptor3.getPropertyType();
        java.lang.String str12 = propertyDescriptor3.getDisplayName();
        boolean boolean13 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "boolean" + "'", str10, "boolean");
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "boolean" + "'", str12, "boolean");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str6, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray3 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray3);
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(methodArray4);
        org.junit.Assert.assertNotNull(classArray5);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(generatorStrategy13);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray18 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray18);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray30);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray30);
        generator0.setDelegates((java.lang.Object[]) methodArray33);
        generator0.setAttemptLoad(false);
        // The following exception was thrown during execution in test generation
        try {
            generator0.setStyle((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mixin style: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(namingPolicy3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Z" + "'", str9, "Z");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodArray18);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(methodArray30);
        org.junit.Assert.assertNotNull(methodArray31);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(methodArray33);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=boolean]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type1.getSize();
        java.lang.String str3 = type1.toString();
        int int5 = type1.getOpcode(6);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("LI;", "LI;");
        org.mockito.asm.Type type10 = signature9.getReturnType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        int int13 = type11.getOpcode((int) ' ');
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type16, type17, type18, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type15, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray20);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("booleanLZ;", type10, typeArray20);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", type1, typeArray20);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray20);
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("boolean", method27, method28);
        propertyDescriptor29.setDisplayName("Z");
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray34 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray33, methodArray34);
        java.beans.PropertyEditor propertyEditor36 = propertyDescriptor29.createPropertyEditor((java.lang.Object) methodArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin37 = org.mockito.cglib.proxy.Mixin.create(classArray25, (java.lang.Object[]) methodArray34);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.reflect.InvocationTargetException-->null");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "S" + "'", str3, "S");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 37 + "'", int13 == 37);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(JFIF)V" + "'", str22, "(JFIF)V");
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(methodArray34);
        org.junit.Assert.assertNotNull(methodArray35);
        org.junit.Assert.assertNull(propertyEditor36);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}](JFIF)S", classLoader1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str3 = signature2.getName();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator7.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator7.getNamingPolicy();
        generator7.setAttemptLoad(true);
        java.lang.ClassLoader classLoader12 = null;
        generator7.setClassLoader(classLoader12);
        boolean boolean14 = generator7.getAttemptLoad();
        java.lang.String[] strArray20 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray23 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray23);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray24);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray24);
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray26);
        java.lang.String[] strArray28 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        generator7.setClasses(classArray26);
        java.lang.String[] strArray35 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray38 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray38);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray35, methodArray39);
        java.lang.Class[] classArray41 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4, classArray26, (java.lang.Object[]) strArray35);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(namingPolicy8);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(methodArray24);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(methodArray38);
        org.junit.Assert.assertNotNull(methodArray39);
        org.junit.Assert.assertNotNull(methodArray40);
        org.junit.Assert.assertNotNull(classArray41);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=boolean]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj6 = propertyDescriptor3.getValue("LZ;");
        java.lang.String str7 = propertyDescriptor3.getShortDescription();
        java.lang.String str8 = propertyDescriptor3.getName();
        boolean boolean9 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "I" + "'", str7, "I");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "I" + "'", str8, "I");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.util.List list5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list6 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass1, list5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.lang.ClassLoader classLoader0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray3 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray3);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin7 = org.mockito.cglib.proxy.Mixin.createBean(classLoader0, (java.lang.Object[]) propertyDescriptorArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(methodArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray3 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray3);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        java.lang.String str7 = type6.getInternalName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        int int10 = type8.getOpcode((int) ' ');
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type13, type14, type15, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("B(JFIF)V", type6, typeArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'B(JFIF)V' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(methodArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[Ljava/lang/String;" + "'", str7, "[Ljava/lang/String;");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37 + "'", int10 == 37);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(JFIF)V" + "'", str19, "(JFIF)V");
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = classInfo3.getType();
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator5.setUseCache(false);
        java.lang.Class class8 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[] { class8 };
        generator5.setClasses(classArray9);
        boolean boolean11 = type4.equals((java.lang.Object) generator5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin12 = generator5.create();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(classInfo3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(JFIF)LI;", "LZ;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JFIF)LI;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("LI;", "LI;");
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getAttemptLoad();
        boolean boolean5 = signature2.equals((java.lang.Object) generator3);
        org.mockito.asm.Type type6 = signature2.getReturnType();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("boolean", method8, method9);
        propertyDescriptor10.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor14 = propertyDescriptor10.createPropertyEditor((java.lang.Object) true);
        java.lang.reflect.Method method15 = null;
        propertyDescriptor10.setReadMethod(method15);
        propertyDescriptor10.setValue("B", (java.lang.Object) "Z");
        boolean boolean20 = signature2.equals((java.lang.Object) propertyDescriptor10);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray23 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray23);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray27 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray27);
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray28);
        boolean boolean30 = signature2.equals((java.lang.Object) methodArray29);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin31 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) methodArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNull(propertyEditor14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(methodArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(methodArray27);
        org.junit.Assert.assertNotNull(methodArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray10 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) propertyDescriptorArray9);
        java.lang.Object[] objArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin12 = org.mockito.cglib.proxy.Mixin.create(classArray10, objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertNotNull(classArray10);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("java/lang/Object", "");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method8 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.String; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/lang/String;" + "'", str5, "[Ljava/lang/String;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.reflect.Method method8 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setPreferred(false);
        propertyDescriptor3.setConstrained(false);
        java.lang.reflect.Method method13 = propertyDescriptor3.getWriteMethod();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}](JFIF)S");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("java/lang/Object");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        propertyDescriptor3.setConstrained(false);
        propertyDescriptor3.setShortDescription("");
        boolean boolean10 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setPreferred(false);
        java.lang.String str13 = propertyDescriptor3.getShortDescription();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 10, (byte) 10 };
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class6 = org.mockito.cglib.core.ReflectUtils.defineClass("(JFIF)J", byteArray4, classLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 10, 10]");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("short");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.String[] strArray8 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        generator0.setClasses(classArray14);
        boolean boolean17 = generator0.getAttemptLoad();
        java.lang.ClassLoader classLoader18 = null;
        generator0.setClassLoader(classLoader18);
        org.mockito.asm.ClassVisitor classVisitor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("hi!(JFIF)V");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->hi!");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = signature14.getDescriptor();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        java.lang.String str17 = signature14.getDescriptor();
        java.lang.String str18 = signature14.getDescriptor();
        java.lang.String str19 = signature14.toString();
        org.mockito.asm.Type type20 = signature14.getReturnType();
        java.lang.String str21 = signature14.getName();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(JFIF)V" + "'", str15, "(JFIF)V");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(JFIF)V" + "'", str17, "(JFIF)V");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(JFIF)V" + "'", str18, "(JFIF)V");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Z(JFIF)V" + "'", str19, "Z(JFIF)V");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Z" + "'", str21, "Z");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        propertyDescriptor3.setConstrained(false);
        propertyDescriptor3.setShortDescription("");
        boolean boolean10 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setPreferred(false);
        java.lang.String str13 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.beans.PropertyDescriptor[name=boolean; shortDescription=]" + "'", str13, "java.beans.PropertyDescriptor[name=boolean; shortDescription=]");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) methodArray8);
        propertyDescriptor3.setExpert(true);
        propertyDescriptor3.setHidden(false);
        boolean boolean15 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNull(propertyEditor10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("void");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("(JFIF)D");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=boolean; values={(JFIF)Z=false}; constrained]");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type3, type4, type5, type6 };
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray7);
        org.mockito.asm.Type type9 = signature8.getReturnType();
        java.lang.String str10 = type9.getClassName();
        org.mockito.cglib.proxy.Mixin.Generator generator11 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean12 = generator11.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator13.getNamingPolicy();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean16 = namingPolicy14.equals((java.lang.Object) type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) type18);
        java.lang.String str20 = type18.getDescriptor();
        boolean boolean21 = namingPolicy14.equals((java.lang.Object) str20);
        generator11.setNamingPolicy(namingPolicy14);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray25 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray25);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray29);
        java.lang.String[] strArray37 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray40 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray39, methodArray40);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray41);
        java.lang.Class[] classArray43 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray41);
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray41);
        generator11.setDelegates((java.lang.Object[]) methodArray44);
        generator11.setAttemptLoad(false);
        boolean boolean48 = type9.equals((java.lang.Object) false);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type51, type52, type53, type54 };
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("hi!", type50, typeArray55);
        org.mockito.asm.Type type57 = signature56.getReturnType();
        java.lang.String str58 = type57.getClassName();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type66 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] { type63, type64, type65, type66 };
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("hi!", type62, typeArray67);
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("B", type60, typeArray67);
        java.lang.String str70 = org.mockito.asm.Type.getMethodDescriptor(type57, typeArray67);
        org.mockito.cglib.core.Signature signature71 = new org.mockito.cglib.core.Signature("LZ;", type9, typeArray67);
        org.mockito.asm.Type[] typeArray72 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str73 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "void" + "'", str10, "void");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(namingPolicy14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Z" + "'", str20, "Z");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(methodArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(methodArray30);
        org.junit.Assert.assertNotNull(methodArray31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(methodArray40);
        org.junit.Assert.assertNotNull(methodArray41);
        org.junit.Assert.assertNotNull(methodArray42);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(methodArray44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "void" + "'", str58, "void");
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "(JFIF)V" + "'", str70, "(JFIF)V");
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        java.lang.ClassLoader classLoader3 = null;
        generator0.setClassLoader(classLoader3);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        boolean boolean7 = namingPolicy5.equals((java.lang.Object) "I");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type10, type11, type12, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray14);
        org.mockito.asm.Type type16 = signature15.getReturnType();
        boolean boolean17 = namingPolicy5.equals((java.lang.Object) type16);
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean19 = generator18.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator20 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = generator20.getNamingPolicy();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean23 = namingPolicy21.equals((java.lang.Object) type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) type25);
        java.lang.String str27 = type25.getDescriptor();
        boolean boolean28 = namingPolicy21.equals((java.lang.Object) str27);
        generator18.setNamingPolicy(namingPolicy21);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray32 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray32);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray36 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray35, methodArray36);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray36);
        java.lang.String[] strArray44 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray47 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray46, methodArray47);
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray44, methodArray48);
        java.lang.Class[] classArray50 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray48);
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray48);
        generator18.setDelegates((java.lang.Object[]) methodArray51);
        generator18.setAttemptLoad(false);
        java.lang.String[] strArray60 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray63 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray62, methodArray63);
        java.lang.reflect.Method[] methodArray65 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray60, methodArray64);
        java.lang.Class[] classArray66 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray64);
        int int67 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray66);
        generator18.setClasses(classArray66);
        java.lang.String[] strArray69 = org.mockito.cglib.core.ReflectUtils.getNames(classArray66);
        boolean boolean70 = namingPolicy5.equals((java.lang.Object) strArray69);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(namingPolicy5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(namingPolicy21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Z" + "'", str27, "Z");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(methodArray32);
        org.junit.Assert.assertNotNull(methodArray33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(methodArray36);
        org.junit.Assert.assertNotNull(methodArray37);
        org.junit.Assert.assertNotNull(methodArray38);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(methodArray47);
        org.junit.Assert.assertNotNull(methodArray48);
        org.junit.Assert.assertNotNull(methodArray49);
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertNotNull(methodArray51);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(methodArray63);
        org.junit.Assert.assertNotNull(methodArray64);
        org.junit.Assert.assertNotNull(methodArray65);
        org.junit.Assert.assertNotNull(classArray66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("B");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray4 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray5 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray4);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        boolean boolean7 = type1.equals((java.lang.Object) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method9 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.String; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(methodArray4);
        org.junit.Assert.assertNotNull(methodArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[Ljava/lang/String;" + "'", str8, "[Ljava/lang/String;");
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray10 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) propertyDescriptorArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin11 = org.mockito.cglib.proxy.Mixin.create((java.lang.Object[]) classArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertNotNull(classArray10);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) -1 };
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class7 = org.mockito.cglib.core.ReflectUtils.defineClass("D", byteArray5, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 1, -1]");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Ljava/lang/Object;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method8 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator7.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator7.getNamingPolicy();
        generator7.setUseCache(false);
        boolean boolean12 = generator7.getAttemptLoad();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray13, true, true);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray13, false, true);
        java.lang.Class[] classArray20 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) propertyDescriptorArray13);
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        generator7.setClasses(classArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method23 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass1, "java.beans.PropertyDescriptor[name=I]", classArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: java.beans.PropertyDescriptor[name=I]");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(namingPolicy8);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray6 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray6);
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray17 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray17);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray18);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray18);
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin22 = org.mockito.cglib.proxy.Mixin.create((java.lang.Object[]) methodArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(methodArray6);
        org.junit.Assert.assertNotNull(methodArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(methodArray18);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(methodArray21);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj6 = propertyDescriptor3.getValue("LZ;");
        boolean boolean7 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setConstrained(false);
        java.lang.reflect.Method method10 = propertyDescriptor3.getReadMethod();
        boolean boolean11 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("D", "java.beans.PropertyDescriptor[name=I; shortDescription=Lorg/mockito/asm/Type;; bound]");
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/lang/String;" + "'", str5, "[Ljava/lang/String;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[Ljava/lang/String;" + "'", str7, "[Ljava/lang/String;");
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("LI;", "LI;");
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getAttemptLoad();
        boolean boolean5 = signature2.equals((java.lang.Object) generator3);
        // The following exception was thrown during execution in test generation
        try {
            generator3.setStyle((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mixin style: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray6 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray6);
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray17 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray17);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray18);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray18);
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray18);
        java.lang.Class<?> wildcardClass22 = methodArray18.getClass();
        org.mockito.cglib.proxy.Mixin.Generator generator23 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator23.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = generator23.getNamingPolicy();
        generator23.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean30 = generator29.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator31 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = generator31.getNamingPolicy();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean34 = namingPolicy32.equals((java.lang.Object) type33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean37 = type35.equals((java.lang.Object) type36);
        java.lang.String str38 = type36.getDescriptor();
        boolean boolean39 = namingPolicy32.equals((java.lang.Object) str38);
        generator29.setNamingPolicy(namingPolicy32);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray43 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray43);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray47 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray46, methodArray47);
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray47);
        java.lang.String[] strArray55 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray58 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray59 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray57, methodArray58);
        java.lang.reflect.Method[] methodArray60 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray55, methodArray59);
        java.lang.Class[] classArray61 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray59);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray59);
        generator29.setDelegates((java.lang.Object[]) methodArray62);
        java.lang.Class[] classArray64 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray62);
        generator23.setDelegates((java.lang.Object[]) classArray64);
        java.lang.String[] strArray66 = org.mockito.cglib.core.ReflectUtils.getNames(classArray64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor67 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass22, classArray64);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.reflect.Method;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(methodArray6);
        org.junit.Assert.assertNotNull(methodArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(methodArray18);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(namingPolicy26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(namingPolicy32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Z" + "'", str38, "Z");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(methodArray43);
        org.junit.Assert.assertNotNull(methodArray44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(methodArray47);
        org.junit.Assert.assertNotNull(methodArray48);
        org.junit.Assert.assertNotNull(methodArray49);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(methodArray58);
        org.junit.Assert.assertNotNull(methodArray59);
        org.junit.Assert.assertNotNull(methodArray60);
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertNotNull(methodArray62);
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertNotNull(strArray66);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        generator0.setStyle(2);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertNotNull(generatorStrategy4);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getAttemptLoad();
        boolean boolean8 = generator6.getUseCache();
        java.lang.ClassLoader classLoader9 = null;
        generator6.setClassLoader(classLoader9);
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = generator6.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator6.getStrategy();
        boolean boolean13 = generator6.getUseCache();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray16 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) methodArray16);
        generator6.setClasses(classArray18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass21 = type20.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4, classArray18, (java.lang.Object[]) propertyDescriptorArray24);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(namingPolicy11);
        org.junit.Assert.assertNotNull(generatorStrategy12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org/mockito/asm/Type" + "'", str22, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray23);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator7.setUseCache(false);
        java.lang.String[] strArray15 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray18 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray18);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray19);
        java.lang.Class[] classArray21 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray19);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray21);
        generator7.setClasses(classArray21);
        java.lang.String[] strArray24 = org.mockito.cglib.core.ReflectUtils.getNames(classArray21);
        java.lang.String[] strArray25 = org.mockito.cglib.core.ReflectUtils.getNames(classArray21);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method27 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass1, "java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}](JFIF)S", classArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}](JFIF)S");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str5, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodArray18);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(classArray26);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=boolean; displayName=Z]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method5 = propertyDescriptor3.getReadMethod();
        boolean boolean7 = propertyDescriptor3.equals((java.lang.Object) 3);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        boolean boolean6 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=boolean; displayName=Z]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray3);
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray4);
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean8 = generator7.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator9.getNamingPolicy();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean12 = namingPolicy10.equals((java.lang.Object) type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) type14);
        java.lang.String str16 = type14.getDescriptor();
        boolean boolean17 = namingPolicy10.equals((java.lang.Object) str16);
        generator7.setNamingPolicy(namingPolicy10);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator7.getStrategy();
        boolean boolean20 = generator7.getAttemptLoad();
        java.lang.String[] strArray26 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray30);
        int int33 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray32);
        generator7.setClasses(classArray32);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin35 = org.mockito.cglib.proxy.Mixin.create(classArray4, (java.lang.Object[]) classArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(namingPolicy10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Z" + "'", str16, "Z");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(methodArray30);
        org.junit.Assert.assertNotNull(methodArray31);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor7 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        java.lang.reflect.Method method8 = null;
        propertyDescriptor3.setReadMethod(method8);
        propertyDescriptor3.setValue("B", (java.lang.Object) "Z");
        java.lang.String str13 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(propertyEditor7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]" + "'", str13, "java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]");
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("I");
        java.lang.String str7 = type6.toString();
        boolean boolean8 = generatorStrategy4.equals((java.lang.Object) str7);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str12 = signature11.getName();
        boolean boolean13 = generatorStrategy4.equals((java.lang.Object) str12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo17 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        boolean boolean18 = generatorStrategy4.equals((java.lang.Object) classInfo17);
        boolean boolean20 = generatorStrategy4.equals((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(generatorStrategy3);
        org.junit.Assert.assertNotNull(generatorStrategy4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LI;" + "'", str7, "LI;");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(classInfo17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor7 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        java.lang.reflect.Method method8 = null;
        propertyDescriptor3.setReadMethod(method8);
        boolean boolean10 = propertyDescriptor3.isHidden();
        java.lang.String str11 = propertyDescriptor3.getDisplayName();
        boolean boolean12 = propertyDescriptor3.isHidden();
        org.junit.Assert.assertNull(propertyEditor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Z" + "'", str11, "Z");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.lang.String[] strArray5 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin11 = org.mockito.cglib.proxy.Mixin.create((java.lang.Object[]) methodArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(methodArray10);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.String[] strArray8 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        generator0.setClasses(classArray14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = generator0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = generator0.getNamingPolicy();
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            generator0.generateClass(classVisitor19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(generatorStrategy17);
        org.junit.Assert.assertNotNull(namingPolicy18);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Mixin mixin1 = org.mockito.cglib.proxy.Mixin.createBean(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        java.lang.String str4 = classInfo3.toString();
        org.mockito.asm.Type type5 = classInfo3.getSuperType();
        org.mockito.asm.Type[] typeArray6 = classInfo3.getInterfaces();
        org.mockito.asm.Type type7 = classInfo3.getType();
        org.mockito.asm.Type type8 = classInfo3.getSuperType();
        java.lang.String str9 = type8.toString();
        org.mockito.cglib.proxy.Mixin.Generator generator10 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = generator10.getNamingPolicy();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean13 = namingPolicy11.equals((java.lang.Object) type12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("boolean", method18, method19);
        propertyDescriptor20.setDisplayName("Z");
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        propertyDescriptor20.setValue("boolean", (java.lang.Object) type24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type28, type29, type30, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("hi!", type27, typeArray32);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray32);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("double", type15, typeArray32);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray32);
        boolean boolean37 = type8.equals((java.lang.Object) str36);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(classInfo3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.mockito.asm.Type" + "'", str4, "org.mockito.asm.Type");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ljava/lang/Object;" + "'", str9, "Ljava/lang/Object;");
        org.junit.Assert.assertNotNull(namingPolicy11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "boolean" + "'", str16, "boolean");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JFIF)J" + "'", str34, "(JFIF)J");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(JFIF)D" + "'", str36, "(JFIF)D");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        java.lang.ClassLoader classLoader5 = null;
        generator0.setClassLoader(classLoader5);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        // The following exception was thrown during execution in test generation
        try {
            generator0.setStyle((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mixin style: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy1);
        org.junit.Assert.assertNotNull(namingPolicy2);
        org.junit.Assert.assertNotNull(namingPolicy7);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method8 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.lang.String; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[Ljava/lang/String;" + "'", str5, "[Ljava/lang/String;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=boolean; displayName=Z; shortDescription=]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[Ljava/lang/String;" + "'", str6, "[Ljava/lang/String;");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method5 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        propertyDescriptor3.setShortDescription("Lorg/mockito/asm/Type;");
        propertyDescriptor3.setBound(true);
        java.lang.String str8 = propertyDescriptor3.getShortDescription();
        java.lang.Class<?> wildcardClass9 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("boolean", method11, method12);
        propertyDescriptor13.setDisplayName("Z");
        propertyDescriptor13.setConstrained(true);
        propertyDescriptor13.setBound(false);
        java.lang.reflect.Method method20 = null;
        propertyDescriptor13.setReadMethod(method20);
        boolean boolean22 = propertyDescriptor3.equals((java.lang.Object) method20);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }
}

