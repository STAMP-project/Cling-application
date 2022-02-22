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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(JJV)J", "(JJV)J");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JJV)J' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        int int0 = org.mockito.asm.Type.INT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
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
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
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
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        int int0 = org.mockito.asm.Type.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(JJV)J", "J");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JJV)J' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
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
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.mockito.cglib.core.AbstractClassGenerator abstractClassGenerator0 = org.mockito.cglib.core.AbstractClassGenerator.getCurrent();
        org.junit.Assert.assertNull(abstractClassGenerator0);
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
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
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
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        int int0 = org.mockito.asm.Type.OBJECT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        int int0 = org.mockito.asm.Type.BYTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        int int0 = org.mockito.asm.Type.VOID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.lang.Class class0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor8 = org.mockito.cglib.core.ReflectUtils.getConstructor(class0, classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(JJV)J" + "'", str6, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray7);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
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
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        int int0 = org.mockito.asm.Type.BOOLEAN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
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
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        java.lang.Class class0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray5);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.mockito.cglib.core.ReflectUtils.newInstance(class0, classArray7, (java.lang.Object[]) methodArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(JJV)J" + "'", str6, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(methodArray13);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
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
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
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
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        int int0 = org.mockito.asm.Type.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
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
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        int int0 = org.mockito.asm.Type.ARRAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("(JJV)J", classLoader1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int0 = org.mockito.asm.Type.CHAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
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
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("(JJV)J");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
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
            java.lang.String str1 = org.mockito.asm.Type.getInternalName(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
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
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(JJV)J", "V");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JJV)J' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray5);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(JJV)J" + "'", str6, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
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
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        boolean boolean4 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str3 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J" + "'", str3, "J");
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10 };
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class7 = org.mockito.cglib.core.ReflectUtils.defineClass("hi!", byteArray5, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 10]");
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
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
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
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
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str3 = signature2.getName();
        boolean boolean5 = signature2.equals((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray6 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J" + "'", str3, "J");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        int int0 = org.mockito.asm.Type.DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setWriteMethod(method4);
        boolean boolean6 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
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
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
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
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class4 = org.mockito.cglib.core.ReflectUtils.defineClass("", byteArray2, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        boolean boolean17 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        int int0 = org.mockito.asm.Type.FLOAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S" + "'", str1, "S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
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
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
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
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray12);
        int int15 = type7.getSort();
        propertyDescriptor5.setValue("V", (java.lang.Object) type7);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor5.getPropertyEditorClass();
        propertyDescriptor5.setValue("V", (java.lang.Object) 9);
        boolean boolean21 = type1.equals((java.lang.Object) propertyDescriptor5);
        boolean boolean22 = propertyDescriptor5.isConstrained();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(JJV)J" + "'", str13, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(JJV)J" + "'", str14, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        java.lang.reflect.Constructor constructor0 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray1 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray1, true, false);
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray1);
        org.junit.Assert.assertNotNull(methodArray4);
        org.junit.Assert.assertNotNull(classArray5);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
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
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type15 = type5.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("S");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("S");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
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
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        java.lang.Class class0 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray5 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray2, true, false);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod(class0, "S", classArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: S");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(methodArray5);
        org.junit.Assert.assertNotNull(classArray6);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("Llong;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
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
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setHidden(false);
        java.lang.String str7 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.beans.PropertyDescriptor[name=hi!]" + "'", str7, "java.beans.PropertyDescriptor[name=hi!]");
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str3 = signature2.getDescriptor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.lang.Class class0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray5);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type11, type12, type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray14);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray14);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.mockito.cglib.core.ReflectUtils.newInstance(class0, classArray7, (java.lang.Object[]) strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(JJV)J" + "'", str6, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(JJV)J" + "'", str15, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100 };
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class7 = org.mockito.cglib.core.ReflectUtils.defineClass("hi!", byteArray5, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100]");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        java.lang.Class class0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray5);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor10 = org.mockito.cglib.core.ReflectUtils.getConstructor(class0, classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(JJV)J" + "'", str6, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(classArray9);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        propertyDescriptor3.setHidden(false);
        boolean boolean23 = propertyDescriptor3.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
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
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.lang.Class class0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray5);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor11 = org.mockito.cglib.core.ReflectUtils.getConstructor(class0, classArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(JJV)J" + "'", str6, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(classArray10);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method20 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass17, "J", classArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: J");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray19);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type20, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray23);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray23);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method28 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass17, "java.beans.PropertyDescriptor[name=hi!]", classArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: java.beans.PropertyDescriptor[name=hi!]");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(JJV)J" + "'", str24, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(classArray27);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        java.util.List list18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list19 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass17, list18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(JJV)V", "SS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JJV)V' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray18, true, false);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray18, true, true);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor26 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass17, classArray25);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertNotNull(methodArray24);
        org.junit.Assert.assertNotNull(classArray25);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.util.List list19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list20 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass17, list19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method5 = null;
        propertyDescriptor3.setReadMethod(method5);
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        java.util.Enumeration<java.lang.String> strEnumeration11 = propertyDescriptor10.attributeNames();
        propertyDescriptor10.setHidden(false);
        java.beans.PropertyEditor propertyEditor14 = propertyDescriptor3.createPropertyEditor((java.lang.Object) false);
        boolean boolean15 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNotNull(strEnumeration11);
        org.junit.Assert.assertNull(propertyEditor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type20, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray23);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray23);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor29 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass17, classArray28);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(java.lang.String, java.lang.String, java.lang.String)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(JJV)J" + "'", str24, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(classArray28);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("V");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method19 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("V");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray12);
        int int15 = type7.getSort();
        propertyDescriptor5.setValue("V", (java.lang.Object) type7);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor5.getPropertyEditorClass();
        propertyDescriptor5.setValue("V", (java.lang.Object) 9);
        boolean boolean21 = type1.equals((java.lang.Object) propertyDescriptor5);
        propertyDescriptor5.setName("long");
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str26 = type25.getInternalName();
        java.beans.PropertyEditor propertyEditor27 = propertyDescriptor5.createPropertyEditor((java.lang.Object) str26);
        boolean boolean28 = propertyDescriptor5.isBound();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(JJV)J" + "'", str13, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(JJV)J" + "'", str14, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(propertyEditor27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
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
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type5, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray8);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray10);
        boolean boolean13 = signature2.equals((java.lang.Object) classArray12);
        java.lang.String str14 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type15 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J" + "'", str3, "J");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(JJV)J" + "'", str9, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "J" + "'", str14, "J");
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type0.getOpcode(1);
        java.lang.String str3 = type0.getClassName();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "long" + "'", str3, "long");
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
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
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1 };
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = org.mockito.cglib.core.ReflectUtils.defineClass("long", byteArray3, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1]");
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        boolean boolean17 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setShortDescription("");
        propertyDescriptor3.setExpert(false);
        java.lang.String str24 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; shortDescription=; values={V=J}; bound]" + "'", str24, "java.beans.PropertyDescriptor[name=hi!; shortDescription=; values={V=J}; bound]");
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("(JJV)J", method20, method21);
        propertyDescriptor22.setShortDescription("J");
        propertyDescriptor3.setValue("(JJV)J", (java.lang.Object) "J");
        java.lang.String str26 = propertyDescriptor3.getName();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        java.lang.String str18 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setHidden(true);
        java.lang.reflect.Method method21 = propertyDescriptor3.getWriteMethod();
        boolean boolean22 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray20, true, false);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray20, true, true);
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "Llong;", "(JJV)J" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray31, true, false);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray27, (java.lang.Object[]) strArray30);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str19, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(methodArray26);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(propertyDescriptorArray31);
        org.junit.Assert.assertNotNull(methodArray34);
        org.junit.Assert.assertNotNull(methodArray35);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Jhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(JJV)J", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type14, type15, type16 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray17);
        int int20 = type12.getSort();
        propertyDescriptor10.setValue("V", (java.lang.Object) type12);
        java.lang.reflect.Method method22 = propertyDescriptor10.getReadMethod();
        java.lang.Class<?> wildcardClass23 = propertyDescriptor10.getPropertyEditorClass();
        java.lang.String str24 = propertyDescriptor10.getShortDescription();
        java.lang.String str25 = propertyDescriptor10.getDisplayName();
        propertyDescriptor10.setHidden(true);
        boolean boolean28 = propertyDescriptor3.equals((java.lang.Object) propertyDescriptor10);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(JJV)J" + "'", str18, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(JJV)J" + "'", str19, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        java.lang.String str8 = type0.getDescriptor();
        int int10 = type0.getOpcode((int) ' ');
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(JJV)J" + "'", str6, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(JJV)J" + "'", str7, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "J" + "'", str8, "J");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        boolean boolean17 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setShortDescription("");
        propertyDescriptor3.setExpert(false);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        int int26 = type24.getOpcode((int) '4');
        int int27 = type24.getSize();
        boolean boolean28 = propertyDescriptor3.equals((java.lang.Object) type24);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 53 + "'", int26 == 53);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("long");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setDisplayName("V");
        boolean boolean20 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        java.lang.String str18 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setHidden(true);
        boolean boolean22 = propertyDescriptor3.equals((java.lang.Object) 33);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
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
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str3 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J" + "'", str3, "J");
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method20 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(classInfo19);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str25 = signature24.getName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type27, type28, type29 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray30);
        java.lang.String[] strArray33 = org.mockito.cglib.core.ReflectUtils.getNames(classArray32);
        java.lang.Class[] classArray34 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray32);
        boolean boolean35 = signature24.equals((java.lang.Object) classArray34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor36 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass17, classArray34);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(java.lang.Class, java.lang.Class, java.lang.Class)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str21, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "J" + "'", str25, "J");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(JJV)J" + "'", str31, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("S");
        int int2 = type1.getSort();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = type1.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("Ljava/beans/PropertyDescriptor;");
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
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.lang.String str22 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method23 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str21, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str22, "Ljava/beans/PropertyDescriptor;");
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("Llong;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        propertyDescriptor7.setConstrained(true);
        boolean boolean10 = type0.equals((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = type0.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "S" + "'", str3, "S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type9, type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray11);
        int int14 = type6.getSort();
        propertyDescriptor4.setValue("V", (java.lang.Object) type6);
        java.lang.reflect.Method method16 = propertyDescriptor4.getReadMethod();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor4.getPropertyEditorClass();
        java.lang.String str18 = propertyDescriptor4.getShortDescription();
        java.lang.String str19 = propertyDescriptor4.getDisplayName();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.reflect.Method method24 = null;
        propertyDescriptor23.setWriteMethod(method24);
        propertyDescriptor23.setBound(false);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        java.util.Enumeration<java.lang.String> strEnumeration32 = propertyDescriptor31.attributeNames();
        java.lang.reflect.Method method33 = null;
        propertyDescriptor31.setReadMethod(method33);
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("hi!", method36, method37);
        java.util.Enumeration<java.lang.String> strEnumeration39 = propertyDescriptor38.attributeNames();
        propertyDescriptor38.setHidden(false);
        java.beans.PropertyEditor propertyEditor42 = propertyDescriptor31.createPropertyEditor((java.lang.Object) false);
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("hi!", method44, method45);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type50, type51, type52 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type49, typeArray53);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray53);
        int int56 = type48.getSort();
        propertyDescriptor46.setValue("V", (java.lang.Object) type48);
        java.lang.reflect.Method method58 = propertyDescriptor46.getReadMethod();
        propertyDescriptor46.setExpert(false);
        propertyDescriptor46.setName("hi!");
        propertyDescriptor46.setHidden(false);
        java.lang.reflect.Method method65 = propertyDescriptor46.getReadMethod();
        propertyDescriptor46.setPreferred(false);
        java.lang.reflect.Method method69 = null;
        java.lang.reflect.Method method70 = null;
        java.beans.PropertyDescriptor propertyDescriptor71 = new java.beans.PropertyDescriptor("hi!", method69, method70);
        org.mockito.asm.Type type73 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type74 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type75 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type76 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type77 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray78 = new org.mockito.asm.Type[] { type75, type76, type77 };
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type74, typeArray78);
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type73, typeArray78);
        int int81 = type73.getSort();
        propertyDescriptor71.setValue("V", (java.lang.Object) type73);
        java.lang.Class<?> wildcardClass83 = propertyDescriptor71.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass84 = propertyDescriptor71.getPropertyType();
        java.beans.PropertyDescriptor[] propertyDescriptorArray85 = new java.beans.PropertyDescriptor[] { propertyDescriptor4, propertyDescriptor23, propertyDescriptor31, propertyDescriptor46, propertyDescriptor71 };
        java.lang.reflect.Method[] methodArray88 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray85, false, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj89 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) propertyDescriptorArray85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(JJV)J" + "'", str13, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strEnumeration32);
        org.junit.Assert.assertNotNull(strEnumeration39);
        org.junit.Assert.assertNull(propertyEditor42);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "(JJV)J" + "'", str54, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(JJV)J" + "'", str55, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 7 + "'", int56 == 7);
        org.junit.Assert.assertNull(method58);
        org.junit.Assert.assertNull(method65);
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertNotNull(type75);
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "(JJV)J" + "'", str79, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "(JJV)J" + "'", str80, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 7 + "'", int81 == 7);
        org.junit.Assert.assertNull(wildcardClass83);
        org.junit.Assert.assertNull(wildcardClass84);
        org.junit.Assert.assertNotNull(propertyDescriptorArray85);
        org.junit.Assert.assertNotNull(methodArray88);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Ljava/beans/PropertyDescriptor;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 31");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        byte[] byteArray1 = new byte[] {};
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.mockito.cglib.core.ReflectUtils.defineClass("LS;", byteArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(JJV)J", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.lang.Object obj8 = propertyDescriptor3.getValue("Llong;");
        boolean boolean9 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.mockito.asm.Type type0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        int int4 = type2.getOpcode(1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type9, type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", type2, typeArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "V" + "'", str6, "V");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(JJV)V" + "'", str13, "(JJV)V");
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setHidden(false);
        boolean boolean7 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(JJV)J", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.lang.Object obj8 = propertyDescriptor3.getValue("Llong;");
        boolean boolean9 = propertyDescriptor3.isHidden();
        boolean boolean10 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        java.lang.Object obj21 = propertyDescriptor3.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor3.attributeNames();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        int int27 = type24.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type30, type31, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray33);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("S", type24, typeArray33);
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature36);
        java.lang.Class<?> wildcardClass38 = propertyDescriptor3.getClass();
        java.util.List list39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list40 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass38, list39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strEnumeration22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "J" + "'", str25, "J");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JJV)J" + "'", str34, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(JJV)J" + "'", str35, "(JJV)J");
        org.junit.Assert.assertNull(propertyEditor37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray4);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.reflect.Method[] methodArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(JJV)J" + "'", str5, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 1 };
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class8 = org.mockito.cglib.core.ReflectUtils.defineClass("(JJV)V", byteArray6, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 10, -1, 1]");
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        boolean boolean17 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setShortDescription("");
        java.lang.reflect.Method method22 = null;
        propertyDescriptor3.setReadMethod(method22);
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("hi!", method25, method26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type31, type32, type33 };
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray34);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray34);
        int int37 = type29.getSort();
        propertyDescriptor27.setValue("V", (java.lang.Object) type29);
        java.lang.reflect.Method method39 = propertyDescriptor27.getReadMethod();
        propertyDescriptor27.setExpert(false);
        propertyDescriptor27.setName("hi!");
        propertyDescriptor27.setHidden(false);
        java.lang.reflect.Method method46 = propertyDescriptor27.getReadMethod();
        propertyDescriptor27.setPreferred(false);
        propertyDescriptor27.setName("J");
        propertyDescriptor27.setDisplayName("LS;");
        boolean boolean53 = propertyDescriptor27.isPreferred();
        boolean boolean54 = propertyDescriptor3.equals((java.lang.Object) propertyDescriptor27);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(JJV)J" + "'", str35, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(JJV)J" + "'", str36, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 7 + "'", int37 == 7);
        org.junit.Assert.assertNull(method39);
        org.junit.Assert.assertNull(method46);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Object obj5 = propertyDescriptor3.getValue("Lhi!;");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
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
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.lang.String str22 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str21, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str22, "Ljava/beans/PropertyDescriptor;");
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("SS");
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
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        boolean boolean17 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setDisplayName("java/beans/PropertyDescriptor");
        java.lang.String str22 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; displayName=java/beans/PropertyDescriptor; values={V=J}; bound]" + "'", str22, "java.beans.PropertyDescriptor[name=hi!; displayName=java/beans/PropertyDescriptor; values={V=J}; bound]");
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        java.lang.reflect.Method method17 = null;
        propertyDescriptor3.setReadMethod(method17);
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("Llong;", method20, method21);
        propertyDescriptor22.setName("S");
        boolean boolean25 = propertyDescriptor3.equals((java.lang.Object) "S");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setShortDescription("java/beans/PropertyDescriptor");
        boolean boolean9 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("Llong;", method1, method2);
        propertyDescriptor3.setConstrained(false);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        int int10 = type8.getOpcode((int) (byte) 10);
        java.lang.String str11 = type8.toString();
        int int12 = type8.getSize();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        int int15 = type13.getOpcode((int) '4');
        java.lang.String str16 = type13.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type19, type20, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray22);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray22);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray22);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type8, typeArray22);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) "");
        boolean boolean28 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "S" + "'", str11, "S");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "J" + "'", str16, "J");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(JJV)J" + "'", str23, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(JJV)J" + "'", str24, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(JJV)J" + "'", str25, "(JJV)J");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.util.List list22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list23 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass17, list22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("J");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        java.lang.Object obj21 = propertyDescriptor3.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor3.attributeNames();
        java.util.Enumeration<java.lang.String> strEnumeration23 = propertyDescriptor3.attributeNames();
        boolean boolean24 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strEnumeration22);
        org.junit.Assert.assertNotNull(strEnumeration23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        java.lang.reflect.Constructor constructor0 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray1 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray1, true, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) propertyDescriptorArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray1);
        org.junit.Assert.assertNotNull(methodArray4);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=hi!; displayName=java/beans/PropertyDescriptor; values={V=J}; bound]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type24, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray26);
        java.lang.String[] strArray29 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        java.lang.Class[] classArray30 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type32, type33, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray35);
        java.lang.Class[] classArray37 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray35);
        java.lang.String[] strArray38 = org.mockito.cglib.core.ReflectUtils.getNames(classArray37);
        java.lang.String[] strArray39 = org.mockito.cglib.core.ReflectUtils.getNames(classArray37);
        java.lang.String[] strArray40 = org.mockito.cglib.core.ReflectUtils.getNames(classArray37);
        int int41 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray28, (java.lang.Object[]) classArray37);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(org.mockito.asm.Type, org.mockito.asm.Type, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java/beans/PropertyDescriptor" + "'", str21, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(JJV)J" + "'", str27, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(JJV)J" + "'", str36, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("Lhi!;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class6 = org.mockito.cglib.core.ReflectUtils.defineClass("", byteArray4, classLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -1]");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 100 };
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class7 = org.mockito.cglib.core.ReflectUtils.defineClass("Jhi!", byteArray5, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 10, 100]");
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type22, type23, type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray25);
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray25);
        java.lang.String[] strArray28 = org.mockito.cglib.core.ReflectUtils.getNames(classArray27);
        java.lang.String[] strArray29 = org.mockito.cglib.core.ReflectUtils.getNames(classArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method30 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass17, "", classArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: ");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str19, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(JJV)J" + "'", str26, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        propertyDescriptor7.setConstrained(true);
        boolean boolean10 = type0.equals((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = type0.getInternalName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "S" + "'", str3, "S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        java.lang.String str18 = propertyDescriptor3.getDisplayName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        int int21 = type19.getOpcode((int) '4');
        java.lang.String str22 = type19.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type25, type26, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray28);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray28);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray28);
        boolean boolean32 = propertyDescriptor3.equals((java.lang.Object) typeArray28);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 53 + "'", int21 == 53);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "J" + "'", str22, "J");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(JJV)J" + "'", str29, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(JJV)J" + "'", str30, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(JJV)J" + "'", str31, "(JJV)J");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setConstrained(true);
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method8 = null;
        propertyDescriptor3.setReadMethod(method8);
        java.lang.Object obj11 = propertyDescriptor3.getValue("LS;");
        java.lang.String[] strArray16 = new java.lang.String[] { "V", "hi!", "hi!", "Llong;" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray17, true, false);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray17, true, true);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray23);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray23);
        boolean boolean26 = propertyDescriptor3.equals((java.lang.Object) methodArray25);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("Ljava/beans/PropertyDescriptor;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("Llong;", method1, method2);
        boolean boolean4 = propertyDescriptor3.isExpert();
        java.lang.String str5 = propertyDescriptor3.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.beans.PropertyDescriptor[name=Llong;]" + "'", str5, "java.beans.PropertyDescriptor[name=Llong;]");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setBound(true);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("Jhi!", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray4);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] { method10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(JJV)J" + "'", str5, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(methodArray11);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class9 = org.mockito.cglib.core.ReflectUtils.defineClass("Lhi!;", byteArray7, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 1, 100, 1, -1]");
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("short");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class9 = org.mockito.cglib.core.ReflectUtils.defineClass("(JJV)V", byteArray7, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 1, 0, 10]");
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        java.lang.Object obj21 = propertyDescriptor3.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor3.attributeNames();
        boolean boolean23 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strEnumeration22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method5 = null;
        propertyDescriptor3.setReadMethod(method5);
        propertyDescriptor3.setExpert(true);
        boolean boolean9 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class7 = org.mockito.cglib.core.ReflectUtils.defineClass("long", byteArray5, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100, -1, 1]");
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method18 = null;
        propertyDescriptor3.setWriteMethod(method18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        int int22 = type20.getOpcode((int) (byte) 10);
        java.lang.String str23 = type20.toString();
        java.beans.PropertyEditor propertyEditor24 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type20);
        java.lang.String str25 = propertyDescriptor3.getName();
        propertyDescriptor3.setExpert(true);
        java.lang.Object obj29 = propertyDescriptor3.getValue("(JJV)V");
        boolean boolean30 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "S" + "'", str23, "S");
        org.junit.Assert.assertNull(propertyEditor24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("()J", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method20 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 100 };
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class9 = org.mockito.cglib.core.ReflectUtils.defineClass("S", byteArray7, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 10, 0, -1, 100]");
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
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
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.lang.String str20 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.util.List list21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list22 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass17, list21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str20, "Ljava/beans/PropertyDescriptor;");
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type0.getOpcode(1);
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("hi!", method4, method5);
        java.lang.reflect.Method method7 = null;
        propertyDescriptor6.setWriteMethod(method7);
        java.lang.Class<?> wildcardClass9 = propertyDescriptor6.getPropertyEditorClass();
        propertyDescriptor6.setPreferred(false);
        boolean boolean12 = type0.equals((java.lang.Object) propertyDescriptor6);
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        java.lang.String str17 = propertyDescriptor16.getDisplayName();
        propertyDescriptor16.setShortDescription("SS");
        boolean boolean20 = propertyDescriptor16.isPreferred();
        propertyDescriptor16.setHidden(false);
        boolean boolean23 = propertyDescriptor6.equals((java.lang.Object) false);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("Ljava/beans/PropertyDescriptor;");
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
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method5 = null;
        propertyDescriptor3.setReadMethod(method5);
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        java.util.Enumeration<java.lang.String> strEnumeration11 = propertyDescriptor10.attributeNames();
        propertyDescriptor10.setHidden(false);
        java.beans.PropertyEditor propertyEditor14 = propertyDescriptor3.createPropertyEditor((java.lang.Object) false);
        boolean boolean15 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNotNull(strEnumeration11);
        org.junit.Assert.assertNull(propertyEditor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setDisplayName("V");
        propertyDescriptor3.setConstrained(false);
        java.lang.Object obj23 = null;
        // The following exception was thrown during execution in test generation
        try {
            propertyDescriptor3.setValue("J", obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean4 = signature2.equals((java.lang.Object) true);
        java.lang.String str5 = signature2.getDescriptor();
        java.lang.String str6 = signature2.getName();
        java.lang.String str7 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray8 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "J" + "'", str6, "J");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Jhi!" + "'", str7, "Jhi!");
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray12);
        int int15 = type7.getSort();
        propertyDescriptor5.setValue("V", (java.lang.Object) type7);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor5.getPropertyEditorClass();
        propertyDescriptor5.setValue("V", (java.lang.Object) 9);
        boolean boolean21 = type1.equals((java.lang.Object) propertyDescriptor5);
        java.lang.String str22 = type1.getInternalName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type23 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(JJV)J" + "'", str13, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(JJV)J" + "'", str14, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "long" + "'", str22, "long");
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setWriteMethod(method4);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(false);
        java.lang.Class<?> wildcardClass9 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass9);
        java.util.List list12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list13 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass9, list12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java/beans/PropertyDescriptor");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getClassName();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S" + "'", str1, "S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "short" + "'", str2, "short");
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str25 = signature24.getName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type27, type28, type29 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray30);
        java.lang.String[] strArray33 = org.mockito.cglib.core.ReflectUtils.getNames(classArray32);
        java.lang.Class[] classArray34 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray32);
        boolean boolean35 = signature24.equals((java.lang.Object) classArray34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method36 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass17, "boolean", classArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: boolean");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "J" + "'", str25, "J");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(JJV)J" + "'", str31, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray4);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, false);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray13);
        java.lang.reflect.Method[] methodArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(JJV)J" + "'", str5, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(methodArray14);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("Jhi!", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=hi!; displayName=java/beans/PropertyDescriptor; values={V=J}; bound]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("()J");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("C", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("S");
        int int2 = type1.getSort();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("long");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type2 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "V", "hi!", "hi!", "Llong;" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, false);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, true);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray12);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(methodArray14);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method5 = null;
        propertyDescriptor3.setReadMethod(method5);
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        java.util.Enumeration<java.lang.String> strEnumeration11 = propertyDescriptor10.attributeNames();
        propertyDescriptor10.setHidden(false);
        java.beans.PropertyEditor propertyEditor14 = propertyDescriptor3.createPropertyEditor((java.lang.Object) false);
        propertyDescriptor3.setDisplayName("LS;");
        boolean boolean17 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNotNull(strEnumeration11);
        org.junit.Assert.assertNull(propertyEditor14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setWriteMethod(method4);
        propertyDescriptor3.setBound(false);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str9 = type8.toString();
        boolean boolean10 = propertyDescriptor3.equals((java.lang.Object) type8);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "C" + "'", str9, "C");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("(JJV)S");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        java.lang.String str5 = propertyDescriptor3.getShortDescription();
        boolean boolean6 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        int int23 = type21.getOpcode((int) (byte) 10);
        java.lang.String str24 = type21.toString();
        int int25 = type21.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        int int28 = type26.getOpcode((int) '4');
        java.lang.String str29 = type26.getDescriptor();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type32, type33, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray35);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray35);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray35);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type21, typeArray35);
        java.lang.Class[] classArray40 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method41 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass17, "J", classArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: J");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "S" + "'", str24, "S");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 53 + "'", int28 == 53);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "J" + "'", str29, "J");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(JJV)J" + "'", str36, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(JJV)J" + "'", str37, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(JJV)J" + "'", str38, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray40);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type5, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray8);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray10);
        boolean boolean13 = signature2.equals((java.lang.Object) classArray12);
        java.lang.String str14 = signature2.getName();
        java.lang.String str15 = signature2.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type16 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J" + "'", str3, "J");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(JJV)J" + "'", str9, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "J" + "'", str14, "J");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        int int3 = type0.getSize();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.toString();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "boolean" + "'", str4, "boolean");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Z" + "'", str5, "Z");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("long", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 0 };
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class7 = org.mockito.cglib.core.ReflectUtils.defineClass("Llong;", byteArray5, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, 0]");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.util.List list20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list21 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass17, list20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(classInfo19);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "");
        java.lang.String str3 = signature2.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=hi!; shortDescription=; values={V=J}; bound]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 79");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
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
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type25, type26, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray28);
        java.lang.Class[] classArray30 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray28);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor33 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass17, classArray30);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(org.mockito.asm.Type, org.mockito.asm.Type, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java/beans/PropertyDescriptor" + "'", str21, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(JJV)J" + "'", str29, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(classArray32);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        byte[] byteArray1 = null;
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.mockito.cglib.core.ReflectUtils.defineClass("hi!", byteArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type21, type22, type23 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray24);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray24);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor29 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass17, classArray28);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(java.lang.Class, java.lang.Class, java.lang.Class)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str19, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(JJV)J" + "'", str25, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(classArray28);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor", method1, method2);
        java.lang.String str4 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor]" + "'", str4, "java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor]");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setName("long");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type22, type23, type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray25);
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray25);
        java.lang.String[] strArray28 = org.mockito.cglib.core.ReflectUtils.getNames(classArray27);
        java.lang.Class[] classArray29 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray27);
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method32 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass17, "boolean", classArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: boolean");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(JJV)J" + "'", str26, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        java.lang.Object obj21 = propertyDescriptor3.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor3.attributeNames();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        int int27 = type24.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type30, type31, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray33);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("S", type24, typeArray33);
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature36);
        java.lang.Class<?> wildcardClass38 = propertyDescriptor3.getClass();
        java.lang.String str39 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        java.util.List list40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list41 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass38, list40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strEnumeration22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "J" + "'", str25, "J");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JJV)J" + "'", str34, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(JJV)J" + "'", str35, "(JJV)J");
        org.junit.Assert.assertNull(propertyEditor37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java/beans/PropertyDescriptor" + "'", str39, "java/beans/PropertyDescriptor");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 10 };
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class9 = org.mockito.cglib.core.ReflectUtils.defineClass("(JJV)J", byteArray7, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 10, 1, -1, 10]");
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.lang.String str22 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type24, type25, type26 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray27);
        java.lang.Class[] classArray29 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray27);
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor31 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass17, classArray29);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(org.mockito.asm.Type, org.mockito.asm.Type, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str21, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str22, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(JJV)J" + "'", str28, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type24, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray26);
        java.lang.String[] strArray29 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "Llong;", "(JJV)J" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray33, true, false);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray36);
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray38, true, false);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray41);
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray43, false, false);
        java.lang.reflect.Method[] methodArray47 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray28, (java.lang.Object[]) methodArray47);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(org.mockito.asm.Type, org.mockito.asm.Type, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(JJV)J" + "'", str27, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(propertyDescriptorArray33);
        org.junit.Assert.assertNotNull(methodArray36);
        org.junit.Assert.assertNotNull(methodArray37);
        org.junit.Assert.assertNotNull(propertyDescriptorArray38);
        org.junit.Assert.assertNotNull(methodArray41);
        org.junit.Assert.assertNotNull(methodArray42);
        org.junit.Assert.assertNotNull(propertyDescriptorArray43);
        org.junit.Assert.assertNotNull(methodArray46);
        org.junit.Assert.assertNotNull(methodArray47);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type19, type20, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray22);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray22);
        java.lang.String[] strArray25 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        int int28 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type30, type31, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray24, (java.lang.Object[]) typeArray33);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(org.mockito.asm.Type, org.mockito.asm.Type, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(JJV)J" + "'", str23, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JJV)J" + "'", str34, "(JJV)J");
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        java.lang.String str5 = propertyDescriptor3.getDisplayName();
        boolean boolean6 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type14, type15, type16 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray17);
        int int20 = type12.getSort();
        propertyDescriptor10.setValue("V", (java.lang.Object) type12);
        java.lang.reflect.Method method22 = propertyDescriptor10.getReadMethod();
        propertyDescriptor10.setExpert(false);
        propertyDescriptor10.setName("hi!");
        propertyDescriptor10.setShortDescription("SS");
        boolean boolean29 = propertyDescriptor3.equals((java.lang.Object) "SS");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(JJV)J" + "'", str18, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(JJV)J" + "'", str19, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method22 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setPreferred(false);
        propertyDescriptor3.setName("J");
        boolean boolean27 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        java.util.List list22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list23 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass17, list22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("short");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method21 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method22 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Ljava/beans/PropertyDescriptor;");
        int int2 = type1.getSort();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("V");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        java.util.List list21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list22 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass17, list21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method5 = null;
        propertyDescriptor3.setReadMethod(method5);
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        java.util.Enumeration<java.lang.String> strEnumeration11 = propertyDescriptor10.attributeNames();
        propertyDescriptor10.setHidden(false);
        java.beans.PropertyEditor propertyEditor14 = propertyDescriptor3.createPropertyEditor((java.lang.Object) false);
        java.util.Enumeration<java.lang.String> strEnumeration15 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setName("(JJV)V");
        boolean boolean18 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNotNull(strEnumeration11);
        org.junit.Assert.assertNull(propertyEditor14);
        org.junit.Assert.assertNotNull(strEnumeration15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        java.lang.Object obj21 = propertyDescriptor3.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor3.attributeNames();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        int int27 = type24.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type30, type31, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray33);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("S", type24, typeArray33);
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature36);
        java.lang.Class<?> wildcardClass38 = propertyDescriptor3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass38);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strEnumeration22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "J" + "'", str25, "J");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JJV)J" + "'", str34, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(JJV)J" + "'", str35, "(JJV)J");
        org.junit.Assert.assertNull(propertyEditor37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method16 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        byte[] byteArray1 = new byte[] {};
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.mockito.cglib.core.ReflectUtils.defineClass("S", byteArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
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
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str3 = signature2.getName();
        boolean boolean5 = signature2.equals((java.lang.Object) "hi!");
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str9 = signature8.getName();
        java.lang.String str10 = signature8.getDescriptor();
        boolean boolean11 = signature2.equals((java.lang.Object) signature8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray12 = signature8.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J" + "'", str3, "J");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "J" + "'", str9, "J");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type5, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray8);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray10);
        boolean boolean13 = signature2.equals((java.lang.Object) classArray12);
        java.lang.String str14 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray15 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J" + "'", str3, "J");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(JJV)J" + "'", str9, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "J" + "'", str14, "J");
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("long");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray12);
        int int15 = type7.getSort();
        propertyDescriptor5.setValue("V", (java.lang.Object) type7);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor5.getPropertyEditorClass();
        propertyDescriptor5.setValue("V", (java.lang.Object) 9);
        boolean boolean21 = type1.equals((java.lang.Object) propertyDescriptor5);
        java.lang.String str22 = propertyDescriptor5.getName();
        java.lang.reflect.Method method23 = propertyDescriptor5.getReadMethod();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type26, type27, type28 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray29);
        java.lang.String str32 = type24.getClassName();
        boolean boolean33 = propertyDescriptor5.equals((java.lang.Object) type24);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(JJV)J" + "'", str13, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(JJV)J" + "'", str14, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(JJV)J" + "'", str30, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(JJV)J" + "'", str31, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "long" + "'", str32, "long");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("short");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method22 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method23 = propertyDescriptor3.getReadMethod();
        boolean boolean24 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
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
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.String str15 = type5.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = type5.getInternalName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "J" + "'", str15, "J");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray12);
        int int15 = type7.getSort();
        propertyDescriptor5.setValue("V", (java.lang.Object) type7);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor5.getPropertyEditorClass();
        propertyDescriptor5.setValue("V", (java.lang.Object) 9);
        boolean boolean21 = type1.equals((java.lang.Object) propertyDescriptor5);
        org.mockito.asm.Type[] typeArray22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(JJV)J" + "'", str13, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(JJV)J" + "'", str14, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("V", "LS;");
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=Llong;]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type12, type13, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray15);
        int int18 = type10.getSort();
        propertyDescriptor8.setValue("V", (java.lang.Object) type10);
        java.lang.Class<?> wildcardClass20 = propertyDescriptor8.getPropertyEditorClass();
        propertyDescriptor8.setValue("V", (java.lang.Object) 9);
        boolean boolean24 = type4.equals((java.lang.Object) propertyDescriptor8);
        java.lang.String str25 = propertyDescriptor8.getName();
        java.lang.Object obj27 = propertyDescriptor8.getValue("");
        boolean boolean28 = type2.equals((java.lang.Object) "");
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        int int32 = type30.getOpcode(1);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type36, type37, type38 };
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray39);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray39);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("hi!", type30, typeArray39);
        org.mockito.asm.Type type43 = signature42.getReturnType();
        org.mockito.asm.Type type44 = signature42.getReturnType();
        org.mockito.asm.Type[] typeArray45 = signature42.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("()J", type2, typeArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()J' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(JJV)J" + "'", str16, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(JJV)J" + "'", str17, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "V" + "'", str34, "V");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(JJV)J" + "'", str40, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(JJV)V" + "'", str41, "(JJV)V");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(typeArray45);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type9, type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray11);
        int int14 = type6.getSort();
        propertyDescriptor4.setValue("V", (java.lang.Object) type6);
        java.lang.reflect.Method method16 = propertyDescriptor4.getReadMethod();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor4.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass18 = propertyDescriptor4.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) propertyDescriptorArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(JJV)J" + "'", str13, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("C", "()J");
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("J");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        java.lang.Object obj21 = propertyDescriptor3.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor3.attributeNames();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        int int27 = type24.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type30, type31, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray33);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("S", type24, typeArray33);
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature36);
        java.lang.Class<?> wildcardClass38 = propertyDescriptor3.getClass();
        java.lang.String str39 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method41 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strEnumeration22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "J" + "'", str25, "J");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JJV)J" + "'", str34, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(JJV)J" + "'", str35, "(JJV)J");
        org.junit.Assert.assertNull(propertyEditor37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java/beans/PropertyDescriptor" + "'", str39, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(type40);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method5 = null;
        propertyDescriptor3.setReadMethod(method5);
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        java.util.Enumeration<java.lang.String> strEnumeration11 = propertyDescriptor10.attributeNames();
        propertyDescriptor10.setHidden(false);
        java.beans.PropertyEditor propertyEditor14 = propertyDescriptor3.createPropertyEditor((java.lang.Object) false);
        java.util.Enumeration<java.lang.String> strEnumeration15 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setName("(JJV)V");
        java.lang.reflect.Method method18 = propertyDescriptor3.getReadMethod();
        java.lang.String str19 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNotNull(strEnumeration11);
        org.junit.Assert.assertNull(propertyEditor14);
        org.junit.Assert.assertNotNull(strEnumeration15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.beans.PropertyDescriptor[name=(JJV)V]" + "'", str19, "java.beans.PropertyDescriptor[name=(JJV)V]");
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        boolean boolean17 = propertyDescriptor3.isExpert();
        java.util.Enumeration<java.lang.String> strEnumeration18 = propertyDescriptor3.attributeNames();
        java.lang.Class<?> wildcardClass19 = propertyDescriptor3.getPropertyEditorClass();
        boolean boolean20 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strEnumeration18);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        java.lang.Class class0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray6);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        boolean boolean10 = type1.equals((java.lang.Object) classArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor11 = org.mockito.cglib.core.ReflectUtils.getConstructor(class0, classArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(JJV)J" + "'", str7, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        java.util.List list23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list24 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass17, list23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java/beans/PropertyDescriptor" + "'", str21, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java/beans/PropertyDescriptor" + "'", str22, "java/beans/PropertyDescriptor");
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1 };
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = org.mockito.cglib.core.ReflectUtils.defineClass("", byteArray3, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 1]");
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("short");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type5, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray8);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray10);
        boolean boolean13 = signature2.equals((java.lang.Object) classArray12);
        java.lang.String str14 = signature2.getName();
        java.lang.String str15 = signature2.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray16 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J" + "'", str3, "J");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(JJV)J" + "'", str9, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "J" + "'", str14, "J");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        java.lang.Object obj21 = propertyDescriptor3.getValue("SS");
        java.lang.String str22 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; values={V=J}]" + "'", str22, "java.beans.PropertyDescriptor[name=hi!; values={V=J}]");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
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
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(JJV)J", method1, method2);
        boolean boolean4 = propertyDescriptor3.isExpert();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=(JJV)V]", classLoader1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
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
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setDisplayName("java/beans/PropertyDescriptor");
        boolean boolean20 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setWriteMethod(method4);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(false);
        java.lang.Class<?> wildcardClass9 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.util.List list11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass9, list11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type10);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("()J");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setHidden(false);
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setName("V");
        propertyDescriptor3.setShortDescription("long");
        java.lang.String str12 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.beans.PropertyDescriptor[name=V; shortDescription=long]" + "'", str12, "java.beans.PropertyDescriptor[name=V; shortDescription=long]");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setDisplayName("java/beans/PropertyDescriptor");
        java.lang.reflect.Method method20 = propertyDescriptor3.getReadMethod();
        java.util.Enumeration<java.lang.String> strEnumeration21 = propertyDescriptor3.attributeNames();
        java.lang.Object obj23 = propertyDescriptor3.getValue("java.beans.PropertyDescriptor[name=hi!]");
        boolean boolean24 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(strEnumeration21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        java.lang.reflect.Method method17 = null;
        propertyDescriptor3.setReadMethod(method17);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method21 = propertyDescriptor3.getReadMethod();
        java.lang.String str22 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; values={V=J}]" + "'", str22, "java.beans.PropertyDescriptor[name=hi!; values={V=J}]");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method18 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=V; shortDescription=long]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 60");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        boolean boolean17 = propertyDescriptor3.isExpert();
        java.util.Enumeration<java.lang.String> strEnumeration18 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method19 = null;
        propertyDescriptor3.setWriteMethod(method19);
        java.lang.String str21 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strEnumeration18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; values={V=J}]" + "'", str21, "java.beans.PropertyDescriptor[name=hi!; values={V=J}]");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=hi!; values={V=J}]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setShortDescription("SS");
        boolean boolean7 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setExpert(false);
        java.lang.String str12 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; shortDescription=SS]" + "'", str12, "java.beans.PropertyDescriptor[name=hi!; shortDescription=SS]");
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method22 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str19, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java/beans/PropertyDescriptor" + "'", str20, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        java.lang.Object obj21 = propertyDescriptor3.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor3.attributeNames();
        java.lang.String str23 = propertyDescriptor3.getName();
        propertyDescriptor3.setHidden(true);
        java.lang.String str26 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setConstrained(true);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strEnumeration22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode((int) (byte) -1);
        java.lang.String str4 = type0.toString();
        java.lang.String str5 = type0.toString();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "J" + "'", str1, "J");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "J" + "'", str4, "J");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "J" + "'", str5, "J");
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        java.lang.reflect.Constructor constructor0 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray1 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray1, false, false);
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray1, false, false);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray1, false, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) propertyDescriptorArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray1);
        org.junit.Assert.assertNotNull(methodArray4);
        org.junit.Assert.assertNotNull(methodArray7);
        org.junit.Assert.assertNotNull(methodArray10);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setHidden(false);
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str8 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.beans.PropertyDescriptor[name=hi!]" + "'", str8, "java.beans.PropertyDescriptor[name=hi!]");
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setExpert(true);
        boolean boolean18 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 110");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, false);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, true);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        boolean boolean12 = type0.equals((java.lang.Object) methodArray10);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean17 = signature15.equals((java.lang.Object) true);
        boolean boolean18 = type0.equals((java.lang.Object) signature15);
        java.lang.String str19 = signature15.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray20 = signature15.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "S" + "'", str3, "S");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(methodArray7);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Jhi!" + "'", str19, "Jhi!");
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("long");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setValue("SS", (java.lang.Object) "hi!");
        java.lang.String str10 = propertyDescriptor3.getName();
        boolean boolean11 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(JJV)Z", "V");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JJV)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSort();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "J" + "'", str1, "J");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class8 = org.mockito.cglib.core.ReflectUtils.defineClass("", byteArray6, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 1, 100, 0]");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type20, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray23);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray23);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method28 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass15, "(JJV)J", classArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: (JJV)J");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(JJV)J" + "'", str24, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(classArray27);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type22, type23, type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray25);
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray25);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type35, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray38);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray38);
        int int41 = type33.getSort();
        propertyDescriptor31.setValue("V", (java.lang.Object) type33);
        java.lang.Class<?> wildcardClass43 = propertyDescriptor31.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass43);
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass43);
        java.lang.Class[] classArray46 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray27, (java.lang.Object[]) classArray46);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(org.mockito.asm.Type, org.mockito.asm.Type, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(JJV)J" + "'", str26, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(JJV)J" + "'", str39, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(JJV)J" + "'", str40, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 7 + "'", int41 == 7);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(propertyDescriptorArray44);
        org.junit.Assert.assertNotNull(propertyDescriptorArray45);
        org.junit.Assert.assertNotNull(classArray46);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method21 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100 };
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = org.mockito.cglib.core.ReflectUtils.defineClass("short", byteArray3, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 100]");
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=Llong;]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method18 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("short", "java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 110");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method18 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type9, type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray11);
        int int14 = type6.getSort();
        propertyDescriptor4.setValue("V", (java.lang.Object) type6);
        java.lang.Class<?> wildcardClass16 = propertyDescriptor4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass16);
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray18, true, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(JJV)J" + "'", str13, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(methodArray21);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        java.lang.Object obj21 = propertyDescriptor3.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor3.attributeNames();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        int int27 = type24.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type30, type31, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray33);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("S", type24, typeArray33);
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getObjectType("long");
        java.beans.PropertyEditor propertyEditor40 = propertyDescriptor3.createPropertyEditor((java.lang.Object) "long");
        java.lang.Object obj42 = propertyDescriptor3.getValue("(JJV)V");
        java.lang.String str43 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strEnumeration22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "J" + "'", str25, "J");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JJV)J" + "'", str34, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(JJV)J" + "'", str35, "(JJV)J");
        org.junit.Assert.assertNull(propertyEditor37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNull(propertyEditor40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; values={V=J}]" + "'", str43, "java.beans.PropertyDescriptor[name=hi!; values={V=J}]");
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.lang.Class class0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray5);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor10 = org.mockito.cglib.core.ReflectUtils.getConstructor(class0, classArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(JJV)J" + "'", str6, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(classArray9);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("V", "Lhi!;");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.String str21 = propertyDescriptor3.getDisplayName();
        java.lang.Class<?> wildcardClass22 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str23 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.beans.PropertyDescriptor[name=hi!]" + "'", str21, "java.beans.PropertyDescriptor[name=hi!]");
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]; values={V=J}]" + "'", str23, "java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]; values={V=J}]");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
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
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
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
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("LS;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("hi!(JJV)J", classLoader1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->hi!");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) typeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(JJV)J" + "'", str7, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(JJV)J" + "'", str8, "(JJV)J");
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray12);
        int int15 = type7.getSort();
        propertyDescriptor5.setValue("V", (java.lang.Object) type7);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor5.getPropertyEditorClass();
        propertyDescriptor5.setValue("V", (java.lang.Object) 9);
        boolean boolean21 = type1.equals((java.lang.Object) propertyDescriptor5);
        propertyDescriptor5.setName("long");
        propertyDescriptor5.setConstrained(false);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(JJV)J" + "'", str13, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(JJV)J" + "'", str14, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        java.util.List list20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list21 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass17, list20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type5, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray8);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray10);
        boolean boolean13 = signature2.equals((java.lang.Object) classArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray14 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J" + "'", str3, "J");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(JJV)J" + "'", str9, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        propertyDescriptor7.setConstrained(true);
        boolean boolean10 = type0.equals((java.lang.Object) true);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("S");
        boolean boolean13 = type0.equals((java.lang.Object) type12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type14 = type12.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "S" + "'", str3, "S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("(JJV)V");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray4);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, false);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, true);
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray16);
        java.lang.reflect.Method[] methodArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(JJV)J" + "'", str5, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(methodArray17);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.util.List list21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list22 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass17, list21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str19, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(classInfo20);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean4 = signature2.equals((java.lang.Object) true);
        java.lang.String str5 = signature2.getDescriptor();
        java.lang.String str6 = signature2.toString();
        java.lang.String str7 = signature2.toString();
        java.lang.String str8 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type9 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Jhi!" + "'", str6, "Jhi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Jhi!" + "'", str7, "Jhi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "J" + "'", str8, "J");
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setWriteMethod(method4);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(false);
        java.lang.Class<?> wildcardClass9 = propertyDescriptor3.getClass();
        java.lang.String str10 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        int int14 = type12.getOpcode((int) (byte) 10);
        java.lang.String str15 = type12.toString();
        int int16 = type12.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        int int19 = type17.getOpcode((int) '4');
        java.lang.String str20 = type17.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type24, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray26);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray26);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type12, typeArray26);
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray26);
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        java.lang.Object[] objArray33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass9, classArray31, objArray33);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(org.mockito.asm.Type, org.mockito.asm.Type, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str10, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "S" + "'", str15, "S");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 53 + "'", int19 == 53);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "J" + "'", str20, "J");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(JJV)J" + "'", str27, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(JJV)J" + "'", str28, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(JJV)J" + "'", str29, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        boolean boolean17 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass20 = propertyDescriptor3.getPropertyType();
        boolean boolean21 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class6 = org.mockito.cglib.core.ReflectUtils.defineClass("(JJV)LS;", byteArray4, classLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -1]");
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("Ljava/beans/FeatureDescriptor;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class4 = org.mockito.cglib.core.ReflectUtils.defineClass("(JJV)Z", byteArray2, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L(JJV)V;", "java.beans.PropertyDescriptor[name=hi!; values={V=J}]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'L(JJV)V;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setWriteMethod(method4);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(false);
        java.lang.Class<?> wildcardClass9 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        java.util.List list11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass9, list11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("java.beans.PropertyDescriptor[name=hi!]");
        boolean boolean21 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method5 = null;
        propertyDescriptor3.setReadMethod(method5);
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        java.util.Enumeration<java.lang.String> strEnumeration11 = propertyDescriptor10.attributeNames();
        propertyDescriptor10.setHidden(false);
        java.beans.PropertyEditor propertyEditor14 = propertyDescriptor3.createPropertyEditor((java.lang.Object) false);
        java.util.Enumeration<java.lang.String> strEnumeration15 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setName("(JJV)V");
        java.lang.reflect.Method method18 = propertyDescriptor3.getReadMethod();
        boolean boolean19 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNotNull(strEnumeration11);
        org.junit.Assert.assertNull(propertyEditor14);
        org.junit.Assert.assertNotNull(strEnumeration15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = org.mockito.cglib.core.ReflectUtils.defineClass("SS", byteArray3, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 0]");
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        java.util.List list23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list24 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass17, list23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java/beans/PropertyDescriptor" + "'", str21, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean4 = signature2.equals((java.lang.Object) true);
        java.lang.String str5 = signature2.getDescriptor();
        java.lang.String str6 = signature2.toString();
        java.lang.String str7 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Jhi!" + "'", str6, "Jhi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Jhi!" + "'", str7, "Jhi!");
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=hi!; shortDescription=SS]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 60");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("SS");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method20 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getClassName();
        int int4 = type0.getSort();
        int int6 = type0.getOpcode((-1));
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S" + "'", str1, "S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "S" + "'", str2, "S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "short" + "'", str3, "short");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method22 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method23 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method24 = null;
        propertyDescriptor3.setReadMethod(method24);
        java.lang.String[] strArray29 = new java.lang.String[] { "Llong;", "(JJV)J" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray30, true, false);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray29, methodArray33);
        propertyDescriptor3.setValue("J", (java.lang.Object) methodArray34);
        boolean boolean36 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(propertyDescriptorArray30);
        org.junit.Assert.assertNotNull(methodArray33);
        org.junit.Assert.assertNotNull(methodArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("LS;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("SS", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Jhi!", "java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 110");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type24, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray26);
        java.lang.String[] strArray29 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        java.lang.Class[] classArray30 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray28);
        int int31 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method32 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass17, "Ljava/beans/PropertyDescriptor;", classArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: Ljava/beans/PropertyDescriptor;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(classInfo20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(JJV)J" + "'", str27, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        byte[] byteArray1 = new byte[] {};
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.mockito.cglib.core.ReflectUtils.defineClass("(JJV)J", byteArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L(JJV)V;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        java.util.List list21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list22 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass15, list21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java/beans/PropertyDescriptor" + "'", str19, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java/beans/PropertyDescriptor" + "'", str20, "java/beans/PropertyDescriptor");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setHidden(false);
        boolean boolean7 = propertyDescriptor3.isHidden();
        java.lang.String str8 = propertyDescriptor3.getDisplayName();
        boolean boolean9 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class4 = org.mockito.cglib.core.ReflectUtils.defineClass("(JJV)S", byteArray2, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]; values={V=J}]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean4 = signature2.equals((java.lang.Object) true);
        java.lang.String str5 = signature2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Jhi!" + "'", str5, "Jhi!");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.String str21 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method23 = null;
        java.lang.reflect.Method method24 = null;
        java.beans.PropertyDescriptor propertyDescriptor25 = new java.beans.PropertyDescriptor("hi!", method23, method24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type29, type30, type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray32);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray32);
        int int35 = type27.getSort();
        propertyDescriptor25.setValue("V", (java.lang.Object) type27);
        java.lang.Class<?> wildcardClass37 = propertyDescriptor25.getClass();
        java.beans.PropertyEditor propertyEditor38 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor25);
        propertyDescriptor3.setConstrained(false);
        propertyDescriptor3.setConstrained(true);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.beans.PropertyDescriptor[name=hi!]" + "'", str21, "java.beans.PropertyDescriptor[name=hi!]");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(JJV)J" + "'", str33, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JJV)J" + "'", str34, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 7 + "'", int35 == 7);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(propertyEditor38);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java/beans/PropertyDescriptor");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("short", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setDisplayName("V");
        propertyDescriptor3.setDisplayName("Jhi!");
        propertyDescriptor3.setConstrained(false);
        boolean boolean24 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.util.List list2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list3 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass1, list2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setWriteMethod(method4);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(false);
        java.lang.Class<?> wildcardClass9 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.util.List list12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list13 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass9, list12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(classInfo11);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=hi!; shortDescription=; values={V=J}; bound]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str24 = signature23.getName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type26, type27, type28 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray29);
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray29);
        java.lang.String[] strArray32 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        java.lang.Class[] classArray33 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray31);
        boolean boolean34 = signature23.equals((java.lang.Object) classArray33);
        java.lang.String[] strArray35 = org.mockito.cglib.core.ReflectUtils.getNames(classArray33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method36 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass17, "java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]", classArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "J" + "'", str24, "J");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(JJV)J" + "'", str30, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
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
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0 };
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class7 = org.mockito.cglib.core.ReflectUtils.defineClass("Ljava/beans/PropertyDescriptor;", byteArray5, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 10, 0]");
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("S");
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = type1.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
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
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray12);
        int int15 = type7.getSort();
        propertyDescriptor5.setValue("V", (java.lang.Object) type7);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor5.getPropertyEditorClass();
        propertyDescriptor5.setValue("V", (java.lang.Object) 9);
        boolean boolean21 = type1.equals((java.lang.Object) propertyDescriptor5);
        java.lang.String str22 = propertyDescriptor5.getName();
        boolean boolean23 = propertyDescriptor5.isExpert();
        propertyDescriptor5.setName("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        java.lang.String str26 = propertyDescriptor5.toString();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(JJV)J" + "'", str13, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(JJV)J" + "'", str14, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]; values={V=9}]" + "'", str26, "java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]; values={V=9}]");
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("java.beans.PropertyDescriptor[name=(JJV)V]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.lang.String str18 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray20, true, false);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray20, true, true);
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method28 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass15, "java.beans.PropertyDescriptor[name=hi!; hidden; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]", classArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: java.beans.PropertyDescriptor[name=hi!; hidden; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str18, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(methodArray26);
        org.junit.Assert.assertNotNull(classArray27);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray12);
        int int15 = type7.getSort();
        propertyDescriptor5.setValue("V", (java.lang.Object) type7);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor5.getPropertyEditorClass();
        propertyDescriptor5.setValue("V", (java.lang.Object) 9);
        boolean boolean21 = type1.equals((java.lang.Object) propertyDescriptor5);
        propertyDescriptor5.setName("long");
        propertyDescriptor5.setShortDescription("long");
        boolean boolean26 = propertyDescriptor5.isConstrained();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(JJV)J" + "'", str13, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(JJV)J" + "'", str14, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        boolean boolean17 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setShortDescription("");
        propertyDescriptor3.setExpert(false);
        java.lang.String str24 = propertyDescriptor3.getDisplayName();
        java.lang.String[] strArray29 = new java.lang.String[] { "V", "hi!", "hi!", "Llong;" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray30, true, false);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray30, true, true);
        java.lang.Class[] classArray37 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray36);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray29, methodArray36);
        boolean boolean39 = propertyDescriptor3.equals((java.lang.Object) methodArray38);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(propertyDescriptorArray30);
        org.junit.Assert.assertNotNull(methodArray33);
        org.junit.Assert.assertNotNull(methodArray36);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(methodArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor", method1, method2);
        boolean boolean4 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]; values={V=J}]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 106");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("()J", classLoader1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.Class[] classArray22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method23 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass17, "V", classArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: V");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(type20);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
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
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method17 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str22 = signature21.getName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type24, type25, type26 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray27);
        java.lang.Class[] classArray29 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray27);
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray29);
        boolean boolean32 = signature21.equals((java.lang.Object) classArray31);
        java.lang.String[] strArray33 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method34 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass15, "Z", classArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: Z");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "J" + "'", str22, "J");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(JJV)J" + "'", str28, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method18 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setHidden(false);
        java.lang.String str23 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; values={V=J}; bound]" + "'", str23, "java.beans.PropertyDescriptor[name=hi!; values={V=J}; bound]");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = org.mockito.cglib.core.ReflectUtils.defineClass("C", byteArray3, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1]");
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=hi!; hidden; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) -1 };
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class7 = org.mockito.cglib.core.ReflectUtils.defineClass("Lhi!;", byteArray5, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 100, 0, -1]");
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        java.lang.reflect.Method method20 = null;
        propertyDescriptor3.setWriteMethod(method20);
        propertyDescriptor3.setExpert(true);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=Llong;]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str19, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java/beans/PropertyDescriptor" + "'", str20, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.util.List list21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list22 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass17, list21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.toString();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        int int8 = type6.getOpcode((int) ' ');
        int int9 = type6.getSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "S" + "'", str3, "S");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "S" + "'", str4, "S");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SS" + "'", str5, "SS");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str3 = signature2.getName();
        boolean boolean5 = signature2.equals((java.lang.Object) "hi!");
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str9 = signature8.getName();
        java.lang.String str10 = signature8.getDescriptor();
        boolean boolean11 = signature2.equals((java.lang.Object) signature8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type12 = signature8.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J" + "'", str3, "J");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "J" + "'", str9, "J");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        java.lang.Object obj21 = propertyDescriptor3.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor3.attributeNames();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        int int27 = type24.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type30, type31, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray33);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("S", type24, typeArray33);
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature36);
        org.mockito.asm.Type type38 = signature36.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type39 = type38.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strEnumeration22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "J" + "'", str25, "J");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JJV)J" + "'", str34, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(JJV)J" + "'", str35, "(JJV)J");
        org.junit.Assert.assertNull(propertyEditor37);
        org.junit.Assert.assertNotNull(type38);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
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
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.getDescriptor();
        java.lang.String str6 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray7 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "S" + "'", str3, "S");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "S" + "'", str4, "S");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "S" + "'", str5, "S");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SS" + "'", str6, "SS");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("java.beans.PropertyDescriptor[name=hi!; values={V=J}]");
        java.lang.String str2 = type1.getInternalName();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; values={V=J}]" + "'", str2, "java.beans.PropertyDescriptor[name=hi!; values={V=J}]");
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
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
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method22 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method23 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method24 = null;
        propertyDescriptor3.setReadMethod(method24);
        java.lang.Object obj27 = propertyDescriptor3.getValue("(JJV)Z");
        boolean boolean28 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str3 = signature2.getName();
        boolean boolean5 = signature2.equals((java.lang.Object) "hi!");
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str9 = signature8.getName();
        java.lang.String str10 = signature8.getDescriptor();
        boolean boolean11 = signature2.equals((java.lang.Object) signature8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type12 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J" + "'", str3, "J");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "J" + "'", str9, "J");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type5, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray8);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray10);
        boolean boolean13 = signature2.equals((java.lang.Object) classArray12);
        java.lang.String str14 = signature2.getName();
        boolean boolean16 = signature2.equals((java.lang.Object) '4');
        java.lang.String str17 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray18 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J" + "'", str3, "J");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(JJV)J" + "'", str9, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "J" + "'", str14, "J");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Jhi!" + "'", str17, "Jhi!");
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method5 = null;
        propertyDescriptor3.setReadMethod(method5);
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        java.util.Enumeration<java.lang.String> strEnumeration11 = propertyDescriptor10.attributeNames();
        propertyDescriptor10.setHidden(false);
        java.beans.PropertyEditor propertyEditor14 = propertyDescriptor3.createPropertyEditor((java.lang.Object) false);
        java.util.Enumeration<java.lang.String> strEnumeration15 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setName("(JJV)V");
        java.lang.Object obj19 = propertyDescriptor3.getValue("java.beans.PropertyDescriptor[name=Llong;]");
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNotNull(strEnumeration11);
        org.junit.Assert.assertNull(propertyEditor14);
        org.junit.Assert.assertNotNull(strEnumeration15);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("Llong;", method1, method2);
        propertyDescriptor3.setConstrained(false);
        boolean boolean6 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        int int2 = type1.getSort();
        int int3 = type1.getSort();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray12);
        int int15 = type7.getSort();
        propertyDescriptor5.setValue("V", (java.lang.Object) type7);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor5.getPropertyEditorClass();
        propertyDescriptor5.setValue("V", (java.lang.Object) 9);
        boolean boolean21 = type1.equals((java.lang.Object) propertyDescriptor5);
        java.lang.String str22 = propertyDescriptor5.getName();
        boolean boolean23 = propertyDescriptor5.isExpert();
        java.lang.Class<?> wildcardClass24 = propertyDescriptor5.getPropertyType();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(JJV)J" + "'", str13, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(JJV)J" + "'", str14, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(wildcardClass24);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setDisplayName("V");
        propertyDescriptor3.setDisplayName("Jhi!");
        propertyDescriptor3.setShortDescription("(JJV)V");
        java.util.Enumeration<java.lang.String> strEnumeration24 = propertyDescriptor3.attributeNames();
        boolean boolean25 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strEnumeration24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method21 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(classInfo20);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        java.lang.Object obj21 = propertyDescriptor3.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor3.attributeNames();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        int int27 = type24.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type30, type31, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray33);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("S", type24, typeArray33);
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature36);
        java.lang.Class<?> wildcardClass38 = propertyDescriptor3.getClass();
        java.lang.String str39 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method40 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strEnumeration22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "J" + "'", str25, "J");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JJV)J" + "'", str34, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(JJV)J" + "'", str35, "(JJV)J");
        org.junit.Assert.assertNull(propertyEditor37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java/beans/PropertyDescriptor" + "'", str39, "java/beans/PropertyDescriptor");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0 };
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = org.mockito.cglib.core.ReflectUtils.defineClass("LS;", byteArray3, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0]");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("java/beans/PropertyDescriptor");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type2 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
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
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java/beans/PropertyDescriptor" + "'", str19, "java/beans/PropertyDescriptor");
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("(JJV)Z");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "V", "hi!", "hi!", "Llong;" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, false);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, true);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray12);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(methodArray14);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        propertyDescriptor3.setHidden(false);
        boolean boolean19 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
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
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        byte[] byteArray1 = new byte[] {};
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.mockito.cglib.core.ReflectUtils.defineClass("(JJV)LS;", byteArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("V", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        java.lang.Object obj6 = propertyDescriptor3.getValue("(JJV)V");
        propertyDescriptor3.setDisplayName("J");
        java.lang.reflect.Method method9 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method10 = propertyDescriptor3.getReadMethod();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType("java.beans.PropertyDescriptor[name=hi!; shortDescription=; values={V=J}; bound]");
        boolean boolean13 = propertyDescriptor3.equals((java.lang.Object) type12);
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(JJV)J", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.lang.String str7 = propertyDescriptor3.getDisplayName();
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getClass();
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, false);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray13);
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor16 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass8, classArray14);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(JJV)J" + "'", str7, "(JJV)J");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java/beans/PropertyDescriptor" + "'", str9, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setWriteMethod(method4);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(false);
        java.lang.Class<?> wildcardClass9 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean15 = signature13.equals((java.lang.Object) true);
        java.lang.String str16 = signature13.getDescriptor();
        java.lang.String str17 = signature13.toString();
        java.lang.String str18 = signature13.getDescriptor();
        boolean boolean19 = type10.equals((java.lang.Object) str18);
        org.mockito.asm.Type type20 = type10.getElementType();
        int int21 = type20.getSize();
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Jhi!" + "'", str17, "Jhi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        int int2 = type1.getDimensions();
        java.lang.String str3 = type1.getInternalName();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ava.beans.PropertyDescriptor[name=hi!" + "'", str3, "ava.beans.PropertyDescriptor[name=hi!");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        int int16 = type5.getOpcode(9);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = type5.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        java.lang.Object obj21 = propertyDescriptor3.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor3.attributeNames();
        java.lang.String str23 = propertyDescriptor3.getName();
        propertyDescriptor3.setHidden(true);
        propertyDescriptor3.setName("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.Object obj29 = propertyDescriptor3.getValue("(JJV)LS;");
        boolean boolean30 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strEnumeration22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray16, true, false);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray16, true, true);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray22);
        java.lang.String[] strArray24 = org.mockito.cglib.core.ReflectUtils.getNames(classArray23);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor26 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass15, classArray25);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(classArray25);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        byte[] byteArray1 = new byte[] {};
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.mockito.cglib.core.ReflectUtils.defineClass("java.beans.PropertyDescriptor[name=hi!; shortDescription=; values={V=J}; bound]", byteArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        boolean boolean17 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setShortDescription("");
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setDisplayName("LS;");
        boolean boolean26 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("hi!(JJV)J");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=hi!; displayName=java/beans/PropertyDescriptor; values={V=J}; bound]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("L(JJV)V;");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->L");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setDisplayName("V");
        boolean boolean20 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method21 = null;
        propertyDescriptor3.setReadMethod(method21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        int int25 = type23.getOpcode((int) (byte) 10);
        java.lang.String str26 = type23.toString();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("hi!", method28, method29);
        propertyDescriptor30.setConstrained(true);
        boolean boolean33 = type23.equals((java.lang.Object) true);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("S");
        boolean boolean36 = type23.equals((java.lang.Object) type35);
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type35);
        java.lang.String str38 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "S" + "'", str26, "S");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(propertyEditor37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; displayName=V; values={V=J}]" + "'", str38, "java.beans.PropertyDescriptor[name=hi!; displayName=V; values={V=J}]");
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setHidden(false);
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setShortDescription("Ljava/beans/PropertyDescriptor;");
        java.lang.String str10 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method11 = propertyDescriptor3.getReadMethod();
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("S", "S");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type18, type19, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray21);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray21);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray21);
        boolean boolean25 = signature14.equals((java.lang.Object) type15);
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("hi!", method27, method28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type33, type34, type35 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray36);
        int int39 = type31.getSort();
        propertyDescriptor29.setValue("V", (java.lang.Object) type31);
        java.lang.Class<?> wildcardClass41 = propertyDescriptor29.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass41);
        boolean boolean44 = signature14.equals((java.lang.Object) type43);
        java.lang.String str45 = signature14.toString();
        boolean boolean46 = propertyDescriptor3.equals((java.lang.Object) signature14);
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str10, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "V" + "'", str16, "V");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(JJV)J" + "'", str22, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(JJV)V" + "'", str24, "(JJV)V");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(JJV)J" + "'", str37, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(JJV)J" + "'", str38, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 7 + "'", int39 == 7);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(propertyDescriptorArray42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "SS" + "'", str45, "SS");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray12);
        int int15 = type7.getSort();
        propertyDescriptor5.setValue("V", (java.lang.Object) type7);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor5.getPropertyEditorClass();
        propertyDescriptor5.setValue("V", (java.lang.Object) 9);
        boolean boolean21 = type1.equals((java.lang.Object) propertyDescriptor5);
        propertyDescriptor5.setName("long");
        propertyDescriptor5.setShortDescription("long");
        propertyDescriptor5.setPreferred(false);
        java.lang.String str28 = propertyDescriptor5.getDisplayName();
        java.lang.reflect.Method method29 = propertyDescriptor5.getWriteMethod();
        java.lang.reflect.Method method30 = null;
        propertyDescriptor5.setReadMethod(method30);
        boolean boolean32 = propertyDescriptor5.isConstrained();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(JJV)J" + "'", str13, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(JJV)J" + "'", str14, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "long" + "'", str28, "long");
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setHidden(false);
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getPropertyEditorClass();
        java.util.Enumeration<java.lang.String> strEnumeration8 = propertyDescriptor3.attributeNames();
        java.util.Enumeration<java.lang.String> strEnumeration9 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method10 = propertyDescriptor3.getWriteMethod();
        java.lang.Object obj12 = propertyDescriptor3.getValue("()J");
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strEnumeration8);
        org.junit.Assert.assertNotNull(strEnumeration9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.util.List list20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list21 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass17, list20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.util.List list24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list25 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass17, list24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java/beans/PropertyDescriptor" + "'", str21, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(classInfo23);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        boolean boolean18 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("long");
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.toString();
        java.lang.String str4 = type1.getDescriptor();
        int int5 = type1.getSize();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Llong;" + "'", str2, "Llong;");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Llong;" + "'", str3, "Llong;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Llong;" + "'", str4, "Llong;");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.lang.String str20 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, false, true);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str20, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertNotNull(methodArray24);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("C");
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
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setDisplayName("V");
        boolean boolean20 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method21 = null;
        propertyDescriptor3.setReadMethod(method21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        int int25 = type23.getOpcode((int) (byte) 10);
        java.lang.String str26 = type23.toString();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("hi!", method28, method29);
        propertyDescriptor30.setConstrained(true);
        boolean boolean33 = type23.equals((java.lang.Object) true);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("S");
        boolean boolean36 = type23.equals((java.lang.Object) type35);
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type35);
        java.lang.String str38 = type35.getDescriptor();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "S" + "'", str26, "S");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(propertyEditor37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "LS;" + "'", str38, "LS;");
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setShortDescription("SS");
        boolean boolean7 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray19);
        int int22 = type14.getSort();
        propertyDescriptor12.setValue("V", (java.lang.Object) type14);
        java.lang.Class<?> wildcardClass24 = propertyDescriptor12.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass25 = propertyDescriptor12.getPropertyType();
        java.lang.reflect.Method method26 = null;
        propertyDescriptor12.setReadMethod(method26);
        propertyDescriptor12.setExpert(false);
        boolean boolean30 = propertyDescriptor12.isPreferred();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) propertyDescriptor12);
        java.lang.String str32 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(JJV)J" + "'", str20, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(JJV)J" + "'", str21, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; shortDescription=SS; values={java.beans.PropertyDescriptor[name=hi!]=java.beans.PropertyDescriptor[name=hi!; values={V=J}]}]" + "'", str32, "java.beans.PropertyDescriptor[name=hi!; shortDescription=SS; values={java.beans.PropertyDescriptor[name=hi!]=java.beans.PropertyDescriptor[name=hi!; values={V=J}]}]");
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("()S");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method19 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("SS", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setWriteMethod(method4);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(false);
        java.lang.Class<?> wildcardClass9 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type20, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray23);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray23);
        int int26 = type18.getSort();
        propertyDescriptor16.setValue("V", (java.lang.Object) type18);
        java.lang.reflect.Method method28 = propertyDescriptor16.getReadMethod();
        propertyDescriptor16.setExpert(false);
        propertyDescriptor16.setName("hi!");
        propertyDescriptor16.setHidden(false);
        java.lang.reflect.Method method35 = propertyDescriptor16.getReadMethod();
        boolean boolean36 = type12.equals((java.lang.Object) method35);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(JJV)J" + "'", str24, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(JJV)J" + "'", str25, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(method35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.lang.String str20 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        java.util.List list22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list23 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass17, list22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str20, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=hi!; values={V=J}; bound]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setDisplayName("V");
        propertyDescriptor3.setDisplayName("Jhi!");
        propertyDescriptor3.setShortDescription("(JJV)V");
        java.util.Enumeration<java.lang.String> strEnumeration24 = propertyDescriptor3.attributeNames();
        java.lang.String str25 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strEnumeration24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; displayName=Jhi!; shortDescription=(JJV)V; values={V=J}]" + "'", str25, "java.beans.PropertyDescriptor[name=hi!; displayName=Jhi!; shortDescription=(JJV)V; values={V=J}]");
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method20 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str19, "Ljava/beans/PropertyDescriptor;");
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        int int8 = type6.getOpcode(1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type12, type13, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray15);
        org.mockito.asm.Type type19 = signature18.getReturnType();
        org.mockito.asm.Type type20 = signature18.getReturnType();
        boolean boolean21 = propertyDescriptor3.equals((java.lang.Object) type20);
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "V" + "'", str10, "V");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(JJV)J" + "'", str16, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(JJV)V" + "'", str17, "(JJV)V");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("(JJV)J", method20, method21);
        propertyDescriptor22.setShortDescription("J");
        propertyDescriptor3.setValue("(JJV)J", (java.lang.Object) "J");
        boolean boolean26 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1 };
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = org.mockito.cglib.core.ReflectUtils.defineClass("hi!", byteArray3, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1]");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        java.lang.Object obj19 = propertyDescriptor3.getValue("hi!");
        propertyDescriptor3.setPreferred(true);
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]; values={V=J}]");
        boolean boolean24 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        java.lang.Object obj21 = propertyDescriptor3.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor3.attributeNames();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        int int27 = type24.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type30, type31, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray33);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("S", type24, typeArray33);
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getObjectType("long");
        java.beans.PropertyEditor propertyEditor40 = propertyDescriptor3.createPropertyEditor((java.lang.Object) "long");
        java.lang.Object obj42 = propertyDescriptor3.getValue("(JJV)V");
        boolean boolean43 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strEnumeration22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "J" + "'", str25, "J");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JJV)J" + "'", str34, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(JJV)J" + "'", str35, "(JJV)J");
        org.junit.Assert.assertNull(propertyEditor37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNull(propertyEditor40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setDisplayName("V");
        propertyDescriptor3.setDisplayName("Jhi!");
        propertyDescriptor3.setShortDescription("(JJV)V");
        java.util.Enumeration<java.lang.String> strEnumeration24 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type32, type33, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray35);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray35);
        int int38 = type30.getSort();
        propertyDescriptor28.setValue("V", (java.lang.Object) type30);
        java.lang.reflect.Method method40 = propertyDescriptor28.getReadMethod();
        propertyDescriptor28.setExpert(false);
        propertyDescriptor28.setName("hi!");
        propertyDescriptor28.setHidden(false);
        java.lang.reflect.Method method47 = propertyDescriptor28.getWriteMethod();
        java.lang.String str48 = propertyDescriptor28.getName();
        boolean boolean49 = propertyDescriptor3.equals((java.lang.Object) propertyDescriptor28);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strEnumeration24);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(JJV)J" + "'", str36, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(JJV)J" + "'", str37, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 7 + "'", int38 == 7);
        org.junit.Assert.assertNull(method40);
        org.junit.Assert.assertNull(method47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean4 = signature2.equals((java.lang.Object) true);
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type12, type13, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray15);
        int int18 = type10.getSort();
        propertyDescriptor8.setValue("V", (java.lang.Object) type10);
        java.lang.reflect.Method method20 = propertyDescriptor8.getReadMethod();
        java.lang.Class<?> wildcardClass21 = propertyDescriptor8.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass22 = propertyDescriptor8.getClass();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass22);
        boolean boolean27 = signature2.equals((java.lang.Object) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(JJV)J" + "'", str16, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(JJV)J" + "'", str17, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) -1 };
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class9 = org.mockito.cglib.core.ReflectUtils.defineClass("", byteArray7, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 0, 0, 100, -1]");
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("LS;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("(JJV)J", method20, method21);
        propertyDescriptor22.setShortDescription("J");
        propertyDescriptor3.setValue("(JJV)J", (java.lang.Object) "J");
        boolean boolean26 = propertyDescriptor3.isExpert();
        boolean boolean27 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Jhi!", "java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getDescriptor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Jhi!" + "'", str3, "Jhi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]" + "'", str4, "java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method18 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(type17);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(JJV)Ljava/beans/PropertyDescriptor;");
        java.lang.String str2 = type1.getInternalName();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(JJV)Ljava/beans/PropertyDescriptor;" + "'", str2, "(JJV)Ljava/beans/PropertyDescriptor;");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method24 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java/beans/PropertyDescriptor" + "'", str21, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(type23);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("long");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
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
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method5 = null;
        propertyDescriptor3.setReadMethod(method5);
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        java.util.Enumeration<java.lang.String> strEnumeration11 = propertyDescriptor10.attributeNames();
        propertyDescriptor10.setHidden(false);
        java.beans.PropertyEditor propertyEditor14 = propertyDescriptor3.createPropertyEditor((java.lang.Object) false);
        propertyDescriptor3.setDisplayName("LS;");
        java.lang.String str17 = propertyDescriptor3.getName();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNotNull(strEnumeration11);
        org.junit.Assert.assertNull(propertyEditor14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        java.lang.reflect.Method method17 = null;
        propertyDescriptor3.setReadMethod(method17);
        java.lang.reflect.Method method19 = null;
        propertyDescriptor3.setReadMethod(method19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, false);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray24);
        boolean boolean26 = propertyDescriptor3.equals((java.lang.Object) methodArray24);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertNotNull(methodArray24);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
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
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method23 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str19, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java/beans/PropertyDescriptor" + "'", str20, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertNotNull(type22);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=hi!; displayName=V; values={V=J}]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        byte[] byteArray1 = new byte[] {};
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.mockito.cglib.core.ReflectUtils.defineClass("java.beans.PropertyDescriptor[name=Llong;]", byteArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("(JJV)Ljava/beans/PropertyDescriptor;", classLoader1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type22, type23, type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray25);
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray25);
        java.lang.String[] strArray28 = org.mockito.cglib.core.ReflectUtils.getNames(classArray27);
        java.lang.Class[] classArray29 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray27);
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type32, type33, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray35);
        java.lang.Class[] classArray37 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray35);
        java.lang.String[] strArray38 = org.mockito.cglib.core.ReflectUtils.getNames(classArray37);
        java.lang.String[] strArray39 = org.mockito.cglib.core.ReflectUtils.getNames(classArray37);
        java.lang.String[] strArray40 = org.mockito.cglib.core.ReflectUtils.getNames(classArray37);
        java.beans.PropertyDescriptor[] propertyDescriptorArray41 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray41, true, false);
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray40, methodArray44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray29, (java.lang.Object[]) strArray40);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(java.lang.Class, java.lang.Class, java.lang.Class)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str19, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(classInfo20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(JJV)J" + "'", str26, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(JJV)J" + "'", str36, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(propertyDescriptorArray41);
        org.junit.Assert.assertNotNull(methodArray44);
        org.junit.Assert.assertNotNull(methodArray45);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("(JJV)Ljava/beans/PropertyDescriptor;");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=hi!; hidden; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method18 = null;
        propertyDescriptor3.setWriteMethod(method18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        int int22 = type20.getOpcode((int) (byte) 10);
        java.lang.String str23 = type20.toString();
        java.beans.PropertyEditor propertyEditor24 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type20);
        java.lang.String str25 = propertyDescriptor3.getName();
        java.lang.Object obj27 = propertyDescriptor3.getValue("Llong;");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass28 = obj27.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "S" + "'", str23, "S");
        org.junit.Assert.assertNull(propertyEditor24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        java.lang.String str5 = propertyDescriptor3.getShortDescription();
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        boolean boolean7 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("(JJV)Lva/beans/PropertyDescriptor;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(JJV)J", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.lang.String str7 = propertyDescriptor3.getDisplayName();
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getClass();
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type11, type12, type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray14);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray14);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray16);
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        java.lang.Object[] objArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass8, classArray18, objArray21);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(java.lang.Class, java.lang.Class, java.lang.Class)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(JJV)J" + "'", str7, "(JJV)J");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java/beans/PropertyDescriptor" + "'", str9, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(JJV)J" + "'", str15, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setWriteMethod(method4);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(false);
        java.lang.Class<?> wildcardClass9 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean15 = signature13.equals((java.lang.Object) true);
        java.lang.String str16 = signature13.getDescriptor();
        java.lang.String str17 = signature13.toString();
        java.lang.String str18 = signature13.getDescriptor();
        boolean boolean19 = type10.equals((java.lang.Object) str18);
        org.mockito.asm.Type type20 = type10.getElementType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type24, type25, type26 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray27);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray27);
        int int30 = type22.getSort();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type34, type35, type36 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray37);
        java.lang.Class[] classArray39 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray37);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray37);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; shortDescription=; values={V=J}; bound]", type22, typeArray37);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray37);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Jhi!" + "'", str17, "Jhi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(JJV)J" + "'", str28, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(JJV)J" + "'", str29, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "V" + "'", str32, "V");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(JJV)J" + "'", str38, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(JJV)V" + "'", str40, "(JJV)V");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(JJV)Ljava/beans/PropertyDescriptor;" + "'", str42, "(JJV)Ljava/beans/PropertyDescriptor;");
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(JJV)J", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.lang.String str7 = propertyDescriptor3.getDisplayName();
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getClass();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type17, type18, type19 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray20);
        int int23 = type15.getSort();
        propertyDescriptor13.setValue("V", (java.lang.Object) type15);
        java.lang.Class<?> wildcardClass25 = propertyDescriptor13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass25);
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass25);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method29 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass8, "(JJV)J", classArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: (JJV)J");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(JJV)J" + "'", str7, "(JJV)J");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(JJV)J" + "'", str21, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(JJV)J" + "'", str22, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertNotNull(propertyDescriptorArray27);
        org.junit.Assert.assertNotNull(classArray28);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method21 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setShortDescription("SS");
        propertyDescriptor3.setConstrained(true);
        propertyDescriptor3.setConstrained(false);
        java.lang.reflect.Method method11 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setReadMethod(method12);
        java.lang.String str14 = propertyDescriptor3.getName();
        java.lang.reflect.Method method15 = null;
        propertyDescriptor3.setReadMethod(method15);
        boolean boolean17 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method24 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str19, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java/beans/PropertyDescriptor" + "'", str20, "java/beans/PropertyDescriptor");
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str23, "Ljava/beans/PropertyDescriptor;");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("C");
        java.lang.String str2 = type1.toString();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "C" + "'", str2, "C");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(JJV)J");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setShortDescription("LS;");
        java.lang.String str21 = propertyDescriptor3.getShortDescription();
        boolean boolean22 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LS;" + "'", str21, "LS;");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setShortDescription("SS");
        propertyDescriptor3.setConstrained(true);
        propertyDescriptor3.setConstrained(false);
        propertyDescriptor3.setPreferred(false);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray16 = org.mockito.asm.Type.getArgumentTypes("()J");
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("V", type14, typeArray16);
        boolean boolean18 = propertyDescriptor3.equals((java.lang.Object) type14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("long");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getName();
        boolean boolean18 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("(JJV)J", method20, method21);
        propertyDescriptor22.setShortDescription("J");
        propertyDescriptor3.setValue("(JJV)J", (java.lang.Object) "J");
        propertyDescriptor3.setPreferred(true);
        java.lang.reflect.Method method28 = null;
        propertyDescriptor3.setReadMethod(method28);
        boolean boolean30 = propertyDescriptor3.isHidden();
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("Z()J");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->Z");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "Llong;", "(JJV)J" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, false);
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray9, true, false);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, false, false);
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(methodArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(methodArray18);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        int int21 = type19.getOpcode((int) '4');
        java.lang.String str22 = type19.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type25, type26, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray28);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray28);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type34, type35, type36 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray37);
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray37);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray37);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray37);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 53 + "'", int21 == 53);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "J" + "'", str22, "J");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(JJV)J" + "'", str29, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(JJV)J" + "'", str30, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(JJV)J" + "'", str31, "(JJV)J");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(JJV)J" + "'", str38, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(JJV)J" + "'", str39, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(JJV)J" + "'", str40, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(JJV)Ljava/beans/PropertyDescriptor;" + "'", str41, "(JJV)Ljava/beans/PropertyDescriptor;");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.lang.Class class0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method9 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod(class0, "java.beans.PropertyDescriptor[name=hi!; displayName=Jhi!; shortDescription=(JJV)V; values={V=J}]", classArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: java.beans.PropertyDescriptor[name=hi!; displayName=Jhi!; shortDescription=(JJV)V; values={V=J}]");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(JJV)J" + "'", str7, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray8);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        java.lang.Class<?> wildcardClass6 = type0.getClass();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(JJV)J" + "'", str5, "(JJV)J");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=hi!; displayName=; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 124");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(JJV)J", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.lang.String str7 = propertyDescriptor3.getDisplayName();
        boolean boolean8 = propertyDescriptor3.isHidden();
        java.lang.String str9 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(JJV)J" + "'", str7, "(JJV)J");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.beans.PropertyDescriptor[name=(JJV)J; shortDescription=J]" + "'", str9, "java.beans.PropertyDescriptor[name=(JJV)J; shortDescription=J]");
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        byte[] byteArray2 = new byte[] { (byte) 0 };
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class4 = org.mockito.cglib.core.ReflectUtils.defineClass("C", byteArray2, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0]");
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray7 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "S" + "'", str3, "S");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "S" + "'", str4, "S");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "S" + "'", str6, "S");
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setWriteMethod(method4);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(false);
        java.lang.Class<?> wildcardClass9 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.util.List list13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list14 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass9, list13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(type12);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(JJV)J", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.lang.Object obj8 = propertyDescriptor3.getValue("Llong;");
        boolean boolean9 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method10 = null;
        propertyDescriptor3.setReadMethod(method10);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]", method13, method14);
        propertyDescriptor15.setConstrained(true);
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(propertyEditor18);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.util.List list19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list20 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass15, list19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        java.lang.Object obj21 = propertyDescriptor3.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor3.attributeNames();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        int int27 = type24.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type30, type31, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray33);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("S", type24, typeArray33);
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature36);
        java.lang.Class<?> wildcardClass38 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass38);
        java.util.List list40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list41 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass38, list40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(JJV)J" + "'", str11, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(JJV)J" + "'", str12, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strEnumeration22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "J" + "'", str25, "J");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(JJV)J" + "'", str34, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(JJV)J" + "'", str35, "(JJV)J");
        org.junit.Assert.assertNull(propertyEditor37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(propertyDescriptorArray39);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setHidden(false);
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method8 = null;
        propertyDescriptor3.setWriteMethod(method8);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.util.Enumeration<java.lang.String> strEnumeration15 = propertyDescriptor14.attributeNames();
        propertyDescriptor14.setHidden(false);
        boolean boolean18 = propertyDescriptor14.isHidden();
        propertyDescriptor14.setConstrained(false);
        propertyDescriptor3.setValue("hi!(JJV)J", (java.lang.Object) propertyDescriptor14);
        java.lang.String str22 = propertyDescriptor3.getDisplayName();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strEnumeration15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("long", "Llong;");
        java.lang.String str3 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "longLlong;" + "'", str3, "longLlong;");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J" + "'", str3, "J");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("C", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setHidden(false);
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setShortDescription("Ljava/beans/PropertyDescriptor;");
        java.lang.String str10 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setHidden(true);
        propertyDescriptor3.setDisplayName("java.beans.PropertyDescriptor[name=hi!; values={V=J}]");
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("java.beans.PropertyDescriptor[name=hi!; values={V=J}]");
        boolean boolean18 = propertyDescriptor3.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=hi!; values={V=J}]");
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ljava/beans/PropertyDescriptor;" + "'", str10, "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
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
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type5, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray8);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray10);
        boolean boolean13 = signature2.equals((java.lang.Object) classArray12);
        java.lang.String str14 = signature2.getName();
        java.lang.String str15 = signature2.getDescriptor();
        java.lang.String str16 = signature2.getDescriptor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "J" + "'", str3, "J");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(JJV)J" + "'", str9, "(JJV)J");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "J" + "'", str14, "J");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        int int3 = type1.getOpcode((int) (byte) 10);
        java.lang.String str4 = type1.toString();
        int int5 = type1.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType("S");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type18, type19, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray21);
        int int24 = type16.getSort();
        propertyDescriptor14.setValue("V", (java.lang.Object) type16);
        java.lang.Class<?> wildcardClass26 = propertyDescriptor14.getPropertyEditorClass();
        propertyDescriptor14.setValue("V", (java.lang.Object) 9);
        boolean boolean30 = type10.equals((java.lang.Object) propertyDescriptor14);
        java.lang.String str31 = propertyDescriptor14.getName();
        boolean boolean32 = propertyDescriptor14.isExpert();
        propertyDescriptor14.setName("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        boolean boolean35 = type8.equals((java.lang.Object) propertyDescriptor14);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type39, type40, type41 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray42);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray42);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=V; shortDescription=long]", type8, typeArray42);
        org.mockito.asm.Type[] typeArray46 = signature45.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=V; shortDescription=long](JJV)S", type1, typeArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'java.beans.PropertyDescriptor[name=V; shortDescription=long](JJV)S' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "S" + "'", str4, "S");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(JJV)J" + "'", str22, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(JJV)J" + "'", str23, "(JJV)J");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "V" + "'", str37, "V");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(JJV)J" + "'", str43, "(JJV)J");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(JJV)V" + "'", str44, "(JJV)V");
        org.junit.Assert.assertNotNull(typeArray46);
    }
}

