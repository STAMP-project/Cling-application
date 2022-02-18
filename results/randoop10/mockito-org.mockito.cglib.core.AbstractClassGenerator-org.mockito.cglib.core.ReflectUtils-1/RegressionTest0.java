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
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        int int0 = org.mockito.asm.Type.FLOAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.lang.String[] strArray0 = null;
        java.lang.reflect.Method[] methodArray1 = new java.lang.reflect.Method[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray2 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray0, methodArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(methodArray1);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
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
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
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
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
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
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.asm.Type.getDescriptor(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] { method1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray0, methodArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(methodArray2);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
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
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
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
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        int int0 = org.mockito.asm.Type.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
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
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSort();
        java.lang.Object[] objArray6 = new java.lang.Object[] { type1, 0.0d, 6, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, objArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[B, 0.0, 6, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[B, 0.0, 6, 1.0]");
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int0 = org.mockito.asm.Type.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
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
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
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
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
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
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        int int0 = org.mockito.asm.Type.CHAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
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
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
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
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
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
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.lang.reflect.Constructor constructor0 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray1 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray1, false, false);
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
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        boolean boolean5 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
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
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        int int6 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor7 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("byte");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.mockito.cglib.core.AbstractClassGenerator abstractClassGenerator0 = org.mockito.cglib.core.AbstractClassGenerator.getCurrent();
        org.junit.Assert.assertNull(abstractClassGenerator0);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        int int0 = org.mockito.asm.Type.BYTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSort();
        int int8 = type5.getOpcode(3);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 0, 1L, 6, 10L, type5, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0, 1, 6, 10, B, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0, 1, 6, 10, B, 1]");
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        java.lang.String str5 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.beans.PropertyDescriptor[name=hi!]" + "'", str5, "java.beans.PropertyDescriptor[name=hi!]");
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 39");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        int int0 = org.mockito.asm.Type.OBJECT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
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
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method10 = null;
        propertyDescriptor3.setReadMethod(method10);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type15 = signature14.getReturnType();
        java.lang.Class<?> wildcardClass16 = signature14.getClass();
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("hi!", method18, method19);
        java.lang.Class<?> wildcardClass21 = propertyDescriptor20.getClass();
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type25 = signature24.getReturnType();
        java.lang.Class<?> wildcardClass26 = signature24.getClass();
        java.lang.Class[] classArray27 = new java.lang.Class[] { wildcardClass16, wildcardClass21, wildcardClass26 };
        int int28 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray27);
        boolean boolean29 = propertyDescriptor3.equals((java.lang.Object) classArray27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        int int0 = org.mockito.asm.Type.INT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        java.lang.reflect.Constructor constructor0 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray3, false, false);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, "java/beans/PropertyDescriptor", propertyDescriptorArray3, (short) 0, 5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(methodArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, java/beans/PropertyDescriptor, [], 0, 5]");
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("byteB");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java/beans/PropertyDescriptor");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
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
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("float", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        int int2 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        int int3 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        int int4 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        int int5 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) classArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setDisplayName("java.beans.PropertyDescriptor[name=hi!]");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        int int7 = type6.getSort();
        boolean boolean8 = propertyDescriptor3.equals((java.lang.Object) int7);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        boolean boolean10 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
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
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java/beans/PropertyDescriptor" + "'", str5, "java/beans/PropertyDescriptor");
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        java.lang.String str5 = propertyDescriptor4.getShortDescription();
        java.lang.reflect.Method method6 = propertyDescriptor4.getWriteMethod();
        propertyDescriptor4.setValue("double", (java.lang.Object) ' ');
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type14 = signature13.getReturnType();
        java.lang.Class<?> wildcardClass15 = signature13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        java.lang.Object[] objArray19 = new java.lang.Object[] { ' ', "", wildcardClass15, 5, "byteB" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, objArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[ , , class org.mockito.cglib.core.Signature, 5, byteB]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[ , , class org.mockito.cglib.core.Signature, 5, byteB]");
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
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
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        int int0 = org.mockito.asm.Type.VOID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor7 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method5 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.Signature is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        int int0 = org.mockito.asm.Type.ARRAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getDisplayName();
        java.lang.String str7 = propertyDescriptor3.getShortDescription();
        boolean boolean8 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "byteB");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=hi!]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("float");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("hi!", method4, method5);
        java.lang.String str7 = propertyDescriptor6.getShortDescription();
        boolean boolean8 = signature2.equals((java.lang.Object) str7);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        int int0 = org.mockito.asm.Type.DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        boolean boolean18 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("double");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java/beans/PropertyDescriptor" + "'", str5, "java/beans/PropertyDescriptor");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
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
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) -1 };
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = org.mockito.cglib.core.ReflectUtils.defineClass("double", byteArray3, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, -1]");
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("float");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str5, "Lorg/mockito/cglib/core/Signature;");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor3.attributeNames();
        java.lang.String str11 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; values={byte=0}]" + "'", str11, "java.beans.PropertyDescriptor[name=hi!; values={byte=0}]");
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method13 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass4, "byteB", classArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: byteB");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(classArray12);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        int int20 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type25 = signature24.getReturnType();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        int int30 = type29.getSort();
        int int32 = type29.getOpcode(3);
        java.lang.String str33 = type29.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        int int35 = type34.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        int int37 = type36.getSort();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str39 = type38.getClassName();
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type27, type29, type34, type36, type38 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BYTE_TYPE;
        int int43 = type42.getSize();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str46 = type45.getDescriptor();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str49 = type48.getClassName();
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type26, type42, type45, type47, type48 };
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass15, classArray19, (java.lang.Object[]) typeArray50);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java/beans/PropertyDescriptor" + "'", str18, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "double" + "'", str28, "double");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "byte" + "'", str33, "byte");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "double" + "'", str39, "double");
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(DBBBD)V" + "'", str41, "(DBBBD)V");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Lhi!;" + "'", str46, "Lhi!;");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "double" + "'", str49, "double");
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(VBLhi!;SD)B" + "'", str51, "(VBLhi!;SD)B");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        int int0 = org.mockito.asm.Type.BOOLEAN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        int int2 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        int int3 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        int int4 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        int int5 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        int int6 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) classArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("byteB", "Lorg/mockito/cglib/core/Signature;");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        java.util.List list19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list20 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass15, list19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        byte[] byteArray1 = new byte[] {};
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.mockito.cglib.core.ReflectUtils.defineClass("hi!byteB", byteArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
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
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        java.util.List list5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list6 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("byte", "B");
        java.lang.String str3 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "byteB" + "'", str3, "byteB");
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
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
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        java.util.List list5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list6 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.Signature is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration5 = propertyDescriptor3.attributeNames();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("B", method1, method2);
        java.lang.String str4 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.beans.PropertyDescriptor[name=B]" + "'", str4, "java.beans.PropertyDescriptor[name=B]");
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        int int7 = type6.getSort();
        java.lang.Class<?> wildcardClass8 = type6.getClass();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.Class<?> wildcardClass13 = signature11.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass13);
        java.lang.Class[] classArray15 = new java.lang.Class[] { wildcardClass8, wildcardClass13 };
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method18 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass4, "hi!byteB", classArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: hi!byteB");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str14, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(classArray17);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor8 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray7);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
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
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
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
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        java.lang.Class<?> wildcardClass2 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass2);
        java.lang.Class[] classArray4 = new java.lang.Class[] {};
        int int5 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor6 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass2, classArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classInfo5);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        java.lang.Class<?> wildcardClass2 = type0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        int int21 = type20.getSort();
        java.lang.Class<?> wildcardClass22 = type20.getClass();
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type26 = signature25.getReturnType();
        java.lang.Class<?> wildcardClass27 = signature25.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass22, wildcardClass27 };
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor32 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass15, classArray31);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(java.lang.Class, java.lang.Class)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str28, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(classArray31);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(DBBBD)Lhi!;", "byteB");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(DBBBD)Lhi!;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("hi!byteB", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.util.List list5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list6 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method5 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method11 = null;
        propertyDescriptor3.setReadMethod(method11);
        java.lang.String str13 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; values={byte=0}]" + "'", str13, "java.beans.PropertyDescriptor[name=hi!; values={byte=0}]");
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSort();
        java.lang.Class<?> wildcardClass7 = type5.getClass();
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type11 = signature10.getReturnType();
        java.lang.Class<?> wildcardClass12 = signature10.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass12);
        java.lang.Class[] classArray14 = new java.lang.Class[] { wildcardClass7, wildcardClass12 };
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray14);
        boolean boolean17 = propertyDescriptor3.equals((java.lang.Object) classArray14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str13, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        int int20 = type19.getSort();
        int int22 = type19.getOpcode(3);
        java.lang.String str23 = type19.getClassName();
        java.lang.String str24 = type19.getClassName();
        java.lang.Class[] classArray25 = new java.lang.Class[] {};
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray25);
        boolean boolean27 = type19.equals((java.lang.Object) classArray25);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type34 = signature33.getReturnType();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        int int39 = type38.getSort();
        int int41 = type38.getOpcode(3);
        java.lang.String str42 = type38.getClassName();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        int int44 = type43.getSort();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        int int46 = type45.getSort();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str48 = type47.getClassName();
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type36, type38, type43, type45, type47 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BYTE_TYPE;
        int int52 = type51.getSize();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str55 = type54.getDescriptor();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str58 = type57.getClassName();
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type35, type51, type54, type56, type57 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray59);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str63 = type62.getClassName();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.BYTE_TYPE;
        int int65 = type64.getSort();
        int int67 = type64.getOpcode(3);
        java.lang.String str68 = type64.getClassName();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.BYTE_TYPE;
        int int70 = type69.getSort();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.BYTE_TYPE;
        int int72 = type71.getSort();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str74 = type73.getClassName();
        org.mockito.asm.Type[] typeArray75 = new org.mockito.asm.Type[] { type62, type64, type69, type71, type73 };
        java.lang.String str76 = org.mockito.asm.Type.getMethodDescriptor(type61, typeArray75);
        java.lang.String str77 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray75);
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray75);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj79 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass15, classArray25, (java.lang.Object[]) typeArray75);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "byte" + "'", str23, "byte");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "byte" + "'", str24, "byte");
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Lhi!;" + "'", str30, "Lhi!;");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "double" + "'", str37, "double");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "byte" + "'", str42, "byte");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "double" + "'", str48, "double");
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(DBBBD)V" + "'", str50, "(DBBBD)V");
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Lhi!;" + "'", str55, "Lhi!;");
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "double" + "'", str58, "double");
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "(VBLhi!;SD)B" + "'", str60, "(VBLhi!;SD)B");
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "double" + "'", str63, "double");
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3 + "'", int67 == 3);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "byte" + "'", str68, "byte");
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 3 + "'", int70 == 3);
        org.junit.Assert.assertNotNull(type71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 3 + "'", int72 == 3);
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "double" + "'", str74, "double");
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "(DBBBD)V" + "'", str76, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "(DBBBD)B" + "'", str77, "(DBBBD)B");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "(DBBBD)Lhi!;" + "'", str78, "(DBBBD)Lhi!;");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(DBBBD)V", method1, method2);
        boolean boolean4 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor11 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(classArray10);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method11 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass4, "hi!", classArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: hi!");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(classArray10);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setConstrained(false);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.lang.String str16 = propertyDescriptor15.getShortDescription();
        java.lang.reflect.Method method17 = propertyDescriptor15.getWriteMethod();
        java.lang.String str18 = propertyDescriptor15.getShortDescription();
        propertyDescriptor15.setValue("byte", (java.lang.Object) (byte) 0);
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor15.attributeNames();
        boolean boolean23 = propertyDescriptor3.equals((java.lang.Object) propertyDescriptor15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("(VBLhi!;SD)B");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setBound(false);
        java.lang.String str7 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.beans.PropertyDescriptor[name=hi!]" + "'", str7, "java.beans.PropertyDescriptor[name=hi!]");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("hi!B", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setConstrained(false);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setExpert(true);
        java.lang.reflect.Method method16 = propertyDescriptor3.getWriteMethod();
        boolean boolean17 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=B]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 37");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("hi!byteB");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.lang.String str16 = propertyDescriptor15.getShortDescription();
        java.lang.reflect.Method method17 = propertyDescriptor15.getWriteMethod();
        propertyDescriptor15.setBound(false);
        java.beans.PropertyEditor propertyEditor20 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor15);
        boolean boolean21 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(propertyEditor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray15 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "B" + "'", str6, "B");
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method11 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass4, "B", classArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: B");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str5, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("byte");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.lang.String str16 = propertyDescriptor15.getShortDescription();
        java.lang.reflect.Method method17 = propertyDescriptor15.getWriteMethod();
        propertyDescriptor15.setBound(false);
        java.beans.PropertyEditor propertyEditor20 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor15);
        boolean boolean21 = propertyDescriptor15.isBound();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(propertyEditor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        java.lang.String[] strArray0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type7 = signature6.getReturnType();
        java.lang.Class<?> wildcardClass8 = signature6.getClass();
        java.lang.String str9 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        java.lang.Class[] classArray10 = new java.lang.Class[] { wildcardClass3, wildcardClass8 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.reflect.Method[] methodArray12 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray12);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type17 = signature16.getReturnType();
        java.lang.String str18 = signature16.getName();
        org.mockito.asm.Type type19 = signature16.getReturnType();
        java.lang.String str20 = signature16.getDescriptor();
        java.lang.Class[] classArray21 = new java.lang.Class[] {};
        int int22 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray21);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        boolean boolean28 = signature16.equals((java.lang.Object) strArray27);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type32 = signature31.getReturnType();
        java.lang.Class<?> wildcardClass33 = signature31.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass33);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray34, true, false);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray37);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray0, methodArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str9, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "B" + "'", str20, "B");
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(propertyDescriptorArray34);
        org.junit.Assert.assertNotNull(methodArray37);
        org.junit.Assert.assertNotNull(methodArray38);
        org.junit.Assert.assertNotNull(methodArray39);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        java.lang.String str5 = propertyDescriptor4.getShortDescription();
        java.lang.reflect.Method method6 = propertyDescriptor4.getWriteMethod();
        java.lang.String str7 = propertyDescriptor4.getShortDescription();
        propertyDescriptor4.setValue("byte", (java.lang.Object) (byte) 0);
        java.util.Enumeration<java.lang.String> strEnumeration11 = propertyDescriptor4.attributeNames();
        java.lang.reflect.Method method12 = null;
        propertyDescriptor4.setReadMethod(method12);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("hi!", method15, method16);
        java.lang.String str18 = propertyDescriptor17.getShortDescription();
        java.lang.reflect.Method method19 = propertyDescriptor17.getWriteMethod();
        java.lang.String str20 = propertyDescriptor17.getShortDescription();
        propertyDescriptor17.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor17.setConstrained(false);
        propertyDescriptor17.setHidden(false);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        java.lang.String str32 = propertyDescriptor31.getShortDescription();
        java.lang.reflect.Method method33 = propertyDescriptor31.getWriteMethod();
        java.lang.String str34 = propertyDescriptor31.getShortDescription();
        boolean boolean35 = propertyDescriptor31.isPreferred();
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type40 = signature39.getReturnType();
        java.lang.String str41 = signature39.getName();
        org.mockito.asm.Type type42 = signature39.getReturnType();
        propertyDescriptor31.setValue("B", (java.lang.Object) type42);
        java.lang.reflect.Method method44 = propertyDescriptor31.getReadMethod();
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = new java.beans.PropertyDescriptor[] { propertyDescriptor4, propertyDescriptor17, propertyDescriptor31 };
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray45, false, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) propertyDescriptorArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNull(method44);
        org.junit.Assert.assertNotNull(propertyDescriptorArray45);
        org.junit.Assert.assertNotNull(methodArray48);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        java.lang.String str5 = propertyDescriptor4.getShortDescription();
        java.lang.reflect.Method method6 = propertyDescriptor4.getWriteMethod();
        propertyDescriptor4.setValue("double", (java.lang.Object) ' ');
        boolean boolean10 = propertyDescriptor4.isExpert();
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.lang.Class<?> wildcardClass16 = propertyDescriptor15.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        propertyDescriptor4.setValue("float", (java.lang.Object) wildcardClass16);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        int int20 = classInfo19.getModifiers();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.lang.String str25 = propertyDescriptor24.getShortDescription();
        java.lang.reflect.Method method26 = propertyDescriptor24.getWriteMethod();
        propertyDescriptor24.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean30 = classInfo19.equals((java.lang.Object) propertyDescriptor24);
        int int31 = classInfo19.getModifiers();
        org.mockito.asm.Type[] typeArray32 = classInfo19.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) typeArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java/beans/PropertyDescriptor" + "'", str17, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(typeArray32);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.Signature is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str5, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str6, "org/mockito/cglib/core/Signature");
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("org/mockito/cglib/core/Signature", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type22 = signature21.getReturnType();
        java.lang.String str23 = signature21.getName();
        org.mockito.asm.Type type24 = signature21.getReturnType();
        boolean boolean25 = classInfo18.equals((java.lang.Object) type24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        int int30 = type29.getSort();
        int int32 = type29.getOpcode(3);
        java.lang.String str33 = type29.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        int int35 = type34.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        int int37 = type36.getSort();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str39 = type38.getClassName();
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type27, type29, type34, type36, type38 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray40);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = type24.getInternalName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "double" + "'", str28, "double");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "byte" + "'", str33, "byte");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "double" + "'", str39, "double");
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(DBBBD)V" + "'", str41, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(DBBBD)B" + "'", str42, "(DBBBD)B");
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        java.lang.Class<?> wildcardClass2 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class4 = org.mockito.cglib.core.ReflectUtils.defineClass("hi!", byteArray2, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
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
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "byteB");
        java.lang.String str3 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!byteB" + "'", str3, "hi!byteB");
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int19 = classInfo18.getModifiers();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean29 = classInfo18.equals((java.lang.Object) propertyDescriptor23);
        int int30 = classInfo18.getModifiers();
        org.mockito.asm.Type[] typeArray31 = classInfo18.getInterfaces();
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Method method34 = null;
        java.beans.PropertyDescriptor propertyDescriptor35 = new java.beans.PropertyDescriptor("hi!", method33, method34);
        java.lang.String str36 = propertyDescriptor35.getShortDescription();
        java.lang.reflect.Method method37 = propertyDescriptor35.getWriteMethod();
        propertyDescriptor35.setValue("double", (java.lang.Object) ' ');
        boolean boolean41 = propertyDescriptor35.isExpert();
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("hi!", method44, method45);
        java.lang.Class<?> wildcardClass47 = propertyDescriptor46.getClass();
        java.lang.String str48 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass47);
        propertyDescriptor35.setValue("float", (java.lang.Object) wildcardClass47);
        org.mockito.cglib.core.ClassInfo classInfo50 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass47);
        int int51 = classInfo50.getModifiers();
        java.lang.reflect.Method method53 = null;
        java.lang.reflect.Method method54 = null;
        java.beans.PropertyDescriptor propertyDescriptor55 = new java.beans.PropertyDescriptor("hi!", method53, method54);
        java.lang.String str56 = propertyDescriptor55.getShortDescription();
        java.lang.reflect.Method method57 = propertyDescriptor55.getWriteMethod();
        propertyDescriptor55.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean61 = classInfo50.equals((java.lang.Object) propertyDescriptor55);
        int int62 = classInfo50.getModifiers();
        org.mockito.asm.Type[] typeArray63 = classInfo50.getInterfaces();
        boolean boolean65 = classInfo50.equals((java.lang.Object) 100.0f);
        java.lang.reflect.Method method67 = null;
        java.lang.reflect.Method method68 = null;
        java.beans.PropertyDescriptor propertyDescriptor69 = new java.beans.PropertyDescriptor("hi!", method67, method68);
        java.lang.String str70 = propertyDescriptor69.getShortDescription();
        java.lang.reflect.Method method71 = propertyDescriptor69.getWriteMethod();
        propertyDescriptor69.setValue("double", (java.lang.Object) ' ');
        boolean boolean75 = propertyDescriptor69.isExpert();
        java.lang.reflect.Method method78 = null;
        java.lang.reflect.Method method79 = null;
        java.beans.PropertyDescriptor propertyDescriptor80 = new java.beans.PropertyDescriptor("hi!", method78, method79);
        java.lang.Class<?> wildcardClass81 = propertyDescriptor80.getClass();
        java.lang.String str82 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass81);
        propertyDescriptor69.setValue("float", (java.lang.Object) wildcardClass81);
        org.mockito.cglib.core.ClassInfo classInfo84 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass81);
        int int85 = classInfo84.getModifiers();
        java.lang.reflect.Method method87 = null;
        java.lang.reflect.Method method88 = null;
        java.beans.PropertyDescriptor propertyDescriptor89 = new java.beans.PropertyDescriptor("hi!", method87, method88);
        java.lang.String str90 = propertyDescriptor89.getShortDescription();
        java.lang.reflect.Method method91 = propertyDescriptor89.getWriteMethod();
        propertyDescriptor89.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean95 = classInfo84.equals((java.lang.Object) propertyDescriptor89);
        int int96 = classInfo84.getModifiers();
        org.mockito.asm.Type type97 = classInfo84.getSuperType();
        boolean boolean98 = classInfo50.equals((java.lang.Object) type97);
        boolean boolean99 = classInfo18.equals((java.lang.Object) classInfo50);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java/beans/PropertyDescriptor" + "'", str48, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNull(method57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNull(method71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "java/beans/PropertyDescriptor" + "'", str82, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertNull(method91);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
        org.junit.Assert.assertNotNull(type97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        int int2 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        int int3 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        int int4 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(classArray5);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(DBBBD)B", method1, method2);
        java.lang.String str4 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.beans.PropertyDescriptor[name=(DBBBD)B]" + "'", str4, "java.beans.PropertyDescriptor[name=(DBBBD)B]");
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setExpert(false);
        java.lang.Class<?> wildcardClass12 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method13 = null;
        propertyDescriptor3.setWriteMethod(method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyType();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        java.lang.Class<?> wildcardClass2 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass2);
        java.lang.Class[] classArray4 = new java.lang.Class[] {};
        int int5 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray4);
        int int6 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray4);
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray4);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray4);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor11 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass2, classArray8);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
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
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 10 };
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class7 = org.mockito.cglib.core.ReflectUtils.defineClass("Lorg/mockito/cglib/core/Signature;", byteArray5, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, 10]");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setConstrained(false);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setPreferred(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method20 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java/beans/PropertyDescriptor" + "'", str19, "java/beans/PropertyDescriptor");
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("B", method1, method2);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        java.lang.Class<?> wildcardClass8 = propertyDescriptor7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method11 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classInfo9);
        org.junit.Assert.assertNull(propertyEditor10);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("hi!B");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(3);
        java.lang.String str20 = type16.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSort();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        int int24 = type23.getSort();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type14, type16, type21, type23, type25 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        int int30 = type29.getSize();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type13, type29, type32, type34, type35 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BYTE_TYPE;
        int int43 = type42.getSort();
        int int45 = type42.getOpcode(3);
        java.lang.String str46 = type42.getClassName();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BYTE_TYPE;
        int int48 = type47.getSort();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BYTE_TYPE;
        int int50 = type49.getSort();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str52 = type51.getClassName();
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type40, type42, type47, type49, type51 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray53);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray53);
        java.lang.reflect.Method method57 = null;
        java.lang.reflect.Method method58 = null;
        java.beans.PropertyDescriptor propertyDescriptor59 = new java.beans.PropertyDescriptor("hi!", method57, method58);
        java.lang.String str60 = propertyDescriptor59.getShortDescription();
        java.lang.reflect.Method method61 = propertyDescriptor59.getWriteMethod();
        propertyDescriptor59.setValue("double", (java.lang.Object) ' ');
        boolean boolean65 = propertyDescriptor59.isExpert();
        java.lang.reflect.Method method68 = null;
        java.lang.reflect.Method method69 = null;
        java.beans.PropertyDescriptor propertyDescriptor70 = new java.beans.PropertyDescriptor("hi!", method68, method69);
        java.lang.Class<?> wildcardClass71 = propertyDescriptor70.getClass();
        java.lang.String str72 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass71);
        propertyDescriptor59.setValue("float", (java.lang.Object) wildcardClass71);
        org.mockito.cglib.core.ClassInfo classInfo74 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass71);
        int int75 = classInfo74.getModifiers();
        java.lang.reflect.Method method77 = null;
        java.lang.reflect.Method method78 = null;
        java.beans.PropertyDescriptor propertyDescriptor79 = new java.beans.PropertyDescriptor("hi!", method77, method78);
        java.lang.String str80 = propertyDescriptor79.getShortDescription();
        java.lang.reflect.Method method81 = propertyDescriptor79.getWriteMethod();
        propertyDescriptor79.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean85 = classInfo74.equals((java.lang.Object) propertyDescriptor79);
        int int86 = classInfo74.getModifiers();
        org.mockito.asm.Type[] typeArray87 = classInfo74.getInterfaces();
        java.lang.String str88 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray87);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj89 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4, classArray6, (java.lang.Object[]) typeArray87);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str5, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "double" + "'", str15, "double");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "byte" + "'", str20, "byte");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "double" + "'", str26, "double");
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(DBBBD)V" + "'", str28, "(DBBBD)V");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Lhi!;" + "'", str33, "Lhi!;");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "double" + "'", str36, "double");
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(VBLhi!;SD)B" + "'", str38, "(VBLhi!;SD)B");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "double" + "'", str41, "double");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "byte" + "'", str46, "byte");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "double" + "'", str52, "double");
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "(DBBBD)V" + "'", str54, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(DBBBD)B" + "'", str55, "(DBBBD)B");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNull(method61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "java/beans/PropertyDescriptor" + "'", str72, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNull(method81);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertNotNull(typeArray87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "()B" + "'", str88, "()B");
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.Signature is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str5, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classInfo6);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method10 = null;
        propertyDescriptor3.setReadMethod(method10);
        java.lang.Object obj13 = propertyDescriptor3.getValue("java/beans/PropertyDescriptor");
        boolean boolean14 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setName("double");
        java.lang.String str12 = propertyDescriptor3.getName();
        propertyDescriptor3.setBound(true);
        boolean boolean15 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "double" + "'", str12, "double");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=(DBBBD)B]", classLoader1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method10 = null;
        propertyDescriptor3.setReadMethod(method10);
        boolean boolean12 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setName("(VBLhi!;SD)B");
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        boolean boolean18 = propertyDescriptor3.equals((java.lang.Object) int17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor12 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray11);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str5, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str6, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(classArray11);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("(DBBBD)Lhi!;");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("V");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java/beans/PropertyDescriptor" + "'", str5, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.String str13 = propertyDescriptor12.getShortDescription();
        java.lang.reflect.Method method14 = propertyDescriptor12.getWriteMethod();
        java.lang.String str15 = propertyDescriptor12.getShortDescription();
        propertyDescriptor12.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor12.setShortDescription("float");
        java.lang.Class[] classArray21 = new java.lang.Class[] {};
        int int22 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        java.beans.PropertyEditor propertyEditor25 = propertyDescriptor12.createPropertyEditor((java.lang.Object) classArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor26 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray21);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(propertyEditor25);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setConstrained(false);
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setReadMethod(method12);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str17 = signature16.getDescriptor();
        java.lang.String str18 = signature16.getDescriptor();
        java.beans.PropertyEditor propertyEditor19 = propertyDescriptor3.createPropertyEditor((java.lang.Object) str18);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "B" + "'", str17, "B");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "B" + "'", str18, "B");
        org.junit.Assert.assertNull(propertyEditor19);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setBound(false);
        java.lang.reflect.Method method8 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setShortDescription("java/beans/PropertyDescriptor");
        java.lang.String str11 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; shortDescription=java/beans/PropertyDescriptor]" + "'", str11, "java.beans.PropertyDescriptor[name=hi!; shortDescription=java/beans/PropertyDescriptor]");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setShortDescription("float");
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.String str14 = propertyDescriptor3.getDisplayName();
        boolean boolean15 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=hi!]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        int int2 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        int int3 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) classArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("byteB");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type4 = signature3.getReturnType();
        java.lang.Class<?> wildcardClass5 = signature3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) propertyDescriptorArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method18 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        java.lang.String str9 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; values={java.beans.PropertyDescriptor[name=hi!]=0}]" + "'", str9, "java.beans.PropertyDescriptor[name=hi!; values={java.beans.PropertyDescriptor[name=hi!]=0}]");
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=hi!; values={java.beans.PropertyDescriptor[name=hi!]=0}]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.String str5 = propertyDescriptor3.getShortDescription();
        java.lang.String str6 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.beans.PropertyDescriptor[name=hi!]" + "'", str6, "java.beans.PropertyDescriptor[name=hi!]");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str5, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str6, "org/mockito/cglib/core/Signature");
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        int int21 = type20.getSort();
        java.lang.Class<?> wildcardClass22 = type20.getClass();
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type26 = signature25.getReturnType();
        java.lang.Class<?> wildcardClass27 = signature25.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass22, wildcardClass27 };
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor33 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass15, classArray29);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(org.mockito.asm.Type, org.mockito.cglib.core.Signature)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str28, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        int int2 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        int int3 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        int int4 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray1);
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type0.getOpcode(3);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        java.lang.Class<?> wildcardClass5 = propertyDescriptor4.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) propertyDescriptorArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java/beans/PropertyDescriptor" + "'", str6, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
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
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        java.lang.Class<?> wildcardClass2 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass2);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        int int6 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray5);
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray5);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method9 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass2, "hi!byteB", classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: hi!byteB");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        propertyDescriptor3.setHidden(true);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.lang.String str25 = propertyDescriptor24.getShortDescription();
        java.lang.reflect.Method method26 = propertyDescriptor24.getWriteMethod();
        propertyDescriptor24.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor24.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor3.setValue("", (java.lang.Object) "Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("hi!", method36, method37);
        java.lang.String str39 = propertyDescriptor38.getShortDescription();
        java.lang.reflect.Method method40 = propertyDescriptor38.getWriteMethod();
        java.lang.String str41 = propertyDescriptor38.getShortDescription();
        propertyDescriptor38.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor38.setShortDescription("float");
        java.lang.Class[] classArray47 = new java.lang.Class[] {};
        int int48 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray47);
        int int49 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray47);
        int int50 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray47);
        java.beans.PropertyEditor propertyEditor51 = propertyDescriptor38.createPropertyEditor((java.lang.Object) classArray47);
        java.lang.Class<?> wildcardClass52 = propertyDescriptor38.getPropertyType();
        boolean boolean53 = propertyDescriptor3.equals((java.lang.Object) propertyDescriptor38);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNull(method40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(propertyEditor51);
        org.junit.Assert.assertNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        java.lang.String str5 = propertyDescriptor4.getShortDescription();
        java.lang.reflect.Method method6 = propertyDescriptor4.getWriteMethod();
        propertyDescriptor4.setValue("double", (java.lang.Object) ' ');
        boolean boolean10 = propertyDescriptor4.isExpert();
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.lang.Class<?> wildcardClass16 = propertyDescriptor15.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        propertyDescriptor4.setValue("float", (java.lang.Object) wildcardClass16);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        java.lang.Object obj20 = null;
        boolean boolean21 = classInfo19.equals(obj20);
        org.mockito.asm.Type[] typeArray22 = classInfo19.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) typeArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java/beans/PropertyDescriptor" + "'", str17, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        propertyDescriptor3.setPreferred(true);
        java.lang.String str10 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; preferred]" + "'", str10, "java.beans.PropertyDescriptor[name=hi!; preferred]");
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        propertyDescriptor3.setValue("B", (java.lang.Object) type14);
        propertyDescriptor3.setShortDescription("byte");
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method20 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        boolean boolean7 = signature2.equals((java.lang.Object) 10.0d);
        java.lang.String str8 = signature2.getName();
        java.lang.String str9 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
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
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class4 = org.mockito.cglib.core.ReflectUtils.defineClass("(DBBBD)V", byteArray2, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("D");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = type1.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        int int9 = type8.getSort();
        java.lang.Class<?> wildcardClass10 = type8.getClass();
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type14 = signature13.getReturnType();
        java.lang.Class<?> wildcardClass15 = signature13.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        java.lang.Class[] classArray17 = new java.lang.Class[] { wildcardClass10, wildcardClass15 };
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method20 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass4, "java/lang/Object", classArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: java/lang/Object");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str5, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str16, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(classArray19);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("java.lang.Object", classLoader1);
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
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setDisplayName("java.beans.PropertyDescriptor[name=hi!]");
        boolean boolean6 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        java.lang.String str20 = classInfo19.toString();
        int int21 = classInfo19.getModifiers();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.beans.PropertyDescriptor" + "'", str20, "java.beans.PropertyDescriptor");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("D");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=B]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        boolean boolean5 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setWriteMethod(method12);
        java.lang.Class<?> wildcardClass14 = propertyDescriptor3.getPropertyEditorClass();
        boolean boolean15 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        java.lang.Class class0 = null;
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type4 = signature3.getReturnType();
        java.lang.Class<?> wildcardClass5 = signature3.getClass();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor9.getClass();
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type14 = signature13.getReturnType();
        java.lang.Class<?> wildcardClass15 = signature13.getClass();
        java.lang.Class[] classArray16 = new java.lang.Class[] { wildcardClass5, wildcardClass10, wildcardClass15 };
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor18 = org.mockito.cglib.core.ReflectUtils.getConstructor(class0, classArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type4 = signature3.getReturnType();
        java.lang.String str5 = signature3.getName();
        org.mockito.asm.Type type6 = signature3.getReturnType();
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type10 = signature9.getReturnType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        int int15 = type14.getSort();
        int int17 = type14.getOpcode(3);
        java.lang.String str18 = type14.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        int int20 = type19.getSort();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSort();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type12, type14, type19, type21, type23 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BYTE_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str34 = type33.getClassName();
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type11, type27, type30, type32, type33 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str39 = type38.getClassName();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        int int41 = type40.getSort();
        int int43 = type40.getOpcode(3);
        java.lang.String str44 = type40.getClassName();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        int int46 = type45.getSort();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BYTE_TYPE;
        int int48 = type47.getSort();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str50 = type49.getClassName();
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type38, type40, type45, type47, type49 };
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray51);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray51);
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("hi!", method55, method56);
        java.lang.String str58 = propertyDescriptor57.getShortDescription();
        java.lang.reflect.Method method59 = propertyDescriptor57.getWriteMethod();
        propertyDescriptor57.setValue("double", (java.lang.Object) ' ');
        boolean boolean63 = propertyDescriptor57.isExpert();
        java.lang.reflect.Method method66 = null;
        java.lang.reflect.Method method67 = null;
        java.beans.PropertyDescriptor propertyDescriptor68 = new java.beans.PropertyDescriptor("hi!", method66, method67);
        java.lang.Class<?> wildcardClass69 = propertyDescriptor68.getClass();
        java.lang.String str70 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass69);
        propertyDescriptor57.setValue("float", (java.lang.Object) wildcardClass69);
        org.mockito.cglib.core.ClassInfo classInfo72 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass69);
        org.mockito.cglib.core.Signature signature75 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type76 = signature75.getReturnType();
        java.lang.String str77 = signature75.getName();
        org.mockito.asm.Type type78 = signature75.getReturnType();
        boolean boolean79 = classInfo72.equals((java.lang.Object) type78);
        org.mockito.asm.Type type80 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type81 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str82 = type81.getClassName();
        org.mockito.asm.Type type83 = org.mockito.asm.Type.BYTE_TYPE;
        int int84 = type83.getSort();
        int int86 = type83.getOpcode(3);
        java.lang.String str87 = type83.getClassName();
        org.mockito.asm.Type type88 = org.mockito.asm.Type.BYTE_TYPE;
        int int89 = type88.getSort();
        org.mockito.asm.Type type90 = org.mockito.asm.Type.BYTE_TYPE;
        int int91 = type90.getSort();
        org.mockito.asm.Type type92 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str93 = type92.getClassName();
        org.mockito.asm.Type[] typeArray94 = new org.mockito.asm.Type[] { type81, type83, type88, type90, type92 };
        java.lang.String str95 = org.mockito.asm.Type.getMethodDescriptor(type80, typeArray94);
        java.lang.String str96 = org.mockito.asm.Type.getMethodDescriptor(type78, typeArray94);
        java.lang.String str97 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray94);
        org.mockito.cglib.core.Signature signature98 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; shortDescription=java/beans/PropertyDescriptor]", type6, typeArray94);
        java.lang.String str99 = type6.getDescriptor();
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "double" + "'", str13, "double");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "byte" + "'", str18, "byte");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "double" + "'", str24, "double");
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(DBBBD)V" + "'", str26, "(DBBBD)V");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Lhi!;" + "'", str31, "Lhi!;");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "double" + "'", str34, "double");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(VBLhi!;SD)B" + "'", str36, "(VBLhi!;SD)B");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "double" + "'", str39, "double");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "byte" + "'", str44, "byte");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "double" + "'", str50, "double");
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(DBBBD)V" + "'", str52, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(DBBBD)B" + "'", str53, "(DBBBD)B");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNull(method59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "java/beans/PropertyDescriptor" + "'", str70, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo72);
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(type78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(type80);
        org.junit.Assert.assertNotNull(type81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "double" + "'", str82, "double");
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 3 + "'", int84 == 3);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 3 + "'", int86 == 3);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "byte" + "'", str87, "byte");
        org.junit.Assert.assertNotNull(type88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 3 + "'", int89 == 3);
        org.junit.Assert.assertNotNull(type90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 3 + "'", int91 == 3);
        org.junit.Assert.assertNotNull(type92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "double" + "'", str93, "double");
        org.junit.Assert.assertNotNull(typeArray94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "(DBBBD)V" + "'", str95, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "(DBBBD)B" + "'", str96, "(DBBBD)B");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "(DBBBD)B" + "'", str97, "(DBBBD)B");
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "B" + "'", str99, "B");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(DBBBD)B", method1, method2);
        propertyDescriptor3.setHidden(false);
        boolean boolean6 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        java.util.List list20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list21 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass15, list20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(classInfo19);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        propertyDescriptor3.setValue("B", (java.lang.Object) type14);
        propertyDescriptor3.setShortDescription("byte");
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        int int21 = type20.getSort();
        java.lang.Class<?> wildcardClass22 = type20.getClass();
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type26 = signature25.getReturnType();
        java.lang.Class<?> wildcardClass27 = signature25.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass22, wildcardClass27 };
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        java.lang.Class[] classArray33 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method34 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass18, "hi!byteB", classArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: hi!byteB");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str28, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(classArray33);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor12 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray7);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("java/beans/PropertyDescriptor", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str6, "Ljava/beans/PropertyDescriptor;");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("java.beans.PropertyDescriptor");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.Signature is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str6, "Lorg/mockito/cglib/core/Signature;");
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=hi!; preferred]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor13 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray11);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str6, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        boolean boolean7 = signature2.equals((java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray8 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("V");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("()B");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.String str4 = signature2.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "B" + "'", str3, "B");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "B" + "'", str4, "B");
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setBound(false);
        boolean boolean7 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setDisplayName("V");
        boolean boolean10 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method8 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.Signature is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("LLorg/mockito/cglib/core/Signature;;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        int int9 = type8.getSort();
        java.lang.Class<?> wildcardClass10 = type8.getClass();
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type14 = signature13.getReturnType();
        java.lang.Class<?> wildcardClass15 = signature13.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        java.lang.Class[] classArray17 = new java.lang.Class[] { wildcardClass10, wildcardClass15 };
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        int int20 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        java.lang.Class[] classArray21 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method22 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass4, "V", classArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: V");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str5, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str6, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str16, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(classArray21);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getPropertyEditorClass();
        boolean boolean19 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type7 = signature6.getReturnType();
        java.lang.Class<?> wildcardClass8 = signature6.getClass();
        java.lang.String str9 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        java.lang.Class[] classArray10 = new java.lang.Class[] { wildcardClass3, wildcardClass8 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray10);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) classArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str9, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(classArray14);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        propertyDescriptor3.setValue("B", (java.lang.Object) type14);
        java.lang.String str16 = type14.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = type14.getInternalName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "B" + "'", str16, "B");
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; values={byte=0}]", method1, method2);
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        java.lang.String str9 = propertyDescriptor8.getDisplayName();
        boolean boolean10 = propertyDescriptor8.isHidden();
        propertyDescriptor8.setName("(DBBBD)Lhi!;");
        java.lang.reflect.Method method13 = propertyDescriptor8.getReadMethod();
        // The following exception was thrown during execution in test generation
        try {
            propertyDescriptor3.setValue("java/lang/Object", (java.lang.Object) method13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 0 };
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class8 = org.mockito.cglib.core.ReflectUtils.defineClass("java.beans.PropertyDescriptor[name=hi!; values={java.beans.PropertyDescriptor[name=hi!]=0}]", byteArray6, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, -1, 10, 0]");
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration5 = propertyDescriptor3.attributeNames();
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getName();
        java.lang.Object obj9 = propertyDescriptor3.getValue("byteB");
        boolean boolean10 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type7 = signature6.getReturnType();
        java.lang.Class<?> wildcardClass8 = signature6.getClass();
        java.lang.String str9 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        java.lang.Class[] classArray10 = new java.lang.Class[] { wildcardClass3, wildcardClass8 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor16.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, false, false);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str9, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(methodArray23);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        propertyDescriptor3.setValue("B", (java.lang.Object) type14);
        java.lang.String str16 = type14.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = type14.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "B" + "'", str16, "B");
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("byte");
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
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        boolean boolean8 = propertyDescriptor3.isExpert();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("byte", "B");
        java.lang.String str12 = signature11.toString();
        org.mockito.asm.Type type13 = signature11.getReturnType();
        boolean boolean14 = propertyDescriptor3.equals((java.lang.Object) type13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "byteB" + "'", str12, "byteB");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Ljava.beans.PropertyDescriptor[name=hi!; values={byte=0}];");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 58");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type15 = signature14.getReturnType();
        java.lang.Class<?> wildcardClass16 = signature14.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass11, wildcardClass16 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray18);
        int int22 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor23 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray18);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>(org.mockito.asm.Type, org.mockito.cglib.core.Signature)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str17, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        boolean boolean5 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setHidden(false);
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type15 = signature14.getReturnType();
        java.lang.Class<?> wildcardClass16 = signature14.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass11, wildcardClass16 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        java.lang.String str26 = propertyDescriptor23.getShortDescription();
        propertyDescriptor23.setValue("byte", (java.lang.Object) (byte) 0);
        java.util.Enumeration<java.lang.String> strEnumeration30 = propertyDescriptor23.attributeNames();
        java.lang.reflect.Method method31 = null;
        propertyDescriptor23.setReadMethod(method31);
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        java.lang.String str37 = propertyDescriptor36.getShortDescription();
        java.lang.reflect.Method method38 = propertyDescriptor36.getWriteMethod();
        java.lang.String str39 = propertyDescriptor36.getShortDescription();
        propertyDescriptor36.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor36.setConstrained(false);
        propertyDescriptor36.setHidden(false);
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("hi!", method48, method49);
        java.lang.String str51 = propertyDescriptor50.getShortDescription();
        java.lang.reflect.Method method52 = propertyDescriptor50.getWriteMethod();
        java.lang.String str53 = propertyDescriptor50.getShortDescription();
        boolean boolean54 = propertyDescriptor50.isPreferred();
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type59 = signature58.getReturnType();
        java.lang.String str60 = signature58.getName();
        org.mockito.asm.Type type61 = signature58.getReturnType();
        propertyDescriptor50.setValue("B", (java.lang.Object) type61);
        java.lang.reflect.Method method63 = propertyDescriptor50.getReadMethod();
        java.beans.PropertyDescriptor[] propertyDescriptorArray64 = new java.beans.PropertyDescriptor[] { propertyDescriptor23, propertyDescriptor36, propertyDescriptor50 };
        java.lang.reflect.Method[] methodArray67 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray64, false, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj68 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass8, classArray18, (java.lang.Object[]) propertyDescriptorArray64);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(org.mockito.asm.Type, org.mockito.cglib.core.Signature)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str17, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration30);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNull(method52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNull(method63);
        org.junit.Assert.assertNotNull(propertyDescriptorArray64);
        org.junit.Assert.assertNotNull(methodArray67);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method19 = propertyDescriptor3.getReadMethod();
        java.lang.String str20 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; values={double= ; float=class java.beans.PropertyDescriptor}]" + "'", str20, "java.beans.PropertyDescriptor[name=hi!; values={double= ; float=class java.beans.PropertyDescriptor}]");
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("L(DBBBD)V;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        int int22 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray20);
        java.lang.String[] strArray25 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method27 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass15, "java.beans.PropertyDescriptor[name=B]", classArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: java.beans.PropertyDescriptor[name=B]");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("B", "(DBBBD)V");
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class6 = org.mockito.cglib.core.ReflectUtils.defineClass("java/lang/Object", byteArray4, classLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 100, 0]");
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        java.util.List list20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list21 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass15, list20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(type19);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type7 = signature6.getReturnType();
        java.lang.Class<?> wildcardClass8 = signature6.getClass();
        java.lang.String str9 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        java.lang.Class[] classArray10 = new java.lang.Class[] { wildcardClass3, wildcardClass8 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str9, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.Signature is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("float", "LLorg/mockito/cglib/core/Signature;;");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "floatLLorg/mockito/cglib/core/Signature;;" + "'", str3, "floatLLorg/mockito/cglib/core/Signature;;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "floatLLorg/mockito/cglib/core/Signature;;" + "'", str4, "floatLLorg/mockito/cglib/core/Signature;;");
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java/beans/PropertyDescriptor" + "'", str5, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
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
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type5 = signature4.getReturnType();
        java.lang.Class<?> wildcardClass6 = signature4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        boolean boolean9 = type0.equals((java.lang.Object) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method10 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.Signature is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str6, "Lorg/mockito/cglib/core/Signature;");
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("Lhi!;float", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        java.lang.Class<?> wildcardClass5 = propertyDescriptor4.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray7, false, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) propertyDescriptorArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(methodArray10);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        java.util.List list21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list22 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass15, list21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(type20);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        byte[] byteArray1 = null;
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.mockito.cglib.core.ReflectUtils.defineClass("D", byteArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.lang.String str16 = propertyDescriptor15.getShortDescription();
        java.lang.reflect.Method method17 = propertyDescriptor15.getWriteMethod();
        propertyDescriptor15.setBound(false);
        java.beans.PropertyEditor propertyEditor20 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor15);
        java.lang.String str21 = propertyDescriptor3.getDisplayName();
        java.lang.String str22 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(propertyEditor20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; values={byte=0}]" + "'", str22, "java.beans.PropertyDescriptor[name=hi!; values={byte=0}]");
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
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
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str7, "org/mockito/cglib/core/Signature");
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("org.mockito.cglib.core.Signature");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("Lhi!;float", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method8 = null;
        propertyDescriptor3.setReadMethod(method8);
        java.lang.reflect.Method method10 = null;
        propertyDescriptor3.setReadMethod(method10);
        boolean boolean12 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
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
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("V", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSort();
        int int8 = type5.getOpcode(3);
        java.lang.String str9 = type5.getClassName();
        java.lang.String str10 = type5.getClassName();
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        boolean boolean13 = type5.equals((java.lang.Object) classArray11);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        propertyDescriptor3.setValue("", (java.lang.Object) strArray14);
        java.lang.Object obj17 = propertyDescriptor3.getValue("float");
        java.lang.String str18 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "byte" + "'", str9, "byte");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "byte" + "'", str10, "byte");
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str7, "org/mockito/cglib/core/Signature");
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setDisplayName("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.String str6 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]]" + "'", str6, "java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]]");
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor3.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor3.setDisplayName("");
        propertyDescriptor3.setPreferred(true);
        boolean boolean15 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("L(DBBBD)V;");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->L");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=(DBBBD)B]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 44");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.Signature is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method19 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java/beans/PropertyDescriptor" + "'", str18, "java/beans/PropertyDescriptor");
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("LLorg/mockito/cglib/core/Signature;;", "LLorg/mockito/cglib/core/Signature;;");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("hi!byteB");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("B", method1, method2);
        boolean boolean4 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = classInfo5.getType();
        int int8 = type6.getOpcode(5);
        int int9 = type6.getSize();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L(DBBBD)V;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int3 = type1.getOpcode((int) (byte) 0);
        int int4 = type1.getSort();
        int int6 = type1.getOpcode((int) (short) 100);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type10 = signature9.getReturnType();
        java.lang.Class<?> wildcardClass11 = signature9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("byteB");
        boolean boolean17 = classInfo14.equals((java.lang.Object) type16);
        org.mockito.asm.Type[] typeArray18 = classInfo14.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("(VBLhi!;SD)B", type1, typeArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(VBLhi!;SD)B' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(classInfo13);
        org.junit.Assert.assertNotNull(classInfo14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        java.lang.Class<?> wildcardClass2 = type0.getClass();
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type6 = signature5.getReturnType();
        java.lang.Class<?> wildcardClass7 = signature5.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        java.lang.Class[] classArray9 = new java.lang.Class[] { wildcardClass2, wildcardClass7 };
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.lang.Class<?> wildcardClass16 = propertyDescriptor15.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray18, false, false);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        int int24 = type23.getSort();
        java.lang.Class<?> wildcardClass25 = type23.getClass();
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type29 = signature28.getReturnType();
        java.lang.Class<?> wildcardClass30 = signature28.getClass();
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass30);
        java.lang.Class[] classArray32 = new java.lang.Class[] { wildcardClass25, wildcardClass30 };
        java.lang.String[] strArray33 = org.mockito.cglib.core.ReflectUtils.getNames(classArray32);
        java.lang.String[] strArray34 = org.mockito.cglib.core.ReflectUtils.getNames(classArray32);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type38 = signature37.getReturnType();
        java.lang.String str39 = signature37.getName();
        org.mockito.asm.Type type40 = signature37.getReturnType();
        java.lang.String str41 = signature37.getDescriptor();
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        int int43 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        int int44 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        int int45 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        java.lang.Class[] classArray46 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray42);
        java.lang.String[] strArray47 = org.mockito.cglib.core.ReflectUtils.getNames(classArray46);
        java.lang.String[] strArray48 = org.mockito.cglib.core.ReflectUtils.getNames(classArray46);
        boolean boolean49 = signature37.equals((java.lang.Object) strArray48);
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type53 = signature52.getReturnType();
        java.lang.Class<?> wildcardClass54 = signature52.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray55 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass54);
        java.lang.reflect.Method[] methodArray58 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray55, true, false);
        java.lang.reflect.Method[] methodArray59 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray48, methodArray58);
        java.lang.reflect.Method[] methodArray60 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray59);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray61 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str8, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str31, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "B" + "'", str41, "B");
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(propertyDescriptorArray55);
        org.junit.Assert.assertNotNull(methodArray58);
        org.junit.Assert.assertNotNull(methodArray59);
        org.junit.Assert.assertNotNull(methodArray60);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setBound(false);
        boolean boolean7 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setDisplayName("V");
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.String str14 = propertyDescriptor13.getShortDescription();
        java.lang.reflect.Method method15 = propertyDescriptor13.getWriteMethod();
        propertyDescriptor13.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor13.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor13.setDisplayName("");
        propertyDescriptor13.setPreferred(true);
        boolean boolean25 = propertyDescriptor3.equals((java.lang.Object) propertyDescriptor13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.String str7 = signature2.getName();
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "B" + "'", str6, "B");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("hi!", method9, method10);
        java.lang.String str12 = propertyDescriptor11.getShortDescription();
        java.lang.reflect.Method method13 = propertyDescriptor11.getWriteMethod();
        propertyDescriptor11.setValue("double", (java.lang.Object) ' ');
        boolean boolean17 = propertyDescriptor11.isExpert();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("hi!", method20, method21);
        java.lang.Class<?> wildcardClass23 = propertyDescriptor22.getClass();
        java.lang.String str24 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        propertyDescriptor11.setValue("float", (java.lang.Object) wildcardClass23);
        org.mockito.cglib.core.ClassInfo classInfo26 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        int int27 = classInfo26.getModifiers();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        java.lang.String str32 = propertyDescriptor31.getShortDescription();
        java.lang.reflect.Method method33 = propertyDescriptor31.getWriteMethod();
        propertyDescriptor31.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean37 = classInfo26.equals((java.lang.Object) propertyDescriptor31);
        java.util.Enumeration<java.lang.String> strEnumeration38 = propertyDescriptor31.attributeNames();
        boolean boolean39 = propertyDescriptor3.equals((java.lang.Object) strEnumeration38);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java/beans/PropertyDescriptor" + "'", str24, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strEnumeration38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode(15);
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        int int5 = type0.getSort();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "F" + "'", str3, "F");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        java.lang.String str5 = propertyDescriptor4.getShortDescription();
        java.lang.reflect.Method method6 = propertyDescriptor4.getWriteMethod();
        propertyDescriptor4.setValue("double", (java.lang.Object) ' ');
        boolean boolean10 = propertyDescriptor4.isExpert();
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.lang.Class<?> wildcardClass16 = propertyDescriptor15.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        propertyDescriptor4.setValue("float", (java.lang.Object) wildcardClass16);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type23 = signature22.getReturnType();
        java.lang.String str24 = signature22.getName();
        org.mockito.asm.Type type25 = signature22.getReturnType();
        boolean boolean26 = classInfo19.equals((java.lang.Object) type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BYTE_TYPE;
        int int28 = type27.getSort();
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Method method31 = null;
        java.beans.PropertyDescriptor propertyDescriptor32 = new java.beans.PropertyDescriptor("hi!", method30, method31);
        java.lang.String str33 = propertyDescriptor32.getShortDescription();
        java.lang.reflect.Method method34 = propertyDescriptor32.getWriteMethod();
        propertyDescriptor32.setValue("double", (java.lang.Object) ' ');
        boolean boolean38 = propertyDescriptor32.isExpert();
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("hi!", method41, method42);
        java.lang.Class<?> wildcardClass44 = propertyDescriptor43.getClass();
        java.lang.String str45 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass44);
        propertyDescriptor32.setValue("float", (java.lang.Object) wildcardClass44);
        org.mockito.cglib.core.ClassInfo classInfo47 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass44);
        int int48 = classInfo47.getModifiers();
        java.lang.reflect.Method method50 = null;
        java.lang.reflect.Method method51 = null;
        java.beans.PropertyDescriptor propertyDescriptor52 = new java.beans.PropertyDescriptor("hi!", method50, method51);
        java.lang.String str53 = propertyDescriptor52.getShortDescription();
        java.lang.reflect.Method method54 = propertyDescriptor52.getWriteMethod();
        propertyDescriptor52.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean58 = classInfo47.equals((java.lang.Object) propertyDescriptor52);
        int int59 = classInfo47.getModifiers();
        org.mockito.asm.Type[] typeArray60 = classInfo47.getInterfaces();
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray60);
        boolean boolean62 = type25.equals((java.lang.Object) typeArray60);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj63 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) typeArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java/beans/PropertyDescriptor" + "'", str17, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java/beans/PropertyDescriptor" + "'", str45, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNull(method54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "()B" + "'", str61, "()B");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        propertyDescriptor3.setValue("B", (java.lang.Object) type14);
        propertyDescriptor3.setShortDescription("byte");
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type25 = signature24.getReturnType();
        java.lang.Class<?> wildcardClass26 = signature24.getClass();
        java.lang.String str27 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass26);
        java.lang.Class[] classArray28 = new java.lang.Class[] { wildcardClass21, wildcardClass26 };
        java.lang.String[] strArray29 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        int int31 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor33 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass18, classArray28);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(org.mockito.asm.Type, org.mockito.cglib.core.Signature)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str27, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setName("double");
        propertyDescriptor3.setExpert(false);
        boolean boolean13 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lhi!;", "float");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lhi!;" + "'", str3, "Lhi!;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lhi!;" + "'", str4, "Lhi!;");
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("Ljava/beans/PropertyDescriptor;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        byte[] byteArray1 = new byte[] {};
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.mockito.cglib.core.ReflectUtils.defineClass("java.beans.PropertyDescriptor", byteArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 10);
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("hi!", method4, method5);
        java.lang.String str7 = propertyDescriptor6.getShortDescription();
        java.lang.reflect.Method method8 = propertyDescriptor6.getWriteMethod();
        propertyDescriptor6.setValue("double", (java.lang.Object) ' ');
        boolean boolean12 = propertyDescriptor6.isExpert();
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("hi!", method15, method16);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        propertyDescriptor6.setValue("float", (java.lang.Object) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type25 = signature24.getReturnType();
        java.lang.String str26 = signature24.getName();
        org.mockito.asm.Type type27 = signature24.getReturnType();
        boolean boolean28 = classInfo21.equals((java.lang.Object) type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str31 = type30.getClassName();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        int int33 = type32.getSort();
        int int35 = type32.getOpcode(3);
        java.lang.String str36 = type32.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        int int38 = type37.getSort();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BYTE_TYPE;
        int int40 = type39.getSort();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str42 = type41.getClassName();
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type30, type32, type37, type39, type41 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray43);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray43);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray43);
        java.lang.String str47 = type0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int48 = type0.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java/beans/PropertyDescriptor" + "'", str19, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo21);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "double" + "'", str31, "double");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "byte" + "'", str36, "byte");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "double" + "'", str42, "double");
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(DBBBD)V" + "'", str44, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(DBBBD)B" + "'", str45, "(DBBBD)B");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(DBBBD)V" + "'", str46, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "V" + "'", str47, "V");
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("(DBBBD)Ljava/beans/PropertyDescriptor;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
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
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
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
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method9 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.Signature is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str8, "Lorg/mockito/cglib/core/Signature;");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.mockito.asm.Type type0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        java.lang.String str5 = propertyDescriptor4.getShortDescription();
        java.lang.reflect.Method method6 = propertyDescriptor4.getWriteMethod();
        propertyDescriptor4.setValue("double", (java.lang.Object) ' ');
        boolean boolean10 = propertyDescriptor4.isExpert();
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.lang.Class<?> wildcardClass16 = propertyDescriptor15.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        propertyDescriptor4.setValue("float", (java.lang.Object) wildcardClass16);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type23 = signature22.getReturnType();
        java.lang.String str24 = signature22.getName();
        org.mockito.asm.Type type25 = signature22.getReturnType();
        boolean boolean26 = classInfo19.equals((java.lang.Object) type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        int int31 = type30.getSort();
        int int33 = type30.getOpcode(3);
        java.lang.String str34 = type30.getClassName();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        int int36 = type35.getSort();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        int int38 = type37.getSort();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str40 = type39.getClassName();
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type28, type30, type35, type37, type39 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java/beans/PropertyDescriptor" + "'", str17, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "double" + "'", str29, "double");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "byte" + "'", str34, "byte");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "double" + "'", str40, "double");
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(DBBBD)V" + "'", str42, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(DBBBD)B" + "'", str43, "(DBBBD)B");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("org/mockito/cglib/core/Signature");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.String str5 = propertyDescriptor3.getShortDescription();
        boolean boolean6 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.String str13 = propertyDescriptor12.getShortDescription();
        java.lang.reflect.Method method14 = propertyDescriptor12.getWriteMethod();
        java.lang.String str15 = propertyDescriptor12.getShortDescription();
        propertyDescriptor12.setValue("byte", (java.lang.Object) (byte) 0);
        java.util.Enumeration<java.lang.String> strEnumeration19 = propertyDescriptor12.attributeNames();
        java.lang.reflect.Method method20 = null;
        propertyDescriptor12.setReadMethod(method20);
        java.lang.reflect.Method method23 = null;
        java.lang.reflect.Method method24 = null;
        java.beans.PropertyDescriptor propertyDescriptor25 = new java.beans.PropertyDescriptor("hi!", method23, method24);
        java.lang.String str26 = propertyDescriptor25.getShortDescription();
        java.lang.reflect.Method method27 = propertyDescriptor25.getWriteMethod();
        java.lang.String str28 = propertyDescriptor25.getShortDescription();
        propertyDescriptor25.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor25.setConstrained(false);
        propertyDescriptor25.setHidden(false);
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("hi!", method37, method38);
        java.lang.String str40 = propertyDescriptor39.getShortDescription();
        java.lang.reflect.Method method41 = propertyDescriptor39.getWriteMethod();
        java.lang.String str42 = propertyDescriptor39.getShortDescription();
        boolean boolean43 = propertyDescriptor39.isPreferred();
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type48 = signature47.getReturnType();
        java.lang.String str49 = signature47.getName();
        org.mockito.asm.Type type50 = signature47.getReturnType();
        propertyDescriptor39.setValue("B", (java.lang.Object) type50);
        java.lang.reflect.Method method52 = propertyDescriptor39.getReadMethod();
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = new java.beans.PropertyDescriptor[] { propertyDescriptor12, propertyDescriptor25, propertyDescriptor39 };
        java.lang.reflect.Method[] methodArray56 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray53, false, false);
        java.lang.Class[] classArray57 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray53);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor58 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray57);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>(java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNull(method41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNull(method52);
        org.junit.Assert.assertNotNull(propertyDescriptorArray53);
        org.junit.Assert.assertNotNull(methodArray56);
        org.junit.Assert.assertNotNull(classArray57);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        propertyDescriptor3.setHidden(true);
        boolean boolean20 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("Lhi!;", "float");
        java.lang.String str10 = signature9.getName();
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        int int14 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray11);
        boolean boolean16 = signature9.equals((java.lang.Object) classArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor17 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray15);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str5, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lhi!;" + "'", str10, "Lhi!;");
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class8 = org.mockito.cglib.core.ReflectUtils.defineClass("byte", byteArray6, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 100, 10, 10]");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.lang.String str16 = propertyDescriptor15.getShortDescription();
        java.lang.reflect.Method method17 = propertyDescriptor15.getWriteMethod();
        propertyDescriptor15.setBound(false);
        java.beans.PropertyEditor propertyEditor20 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor15);
        propertyDescriptor3.setShortDescription("hi!");
        java.lang.reflect.Method method23 = propertyDescriptor3.getWriteMethod();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("java.beans.PropertyDescriptor[name=hi!; values={byte=0}]");
        java.beans.PropertyEditor propertyEditor26 = propertyDescriptor3.createPropertyEditor((java.lang.Object) "java.beans.PropertyDescriptor[name=hi!; values={byte=0}]");
        boolean boolean27 = propertyDescriptor3.isPreferred();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(propertyEditor20);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNull(propertyEditor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type17 = signature16.getReturnType();
        java.lang.Class<?> wildcardClass18 = signature16.getClass();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("hi!", method20, method21);
        java.lang.Class<?> wildcardClass23 = propertyDescriptor22.getClass();
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type27 = signature26.getReturnType();
        java.lang.Class<?> wildcardClass28 = signature26.getClass();
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass18, wildcardClass23, wildcardClass28 };
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4, classArray9, (java.lang.Object[]) classArray29);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        java.lang.Class[] classArray0 = null;
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        org.junit.Assert.assertNull(strArray1);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setShortDescription("float");
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("B", method15, method16);
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor3.createPropertyEditor((java.lang.Object) method16);
        java.util.Enumeration<java.lang.String> strEnumeration19 = propertyDescriptor3.attributeNames();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor3.getPropertyEditorClass();
        boolean boolean21 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(propertyEditor18);
        org.junit.Assert.assertNotNull(strEnumeration19);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str8, "Lorg/mockito/cglib/core/Signature;");
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setBound(false);
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getPropertyType();
        java.lang.String str9 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.beans.PropertyDescriptor[name=hi!]" + "'", str9, "java.beans.PropertyDescriptor[name=hi!]");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java/beans/PropertyDescriptor" + "'", str5, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str7, "Ljava/beans/PropertyDescriptor;");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type4 = signature3.getReturnType();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        int int9 = type8.getSort();
        int int11 = type8.getOpcode(3);
        java.lang.String str12 = type8.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        int int14 = type13.getSort();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        int int16 = type15.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type6, type8, type13, type15, type17 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type5, type21, type24, type26, type27 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray29);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type37 = signature36.getReturnType();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str40 = type39.getClassName();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BYTE_TYPE;
        int int42 = type41.getSort();
        int int44 = type41.getOpcode(3);
        java.lang.String str45 = type41.getClassName();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BYTE_TYPE;
        int int47 = type46.getSort();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BYTE_TYPE;
        int int49 = type48.getSort();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str51 = type50.getClassName();
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type39, type41, type46, type48, type50 };
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray52);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BYTE_TYPE;
        int int55 = type54.getSize();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str58 = type57.getDescriptor();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str61 = type60.getClassName();
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type38, type54, type57, type59, type60 };
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray62);
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type33, typeArray62);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("L(DBBBD)V;", type4, typeArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'L(DBBBD)V;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "double" + "'", str7, "double");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "byte" + "'", str12, "byte");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "double" + "'", str18, "double");
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(DBBBD)V" + "'", str20, "(DBBBD)V");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Lhi!;" + "'", str25, "Lhi!;");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "double" + "'", str28, "double");
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(VBLhi!;SD)B" + "'", str30, "(VBLhi!;SD)B");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "double" + "'", str40, "double");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "byte" + "'", str45, "byte");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "double" + "'", str51, "double");
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(DBBBD)V" + "'", str53, "(DBBBD)V");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Lhi!;" + "'", str58, "Lhi!;");
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "double" + "'", str61, "double");
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "(VBLhi!;SD)B" + "'", str63, "(VBLhi!;SD)B");
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("byte");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        java.lang.String str5 = propertyDescriptor4.getShortDescription();
        java.lang.reflect.Method method6 = propertyDescriptor4.getWriteMethod();
        java.lang.String str7 = propertyDescriptor4.getShortDescription();
        propertyDescriptor4.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor4.setShortDescription("float");
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        int int14 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray13);
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray13);
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray13);
        java.beans.PropertyEditor propertyEditor17 = propertyDescriptor4.createPropertyEditor((java.lang.Object) classArray13);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) classArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(propertyEditor17);
        org.junit.Assert.assertNotNull(classArray18);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("B", method1, method2);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        java.lang.Class<?> wildcardClass8 = propertyDescriptor7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass8);
        java.util.List list11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass8, list11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classInfo9);
        org.junit.Assert.assertNull(propertyEditor10);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setBound(false);
        boolean boolean10 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor3.attributeNames();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        int int12 = type11.getSort();
        java.lang.Class<?> wildcardClass13 = type11.getClass();
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type17 = signature16.getReturnType();
        java.lang.Class<?> wildcardClass18 = signature16.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        java.lang.Class[] classArray20 = new java.lang.Class[] { wildcardClass13, wildcardClass18 };
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        boolean boolean24 = propertyDescriptor3.equals((java.lang.Object) int23);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str19, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type22 = signature21.getReturnType();
        java.lang.String str23 = signature21.getName();
        org.mockito.asm.Type type24 = signature21.getReturnType();
        boolean boolean25 = classInfo18.equals((java.lang.Object) type24);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type29 = signature28.getReturnType();
        java.lang.Class<?> wildcardClass30 = signature28.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass30);
        boolean boolean32 = type24.equals((java.lang.Object) wildcardClass30);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type37 = signature36.getReturnType();
        java.lang.Class<?> wildcardClass38 = signature36.getClass();
        java.lang.reflect.Method method40 = null;
        java.lang.reflect.Method method41 = null;
        java.beans.PropertyDescriptor propertyDescriptor42 = new java.beans.PropertyDescriptor("hi!", method40, method41);
        java.lang.Class<?> wildcardClass43 = propertyDescriptor42.getClass();
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type47 = signature46.getReturnType();
        java.lang.Class<?> wildcardClass48 = signature46.getClass();
        java.lang.Class[] classArray49 = new java.lang.Class[] { wildcardClass38, wildcardClass43, wildcardClass48 };
        int int50 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method51 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass30, "B", classArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: B");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(propertyDescriptorArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!B");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classInfo5);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        boolean boolean5 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.String str13 = propertyDescriptor12.getShortDescription();
        java.lang.reflect.Method method14 = propertyDescriptor12.getWriteMethod();
        propertyDescriptor12.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor12.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor3.setValue("byte", (java.lang.Object) propertyDescriptor12);
        java.lang.Class<?> wildcardClass21 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method23 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 10);
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("hi!", method4, method5);
        java.lang.String str7 = propertyDescriptor6.getShortDescription();
        java.lang.reflect.Method method8 = propertyDescriptor6.getWriteMethod();
        propertyDescriptor6.setValue("double", (java.lang.Object) ' ');
        boolean boolean12 = propertyDescriptor6.isExpert();
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("hi!", method15, method16);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        propertyDescriptor6.setValue("float", (java.lang.Object) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type25 = signature24.getReturnType();
        java.lang.String str26 = signature24.getName();
        org.mockito.asm.Type type27 = signature24.getReturnType();
        boolean boolean28 = classInfo21.equals((java.lang.Object) type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str31 = type30.getClassName();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        int int33 = type32.getSort();
        int int35 = type32.getOpcode(3);
        java.lang.String str36 = type32.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        int int38 = type37.getSort();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BYTE_TYPE;
        int int40 = type39.getSort();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str42 = type41.getClassName();
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type30, type32, type37, type39, type41 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray43);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray43);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray43);
        java.lang.String str47 = type0.getClassName();
        java.lang.String str48 = type0.toString();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java/beans/PropertyDescriptor" + "'", str19, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo21);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "double" + "'", str31, "double");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "byte" + "'", str36, "byte");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "double" + "'", str42, "double");
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(DBBBD)V" + "'", str44, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(DBBBD)B" + "'", str45, "(DBBBD)B");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(DBBBD)V" + "'", str46, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "void" + "'", str47, "void");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "V" + "'", str48, "V");
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("L(DBBBD)V;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration5 = propertyDescriptor3.attributeNames();
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getName();
        boolean boolean8 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type4 = signature3.getReturnType();
        java.lang.String str5 = signature3.getName();
        org.mockito.asm.Type type6 = signature3.getReturnType();
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type10 = signature9.getReturnType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        int int15 = type14.getSort();
        int int17 = type14.getOpcode(3);
        java.lang.String str18 = type14.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        int int20 = type19.getSort();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSort();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type12, type14, type19, type21, type23 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BYTE_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str34 = type33.getClassName();
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type11, type27, type30, type32, type33 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str39 = type38.getClassName();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        int int41 = type40.getSort();
        int int43 = type40.getOpcode(3);
        java.lang.String str44 = type40.getClassName();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        int int46 = type45.getSort();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BYTE_TYPE;
        int int48 = type47.getSort();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str50 = type49.getClassName();
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type38, type40, type45, type47, type49 };
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray51);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray51);
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("hi!", method55, method56);
        java.lang.String str58 = propertyDescriptor57.getShortDescription();
        java.lang.reflect.Method method59 = propertyDescriptor57.getWriteMethod();
        propertyDescriptor57.setValue("double", (java.lang.Object) ' ');
        boolean boolean63 = propertyDescriptor57.isExpert();
        java.lang.reflect.Method method66 = null;
        java.lang.reflect.Method method67 = null;
        java.beans.PropertyDescriptor propertyDescriptor68 = new java.beans.PropertyDescriptor("hi!", method66, method67);
        java.lang.Class<?> wildcardClass69 = propertyDescriptor68.getClass();
        java.lang.String str70 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass69);
        propertyDescriptor57.setValue("float", (java.lang.Object) wildcardClass69);
        org.mockito.cglib.core.ClassInfo classInfo72 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass69);
        org.mockito.cglib.core.Signature signature75 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type76 = signature75.getReturnType();
        java.lang.String str77 = signature75.getName();
        org.mockito.asm.Type type78 = signature75.getReturnType();
        boolean boolean79 = classInfo72.equals((java.lang.Object) type78);
        org.mockito.asm.Type type80 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type81 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str82 = type81.getClassName();
        org.mockito.asm.Type type83 = org.mockito.asm.Type.BYTE_TYPE;
        int int84 = type83.getSort();
        int int86 = type83.getOpcode(3);
        java.lang.String str87 = type83.getClassName();
        org.mockito.asm.Type type88 = org.mockito.asm.Type.BYTE_TYPE;
        int int89 = type88.getSort();
        org.mockito.asm.Type type90 = org.mockito.asm.Type.BYTE_TYPE;
        int int91 = type90.getSort();
        org.mockito.asm.Type type92 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str93 = type92.getClassName();
        org.mockito.asm.Type[] typeArray94 = new org.mockito.asm.Type[] { type81, type83, type88, type90, type92 };
        java.lang.String str95 = org.mockito.asm.Type.getMethodDescriptor(type80, typeArray94);
        java.lang.String str96 = org.mockito.asm.Type.getMethodDescriptor(type78, typeArray94);
        java.lang.String str97 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray94);
        org.mockito.cglib.core.Signature signature98 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; shortDescription=java/beans/PropertyDescriptor]", type6, typeArray94);
        java.lang.String str99 = type6.getClassName();
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "double" + "'", str13, "double");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "byte" + "'", str18, "byte");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "double" + "'", str24, "double");
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(DBBBD)V" + "'", str26, "(DBBBD)V");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Lhi!;" + "'", str31, "Lhi!;");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "double" + "'", str34, "double");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(VBLhi!;SD)B" + "'", str36, "(VBLhi!;SD)B");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "double" + "'", str39, "double");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "byte" + "'", str44, "byte");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "double" + "'", str50, "double");
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(DBBBD)V" + "'", str52, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(DBBBD)B" + "'", str53, "(DBBBD)B");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNull(method59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "java/beans/PropertyDescriptor" + "'", str70, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo72);
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(type78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(type80);
        org.junit.Assert.assertNotNull(type81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "double" + "'", str82, "double");
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 3 + "'", int84 == 3);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 3 + "'", int86 == 3);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "byte" + "'", str87, "byte");
        org.junit.Assert.assertNotNull(type88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 3 + "'", int89 == 3);
        org.junit.Assert.assertNotNull(type90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 3 + "'", int91 == 3);
        org.junit.Assert.assertNotNull(type92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "double" + "'", str93, "double");
        org.junit.Assert.assertNotNull(typeArray94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "(DBBBD)V" + "'", str95, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "(DBBBD)B" + "'", str96, "(DBBBD)B");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "(DBBBD)B" + "'", str97, "(DBBBD)B");
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "byte" + "'", str99, "byte");
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        java.lang.Class<?> wildcardClass2 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass2);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSort();
        int int8 = type5.getOpcode(3);
        java.lang.String str9 = type5.getClassName();
        java.lang.String str10 = type5.getClassName();
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        boolean boolean13 = type5.equals((java.lang.Object) classArray11);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor15 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass2, classArray11);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "byte" + "'", str9, "byte");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "byte" + "'", str10, "byte");
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type7 = signature6.getReturnType();
        java.lang.Class<?> wildcardClass8 = signature6.getClass();
        java.lang.String str9 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        java.lang.Class[] classArray10 = new java.lang.Class[] { wildcardClass3, wildcardClass8 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.reflect.Method[] methodArray12 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray12);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type17 = signature16.getReturnType();
        java.lang.String str18 = signature16.getName();
        org.mockito.asm.Type type19 = signature16.getReturnType();
        java.lang.String str20 = signature16.getDescriptor();
        java.lang.Class[] classArray21 = new java.lang.Class[] {};
        int int22 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray21);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        boolean boolean28 = signature16.equals((java.lang.Object) strArray27);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type32 = signature31.getReturnType();
        java.lang.Class<?> wildcardClass33 = signature31.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass33);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray34, true, false);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray37);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str9, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "B" + "'", str20, "B");
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(propertyDescriptorArray34);
        org.junit.Assert.assertNotNull(methodArray37);
        org.junit.Assert.assertNotNull(methodArray38);
        org.junit.Assert.assertNotNull(methodArray39);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        propertyDescriptor3.setValue("B", (java.lang.Object) type14);
        int int16 = type14.getSize();
        int int17 = type14.getSort();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type18 = type14.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=hi!; shortDescription=java/beans/PropertyDescriptor]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setPreferred(false);
        boolean boolean10 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("float");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSort();
        java.lang.Class<?> wildcardClass23 = type21.getClass();
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type27 = signature26.getReturnType();
        java.lang.Class<?> wildcardClass28 = signature26.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        java.lang.Class[] classArray30 = new java.lang.Class[] { wildcardClass23, wildcardClass28 };
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method33 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass15, "byte", classArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: byte");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java/beans/PropertyDescriptor" + "'", str19, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str29, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(classArray32);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Lhi!;float");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method20 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java/beans/PropertyDescriptor" + "'", str19, "java/beans/PropertyDescriptor");
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 0 };
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class8 = org.mockito.cglib.core.ReflectUtils.defineClass("float", byteArray6, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 1, -1, 0]");
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(DBBBD)B");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.lang.String[] strArray3 = new java.lang.String[] { "(DBBBD)B", "floatLLorg/mockito/cglib/core/Signature;;", "L(DBBBD)V;" };
        java.lang.reflect.Method[] methodArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray5 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("LLorg/mockito/cglib/core/Signature;;", "LLorg/mockito/cglib/core/Signature;;");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type6 = signature5.getReturnType();
        java.lang.Class<?> wildcardClass7 = signature5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        boolean boolean11 = signature2.equals((java.lang.Object) wildcardClass7);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        int int13 = type12.getSort();
        java.lang.Class<?> wildcardClass14 = type12.getClass();
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type18 = signature17.getReturnType();
        java.lang.Class<?> wildcardClass19 = signature17.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass19);
        java.lang.Class[] classArray21 = new java.lang.Class[] { wildcardClass14, wildcardClass19 };
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.ReflectUtils.getNames(classArray21);
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray21);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        int int27 = type26.getSort();
        java.lang.Class<?> wildcardClass28 = type26.getClass();
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type32 = signature31.getReturnType();
        java.lang.Class<?> wildcardClass33 = signature31.getClass();
        java.lang.String str34 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass33);
        java.lang.Class[] classArray35 = new java.lang.Class[] { wildcardClass28, wildcardClass33 };
        java.lang.String[] strArray36 = org.mockito.cglib.core.ReflectUtils.getNames(classArray35);
        java.lang.reflect.Method[] methodArray37 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray37);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type42 = signature41.getReturnType();
        java.lang.String str43 = signature41.getName();
        org.mockito.asm.Type type44 = signature41.getReturnType();
        java.lang.String str45 = signature41.getDescriptor();
        java.lang.Class[] classArray46 = new java.lang.Class[] {};
        int int47 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray46);
        int int48 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray46);
        int int49 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray46);
        java.lang.Class[] classArray50 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray46);
        java.lang.String[] strArray51 = org.mockito.cglib.core.ReflectUtils.getNames(classArray50);
        java.lang.String[] strArray52 = org.mockito.cglib.core.ReflectUtils.getNames(classArray50);
        boolean boolean53 = signature41.equals((java.lang.Object) strArray52);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type57 = signature56.getReturnType();
        java.lang.Class<?> wildcardClass58 = signature56.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass58);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, false);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray52, methodArray62);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray62);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj65 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass7, classArray21, (java.lang.Object[]) methodArray64);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>(org.mockito.asm.Type, org.mockito.cglib.core.Signature)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(classInfo9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str20, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str34, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(methodArray37);
        org.junit.Assert.assertNotNull(methodArray38);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "B" + "'", str45, "B");
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(propertyDescriptorArray59);
        org.junit.Assert.assertNotNull(methodArray62);
        org.junit.Assert.assertNotNull(methodArray63);
        org.junit.Assert.assertNotNull(methodArray64);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lhi!;", "float");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.getName();
        java.lang.String str6 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lhi!;" + "'", str3, "Lhi!;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lhi!;" + "'", str4, "Lhi!;");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lhi!;" + "'", str5, "Lhi!;");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lhi!;float" + "'", str6, "Lhi!;float");
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
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
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.lang.String str16 = propertyDescriptor15.getShortDescription();
        java.lang.reflect.Method method17 = propertyDescriptor15.getWriteMethod();
        propertyDescriptor15.setBound(false);
        java.beans.PropertyEditor propertyEditor20 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor15);
        propertyDescriptor3.setShortDescription("hi!");
        boolean boolean23 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(propertyEditor20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        java.lang.Class<?> wildcardClass5 = propertyDescriptor4.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type11 = signature10.getReturnType();
        java.lang.String str12 = signature10.getName();
        org.mockito.asm.Type type13 = signature10.getReturnType();
        java.lang.String str14 = signature10.getDescriptor();
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray15);
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray19);
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray19);
        boolean boolean22 = signature10.equals((java.lang.Object) strArray21);
        java.lang.String str23 = signature10.getDescriptor();
        org.mockito.asm.Type type24 = signature10.getReturnType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(3);
        java.lang.String str32 = type28.getClassName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        int int34 = type33.getSort();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        int int36 = type35.getSort();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str38 = type37.getClassName();
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type26, type28, type33, type35, type37 };
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray39);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type24, typeArray39);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) typeArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "B" + "'", str14, "B");
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "B" + "'", str23, "B");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "double" + "'", str27, "double");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "byte" + "'", str32, "byte");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "double" + "'", str38, "double");
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(DBBBD)V" + "'", str40, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(DBBBD)Ljava/beans/PropertyDescriptor;" + "'", str42, "(DBBBD)Ljava/beans/PropertyDescriptor;");
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        propertyDescriptor3.setValue("B", (java.lang.Object) type14);
        propertyDescriptor3.setShortDescription("byte");
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        int int22 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        java.lang.String str32 = propertyDescriptor31.getShortDescription();
        java.lang.reflect.Method method33 = propertyDescriptor31.getWriteMethod();
        java.lang.String str34 = propertyDescriptor31.getShortDescription();
        propertyDescriptor31.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor31.setShortDescription("float");
        propertyDescriptor31.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method43 = null;
        java.lang.reflect.Method method44 = null;
        java.beans.PropertyDescriptor propertyDescriptor45 = new java.beans.PropertyDescriptor("hi!", method43, method44);
        java.lang.Class<?> wildcardClass46 = propertyDescriptor45.getClass();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass46);
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass46);
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass46);
        java.beans.PropertyEditor propertyEditor50 = propertyDescriptor31.createPropertyEditor((java.lang.Object) propertyDescriptorArray49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass18, classArray20, (java.lang.Object[]) propertyDescriptorArray49);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(propertyDescriptorArray48);
        org.junit.Assert.assertNotNull(propertyDescriptorArray49);
        org.junit.Assert.assertNull(propertyEditor50);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setBound(false);
        boolean boolean7 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setDisplayName("V");
        propertyDescriptor3.setDisplayName("L(DBBBD)V;");
        boolean boolean12 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("(VBLhi!;SD)B", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSort();
        java.lang.Class<?> wildcardClass7 = type5.getClass();
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type11 = signature10.getReturnType();
        java.lang.Class<?> wildcardClass12 = signature10.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass12);
        java.lang.Class[] classArray14 = new java.lang.Class[] { wildcardClass7, wildcardClass12 };
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor17 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray14);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(org.mockito.asm.Type, org.mockito.cglib.core.Signature)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str13, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type7 = signature6.getReturnType();
        java.lang.Class<?> wildcardClass8 = signature6.getClass();
        java.lang.String str9 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        java.lang.Class[] classArray10 = new java.lang.Class[] { wildcardClass3, wildcardClass8 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.reflect.Method[] methodArray12 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray12);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type17 = signature16.getReturnType();
        java.lang.String str18 = signature16.getName();
        org.mockito.asm.Type type19 = signature16.getReturnType();
        java.lang.String str20 = signature16.getDescriptor();
        java.lang.Class[] classArray21 = new java.lang.Class[] {};
        int int22 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray21);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        boolean boolean28 = signature16.equals((java.lang.Object) strArray27);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type32 = signature31.getReturnType();
        java.lang.Class<?> wildcardClass33 = signature31.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass33);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray34, true, false);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray37);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray37);
        java.lang.reflect.Method[] methodArray40 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str9, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "B" + "'", str20, "B");
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(propertyDescriptorArray34);
        org.junit.Assert.assertNotNull(methodArray37);
        org.junit.Assert.assertNotNull(methodArray38);
        org.junit.Assert.assertNotNull(methodArray39);
        org.junit.Assert.assertNotNull(methodArray40);
        org.junit.Assert.assertNotNull(methodArray41);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        java.lang.Class<?> wildcardClass2 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method12 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass2, "byteB", classArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: byteB");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        boolean boolean8 = propertyDescriptor3.isPreferred();
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        java.lang.String str11 = propertyDescriptor10.getShortDescription();
        java.lang.reflect.Method method12 = propertyDescriptor10.getWriteMethod();
        java.lang.String str13 = propertyDescriptor10.getShortDescription();
        boolean boolean14 = propertyDescriptor10.isPreferred();
        boolean boolean15 = propertyDescriptor10.isExpert();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type19 = signature18.getReturnType();
        java.lang.Class<?> wildcardClass20 = signature18.getClass();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.lang.Class<?> wildcardClass25 = propertyDescriptor24.getClass();
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type29 = signature28.getReturnType();
        java.lang.Class<?> wildcardClass30 = signature28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[] { wildcardClass20, wildcardClass25, wildcardClass30 };
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        java.beans.PropertyEditor propertyEditor33 = propertyDescriptor10.createPropertyEditor((java.lang.Object) classArray31);
        int int34 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        java.lang.Class[] classArray35 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor36 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray31);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>(org.mockito.cglib.core.Signature, java.beans.PropertyDescriptor, org.mockito.cglib.core.Signature)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str5, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str6, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(propertyEditor33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(classArray35);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lhi!;", "float");
        java.lang.String str3 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lhi!;" + "'", str3, "Lhi!;");
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int19 = classInfo18.getModifiers();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean29 = classInfo18.equals((java.lang.Object) propertyDescriptor23);
        int int30 = classInfo18.getModifiers();
        org.mockito.asm.Type[] typeArray31 = classInfo18.getInterfaces();
        org.mockito.asm.Type type32 = classInfo18.getType();
        org.mockito.asm.Type type33 = classInfo18.getSuperType();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getReturnType("F");
        boolean boolean36 = classInfo18.equals((java.lang.Object) "F");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method20 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(classInfo19);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setShortDescription("D");
        java.lang.String str7 = propertyDescriptor3.getShortDescription();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        int int10 = type9.getSort();
        int int12 = type9.getOpcode(3);
        java.lang.String str13 = type9.toString();
        boolean boolean15 = type9.equals((java.lang.Object) 8);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!; preferred]", (java.lang.Object) 8);
        boolean boolean17 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D" + "'", str7, "D");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "B" + "'", str13, "B");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=hi!; preferred; propertyEditorClass=class org.mockito.asm.Type]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("B", method1, method2);
        propertyDescriptor3.setName("Ljava.beans.PropertyDescriptor[name=hi!; values={byte=0}];");
        boolean boolean6 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("Lhi!;");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type9 = signature8.getReturnType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        int int14 = type13.getSort();
        int int16 = type13.getOpcode(3);
        java.lang.String str17 = type13.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        int int19 = type18.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        int int21 = type20.getSort();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type11, type13, type18, type20, type22 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        int int27 = type26.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type10, type26, type29, type31, type32 };
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str38 = type37.getClassName();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BYTE_TYPE;
        int int40 = type39.getSort();
        int int42 = type39.getOpcode(3);
        java.lang.String str43 = type39.getClassName();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BYTE_TYPE;
        int int45 = type44.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BYTE_TYPE;
        int int47 = type46.getSort();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str49 = type48.getClassName();
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type37, type39, type44, type46, type48 };
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray50);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray50);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray50);
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray50);
        org.mockito.asm.Type type55 = type2.getElementType();
        java.lang.reflect.Method method57 = null;
        java.lang.reflect.Method method58 = null;
        java.beans.PropertyDescriptor propertyDescriptor59 = new java.beans.PropertyDescriptor("hi!", method57, method58);
        java.lang.Class<?> wildcardClass60 = propertyDescriptor59.getClass();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass60);
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type66 = signature65.getReturnType();
        java.lang.String str67 = signature65.getName();
        org.mockito.asm.Type type68 = signature65.getReturnType();
        java.lang.String str69 = signature65.getDescriptor();
        java.lang.Class[] classArray70 = new java.lang.Class[] {};
        int int71 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray70);
        int int72 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray70);
        int int73 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray70);
        java.lang.Class[] classArray74 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray70);
        java.lang.String[] strArray75 = org.mockito.cglib.core.ReflectUtils.getNames(classArray74);
        java.lang.String[] strArray76 = org.mockito.cglib.core.ReflectUtils.getNames(classArray74);
        boolean boolean77 = signature65.equals((java.lang.Object) strArray76);
        java.lang.String str78 = signature65.getDescriptor();
        org.mockito.asm.Type type79 = signature65.getReturnType();
        org.mockito.asm.Type type80 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type81 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str82 = type81.getClassName();
        org.mockito.asm.Type type83 = org.mockito.asm.Type.BYTE_TYPE;
        int int84 = type83.getSort();
        int int86 = type83.getOpcode(3);
        java.lang.String str87 = type83.getClassName();
        org.mockito.asm.Type type88 = org.mockito.asm.Type.BYTE_TYPE;
        int int89 = type88.getSort();
        org.mockito.asm.Type type90 = org.mockito.asm.Type.BYTE_TYPE;
        int int91 = type90.getSort();
        org.mockito.asm.Type type92 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str93 = type92.getClassName();
        org.mockito.asm.Type[] typeArray94 = new org.mockito.asm.Type[] { type81, type83, type88, type90, type92 };
        java.lang.String str95 = org.mockito.asm.Type.getMethodDescriptor(type80, typeArray94);
        org.mockito.cglib.core.Signature signature96 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type79, typeArray94);
        java.lang.String str97 = org.mockito.asm.Type.getMethodDescriptor(type61, typeArray94);
        java.lang.String str98 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray94);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lhi!;" + "'", str5, "Lhi!;");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "double" + "'", str12, "double");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "byte" + "'", str17, "byte");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "double" + "'", str23, "double");
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(DBBBD)V" + "'", str25, "(DBBBD)V");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Lhi!;" + "'", str30, "Lhi!;");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "double" + "'", str33, "double");
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(VBLhi!;SD)B" + "'", str35, "(VBLhi!;SD)B");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "double" + "'", str38, "double");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "byte" + "'", str43, "byte");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "double" + "'", str49, "double");
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(DBBBD)V" + "'", str51, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(DBBBD)B" + "'", str52, "(DBBBD)B");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(DBBBD)Lhi!;" + "'", str53, "(DBBBD)Lhi!;");
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "B" + "'", str69, "B");
        org.junit.Assert.assertNotNull(classArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(classArray74);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "B" + "'", str78, "B");
        org.junit.Assert.assertNotNull(type79);
        org.junit.Assert.assertNotNull(type80);
        org.junit.Assert.assertNotNull(type81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "double" + "'", str82, "double");
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 3 + "'", int84 == 3);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 3 + "'", int86 == 3);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "byte" + "'", str87, "byte");
        org.junit.Assert.assertNotNull(type88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 3 + "'", int89 == 3);
        org.junit.Assert.assertNotNull(type90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 3 + "'", int91 == 3);
        org.junit.Assert.assertNotNull(type92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "double" + "'", str93, "double");
        org.junit.Assert.assertNotNull(typeArray94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "(DBBBD)V" + "'", str95, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "(DBBBD)Ljava/beans/PropertyDescriptor;" + "'", str97, "(DBBBD)Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "(DBBBD)Lhi!;" + "'", str98, "(DBBBD)Lhi!;");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.Signature is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.util.List list9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list10 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(3);
        java.lang.String str5 = type1.getClassName();
        java.lang.String str6 = type1.getClassName();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        boolean boolean9 = type1.equals((java.lang.Object) classArray7);
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        int int12 = type11.getSort();
        java.lang.Class<?> wildcardClass13 = type11.getClass();
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type17 = signature16.getReturnType();
        java.lang.Class<?> wildcardClass18 = signature16.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        java.lang.Class[] classArray20 = new java.lang.Class[] { wildcardClass13, wildcardClass18 };
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.reflect.Method[] methodArray22 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray22);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "byte" + "'", str5, "byte");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "byte" + "'", str6, "byte");
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str19, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(methodArray24);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        java.lang.reflect.Method method9 = null;
        propertyDescriptor3.setWriteMethod(method9);
        boolean boolean11 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("Lorg/mockito/cglib/core/Signature;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) -1 };
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class6 = org.mockito.cglib.core.ReflectUtils.defineClass("(DBBBD)Lava.beans.PropertyDescriptor[name=hi!;", byteArray4, classLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 10, -1]");
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
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
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method8 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.Signature is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str7, "org/mockito/cglib/core/Signature");
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java/lang/Object");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method20 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(type19);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("V", method1, method2);
        java.lang.String str4 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.beans.PropertyDescriptor[name=V]" + "'", str4, "java.beans.PropertyDescriptor[name=V]");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type15 = signature14.getReturnType();
        java.lang.Class<?> wildcardClass16 = signature14.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass11, wildcardClass16 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor22 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray18);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(org.mockito.asm.Type, org.mockito.cglib.core.Signature)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str17, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=hi!; values={java.beans.PropertyDescriptor[name=hi!]=0}]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method19 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method20 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setPreferred(false);
        propertyDescriptor3.setDisplayName("java.beans.PropertyDescriptor[name=B]");
        boolean boolean25 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setBound(false);
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getPropertyType();
        propertyDescriptor3.setExpert(false);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type14 = signature13.getReturnType();
        java.lang.Class<?> wildcardClass15 = signature13.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo17 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        boolean boolean18 = propertyDescriptor3.equals((java.lang.Object) classInfo17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str16, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classInfo17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type4 = signature3.getReturnType();
        java.lang.String str5 = signature3.getName();
        org.mockito.asm.Type type6 = signature3.getReturnType();
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type10 = signature9.getReturnType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        int int15 = type14.getSort();
        int int17 = type14.getOpcode(3);
        java.lang.String str18 = type14.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        int int20 = type19.getSort();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSort();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type12, type14, type19, type21, type23 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BYTE_TYPE;
        int int28 = type27.getSize();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str34 = type33.getClassName();
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type11, type27, type30, type32, type33 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str39 = type38.getClassName();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        int int41 = type40.getSort();
        int int43 = type40.getOpcode(3);
        java.lang.String str44 = type40.getClassName();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        int int46 = type45.getSort();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BYTE_TYPE;
        int int48 = type47.getSort();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str50 = type49.getClassName();
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type38, type40, type45, type47, type49 };
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray51);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray51);
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("hi!", method55, method56);
        java.lang.String str58 = propertyDescriptor57.getShortDescription();
        java.lang.reflect.Method method59 = propertyDescriptor57.getWriteMethod();
        propertyDescriptor57.setValue("double", (java.lang.Object) ' ');
        boolean boolean63 = propertyDescriptor57.isExpert();
        java.lang.reflect.Method method66 = null;
        java.lang.reflect.Method method67 = null;
        java.beans.PropertyDescriptor propertyDescriptor68 = new java.beans.PropertyDescriptor("hi!", method66, method67);
        java.lang.Class<?> wildcardClass69 = propertyDescriptor68.getClass();
        java.lang.String str70 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass69);
        propertyDescriptor57.setValue("float", (java.lang.Object) wildcardClass69);
        org.mockito.cglib.core.ClassInfo classInfo72 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass69);
        org.mockito.cglib.core.Signature signature75 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type76 = signature75.getReturnType();
        java.lang.String str77 = signature75.getName();
        org.mockito.asm.Type type78 = signature75.getReturnType();
        boolean boolean79 = classInfo72.equals((java.lang.Object) type78);
        org.mockito.asm.Type type80 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type81 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str82 = type81.getClassName();
        org.mockito.asm.Type type83 = org.mockito.asm.Type.BYTE_TYPE;
        int int84 = type83.getSort();
        int int86 = type83.getOpcode(3);
        java.lang.String str87 = type83.getClassName();
        org.mockito.asm.Type type88 = org.mockito.asm.Type.BYTE_TYPE;
        int int89 = type88.getSort();
        org.mockito.asm.Type type90 = org.mockito.asm.Type.BYTE_TYPE;
        int int91 = type90.getSort();
        org.mockito.asm.Type type92 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str93 = type92.getClassName();
        org.mockito.asm.Type[] typeArray94 = new org.mockito.asm.Type[] { type81, type83, type88, type90, type92 };
        java.lang.String str95 = org.mockito.asm.Type.getMethodDescriptor(type80, typeArray94);
        java.lang.String str96 = org.mockito.asm.Type.getMethodDescriptor(type78, typeArray94);
        java.lang.String str97 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray94);
        org.mockito.cglib.core.Signature signature98 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; shortDescription=java/beans/PropertyDescriptor]", type6, typeArray94);
        int int99 = type6.getSize();
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "double" + "'", str13, "double");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "byte" + "'", str18, "byte");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "double" + "'", str24, "double");
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(DBBBD)V" + "'", str26, "(DBBBD)V");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Lhi!;" + "'", str31, "Lhi!;");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "double" + "'", str34, "double");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(VBLhi!;SD)B" + "'", str36, "(VBLhi!;SD)B");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "double" + "'", str39, "double");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "byte" + "'", str44, "byte");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "double" + "'", str50, "double");
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(DBBBD)V" + "'", str52, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(DBBBD)B" + "'", str53, "(DBBBD)B");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNull(method59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "java/beans/PropertyDescriptor" + "'", str70, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo72);
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(type78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(type80);
        org.junit.Assert.assertNotNull(type81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "double" + "'", str82, "double");
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 3 + "'", int84 == 3);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 3 + "'", int86 == 3);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "byte" + "'", str87, "byte");
        org.junit.Assert.assertNotNull(type88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 3 + "'", int89 == 3);
        org.junit.Assert.assertNotNull(type90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 3 + "'", int91 == 3);
        org.junit.Assert.assertNotNull(type92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "double" + "'", str93, "double");
        org.junit.Assert.assertNotNull(typeArray94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "(DBBBD)V" + "'", str95, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "(DBBBD)B" + "'", str96, "(DBBBD)B");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "(DBBBD)B" + "'", str97, "(DBBBD)B");
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 1 + "'", int99 == 1);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str3 = signature2.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "B" + "'", str3, "B");
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        java.util.Enumeration<java.lang.String> strEnumeration9 = propertyDescriptor3.attributeNames();
        boolean boolean10 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strEnumeration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        java.lang.String str11 = propertyDescriptor10.getShortDescription();
        java.lang.reflect.Method method12 = propertyDescriptor10.getWriteMethod();
        java.lang.String str13 = propertyDescriptor10.getShortDescription();
        boolean boolean14 = propertyDescriptor10.isPreferred();
        boolean boolean15 = propertyDescriptor10.isExpert();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type19 = signature18.getReturnType();
        java.lang.Class<?> wildcardClass20 = signature18.getClass();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.lang.Class<?> wildcardClass25 = propertyDescriptor24.getClass();
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type29 = signature28.getReturnType();
        java.lang.Class<?> wildcardClass30 = signature28.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[] { wildcardClass20, wildcardClass25, wildcardClass30 };
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        java.beans.PropertyEditor propertyEditor33 = propertyDescriptor10.createPropertyEditor((java.lang.Object) classArray31);
        int int34 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("hi!", method36, method37);
        java.lang.Class<?> wildcardClass39 = propertyDescriptor38.getClass();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass39);
        java.beans.PropertyDescriptor[] propertyDescriptorArray41 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass39);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass39);
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass39);
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray43, true, true);
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray43, false, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4, classArray31, (java.lang.Object[]) methodArray49);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>(org.mockito.cglib.core.Signature, java.beans.PropertyDescriptor, org.mockito.cglib.core.Signature)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str5, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(propertyEditor33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(propertyDescriptorArray41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(propertyDescriptorArray43);
        org.junit.Assert.assertNotNull(methodArray46);
        org.junit.Assert.assertNotNull(methodArray49);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type16 = signature15.getReturnType();
        java.lang.Class<?> wildcardClass17 = signature15.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.lang.Class[] classArray19 = new java.lang.Class[] { wildcardClass12, wildcardClass17 };
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray19);
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray19);
        int int22 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4, classArray9, (java.lang.Object[]) classArray19);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str18, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setBound(false);
        org.mockito.asm.Type[] typeArray9 = org.mockito.asm.Type.getArgumentTypes("()B");
        boolean boolean10 = propertyDescriptor3.equals((java.lang.Object) "()B");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        java.lang.String str5 = propertyDescriptor4.getDisplayName();
        boolean boolean6 = propertyDescriptor4.isHidden();
        propertyDescriptor4.setHidden(false);
        java.lang.Class<?> wildcardClass9 = propertyDescriptor4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) propertyDescriptorArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        propertyDescriptor3.setValue("B", (java.lang.Object) type14);
        propertyDescriptor3.setShortDescription("double");
        propertyDescriptor3.setHidden(true);
        boolean boolean20 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "byteB");
        java.lang.String str3 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!byteB" + "'", str3, "hi!byteB");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("V", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSort();
        int int8 = type5.getOpcode(3);
        java.lang.String str9 = type5.getClassName();
        java.lang.String str10 = type5.getClassName();
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        boolean boolean13 = type5.equals((java.lang.Object) classArray11);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        propertyDescriptor3.setValue("", (java.lang.Object) strArray14);
        propertyDescriptor3.setBound(true);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "byte" + "'", str9, "byte");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "byte" + "'", str10, "byte");
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str5, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str6, "org/mockito/cglib/core/Signature");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setBound(false);
        java.lang.reflect.Method method8 = propertyDescriptor3.getWriteMethod();
        java.lang.String str9 = propertyDescriptor3.getName();
        propertyDescriptor3.setPreferred(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("hi!B");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("B");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int19 = classInfo18.getModifiers();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean29 = classInfo18.equals((java.lang.Object) propertyDescriptor23);
        java.lang.Class<?> wildcardClass30 = propertyDescriptor23.getPropertyEditorClass();
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("hi!", method32, method33);
        java.lang.Class<?> wildcardClass35 = propertyDescriptor34.getClass();
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass35);
        java.lang.String str37 = classInfo36.toString();
        org.mockito.asm.Type type38 = classInfo36.getSuperType();
        boolean boolean39 = propertyDescriptor23.equals((java.lang.Object) type38);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(classInfo36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.beans.PropertyDescriptor" + "'", str37, "java.beans.PropertyDescriptor");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=hi!; values={java.beans.PropertyDescriptor[name=hi!]=0}]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 91");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        propertyDescriptor3.setValue("B", (java.lang.Object) type14);
        propertyDescriptor3.setShortDescription("byte");
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.lang.Class<?> wildcardClass25 = propertyDescriptor24.getClass();
        org.mockito.cglib.core.ClassInfo classInfo26 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass25);
        java.lang.String str27 = classInfo26.toString();
        org.mockito.asm.Type type28 = classInfo26.getSuperType();
        boolean boolean29 = classInfo20.equals((java.lang.Object) classInfo26);
        org.mockito.asm.Type type30 = classInfo26.getType();
        int int31 = type30.getSort();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(classInfo20);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(classInfo26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.beans.PropertyDescriptor" + "'", str27, "java.beans.PropertyDescriptor");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("LLorg/mockito/cglib/core/Signature;;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("B");
        org.mockito.asm.Type[] typeArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("hi!B", type2, typeArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        int int2 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor3 = org.mockito.cglib.core.ReflectUtils.getConstructor(class0, classArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setExpert(false);
        java.lang.Class<?> wildcardClass12 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method13 = null;
        propertyDescriptor3.setWriteMethod(method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyType();
        propertyDescriptor3.setPreferred(true);
        boolean boolean18 = propertyDescriptor3.isPreferred();
        boolean boolean19 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        boolean boolean6 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("java/lang/Object", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor11 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray9);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str7, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str8, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
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
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.reflect.Method method8 = propertyDescriptor3.getWriteMethod();
        boolean boolean9 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        boolean boolean5 = propertyDescriptor3.isHidden();
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass6, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        boolean boolean16 = signature11.equals((java.lang.Object) 10.0d);
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        int int19 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        int int20 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        boolean boolean22 = signature11.equals((java.lang.Object) classArray17);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type26 = signature25.getReturnType();
        java.lang.Class<?> wildcardClass27 = signature25.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass27);
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass27);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4, classArray17, (java.lang.Object[]) propertyDescriptorArray30);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str8, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertNotNull(propertyDescriptorArray29);
        org.junit.Assert.assertNotNull(propertyDescriptorArray30);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        java.lang.Class<?> wildcardClass2 = type0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(classInfo3);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method21 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(type20);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method10 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java/beans/PropertyDescriptor" + "'", str5, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str7, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray6 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass6, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        byte[] byteArray1 = new byte[] {};
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.mockito.cglib.core.ReflectUtils.defineClass("java.beans.PropertyDescriptor[name=V]", byteArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type22 = signature21.getReturnType();
        java.lang.String str23 = signature21.getName();
        org.mockito.asm.Type type24 = signature21.getReturnType();
        boolean boolean25 = classInfo18.equals((java.lang.Object) type24);
        java.lang.String str26 = classInfo18.toString();
        org.mockito.asm.Type type27 = classInfo18.getSuperType();
        java.lang.String str28 = type27.getInternalName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.beans.PropertyDescriptor" + "'", str26, "java.beans.PropertyDescriptor");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java/beans/FeatureDescriptor" + "'", str28, "java/beans/FeatureDescriptor");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor5.getClass();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        java.lang.String str15 = signature11.getDescriptor();
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        int int19 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray16);
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        boolean boolean23 = signature11.equals((java.lang.Object) strArray22);
        java.lang.String str24 = signature11.getDescriptor();
        org.mockito.asm.Type type25 = signature11.getReturnType();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        int int30 = type29.getSort();
        int int32 = type29.getOpcode(3);
        java.lang.String str33 = type29.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        int int35 = type34.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        int int37 = type36.getSort();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str39 = type38.getClassName();
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type27, type29, type34, type36, type38 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type25, typeArray40);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray40);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("java.lang.Object", type1, typeArray40);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type48 = signature47.getReturnType();
        java.lang.Class<?> wildcardClass49 = signature47.getClass();
        boolean boolean50 = type1.equals((java.lang.Object) wildcardClass49);
        java.lang.Class[] classArray51 = new java.lang.Class[] {};
        int int52 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray51);
        int int53 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray51);
        int int54 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray51);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BYTE_TYPE;
        int int56 = type55.getSort();
        java.lang.Class<?> wildcardClass57 = type55.getClass();
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type61 = signature60.getReturnType();
        java.lang.Class<?> wildcardClass62 = signature60.getClass();
        java.lang.String str63 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass62);
        java.lang.Class[] classArray64 = new java.lang.Class[] { wildcardClass57, wildcardClass62 };
        java.lang.String[] strArray65 = org.mockito.cglib.core.ReflectUtils.getNames(classArray64);
        java.lang.String[] strArray66 = org.mockito.cglib.core.ReflectUtils.getNames(classArray64);
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type70 = signature69.getReturnType();
        java.lang.String str71 = signature69.getName();
        org.mockito.asm.Type type72 = signature69.getReturnType();
        java.lang.String str73 = signature69.getDescriptor();
        java.lang.Class[] classArray74 = new java.lang.Class[] {};
        int int75 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray74);
        int int76 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray74);
        int int77 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray74);
        java.lang.Class[] classArray78 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray74);
        java.lang.String[] strArray79 = org.mockito.cglib.core.ReflectUtils.getNames(classArray78);
        java.lang.String[] strArray80 = org.mockito.cglib.core.ReflectUtils.getNames(classArray78);
        boolean boolean81 = signature69.equals((java.lang.Object) strArray80);
        org.mockito.cglib.core.Signature signature84 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type85 = signature84.getReturnType();
        java.lang.Class<?> wildcardClass86 = signature84.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray87 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass86);
        java.lang.reflect.Method[] methodArray90 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray87, true, false);
        java.lang.reflect.Method[] methodArray91 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray80, methodArray90);
        java.lang.reflect.Method[] methodArray92 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray66, methodArray91);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj93 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass49, classArray51, (java.lang.Object[]) strArray66);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "B" + "'", str15, "B");
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "B" + "'", str24, "B");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "double" + "'", str28, "double");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "byte" + "'", str33, "byte");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "double" + "'", str39, "double");
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(DBBBD)V" + "'", str41, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(DBBBD)Ljava/beans/PropertyDescriptor;" + "'", str43, "(DBBBD)Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str63, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "B" + "'", str73, "B");
        org.junit.Assert.assertNotNull(classArray74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(classArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(type85);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(propertyDescriptorArray87);
        org.junit.Assert.assertNotNull(methodArray90);
        org.junit.Assert.assertNotNull(methodArray91);
        org.junit.Assert.assertNotNull(methodArray92);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        boolean boolean5 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setHidden(true);
        java.util.Enumeration<java.lang.String> strEnumeration8 = propertyDescriptor3.attributeNames();
        boolean boolean9 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strEnumeration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration5 = propertyDescriptor3.attributeNames();
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.beans.PropertyDescriptor[name=hi!]" + "'", str7, "java.beans.PropertyDescriptor[name=hi!]");
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method11 = null;
        propertyDescriptor3.setReadMethod(method11);
        propertyDescriptor3.setShortDescription("(DBBBD)V");
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("byte", "B");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getDescriptor();
        java.lang.String str5 = signature2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "byteB" + "'", str3, "byteB");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "B" + "'", str4, "B");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "byte" + "'", str5, "byte");
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method20 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str2 = type1.toString();
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("hi!", method4, method5);
        java.lang.String str7 = propertyDescriptor6.getShortDescription();
        java.lang.reflect.Method method8 = propertyDescriptor6.getWriteMethod();
        propertyDescriptor6.setValue("double", (java.lang.Object) ' ');
        boolean boolean12 = propertyDescriptor6.isExpert();
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("hi!", method15, method16);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        propertyDescriptor6.setValue("float", (java.lang.Object) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type25 = signature24.getReturnType();
        java.lang.String str26 = signature24.getName();
        org.mockito.asm.Type type27 = signature24.getReturnType();
        boolean boolean28 = classInfo21.equals((java.lang.Object) type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        int int30 = type29.getSort();
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("hi!", method32, method33);
        java.lang.String str35 = propertyDescriptor34.getShortDescription();
        java.lang.reflect.Method method36 = propertyDescriptor34.getWriteMethod();
        propertyDescriptor34.setValue("double", (java.lang.Object) ' ');
        boolean boolean40 = propertyDescriptor34.isExpert();
        java.lang.reflect.Method method43 = null;
        java.lang.reflect.Method method44 = null;
        java.beans.PropertyDescriptor propertyDescriptor45 = new java.beans.PropertyDescriptor("hi!", method43, method44);
        java.lang.Class<?> wildcardClass46 = propertyDescriptor45.getClass();
        java.lang.String str47 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass46);
        propertyDescriptor34.setValue("float", (java.lang.Object) wildcardClass46);
        org.mockito.cglib.core.ClassInfo classInfo49 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass46);
        int int50 = classInfo49.getModifiers();
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Method method53 = null;
        java.beans.PropertyDescriptor propertyDescriptor54 = new java.beans.PropertyDescriptor("hi!", method52, method53);
        java.lang.String str55 = propertyDescriptor54.getShortDescription();
        java.lang.reflect.Method method56 = propertyDescriptor54.getWriteMethod();
        propertyDescriptor54.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean60 = classInfo49.equals((java.lang.Object) propertyDescriptor54);
        int int61 = classInfo49.getModifiers();
        org.mockito.asm.Type[] typeArray62 = classInfo49.getInterfaces();
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray62);
        boolean boolean64 = type27.equals((java.lang.Object) typeArray62);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("(VBLhi!;SD)B", type1, typeArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(VBLhi!;SD)B' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "V" + "'", str2, "V");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java/beans/PropertyDescriptor" + "'", str19, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo21);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "java/beans/PropertyDescriptor" + "'", str47, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNull(method56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "()B" + "'", str63, "()B");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setShortDescription("float");
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        int int14 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        java.beans.PropertyEditor propertyEditor16 = propertyDescriptor3.createPropertyEditor((java.lang.Object) classArray12);
        propertyDescriptor3.setConstrained(true);
        boolean boolean19 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method20 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass21 = propertyDescriptor3.getPropertyType();
        boolean boolean22 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(propertyEditor16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("LbyteB;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        boolean boolean5 = propertyDescriptor3.isHidden();
        boolean boolean6 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str6, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "byteB");
        java.lang.String str3 = signature2.getDescriptor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "byteB" + "'", str3, "byteB");
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("D", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getName();
        java.lang.Object obj5 = null;
        boolean boolean6 = propertyDescriptor3.equals(obj5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "D" + "'", str4, "D");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("V");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=hi!; values={byte=0}]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration5 = propertyDescriptor3.attributeNames();
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getName();
        propertyDescriptor3.setDisplayName("byteB");
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor3.attributeNames();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration10);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method11 = null;
        propertyDescriptor3.setReadMethod(method11);
        propertyDescriptor3.setShortDescription("(DBBBD)V");
        java.lang.String str15 = propertyDescriptor3.getDisplayName();
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyDescriptor3.setValue("F", obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        boolean boolean5 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.String str13 = propertyDescriptor12.getShortDescription();
        java.lang.reflect.Method method14 = propertyDescriptor12.getWriteMethod();
        propertyDescriptor12.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor12.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor3.setValue("byte", (java.lang.Object) propertyDescriptor12);
        java.lang.Class<?> wildcardClass21 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(type22);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        java.lang.String str5 = propertyDescriptor4.getShortDescription();
        java.lang.reflect.Method method6 = propertyDescriptor4.getWriteMethod();
        propertyDescriptor4.setValue("double", (java.lang.Object) ' ');
        boolean boolean10 = propertyDescriptor4.isExpert();
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.lang.Class<?> wildcardClass16 = propertyDescriptor15.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        propertyDescriptor4.setValue("float", (java.lang.Object) wildcardClass16);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type21 = classInfo20.getType();
        int int22 = classInfo20.getModifiers();
        org.mockito.asm.Type[] typeArray23 = classInfo20.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) typeArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java/beans/PropertyDescriptor" + "'", str17, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(classInfo20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(typeArray23);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=hi!; preferred; propertyEditorClass=class org.mockito.asm.Type]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class9 = org.mockito.cglib.core.ReflectUtils.defineClass("(DBBBD)B", byteArray7, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 100, -1, -1]");
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.lang.Class class0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        java.lang.String str5 = propertyDescriptor4.getShortDescription();
        java.lang.reflect.Method method6 = propertyDescriptor4.getWriteMethod();
        java.lang.String str7 = propertyDescriptor4.getShortDescription();
        propertyDescriptor4.setValue("byte", (java.lang.Object) (byte) 0);
        java.util.Enumeration<java.lang.String> strEnumeration11 = propertyDescriptor4.attributeNames();
        java.lang.reflect.Method method12 = null;
        propertyDescriptor4.setReadMethod(method12);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("hi!", method15, method16);
        java.lang.String str18 = propertyDescriptor17.getShortDescription();
        java.lang.reflect.Method method19 = propertyDescriptor17.getWriteMethod();
        java.lang.String str20 = propertyDescriptor17.getShortDescription();
        propertyDescriptor17.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor17.setConstrained(false);
        propertyDescriptor17.setHidden(false);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        java.lang.String str32 = propertyDescriptor31.getShortDescription();
        java.lang.reflect.Method method33 = propertyDescriptor31.getWriteMethod();
        java.lang.String str34 = propertyDescriptor31.getShortDescription();
        boolean boolean35 = propertyDescriptor31.isPreferred();
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type40 = signature39.getReturnType();
        java.lang.String str41 = signature39.getName();
        org.mockito.asm.Type type42 = signature39.getReturnType();
        propertyDescriptor31.setValue("B", (java.lang.Object) type42);
        java.lang.reflect.Method method44 = propertyDescriptor31.getReadMethod();
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = new java.beans.PropertyDescriptor[] { propertyDescriptor4, propertyDescriptor17, propertyDescriptor31 };
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray45, false, false);
        java.lang.Class[] classArray49 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor50 = org.mockito.cglib.core.ReflectUtils.getConstructor(class0, classArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNull(method44);
        org.junit.Assert.assertNotNull(propertyDescriptorArray45);
        org.junit.Assert.assertNotNull(methodArray48);
        org.junit.Assert.assertNotNull(classArray49);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.beans.PropertyEditor propertyEditor9 = propertyDescriptor3.createPropertyEditor((java.lang.Object) 10);
        propertyDescriptor3.setPreferred(false);
        propertyDescriptor3.setPreferred(false);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("byteB", method15, method16);
        java.lang.Object obj19 = propertyDescriptor17.getValue("byteB");
        boolean boolean20 = propertyDescriptor3.equals((java.lang.Object) propertyDescriptor17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(propertyEditor9);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=hi!; values={double= ; float=class java.beans.PropertyDescriptor}]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setExpert(true);
        propertyDescriptor3.setExpert(false);
        java.lang.String str9 = propertyDescriptor3.getName();
        java.lang.String str10 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.beans.PropertyDescriptor[name=hi!]" + "'", str10, "java.beans.PropertyDescriptor[name=hi!]");
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass9 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type13 = signature12.getReturnType();
        java.lang.Class<?> wildcardClass14 = signature12.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("hi!", method16, method17);
        java.lang.Class<?> wildcardClass19 = propertyDescriptor18.getClass();
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type23 = signature22.getReturnType();
        java.lang.Class<?> wildcardClass24 = signature22.getClass();
        java.lang.Class[] classArray25 = new java.lang.Class[] { wildcardClass14, wildcardClass19, wildcardClass24 };
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray25);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor28 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass9, classArray25);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(org.mockito.cglib.core.Signature, java.beans.PropertyDescriptor, org.mockito.cglib.core.Signature)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int19 = classInfo18.getModifiers();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean29 = classInfo18.equals((java.lang.Object) propertyDescriptor23);
        boolean boolean30 = propertyDescriptor23.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(DBBBD)B", method1, method2);
        propertyDescriptor3.setHidden(false);
        java.util.Enumeration<java.lang.String> strEnumeration6 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setExpert(true);
        propertyDescriptor3.setConstrained(true);
        org.junit.Assert.assertNotNull(strEnumeration6);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type5 = signature4.getReturnType();
        java.lang.Class<?> wildcardClass6 = signature4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type9 = classInfo8.getSuperType();
        java.lang.String str10 = type9.getInternalName();
        java.lang.String str11 = type9.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getReturnType("Lhi!;");
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type24 = signature23.getReturnType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        int int29 = type28.getSort();
        int int31 = type28.getOpcode(3);
        java.lang.String str32 = type28.getClassName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        int int34 = type33.getSort();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        int int36 = type35.getSort();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str38 = type37.getClassName();
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type26, type28, type33, type35, type37 };
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BYTE_TYPE;
        int int42 = type41.getSize();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str45 = type44.getDescriptor();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str48 = type47.getClassName();
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type25, type41, type44, type46, type47 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str53 = type52.getClassName();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BYTE_TYPE;
        int int55 = type54.getSort();
        int int57 = type54.getOpcode(3);
        java.lang.String str58 = type54.getClassName();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BYTE_TYPE;
        int int60 = type59.getSort();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BYTE_TYPE;
        int int62 = type61.getSort();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str64 = type63.getClassName();
        org.mockito.asm.Type[] typeArray65 = new org.mockito.asm.Type[] { type52, type54, type59, type61, type63 };
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray65);
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray65);
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray65);
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type17, typeArray65);
        org.mockito.cglib.core.Signature signature70 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray65);
        org.mockito.cglib.core.Signature signature71 = new org.mockito.cglib.core.Signature("F", type9, typeArray65);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj72 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) typeArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(classInfo8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java/lang/Object" + "'", str10, "java/lang/Object");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.Object" + "'", str11, "java.lang.Object");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Lhi!;" + "'", str20, "Lhi!;");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "double" + "'", str27, "double");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "byte" + "'", str32, "byte");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "double" + "'", str38, "double");
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(DBBBD)V" + "'", str40, "(DBBBD)V");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Lhi!;" + "'", str45, "Lhi!;");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "double" + "'", str48, "double");
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(VBLhi!;SD)B" + "'", str50, "(VBLhi!;SD)B");
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "double" + "'", str53, "double");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "byte" + "'", str58, "byte");
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "double" + "'", str64, "double");
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "(DBBBD)V" + "'", str66, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(DBBBD)B" + "'", str67, "(DBBBD)B");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "(DBBBD)Lhi!;" + "'", str68, "(DBBBD)Lhi!;");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getDisplayName();
        java.lang.String str7 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setName("");
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.String str14 = propertyDescriptor13.getShortDescription();
        java.lang.reflect.Method method15 = propertyDescriptor13.getWriteMethod();
        java.lang.String str16 = propertyDescriptor13.getShortDescription();
        boolean boolean17 = propertyDescriptor13.isPreferred();
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type22 = signature21.getReturnType();
        java.lang.String str23 = signature21.getName();
        org.mockito.asm.Type type24 = signature21.getReturnType();
        propertyDescriptor13.setValue("B", (java.lang.Object) type24);
        java.lang.reflect.Method method26 = propertyDescriptor13.getReadMethod();
        boolean boolean27 = propertyDescriptor3.equals((java.lang.Object) propertyDescriptor13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(DBBBD)V");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("LbyteB;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str5, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str6, "Lorg/mockito/cglib/core/Signature;");
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.reflect.Method method8 = propertyDescriptor3.getWriteMethod();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        int int11 = type9.getOpcode((int) (short) 10);
        int int13 = type9.getOpcode((int) (short) -1);
        java.lang.String str14 = type9.toString();
        boolean boolean15 = propertyDescriptor3.equals((java.lang.Object) str14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "V" + "'", str14, "V");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setBound(false);
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getPropertyType();
        propertyDescriptor3.setExpert(false);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        int int12 = type11.getSort();
        java.lang.Class<?> wildcardClass13 = type11.getClass();
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type17 = signature16.getReturnType();
        java.lang.Class<?> wildcardClass18 = signature16.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        java.lang.Class[] classArray20 = new java.lang.Class[] { wildcardClass13, wildcardClass18 };
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.reflect.Method[] methodArray22 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray22);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type27 = signature26.getReturnType();
        java.lang.String str28 = signature26.getName();
        org.mockito.asm.Type type29 = signature26.getReturnType();
        java.lang.String str30 = signature26.getDescriptor();
        java.lang.Class[] classArray31 = new java.lang.Class[] {};
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        int int33 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        int int34 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        java.lang.Class[] classArray35 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray31);
        java.lang.String[] strArray36 = org.mockito.cglib.core.ReflectUtils.getNames(classArray35);
        java.lang.String[] strArray37 = org.mockito.cglib.core.ReflectUtils.getNames(classArray35);
        boolean boolean38 = signature26.equals((java.lang.Object) strArray37);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type42 = signature41.getReturnType();
        java.lang.Class<?> wildcardClass43 = signature41.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass43);
        java.lang.reflect.Method[] methodArray47 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray44, true, false);
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray47);
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray47);
        boolean boolean50 = propertyDescriptor3.equals((java.lang.Object) methodArray49);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str19, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "B" + "'", str30, "B");
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(propertyDescriptorArray44);
        org.junit.Assert.assertNotNull(methodArray47);
        org.junit.Assert.assertNotNull(methodArray48);
        org.junit.Assert.assertNotNull(methodArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        boolean boolean5 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.String str13 = propertyDescriptor12.getShortDescription();
        java.lang.reflect.Method method14 = propertyDescriptor12.getWriteMethod();
        propertyDescriptor12.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor12.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor3.setValue("byte", (java.lang.Object) propertyDescriptor12);
        java.lang.Class<?> wildcardClass21 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        java.util.List list23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list24 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass21, list23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(type22);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java/lang/Object");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        propertyDescriptor3.setValue("B", (java.lang.Object) type14);
        java.lang.reflect.Method method16 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setShortDescription("floatLLorg/mockito/cglib/core/Signature;;");
        boolean boolean19 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100 };
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = org.mockito.cglib.core.ReflectUtils.defineClass("void", byteArray3, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 100]");
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Ljava/beans/PropertyDescriptor;");
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.getInternalName();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str3, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.beans.PropertyDescriptor" + "'", str4, "java.beans.PropertyDescriptor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java/beans/PropertyDescriptor" + "'", str5, "java/beans/PropertyDescriptor");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 10, (byte) 10 };
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class8 = org.mockito.cglib.core.ReflectUtils.defineClass("", byteArray6, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 1, 10, 10]");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        propertyDescriptor3.setValue("B", (java.lang.Object) type14);
        propertyDescriptor3.setShortDescription("byte");
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        java.util.List list21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list22 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass18, list21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(classInfo20);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str2 = type1.getDescriptor();
        int int4 = type1.getOpcode((int) (short) 0);
        int int5 = type1.getSort();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        java.lang.String str10 = propertyDescriptor9.getShortDescription();
        java.lang.reflect.Method method11 = propertyDescriptor9.getWriteMethod();
        java.lang.String str12 = propertyDescriptor9.getShortDescription();
        boolean boolean13 = propertyDescriptor9.isPreferred();
        java.lang.reflect.Method method14 = null;
        propertyDescriptor9.setReadMethod(method14);
        java.lang.reflect.Method method16 = null;
        propertyDescriptor9.setReadMethod(method16);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor9.getPropertyEditorClass();
        boolean boolean19 = type1.equals((java.lang.Object) propertyDescriptor9);
        java.lang.reflect.Method method20 = propertyDescriptor9.getWriteMethod();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lhi!;" + "'", str2, "Lhi!;");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        propertyDescriptor3.setName("java.beans.PropertyDescriptor[name=hi!; values={byte=0}]");
        java.lang.Class<?> wildcardClass9 = propertyDescriptor3.getPropertyEditorClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("byteB", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("B");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.util.List list9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list10 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str8, "Lorg/mockito/cglib/core/Signature;");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        boolean boolean5 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.String str13 = propertyDescriptor12.getShortDescription();
        java.lang.reflect.Method method14 = propertyDescriptor12.getWriteMethod();
        propertyDescriptor12.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor12.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor3.setValue("byte", (java.lang.Object) propertyDescriptor12);
        java.lang.Class<?> wildcardClass21 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(propertyDescriptorArray23);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type18 = signature17.getReturnType();
        java.lang.Class<?> wildcardClass19 = signature17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass19);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray20, true, false);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        int int26 = type25.getSort();
        java.lang.Class<?> wildcardClass27 = type25.getClass();
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type31 = signature30.getReturnType();
        java.lang.Class<?> wildcardClass32 = signature30.getClass();
        java.lang.String str33 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass32);
        java.lang.Class[] classArray34 = new java.lang.Class[] { wildcardClass27, wildcardClass32 };
        java.lang.String[] strArray35 = org.mockito.cglib.core.ReflectUtils.getNames(classArray34);
        java.lang.reflect.Method[] methodArray36 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray35, methodArray36);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type41 = signature40.getReturnType();
        java.lang.String str42 = signature40.getName();
        org.mockito.asm.Type type43 = signature40.getReturnType();
        java.lang.String str44 = signature40.getDescriptor();
        java.lang.Class[] classArray45 = new java.lang.Class[] {};
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray45);
        int int47 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray45);
        int int48 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray45);
        java.lang.Class[] classArray49 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray45);
        java.lang.String[] strArray50 = org.mockito.cglib.core.ReflectUtils.getNames(classArray49);
        java.lang.String[] strArray51 = org.mockito.cglib.core.ReflectUtils.getNames(classArray49);
        boolean boolean52 = signature40.equals((java.lang.Object) strArray51);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type56 = signature55.getReturnType();
        java.lang.Class<?> wildcardClass57 = signature55.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass57);
        java.lang.reflect.Method[] methodArray61 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray58, true, false);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray51, methodArray61);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray35, methodArray61);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.BYTE_TYPE;
        int int65 = type64.getSort();
        java.lang.Class<?> wildcardClass66 = type64.getClass();
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type70 = signature69.getReturnType();
        java.lang.Class<?> wildcardClass71 = signature69.getClass();
        java.lang.String str72 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass71);
        java.lang.Class[] classArray73 = new java.lang.Class[] { wildcardClass66, wildcardClass71 };
        java.lang.String[] strArray74 = org.mockito.cglib.core.ReflectUtils.getNames(classArray73);
        java.lang.reflect.Method[] methodArray75 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray74, methodArray75);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray35, methodArray75);
        java.lang.reflect.Method method79 = null;
        java.lang.reflect.Method method80 = null;
        java.beans.PropertyDescriptor propertyDescriptor81 = new java.beans.PropertyDescriptor("hi!", method79, method80);
        java.lang.Class<?> wildcardClass82 = propertyDescriptor81.getClass();
        org.mockito.asm.Type type83 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass82);
        java.beans.PropertyDescriptor[] propertyDescriptorArray84 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass82);
        org.mockito.asm.Type type85 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass82);
        java.beans.PropertyDescriptor[] propertyDescriptorArray86 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass82);
        java.lang.reflect.Method[] methodArray89 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray86, true, false);
        java.lang.reflect.Method[] methodArray90 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray35, methodArray89);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray91 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "B" + "'", str6, "B");
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(methodArray24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str33, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(methodArray36);
        org.junit.Assert.assertNotNull(methodArray37);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "B" + "'", str44, "B");
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(propertyDescriptorArray58);
        org.junit.Assert.assertNotNull(methodArray61);
        org.junit.Assert.assertNotNull(methodArray62);
        org.junit.Assert.assertNotNull(methodArray63);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str72, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(methodArray75);
        org.junit.Assert.assertNotNull(methodArray76);
        org.junit.Assert.assertNotNull(methodArray77);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertNotNull(propertyDescriptorArray84);
        org.junit.Assert.assertNotNull(type85);
        org.junit.Assert.assertNotNull(propertyDescriptorArray86);
        org.junit.Assert.assertNotNull(methodArray89);
        org.junit.Assert.assertNotNull(methodArray90);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.beans.PropertyEditor propertyEditor9 = propertyDescriptor3.createPropertyEditor((java.lang.Object) 10);
        propertyDescriptor3.setPreferred(false);
        propertyDescriptor3.setDisplayName("java.beans.PropertyDescriptor[name=(DBBBD)B]");
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyDescriptor3.setValue("(DBBBD)Lava.beans.PropertyDescriptor[name=hi!;", obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(propertyEditor9);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(DBBBD)V", method1, method2);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        java.lang.String str8 = propertyDescriptor7.getDisplayName();
        boolean boolean9 = propertyDescriptor7.isHidden();
        java.lang.Class<?> wildcardClass10 = propertyDescriptor7.getClass();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass10);
        java.util.List list12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list13 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass10, list12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(propertyEditor11);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("V", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSort();
        int int8 = type5.getOpcode(3);
        java.lang.String str9 = type5.getClassName();
        java.lang.String str10 = type5.getClassName();
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        boolean boolean13 = type5.equals((java.lang.Object) classArray11);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        propertyDescriptor3.setValue("", (java.lang.Object) strArray14);
        java.lang.Object obj17 = propertyDescriptor3.getValue("float");
        java.lang.Object obj19 = propertyDescriptor3.getValue("Ljava/lang/Object;");
        java.lang.reflect.Method method20 = null;
        propertyDescriptor3.setWriteMethod(method20);
        java.lang.Object obj23 = propertyDescriptor3.getValue("(DBBBD)B");
        boolean boolean24 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "byte" + "'", str9, "byte");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "byte" + "'", str10, "byte");
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration5 = propertyDescriptor3.attributeNames();
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getName();
        boolean boolean8 = propertyDescriptor3.isHidden();
        boolean boolean9 = propertyDescriptor3.isPreferred();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setPreferred(true);
        boolean boolean13 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setPreferred(false);
        java.lang.String str16 = propertyDescriptor3.getDisplayName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("(VBLhi!;SD)B", classLoader1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.mockito.asm.Type type1 = null;
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        java.lang.String str6 = propertyDescriptor5.getShortDescription();
        java.lang.reflect.Method method7 = propertyDescriptor5.getWriteMethod();
        propertyDescriptor5.setValue("double", (java.lang.Object) ' ');
        boolean boolean11 = propertyDescriptor5.isExpert();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor16.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        propertyDescriptor5.setValue("float", (java.lang.Object) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type24 = signature23.getReturnType();
        java.lang.String str25 = signature23.getName();
        org.mockito.asm.Type type26 = signature23.getReturnType();
        boolean boolean27 = classInfo20.equals((java.lang.Object) type26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BYTE_TYPE;
        int int32 = type31.getSort();
        int int34 = type31.getOpcode(3);
        java.lang.String str35 = type31.getClassName();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        int int37 = type36.getSort();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        int int39 = type38.getSort();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type29, type31, type36, type38, type40 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray42);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray42);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("(DBBBD)B", type1, typeArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java/beans/PropertyDescriptor" + "'", str18, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo20);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "double" + "'", str30, "double");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "byte" + "'", str35, "byte");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "double" + "'", str41, "double");
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(DBBBD)V" + "'", str43, "(DBBBD)V");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(DBBBD)B" + "'", str44, "(DBBBD)B");
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        boolean boolean5 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setHidden(false);
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getClass();
        java.lang.String str9 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        java.util.List list10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list11 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass8, list10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str9, "Ljava/beans/PropertyDescriptor;");
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        boolean boolean18 = propertyDescriptor3.isPreferred();
        boolean boolean19 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("Lva/lang/Object;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("double", "java/beans/PropertyDescriptor");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "double" + "'", str3, "double");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "double" + "'", str4, "double");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "double" + "'", str5, "double");
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("Ljava/beans/PropertyDescriptor;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        java.lang.String str5 = propertyDescriptor4.getShortDescription();
        java.lang.reflect.Method method6 = propertyDescriptor4.getWriteMethod();
        java.lang.String str7 = propertyDescriptor4.getShortDescription();
        propertyDescriptor4.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor4.setShortDescription("float");
        propertyDescriptor4.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("hi!", method16, method17);
        java.lang.Class<?> wildcardClass19 = propertyDescriptor18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass19);
        java.beans.PropertyEditor propertyEditor23 = propertyDescriptor4.createPropertyEditor((java.lang.Object) propertyDescriptorArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) propertyDescriptorArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNull(propertyEditor23);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        byte[] byteArray1 = null;
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.mockito.cglib.core.ReflectUtils.defineClass("", byteArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class4 = org.mockito.cglib.core.ReflectUtils.defineClass("LbyteB;", byteArray2, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("double");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.reflect.Method method8 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method9 = propertyDescriptor3.getWriteMethod();
        java.lang.String str10 = propertyDescriptor3.getShortDescription();
        java.lang.String str11 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.beans.PropertyDescriptor[name=hi!]" + "'", str11, "java.beans.PropertyDescriptor[name=hi!]");
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        propertyDescriptor3.setPreferred(true);
        java.lang.String str10 = propertyDescriptor3.getShortDescription();
        java.lang.String str11 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; preferred]" + "'", str11, "java.beans.PropertyDescriptor[name=hi!; preferred]");
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("Ljava.beans.PropertyDescriptor[name=hi!; values={byte=0}];", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getClassName();
        boolean boolean6 = type1.equals((java.lang.Object) (short) -1);
        int int7 = type1.getDimensions();
        int int8 = type1.getSort();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lhi!;" + "'", str2, "Lhi!;");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("hi!byteB");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str7, "org/mockito/cglib/core/Signature");
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setShortDescription("float");
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.String str14 = propertyDescriptor3.getDisplayName();
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type18 = signature17.getReturnType();
        java.lang.Class<?> wildcardClass19 = signature17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass19);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray20, false, true);
        boolean boolean24 = propertyDescriptor3.equals((java.lang.Object) propertyDescriptorArray20);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.lang.String str16 = propertyDescriptor15.getShortDescription();
        java.lang.reflect.Method method17 = propertyDescriptor15.getWriteMethod();
        propertyDescriptor15.setBound(false);
        java.beans.PropertyEditor propertyEditor20 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor15);
        propertyDescriptor15.setShortDescription("java/beans/PropertyDescriptor");
        java.lang.reflect.Method method23 = null;
        propertyDescriptor15.setWriteMethod(method23);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(propertyEditor20);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("()Ljava/beans/PropertyDescriptor;", classLoader1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setName("double");
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setShortDescription("F");
        propertyDescriptor3.setShortDescription("(DBBBD)Lhi!;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        boolean boolean5 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setHidden(false);
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getClass();
        java.lang.String str9 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        int int12 = type11.getSort();
        java.lang.Class<?> wildcardClass13 = type11.getClass();
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type17 = signature16.getReturnType();
        java.lang.Class<?> wildcardClass18 = signature16.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        java.lang.Class[] classArray20 = new java.lang.Class[] { wildcardClass13, wildcardClass18 };
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor24 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass8, classArray20);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(org.mockito.asm.Type, org.mockito.cglib.core.Signature)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str9, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(classInfo10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str19, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(classArray23);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        int int21 = type20.getSort();
        int int23 = type20.getOpcode(3);
        java.lang.String str24 = type20.getClassName();
        java.lang.String str25 = type20.getClassName();
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray26);
        boolean boolean28 = type20.equals((java.lang.Object) classArray26);
        java.lang.String[] strArray29 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray26);
        int int31 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor32 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass15, classArray26);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "byte" + "'", str24, "byte");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "byte" + "'", str25, "byte");
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
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
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int19 = classInfo18.getModifiers();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean29 = classInfo18.equals((java.lang.Object) propertyDescriptor23);
        propertyDescriptor23.setHidden(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java/beans/PropertyDescriptor" + "'", str16, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L(DBBBD)V;");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method10 = null;
        propertyDescriptor3.setReadMethod(method10);
        java.lang.Object obj13 = propertyDescriptor3.getValue("java/beans/PropertyDescriptor");
        java.lang.Class<?> wildcardClass14 = propertyDescriptor3.getPropertyEditorClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(wildcardClass14);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lva/lang/Object;", "");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        java.lang.String str5 = propertyDescriptor4.getShortDescription();
        java.lang.reflect.Method method6 = propertyDescriptor4.getWriteMethod();
        java.lang.String str7 = propertyDescriptor4.getShortDescription();
        boolean boolean8 = propertyDescriptor4.isPreferred();
        boolean boolean9 = propertyDescriptor4.isExpert();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type13 = signature12.getReturnType();
        java.lang.Class<?> wildcardClass14 = signature12.getClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("hi!", method16, method17);
        java.lang.Class<?> wildcardClass19 = propertyDescriptor18.getClass();
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type23 = signature22.getReturnType();
        java.lang.Class<?> wildcardClass24 = signature22.getClass();
        java.lang.Class[] classArray25 = new java.lang.Class[] { wildcardClass14, wildcardClass19, wildcardClass24 };
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray25);
        java.beans.PropertyEditor propertyEditor27 = propertyDescriptor4.createPropertyEditor((java.lang.Object) classArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) classArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(propertyEditor27);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=V]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "LLorg/mockito/cglib/core/Signature;;");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("void");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.lang.Object", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }
}

