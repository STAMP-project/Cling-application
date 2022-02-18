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
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
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
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
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
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
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
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        int int0 = org.mockito.asm.Type.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
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
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        int int0 = org.mockito.cglib.core.CodeEmitter.SUB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        int int0 = org.mockito.asm.Type.OBJECT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
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
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
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
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.Class class1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer2 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray0, class1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
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
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        int int0 = org.mockito.cglib.core.CodeEmitter.GT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 157 + "'", int0 == 157);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        int int0 = org.mockito.cglib.core.CodeEmitter.XOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 130 + "'", int0 == 130);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
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
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int0 = org.mockito.asm.Type.BOOLEAN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        int int0 = org.mockito.cglib.core.CodeEmitter.ADD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 96 + "'", int0 == 96);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        int int0 = org.mockito.cglib.core.CodeEmitter.REM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 112 + "'", int0 == 112);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
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
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        int int0 = org.mockito.cglib.core.CodeEmitter.OR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        int int0 = org.mockito.cglib.core.CodeEmitter.NEG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 116 + "'", int0 == 116);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        java.lang.Class class0 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method9 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod(class0, "hi!", classArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: hi!");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray8);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method[] methodArray6 = new java.lang.reflect.Method[] { method5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(methodArray6);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int0 = org.mockito.asm.Type.DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        int int0 = org.mockito.asm.Type.BYTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        int int0 = org.mockito.cglib.core.CodeEmitter.EQ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 153 + "'", int0 == 153);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
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
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
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
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
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
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter1 = new org.mockito.cglib.core.CodeEmitter(codeEmitter0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        int int0 = org.mockito.asm.Type.VOID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor7 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass1, classArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str2, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method4 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        int int0 = org.mockito.cglib.core.CodeEmitter.LE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 158 + "'", int0 == 158);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.Class[] classArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor3 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass1, classArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        boolean boolean6 = signature3.equals((java.lang.Object) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        int int12 = type8.getOpcode(100);
        int int13 = type8.getSize();
        java.lang.String str14 = type8.getDescriptor();
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        boolean boolean20 = signature17.equals((java.lang.Object) wildcardClass19);
        java.lang.String str21 = signature17.getName();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 4, boolean6, '#', type8, signature17 };
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass25 = type24.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer27 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray23, (java.lang.Class) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[4, false, #, Z, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[4, false, #, Z, ]");
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org/mockito/asm/Type" + "'", str26, "org/mockito/asm/Type");
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        int int0 = org.mockito.cglib.core.CodeEmitter.AND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 126 + "'", int0 == 126);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        int int0 = org.mockito.asm.Type.ARRAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        int int0 = org.mockito.asm.Type.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass3 = type2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer6 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray0, (java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        int int0 = org.mockito.cglib.core.CodeEmitter.GE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 156 + "'", int0 == 156);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("(Z)C", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        int int0 = org.mockito.cglib.core.CodeEmitter.DIV;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 108 + "'", int0 == 108);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray7 = new java.lang.Class[] { wildcardClass4 };
        java.lang.Object[] objArray13 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1, classArray7, objArray13);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str5, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray14);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
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
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = type0.getClass();
        java.util.List list4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list5 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass3, list4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("char", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        int int0 = org.mockito.cglib.core.CodeEmitter.USHR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 124 + "'", int0 == 124);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
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
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("char");
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
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        int int0 = org.mockito.cglib.core.CodeEmitter.MUL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 104 + "'", int0 == 104);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str2, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        java.lang.String str6 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray7);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = type0.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 124);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        int int0 = org.mockito.asm.Type.FLOAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        boolean boolean13 = propertyDescriptor3.equals((java.lang.Object) "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("D");
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.asm.Type[] typeArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("(Z)C", type2, typeArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "D" + "'", str3, "D");
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method4 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        int int0 = org.mockito.cglib.core.CodeEmitter.NE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 154 + "'", int0 == 154);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
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
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("()D", classLoader1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("char");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("char", "");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("(Z)C", classLoader1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(0);
        int int4 = type0.getOpcode((int) (byte) 1);
        java.lang.String str5 = type0.getClassName();
        java.lang.String str6 = type0.getDescriptor();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "char" + "'", str5, "char");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "C" + "'", str6, "C");
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass3 = type2.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        java.lang.Class[] classArray9 = new java.lang.Class[] { wildcardClass1, wildcardClass3, wildcardClass7 };
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass13 = type12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer14 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray9, (java.lang.Class) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str4, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        boolean boolean10 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setShortDescription("Z");
        boolean boolean13 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        boolean boolean12 = propertyDescriptor3.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        int int0 = org.mockito.cglib.core.CodeEmitter.LT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 155 + "'", int0 == 155);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
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
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        boolean boolean6 = signature3.equals((java.lang.Object) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        int int12 = type8.getOpcode(100);
        int int13 = type8.getSize();
        java.lang.String str14 = type8.getDescriptor();
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        boolean boolean20 = signature17.equals((java.lang.Object) wildcardClass19);
        java.lang.String str21 = signature17.getName();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 4, boolean6, '#', type8, signature17 };
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass25 = type24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass25);
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer28 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray23, (java.lang.Class) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Z" + "'", str14, "Z");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[4, false, #, Z, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[4, false, #, Z, ]");
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org/mockito/asm/Type" + "'", str27, "org/mockito/asm/Type");
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        propertyDescriptor3.setExpert(false);
        boolean boolean14 = propertyDescriptor3.equals((java.lang.Object) 'a');
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("D");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        boolean boolean11 = propertyDescriptor3.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
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
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
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
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str3 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/TypeLorg/mockito/asm/Type;" + "'", str3, "org/mockito/asm/TypeLorg/mockito/asm/Type;");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type6 = classInfo5.getSuperType();
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        boolean boolean12 = signature9.equals((java.lang.Object) wildcardClass11);
        java.lang.String str13 = signature9.getName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray18);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        boolean boolean24 = type21.equals((java.lang.Object) (-1));
        java.lang.Object[] objArray26 = new java.lang.Object[] { classInfo5, signature9, str19, (byte) 1, (-1), 3 };
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, objArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(Z)C" + "'", str19, "(Z)C");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "D" + "'", str22, "D");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[org.mockito.asm.Type, , (Z)C, 1, -1, 3]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[org.mockito.asm.Type, , (Z)C, 1, -1, 3]");
        org.junit.Assert.assertNotNull(classArray27);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        java.lang.String str9 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        java.lang.Class[] classArray10 = new java.lang.Class[] { wildcardClass2, wildcardClass4, wildcardClass8 };
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) classArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str5, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str9, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("long");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = signature2.getClass();
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass6, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setConstrained(true);
        propertyDescriptor3.setConstrained(true);
        java.lang.String str8 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.beans.PropertyDescriptor[name=(Z)C; constrained]" + "'", str8, "java.beans.PropertyDescriptor[name=(Z)C; constrained]");
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
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
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class9 = org.mockito.cglib.core.ReflectUtils.defineClass("(Z)C", byteArray7, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, 1, 100, -1]");
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        int int0 = org.mockito.asm.Type.CHAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str3 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass7, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("org/mockito/asm/TypeLorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        boolean boolean8 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("double", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setPreferred(true);
        java.lang.reflect.Method method12 = propertyDescriptor3.getReadMethod();
        boolean boolean13 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("org.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
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
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans.PropertyDescriptor[name=");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("org.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray10 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray11);
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor14 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass7, classArray12);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str2, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method9 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass10);
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        java.lang.Class[] classArray14 = new java.lang.Class[] { wildcardClass7, wildcardClass10 };
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer18 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray14, (java.lang.Class) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org/mockito/asm/Type" + "'", str12, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(type17);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        java.lang.String str10 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]" + "'", str10, "java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]");
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray3 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray3);
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray4);
        int int6 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(methodArray4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = classInfo9.getType();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type10);
        boolean boolean12 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(classInfo9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNull(propertyEditor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str6, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 0 };
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class9 = org.mockito.cglib.core.ReflectUtils.defineClass("java.beans.PropertyDescriptor[name=(Z)C; constrained]", byteArray7, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 1, 0, 1, 0]");
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        java.lang.String str6 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray7 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str2, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        org.mockito.asm.Type[] typeArray7 = classInfo4.getInterfaces();
        org.mockito.asm.Type[] typeArray8 = classInfo4.getInterfaces();
        java.lang.Class<?> wildcardClass9 = typeArray8.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type16 = classInfo15.getSuperType();
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass21 = type20.getClass();
        boolean boolean22 = signature19.equals((java.lang.Object) wildcardClass21);
        java.lang.String str23 = signature19.getName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean27 = type25.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type25 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        boolean boolean34 = type31.equals((java.lang.Object) (-1));
        java.lang.Object[] objArray36 = new java.lang.Object[] { classInfo15, signature19, str29, (byte) 1, (-1), 3 };
        java.lang.Class[] classArray37 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method38 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass9, "(Z)Lchar;", classArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: (Z)Lchar;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/Type" + "'", str14, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(Z)C" + "'", str29, "(Z)C");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "D" + "'", str32, "D");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[org.mockito.asm.Type, , (Z)C, 1, -1, 3]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[org.mockito.asm.Type, , (Z)C, 1, -1, 3]");
        org.junit.Assert.assertNotNull(classArray37);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
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
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) classArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(classArray8);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("char", "");
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("(Z)C", method4, method5);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor6.setValue("org/mockito/asm/Type", (java.lang.Object) signature10);
        java.lang.String str12 = propertyDescriptor6.getDisplayName();
        boolean boolean13 = propertyDescriptor6.isHidden();
        propertyDescriptor6.setShortDescription("Z");
        java.lang.Object obj17 = propertyDescriptor6.getValue("org.mockito.asm.Type");
        boolean boolean18 = signature2.equals((java.lang.Object) propertyDescriptor6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type19 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(Z)C" + "'", str12, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 100 };
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = org.mockito.cglib.core.ReflectUtils.defineClass("hi!", byteArray3, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 100]");
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setPreferred(true);
        java.lang.reflect.Method method12 = propertyDescriptor3.getReadMethod();
        java.lang.String str13 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]" + "'", str13, "java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]");
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("long");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        java.lang.Object[] objArray11 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray11);
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor14 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass4, classArray12);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Byte, java.lang.Short, java.lang.Character, java.lang.Integer, java.lang.Float)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("(Z)Lchar;", classLoader1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        boolean boolean6 = signature3.equals((java.lang.Object) wildcardClass5);
        boolean boolean7 = type0.equals((java.lang.Object) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        java.lang.Class[] classArray17 = new java.lang.Class[] { wildcardClass9, wildcardClass11, wildcardClass15 };
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor19 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass5, classArray17);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(org.mockito.asm.Type, org.mockito.asm.Type, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str12, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str16, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.util.List list9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list10 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass4, list9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str7, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org/mockito/asm/Type" + "'", str8, "org/mockito/asm/Type");
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type9 = classInfo8.getSuperType();
        org.mockito.asm.Type type10 = classInfo8.getSuperType();
        org.mockito.asm.Type[] typeArray11 = classInfo8.getInterfaces();
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("()Lchar;", type1, typeArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()Lchar;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "()Z" + "'", str12, "()Z");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "D" + "'", str14, "D");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "()D" + "'", str16, "()D");
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("(Z)Lchar;");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (byte) 0);
        int int13 = type9.getOpcode(100);
        int int14 = type9.getSize();
        java.lang.String str15 = type9.getDescriptor();
        boolean boolean16 = propertyDescriptor3.equals((java.lang.Object) str15);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type[] typeArray16 = classInfo15.getInterfaces();
        int int17 = classInfo15.getModifiers();
        propertyDescriptor3.setValue("()D", (java.lang.Object) int17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str20 = type19.getClassName();
        int int21 = type19.getSize();
        boolean boolean22 = propertyDescriptor3.equals((java.lang.Object) int21);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org/mockito/asm/Type" + "'", str13, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "char" + "'", str20, "char");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str7, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("org/mockito/asm/TypeLorg/mockito/asm/Type;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("char", "");
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("(Z)C", method4, method5);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor6.setValue("org/mockito/asm/Type", (java.lang.Object) signature10);
        java.lang.String str12 = propertyDescriptor6.getDisplayName();
        boolean boolean13 = propertyDescriptor6.isHidden();
        propertyDescriptor6.setShortDescription("Z");
        java.lang.Object obj17 = propertyDescriptor6.getValue("org.mockito.asm.Type");
        boolean boolean18 = signature2.equals((java.lang.Object) propertyDescriptor6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray19 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(Z)C" + "'", str12, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("D");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 76");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
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
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor10 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass1, classArray8);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Byte, java.lang.Short, java.lang.Character, java.lang.Integer, java.lang.Float)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Lg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        java.lang.Object[] objArray11 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray11);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray11);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor15 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass1, classArray14);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Byte, java.lang.Short, java.lang.Character, java.lang.Integer, java.lang.Float)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(classArray14);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setValue("org/mockito/asm/TypeLorg/mockito/asm/Type;", (java.lang.Object) 10.0d);
        boolean boolean11 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        boolean boolean7 = signature2.equals((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray8 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
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
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("Ljava/lang/Object;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(Z)Lchar;", "boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(Z)Lchar;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        int int7 = type0.getOpcode(4);
        int int9 = type0.getOpcode((int) ' ');
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        boolean boolean13 = type10.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass14 = type10.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass14);
        boolean boolean17 = type0.equals((java.lang.Object) wildcardClass14);
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method21 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass14, "Lg/mockito/asm/Type;", classArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: Lg/mockito/asm/Type;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "D" + "'", str11, "D");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/Type" + "'", str15, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 112);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("short");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
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
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        org.mockito.asm.Type[] typeArray7 = classInfo4.getInterfaces();
        org.mockito.asm.Type[] typeArray8 = classInfo4.getInterfaces();
        java.lang.Class<?> wildcardClass9 = typeArray8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method12 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Lorg.mockito.asm.Type; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = classInfo9.getType();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type10);
        java.lang.Class<?> wildcardClass12 = propertyDescriptor3.getPropertyEditorClass();
        boolean boolean13 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(classInfo9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNull(propertyEditor11);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        propertyDescriptor3.setExpert(false);
        java.lang.Class<?> wildcardClass13 = propertyDescriptor3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans.PropertyDescriptor[name=");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("Z");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray13);
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor16 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass7, classArray14);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Byte, java.lang.Short, java.lang.Character, java.lang.Integer, java.lang.Float)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        java.lang.String str14 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        propertyDescriptor3.setValue("()D", (java.lang.Object) str14);
        java.lang.String str16 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/asm/Type" + "'", str11, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str13, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str14, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.beans.PropertyDescriptor[name=(Z)C; values={()D=Lorg/mockito/asm/Type;}]" + "'", str16, "java.beans.PropertyDescriptor[name=(Z)C; values={()D=Lorg/mockito/asm/Type;}]");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setShortDescription("long");
        boolean boolean16 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("org/mockito/asm/TypeLorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 42");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("org.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("double");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        boolean boolean6 = signature3.equals((java.lang.Object) wildcardClass5);
        boolean boolean7 = type0.equals((java.lang.Object) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method9 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        boolean boolean3 = type0.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "D" + "'", str1, "D");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        int int3 = type0.getOpcode(32);
        int int5 = type0.getOpcode((int) '4');
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 55 + "'", int5 == 55);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=(Z)C; values={()D=Lorg/mockito/asm/Type;}]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 77");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        boolean boolean10 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setShortDescription("Z");
        java.lang.Object obj14 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("(Z)C", method16, method17);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor18.setValue("org/mockito/asm/Type", (java.lang.Object) signature22);
        java.lang.String str24 = propertyDescriptor18.getDisplayName();
        propertyDescriptor18.setHidden(false);
        propertyDescriptor18.setHidden(false);
        propertyDescriptor18.setName("org/mockito/asm/Type");
        boolean boolean31 = propertyDescriptor3.equals((java.lang.Object) propertyDescriptor18);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(Z)C" + "'", str24, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setName("Lorg/mockito/asm/Type;");
        propertyDescriptor3.setBound(true);
        boolean boolean9 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
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
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method11 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str5, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type[] typeArray6 = classInfo5.getInterfaces();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass8);
        boolean boolean10 = classInfo5.equals((java.lang.Object) wildcardClass8);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray16);
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor20 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass8, classArray17);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Byte, java.lang.Short, java.lang.Character, java.lang.Integer, java.lang.Float)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        boolean boolean6 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setName("boolean");
        boolean boolean9 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        boolean boolean4 = propertyDescriptor3.isPreferred();
        boolean boolean5 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass7, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
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
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("double");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        java.lang.Class[] classArray17 = new java.lang.Class[] { wildcardClass9, wildcardClass11, wildcardClass15 };
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        int int22 = type20.getOpcode(0);
        int int23 = type20.getSort();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass25 = type24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass25);
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass25);
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type[] typeArray30 = classInfo29.getInterfaces();
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type20, typeArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4, classArray17, (java.lang.Object[]) typeArray30);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(org.mockito.asm.Type, org.mockito.asm.Type, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str12, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str16, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org/mockito/asm/Type" + "'", str27, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertNotNull(classInfo29);
        org.junit.Assert.assertNotNull(typeArray30);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.String str7 = propertyDescriptor3.getName();
        propertyDescriptor3.setShortDescription("()D");
        boolean boolean10 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(Z)C" + "'", str7, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1 };
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class7 = org.mockito.cglib.core.ReflectUtils.defineClass("org/mockito/asm/TypeLorg/mockito/asm/Type;", byteArray5, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 10, 1, 1]");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        boolean boolean7 = propertyDescriptor3.isExpert();
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str9 = propertyDescriptor3.getName();
        java.lang.String str10 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.beans.PropertyDescriptor[name=(Z)C; bound]" + "'", str10, "java.beans.PropertyDescriptor[name=(Z)C; bound]");
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
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
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray7, true, true);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray10);
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray18, true, true);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray21);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str5, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str16, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(methodArray23);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Ljava/lang/Object;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = type0.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass3, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        java.lang.Class[] classArray0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type6 = classInfo5.getSuperType();
        org.mockito.asm.Type type7 = classInfo5.getSuperType();
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer12 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray0, (java.lang.Class) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method10 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str9, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = signature2.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass9);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, true);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray10);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method16 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass6, "", classArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: ");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(classArray15);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        propertyDescriptor3.setExpert(false);
        java.lang.Class<?> wildcardClass13 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method18 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass13, "S", classArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: S");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.beans.PropertyEditor propertyEditor8 = propertyDescriptor3.createPropertyEditor((java.lang.Object) 104);
        java.lang.String str9 = propertyDescriptor3.getShortDescription();
        java.lang.String str10 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(propertyEditor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.beans.PropertyDescriptor[name=(Z)C; bound]" + "'", str10, "java.beans.PropertyDescriptor[name=(Z)C; bound]");
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = type0.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass3, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
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
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] {};
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray6);
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("double", type3, typeArray6);
        org.mockito.asm.Type type9 = signature8.getReturnType();
        int int10 = type9.getSize();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "D" + "'", str5, "D");
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "()D" + "'", str7, "()D");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = classInfo9.getType();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type10);
        java.lang.Class<?> wildcardClass12 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(true);
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        propertyDescriptor3.setConstrained(true);
        java.lang.reflect.Method method19 = null;
        propertyDescriptor3.setWriteMethod(method19);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(classInfo9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNull(propertyEditor11);
        org.junit.Assert.assertNull(wildcardClass12);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str11 = propertyDescriptor3.getName();
        java.lang.String str12 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(Z)C" + "'", str11, "(Z)C");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.beans.PropertyDescriptor[name=(Z)C; bound]" + "'", str12, "java.beans.PropertyDescriptor[name=(Z)C; bound]");
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("Lg/mockito/asm/Type;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(Z)C");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method5 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setShortDescription("Z");
        boolean boolean12 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.String str7 = propertyDescriptor3.getName();
        java.lang.Object obj8 = null;
        boolean boolean9 = propertyDescriptor3.equals(obj8);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(Z)C" + "'", str7, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
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
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method[] methodArray5 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray2, true, true);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray2);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type13 = classInfo12.getSuperType();
        org.mockito.asm.Type type14 = classInfo12.getSuperType();
        org.mockito.asm.Type[] typeArray15 = classInfo12.getInterfaces();
        org.mockito.asm.Type[] typeArray16 = classInfo12.getInterfaces();
        java.lang.Class<?> wildcardClass17 = typeArray16.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer20 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray6, (java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Lorg.mockito.asm.Type;.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(methodArray5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/asm/Type" + "'", str11, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = signature7.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type10 = signature7.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "char" + "'", str9, "char");
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        boolean boolean9 = signature6.equals((java.lang.Object) wildcardClass8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 0);
        int int15 = type11.getOpcode(100);
        int int16 = type11.getSize();
        java.lang.String str17 = type11.getDescriptor();
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass22 = type21.getClass();
        boolean boolean23 = signature20.equals((java.lang.Object) wildcardClass22);
        java.lang.String str24 = signature20.getName();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 4, boolean9, '#', type11, signature20 };
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass30 = type27.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass30);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray31, true, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1, classArray26, (java.lang.Object[]) propertyDescriptorArray31);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Integer, java.lang.Boolean, java.lang.Character, org.mockito.asm.Type, org.mockito.cglib.core.Signature)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z" + "'", str17, "Z");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[4, false, #, Z, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[4, false, #, Z, ]");
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(propertyDescriptorArray31);
        org.junit.Assert.assertNotNull(methodArray34);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        int int7 = type0.getOpcode(4);
        int int9 = type0.getOpcode((int) ' ');
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type16 = classInfo15.getType();
        org.mockito.asm.Type type17 = type16.getElementType();
        java.lang.String str18 = type17.toString();
        boolean boolean19 = type0.equals((java.lang.Object) str18);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org/mockito/asm/Type" + "'", str13, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lg/mockito/asm/Type;" + "'", str18, "Lg/mockito/asm/Type;");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = type0.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray15);
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method19 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "Lchar;", classArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: Lchar;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        java.lang.String str8 = propertyDescriptor3.getName();
        boolean boolean9 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(Z)C" + "'", str8, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("()Lg/mockito/asm/Type;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("S");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
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
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass3 = type2.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        java.lang.Class[] classArray9 = new java.lang.Class[] { wildcardClass1, wildcardClass3, wildcardClass7 };
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer14 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray9, (java.lang.Class) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str4, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(type13);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("long");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class4 = org.mockito.cglib.core.ReflectUtils.defineClass("()Z", byteArray2, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10]");
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("short");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=(Z)C; bound]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 47");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getDescriptor();
        java.lang.String str5 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray6 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str4, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/TypeLorg/mockito/asm/Type;" + "'", str5, "org/mockito/asm/TypeLorg/mockito/asm/Type;");
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type[] typeArray6 = classInfo5.getInterfaces();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        boolean boolean9 = classInfo5.equals((java.lang.Object) type7);
        int int10 = type7.getSize();
        int int11 = type7.getSize();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "D" + "'", str8, "D");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java/beans/PropertyDescriptor");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(Z)Lchar;", "B");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(Z)Lchar;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("D");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = type0.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass11);
        java.lang.Class[] classArray13 = new java.lang.Class[] { wildcardClass5, wildcardClass7, wildcardClass11 };
        int int14 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray13);
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor16 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass3, classArray13);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(org.mockito.asm.Type, org.mockito.asm.Type, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str12, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        java.util.Enumeration<java.lang.String> strEnumeration5 = propertyDescriptor3.attributeNames();
        boolean boolean6 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNotNull(strEnumeration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass15);
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type19 = classInfo18.getSuperType();
        org.mockito.asm.Type type20 = classInfo18.getSuperType();
        org.mockito.asm.Type[] typeArray21 = classInfo18.getInterfaces();
        org.mockito.asm.Type type22 = classInfo18.getType();
        boolean boolean23 = propertyDescriptor3.equals((java.lang.Object) classInfo18);
        org.junit.Assert.assertNotNull(strEnumeration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(propertyEditor13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org/mockito/asm/Type" + "'", str17, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method5 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("()Lchar;", "F");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()Lchar;' is invalid");
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
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setName("org/mockito/asm/Type");
        propertyDescriptor3.setDisplayName("long");
        java.lang.String str18 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.beans.PropertyDescriptor[name=org/mockito/asm/Type; displayName=long; values={org/mockito/asm/Type=char}]" + "'", str18, "java.beans.PropertyDescriptor[name=org/mockito/asm/Type; displayName=long; values={org/mockito/asm/Type=char}]");
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        boolean boolean7 = signature2.equals((java.lang.Object) (short) 1);
        java.lang.String str8 = signature2.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (byte) 0);
        int int13 = type9.getOpcode(100);
        int int14 = type9.getSize();
        int int16 = type9.getOpcode(4);
        int int18 = type9.getOpcode((int) ' ');
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] {};
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray21);
        java.lang.String str24 = type9.toString();
        boolean boolean25 = signature2.equals((java.lang.Object) str24);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type26 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "D" + "'", str20, "D");
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "()D" + "'", str22, "()D");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "()Z" + "'", str23, "()Z");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z" + "'", str24, "Z");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("char");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("g.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("char");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type6 = classInfo5.getSuperType();
        org.mockito.asm.Type type7 = classInfo5.getSuperType();
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) propertyDescriptorArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        propertyDescriptor3.setExpert(false);
        java.lang.Class<?> wildcardClass13 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method15 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class java.beans.PropertyDescriptor is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(type14);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        boolean boolean6 = signature3.equals((java.lang.Object) wildcardClass5);
        boolean boolean7 = type0.equals((java.lang.Object) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass11);
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray12, true, true);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray12);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray16);
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method19 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass5, "(Z)Lchar;", classArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: (Z)Lchar;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("B");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method4 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("()Lg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
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
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
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
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method9 = null;
        propertyDescriptor3.setWriteMethod(method9);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method12, method13);
        propertyDescriptor14.setPreferred(false);
        boolean boolean17 = propertyDescriptor3.equals((java.lang.Object) false);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "C");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("Lchar;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setValue("()Z", (java.lang.Object) 9);
        propertyDescriptor3.setName("Ljava/lang/Object;");
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getPropertyEditorClass();
        boolean boolean19 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setShortDescription("Z");
        boolean boolean12 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setBound(false);
        java.lang.reflect.Method method15 = null;
        propertyDescriptor3.setReadMethod(method15);
        boolean boolean17 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        boolean boolean3 = type0.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "D" + "'", str1, "D");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str7, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) 10 };
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class6 = org.mockito.cglib.core.ReflectUtils.defineClass("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", byteArray4, classLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 0, 10]");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass1, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.String str7 = propertyDescriptor3.getName();
        propertyDescriptor3.setShortDescription("()D");
        java.lang.reflect.Method method10 = propertyDescriptor3.getReadMethod();
        boolean boolean11 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(Z)C" + "'", str7, "(Z)C");
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        boolean boolean6 = signature3.equals((java.lang.Object) wildcardClass5);
        java.lang.String str7 = signature3.getName();
        boolean boolean8 = type0.equals((java.lang.Object) str7);
        java.lang.String str9 = type0.getDescriptor();
        java.lang.Class<?> wildcardClass10 = type0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method11 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setName("()Z");
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        boolean boolean13 = signature10.equals((java.lang.Object) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        boolean boolean15 = propertyDescriptor3.equals((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        org.mockito.asm.Type[] typeArray7 = classInfo4.getInterfaces();
        org.mockito.asm.Type[] typeArray8 = classInfo4.getInterfaces();
        java.lang.Class<?> wildcardClass9 = typeArray8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        java.util.List list11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass9, list11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.mockito.asm.Type type1 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean5 = type3.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("()Z", type1, typeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(Z)C" + "'", str7, "(Z)C");
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method9 = null;
        propertyDescriptor3.setWriteMethod(method9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass13 = type12.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass13);
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type[] typeArray17 = classInfo16.getInterfaces();
        boolean boolean19 = classInfo16.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray20 = classInfo16.getInterfaces();
        org.mockito.asm.Type type21 = classInfo16.getSuperType();
        propertyDescriptor3.setValue("()Lg/mockito/asm/Type;", (java.lang.Object) classInfo16);
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("(Z)C", method24, method25);
        propertyDescriptor26.setBound(true);
        java.lang.Class<?> wildcardClass29 = propertyDescriptor26.getPropertyType();
        java.lang.Object obj31 = propertyDescriptor26.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method32 = null;
        propertyDescriptor26.setWriteMethod(method32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass36 = type35.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass36);
        java.lang.String str38 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass36);
        org.mockito.cglib.core.ClassInfo classInfo39 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass36);
        org.mockito.asm.Type[] typeArray40 = classInfo39.getInterfaces();
        boolean boolean42 = classInfo39.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray43 = classInfo39.getInterfaces();
        org.mockito.asm.Type type44 = classInfo39.getSuperType();
        propertyDescriptor26.setValue("()Lg/mockito/asm/Type;", (java.lang.Object) classInfo39);
        boolean boolean46 = classInfo16.equals((java.lang.Object) propertyDescriptor26);
        int int47 = classInfo16.getModifiers();
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/Type" + "'", str15, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNull(wildcardClass29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(propertyDescriptorArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org/mockito/asm/Type" + "'", str38, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setConstrained(true);
        propertyDescriptor3.setConstrained(true);
        boolean boolean8 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        java.lang.Class class0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray6);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor10 = org.mockito.cglib.core.ReflectUtils.getConstructor(class0, classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("(Z)Lchar;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("short");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        propertyDescriptor9.setBound(false);
        java.lang.Class<?> wildcardClass16 = propertyDescriptor9.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor19 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass16, classArray17);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEnumeration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(propertyEditor13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str7, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org/mockito/asm/Type" + "'", str8, "org/mockito/asm/Type");
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("S", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("org/mockito/asm/TypeLorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        org.mockito.asm.Type type7 = classInfo4.getSuperType();
        org.mockito.asm.Type[] typeArray8 = classInfo4.getInterfaces();
        int int9 = classInfo4.getModifiers();
        java.lang.Class<?> wildcardClass10 = classInfo4.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray16);
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor19 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass10, classArray17);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.ReflectUtils$4.<init>(java.lang.Byte, java.lang.Short, java.lang.Character, java.lang.Integer, java.lang.Float)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class4 = org.mockito.cglib.core.ReflectUtils.defineClass("F", byteArray2, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("Ljava/lang/Object;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        boolean boolean7 = signature2.equals((java.lang.Object) (short) 1);
        java.lang.String str8 = signature2.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (byte) 0);
        int int13 = type9.getOpcode(100);
        int int14 = type9.getSize();
        int int16 = type9.getOpcode(4);
        int int18 = type9.getOpcode((int) ' ');
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] {};
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray21);
        java.lang.String str24 = type9.toString();
        boolean boolean25 = signature2.equals((java.lang.Object) str24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass27 = type26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass27);
        java.lang.String str29 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass27);
        org.mockito.cglib.core.ClassInfo classInfo31 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        java.lang.Class<?> wildcardClass33 = type32.getClass();
        java.lang.String str34 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass33);
        java.lang.String str35 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass33);
        boolean boolean36 = signature2.equals((java.lang.Object) wildcardClass33);
        java.util.List list37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list38 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass33, list37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "D" + "'", str20, "D");
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "()D" + "'", str22, "()D");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "()Z" + "'", str23, "()Z");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z" + "'", str24, "Z");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org/mockito/asm/Type" + "'", str29, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray30);
        org.junit.Assert.assertNotNull(classInfo31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str34, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str35, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method8 = null;
        propertyDescriptor3.setWriteMethod(method8);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str11 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.beans.PropertyDescriptor[name=(Z)C]" + "'", str11, "java.beans.PropertyDescriptor[name=(Z)C]");
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        boolean boolean7 = signature4.equals((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = signature4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer9 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray0, (java.lang.Class) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.Signature.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=(Z)C; constrained]", classLoader1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setName("org/mockito/asm/Type");
        propertyDescriptor3.setDisplayName("long");
        boolean boolean18 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setName("org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass22 = type21.getClass();
        java.beans.PropertyEditor propertyEditor23 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass22);
        java.util.List list26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list27 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass22, list26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(propertyEditor23);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type[] typeArray6 = classInfo5.getInterfaces();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass8);
        boolean boolean10 = classInfo5.equals((java.lang.Object) wildcardClass8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("g.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
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
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method8 = null;
        propertyDescriptor3.setWriteMethod(method8);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type16 = classInfo15.getType();
        boolean boolean17 = propertyDescriptor3.equals((java.lang.Object) type16);
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/Type" + "'", str14, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        java.util.Enumeration<java.lang.String> strEnumeration5 = propertyDescriptor3.attributeNames();
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.String str7 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertNotNull(strEnumeration5);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.beans.PropertyDescriptor[name=(Z)C]" + "'", str7, "java.beans.PropertyDescriptor[name=(Z)C]");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
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
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        org.mockito.asm.Type[] typeArray7 = classInfo4.getInterfaces();
        org.mockito.asm.Type[] typeArray8 = classInfo4.getInterfaces();
        java.lang.Class<?> wildcardClass9 = typeArray8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass9);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        boolean boolean16 = type13.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass17 = type13.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        java.lang.String str20 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer21 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray12, (java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "D" + "'", str14, "D");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org/mockito/asm/Type" + "'", str18, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str20, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("org/mockito/asm/TypeD");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        boolean boolean7 = propertyDescriptor3.isExpert();
        boolean boolean8 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("Lchar;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass13 = type10.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass13);
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass13);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass21 = type20.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass21);
        java.lang.String str23 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        org.mockito.cglib.core.ClassInfo classInfo25 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        java.lang.Class<?> wildcardClass27 = type26.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass7, classArray19, (java.lang.Object[]) propertyDescriptorArray29);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/Type" + "'", str14, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org/mockito/asm/Type" + "'", str17, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org/mockito/asm/Type" + "'", str23, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertNotNull(classInfo25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str28, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray29);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type9 = classInfo8.getSuperType();
        org.mockito.asm.Type type10 = classInfo8.getSuperType();
        org.mockito.asm.Type[] typeArray11 = classInfo8.getInterfaces();
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) typeArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "()Z" + "'", str12, "()Z");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        boolean boolean6 = signature3.equals((java.lang.Object) wildcardClass5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = type7.getElementType();
        int int10 = type7.getOpcode(116);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        boolean boolean16 = signature13.equals((java.lang.Object) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type18 = type17.getElementType();
        int int19 = type18.getSort();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        int int23 = type21.getOpcode(0);
        int int24 = type21.getSort();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass26 = type25.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass26);
        java.lang.String str28 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass26);
        org.mockito.cglib.core.ClassInfo classInfo30 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type[] typeArray31 = classInfo30.getInterfaces();
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("", type21, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray31);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("()Lchar;", type7, typeArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()Lchar;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 120 + "'", int10 == 120);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(propertyDescriptorArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org/mockito/asm/Type" + "'", str28, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray29);
        org.junit.Assert.assertNotNull(classInfo30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "()Lg/mockito/asm/Type;" + "'", str33, "()Lg/mockito/asm/Type;");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.getName();
        java.lang.String str6 = signature2.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray7 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/TypeLorg/mockito/asm/Type;" + "'", str3, "org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str6, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setPreferred(true);
        java.lang.String str12 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method13 = null;
        propertyDescriptor3.setReadMethod(method13);
        propertyDescriptor3.setName("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        boolean boolean17 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(Z)C" + "'", str12, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        java.lang.String str3 = type0.getClassName();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "double" + "'", str3, "double");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 154);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setPreferred(true);
        boolean boolean12 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("Lmockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method9 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str7, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org/mockito/asm/Type" + "'", str8, "org/mockito/asm/Type");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=(Z)C]");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setExpert(true);
        propertyDescriptor3.setExpert(true);
        java.lang.reflect.Method method17 = propertyDescriptor3.getWriteMethod();
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        boolean boolean9 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray5);
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer12 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray6, (java.lang.Class) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setWriteMethod(method4);
        java.beans.PropertyEditor propertyEditor7 = propertyDescriptor3.createPropertyEditor((java.lang.Object) 128);
        java.lang.String str8 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(propertyEditor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.beans.PropertyDescriptor[name=(Z)C]" + "'", str8, "java.beans.PropertyDescriptor[name=(Z)C]");
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
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
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray3);
        java.lang.String str5 = type1.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type[] typeArray12 = classInfo11.getInterfaces();
        java.lang.String str13 = classInfo11.toString();
        org.mockito.asm.Type[] typeArray14 = classInfo11.getInterfaces();
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("B", type1, typeArray14);
        java.lang.String str16 = type1.getDescriptor();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "D" + "'", str2, "D");
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "()D" + "'", str4, "()D");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "D" + "'", str5, "D");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org/mockito/asm/Type" + "'", str9, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(classInfo11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.mockito.asm.Type" + "'", str13, "org.mockito.asm.Type");
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "D" + "'", str16, "D");
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("()Lchar;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getDescriptor();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray6 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str4, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class7 = org.mockito.cglib.core.ReflectUtils.defineClass("()D", byteArray5, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 10, 10]");
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getDescriptor();
        java.lang.String str5 = signature2.toString();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray7 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str4, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/TypeLorg/mockito/asm/Type;" + "'", str5, "org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        propertyDescriptor3.setExpert(false);
        java.lang.Class<?> wildcardClass13 = propertyDescriptor3.getClass();
        java.util.List list14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list15 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass13, list14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = classInfo9.getType();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type10);
        java.lang.Class<?> wildcardClass12 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(true);
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        boolean boolean17 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(classInfo9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNull(propertyEditor11);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("()C");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray17);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray17);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray17);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass22 = type21.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass22);
        java.lang.String str24 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass22);
        org.mockito.cglib.core.ClassInfo classInfo25 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type[] typeArray26 = classInfo25.getInterfaces();
        boolean boolean28 = classInfo25.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray29 = classInfo25.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass7, classArray20, (java.lang.Object[]) typeArray29);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Byte, java.lang.Short, java.lang.Character, java.lang.Integer, java.lang.Float)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/asm/Type" + "'", str11, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(propertyDescriptorArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org/mockito/asm/Type" + "'", str24, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(typeArray29);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        boolean boolean6 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setName("boolean");
        boolean boolean9 = propertyDescriptor3.isExpert();
        boolean boolean10 = propertyDescriptor3.isPreferred();
        java.lang.String str11 = propertyDescriptor3.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.beans.PropertyDescriptor[name=boolean; bound]" + "'", str11, "java.beans.PropertyDescriptor[name=boolean; bound]");
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) propertyDescriptorArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method8 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str7, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type13 = classInfo12.getSuperType();
        org.mockito.asm.Type type14 = classInfo12.getSuperType();
        org.mockito.asm.Type[] typeArray15 = classInfo12.getInterfaces();
        org.mockito.asm.Type[] typeArray16 = classInfo12.getInterfaces();
        java.lang.Class<?> wildcardClass17 = typeArray16.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method21 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass1, "java.beans.PropertyDescriptor[name=(Z)C; bound]", classArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: java.beans.PropertyDescriptor[name=(Z)C; bound]");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str5, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/asm/Type" + "'", str11, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(classArray20);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("Lchar;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = type0.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type[] typeArray16 = classInfo15.getInterfaces();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        boolean boolean20 = classInfo15.equals((java.lang.Object) wildcardClass18);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer21 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray9, (java.lang.Class) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org/mockito/asm/Type" + "'", str13, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("J", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        boolean boolean6 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(false);
        boolean boolean9 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("[Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 23");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        java.lang.String str10 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass13 = type12.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass13);
        java.lang.Class[] classArray15 = new java.lang.Class[] { wildcardClass7, wildcardClass9, wildcardClass13 };
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method18 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass1, "", classArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: ");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str10, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str14, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        boolean boolean21 = type11.equals((java.lang.Object) classArray20);
        java.lang.Class[] classArray22 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor23 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass7, classArray20);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Byte, java.lang.Short, java.lang.Character, java.lang.Integer, java.lang.Float)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/mockito/asm/Type" + "'", str10, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(classArray22);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
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
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        int int2 = type1.getSort();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean5 = type3.equals((java.lang.Object) (byte) 0);
        int int7 = type3.getOpcode(100);
        int int8 = type3.getSize();
        int int10 = type3.getOpcode(4);
        int int12 = type3.getOpcode((int) ' ');
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray15);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray15);
        int int20 = type1.getOpcode(156);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "D" + "'", str14, "D");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "()D" + "'", str16, "()D");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "()Z" + "'", str17, "()Z");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "()D" + "'", str18, "()D");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 159 + "'", int20 == 159);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = type0.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.util.List list9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list10 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass3, list9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setPreferred(true);
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        java.beans.PropertyEditor propertyEditor15 = propertyDescriptor3.createPropertyEditor((java.lang.Object) 128);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray18, false, true);
        java.lang.Class[] classArray22 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray21);
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray22);
        boolean boolean24 = propertyDescriptor3.equals((java.lang.Object) classArray22);
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(propertyEditor15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        boolean boolean6 = propertyDescriptor3.isExpert();
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        boolean boolean13 = signature10.equals((java.lang.Object) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass12);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=(Z)C; constrained]", (java.lang.Object) propertyDescriptorArray14);
        java.lang.String str16 = propertyDescriptor3.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
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
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
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
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type[] typeArray16 = classInfo15.getInterfaces();
        int int17 = classInfo15.getModifiers();
        propertyDescriptor3.setValue("()D", (java.lang.Object) int17);
        propertyDescriptor3.setBound(false);
        java.lang.String str21 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org/mockito/asm/Type" + "'", str13, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; ()D=1}]" + "'", str21, "java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; ()D=1}]");
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass8 = type5.getClass();
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass8);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        java.lang.Object[] objArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1, classArray12, objArray15);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.IndexedPropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str2, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org/mockito/asm/Type" + "'", str9, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(classArray14);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("Lmockito/asm/Type;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0 };
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class7 = org.mockito.cglib.core.ReflectUtils.defineClass("", byteArray5, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 10, 0]");
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass2);
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray3, true, true);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray3);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(methodArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(classArray8);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; ()D=1}]");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass11 = type8.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass11);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray14);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method18 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass4, "java.beans.PropertyDescriptor[name=(Z)C]", classArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: java.beans.PropertyDescriptor[name=(Z)C]");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org/mockito/asm/Type" + "'", str12, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(classArray17);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; ()D=1}]", classLoader1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = type0.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 0);
        int int14 = type10.getOpcode(100);
        int int15 = type10.getSize();
        int int17 = type10.getOpcode(4);
        int int19 = type10.getOpcode((int) ' ');
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        boolean boolean23 = type20.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass24 = type20.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass24);
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass24);
        boolean boolean27 = type10.equals((java.lang.Object) wildcardClass24);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer28 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray9, (java.lang.Class) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "D" + "'", str21, "D");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org/mockito/asm/Type" + "'", str25, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass4 = type1.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray7);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray8);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("char");
        java.lang.String str2 = type1.toString();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method4 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lchar;" + "'", str2, "Lchar;");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        boolean boolean3 = type0.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass4, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "D" + "'", str1, "D");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(classInfo7);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray16 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method19 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass7, "()Lorg/mockito/asm/Type;", classArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: ()Lorg/mockito/asm/Type;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/asm/Type" + "'", str11, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(classArray18);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str5, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        propertyDescriptor3.setHidden(true);
        propertyDescriptor3.setExpert(false);
        java.lang.String str12 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.beans.PropertyDescriptor[name=(Z)C; hidden]" + "'", str12, "java.beans.PropertyDescriptor[name=(Z)C; hidden]");
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray5);
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass10);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer14 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray6, (java.lang.Class) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(classInfo13);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass4 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, false, true);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) propertyDescriptorArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray14);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = signature2.getClass();
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass6, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("C");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getDescriptor();
        java.lang.String str5 = signature2.toString();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        java.lang.String str7 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray8 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str4, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/TypeLorg/mockito/asm/Type;" + "'", str5, "org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/TypeLorg/mockito/asm/Type;" + "'", str7, "org/mockito/asm/TypeLorg/mockito/asm/Type;");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray1);
        java.lang.reflect.Method[] methodArray3 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        java.lang.String str9 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass8);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray11, true, true);
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray14);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor18 = org.mockito.cglib.core.ReflectUtils.getConstructor(class0, classArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(methodArray4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str9, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(classArray17);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        boolean boolean21 = type11.equals((java.lang.Object) classArray20);
        java.lang.Class[] classArray22 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method23 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass7, "java.beans.PropertyDescriptor[name=org/mockito/asm/Type; displayName=long; values={org/mockito/asm/Type=char}]", classArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: java.beans.PropertyDescriptor[name=org/mockito/asm/Type; displayName=long; values={org/mockito/asm/Type=char}]");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(classArray22);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        boolean boolean11 = propertyDescriptor3.isPreferred();
        boolean boolean12 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setPreferred(true);
        java.lang.String str12 = propertyDescriptor3.getDisplayName();
        java.util.Enumeration<java.lang.String> strEnumeration13 = propertyDescriptor3.attributeNames();
        java.lang.String str14 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(Z)C" + "'", str12, "(Z)C");
        org.junit.Assert.assertNotNull(strEnumeration13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]" + "'", str14, "java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        int int5 = type0.getOpcode(8);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "D" + "'", str1, "D");
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "()D" + "'", str3, "()D");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        org.mockito.asm.Type[] typeArray7 = classInfo4.getInterfaces();
        org.mockito.asm.Type[] typeArray8 = classInfo4.getInterfaces();
        java.lang.Class<?> wildcardClass9 = typeArray8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass9);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray11);
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method14, method15);
        propertyDescriptor16.setExpert(false);
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("(Z)C", method20, method21);
        java.util.Enumeration<java.lang.String> strEnumeration23 = propertyDescriptor22.attributeNames();
        boolean boolean24 = propertyDescriptor22.isPreferred();
        java.lang.Class<?> wildcardClass25 = propertyDescriptor22.getPropertyType();
        java.beans.PropertyEditor propertyEditor26 = propertyDescriptor16.createPropertyEditor((java.lang.Object) propertyDescriptor22);
        propertyDescriptor22.setBound(false);
        java.lang.Class<?> wildcardClass29 = propertyDescriptor22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer30 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray12, (java.lang.Class) wildcardClass29);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(strEnumeration23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertNull(propertyEditor26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
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
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor11 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass1, classArray8);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Byte, java.lang.Short, java.lang.Character, java.lang.Integer, java.lang.Float)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setName("org/mockito/asm/Type");
        propertyDescriptor3.setDisplayName("long");
        boolean boolean18 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setName("org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass22 = type21.getClass();
        java.beans.PropertyEditor propertyEditor23 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass22);
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass27 = type26.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass33 = type32.getClass();
        java.lang.String str34 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass33);
        java.lang.Class[] classArray35 = new java.lang.Class[] { wildcardClass27, wildcardClass29, wildcardClass33 };
        int int36 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray35);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray39 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray38, methodArray39);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray43 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray43);
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray38, methodArray43);
        java.lang.Class[] classArray46 = new java.lang.Class[] {};
        java.lang.String[] strArray47 = org.mockito.cglib.core.ReflectUtils.getNames(classArray46);
        java.lang.reflect.Method[] methodArray48 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray47, methodArray48);
        java.lang.reflect.Method[] methodArray50 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray38, methodArray48);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass22, classArray35, (java.lang.Object[]) methodArray48);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(org.mockito.asm.Type, org.mockito.asm.Type, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(propertyEditor23);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org/mockito/asm/Type" + "'", str25, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str30, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str34, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(methodArray39);
        org.junit.Assert.assertNotNull(methodArray40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(methodArray43);
        org.junit.Assert.assertNotNull(methodArray44);
        org.junit.Assert.assertNotNull(methodArray45);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(methodArray48);
        org.junit.Assert.assertNotNull(methodArray49);
        org.junit.Assert.assertNotNull(methodArray50);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setHidden(false);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        java.lang.String str16 = signature15.getName();
        propertyDescriptor3.setValue("F", (java.lang.Object) str16);
        boolean boolean18 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Ljava/lang/Object;" + "'", str16, "Ljava/lang/Object;");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        boolean boolean16 = signature13.equals((java.lang.Object) wildcardClass15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 0);
        int int22 = type18.getOpcode(100);
        int int23 = type18.getSize();
        java.lang.String str24 = type18.getDescriptor();
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        boolean boolean30 = signature27.equals((java.lang.Object) wildcardClass29);
        java.lang.String str31 = signature27.getName();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 4, boolean16, '#', type18, signature27 };
        java.lang.Class[] classArray33 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray32);
        int int34 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray33);
        java.lang.Class[] classArray35 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor36 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass7, classArray33);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Integer, java.lang.Boolean, java.lang.Character, org.mockito.asm.Type, org.mockito.cglib.core.Signature)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z" + "'", str24, "Z");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[4, false, #, Z, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[4, false, #, Z, ]");
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(classArray35);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("()Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("[Lorg/mockito/asm/Type;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class8 = org.mockito.cglib.core.ReflectUtils.defineClass("java.beans.PropertyDescriptor[name=boolean; bound]", byteArray6, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 1, 100, -1]");
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("()C", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray9);
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor13 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass1, classArray11);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Byte, java.lang.Short, java.lang.Character, java.lang.Integer, java.lang.Float)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str2, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method8 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = type6.getElementType();
        int int8 = type7.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        int int12 = type10.getOpcode(0);
        int int13 = type10.getSort();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass15);
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type[] typeArray20 = classInfo19.getInterfaces();
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type10, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray20);
        int int24 = type7.getOpcode(112);
        java.lang.String str25 = type7.getInternalName();
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str29 = signature28.getDescriptor();
        boolean boolean30 = type7.equals((java.lang.Object) signature28);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray31 = signature28.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org/mockito/asm/Type" + "'", str17, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "()Lg/mockito/asm/Type;" + "'", str22, "()Lg/mockito/asm/Type;");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 116 + "'", int24 == 116);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "g/mockito/asm/Type" + "'", str25, "g/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.toString();
        java.lang.String str5 = type0.getClassName();
        int int6 = type0.getSize();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Z" + "'", str3, "Z");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Z" + "'", str4, "Z");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "boolean" + "'", str5, "boolean");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method4 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("Ljava/lang/Object;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method4 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str2, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = classInfo9.getType();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type10);
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setWriteMethod(method12);
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method16, method17);
        propertyDescriptor18.setExpert(false);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("(Z)C", method22, method23);
        java.util.Enumeration<java.lang.String> strEnumeration25 = propertyDescriptor24.attributeNames();
        boolean boolean26 = propertyDescriptor24.isPreferred();
        java.lang.Class<?> wildcardClass27 = propertyDescriptor24.getPropertyType();
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor18.createPropertyEditor((java.lang.Object) propertyDescriptor24);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]", (java.lang.Object) propertyDescriptor18);
        boolean boolean30 = propertyDescriptor18.isConstrained();
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(classInfo9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNull(propertyEditor11);
        org.junit.Assert.assertNotNull(strEnumeration25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(wildcardClass27);
        org.junit.Assert.assertNull(propertyEditor28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = type0.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("()Z");
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
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass7);
        java.util.List list10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list11 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass7, list10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type[] typeArray6 = classInfo5.getInterfaces();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass8);
        boolean boolean10 = classInfo5.equals((java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) -1 };
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class6 = org.mockito.cglib.core.ReflectUtils.defineClass("()Lchar;", byteArray4, classLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, -1]");
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str3 = signature2.getDescriptor();
        boolean boolean5 = signature2.equals((java.lang.Object) 108);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray6 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type[] typeArray6 = classInfo5.getInterfaces();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass8);
        boolean boolean10 = classInfo5.equals((java.lang.Object) wildcardClass8);
        java.util.List list11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass8, list11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        boolean boolean10 = propertyDescriptor3.isHidden();
        boolean boolean11 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setDisplayName("D");
        java.lang.Object obj14 = null;
        boolean boolean15 = propertyDescriptor3.equals(obj14);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; ()D=1}]");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans.PropertyDescriptor[name=");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = classInfo9.getType();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] {};
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray14);
        boolean boolean16 = propertyDescriptor3.equals((java.lang.Object) typeArray14);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(classInfo9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNull(propertyEditor11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "D" + "'", str13, "D");
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "()D" + "'", str15, "()D");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
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
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = signature2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.Signature is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("org/mockito/asm/TypeD");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type[] typeArray16 = classInfo15.getInterfaces();
        int int17 = classInfo15.getModifiers();
        propertyDescriptor3.setValue("()D", (java.lang.Object) int17);
        propertyDescriptor3.setBound(false);
        java.lang.String str21 = propertyDescriptor3.getShortDescription();
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str25 = signature24.getName();
        java.lang.String str26 = signature24.getName();
        boolean boolean27 = propertyDescriptor3.equals((java.lang.Object) signature24);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org/mockito/asm/Type" + "'", str13, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(Z)C" + "'", str21, "(Z)C");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org/mockito/asm/Type" + "'", str25, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org/mockito/asm/Type" + "'", str26, "org/mockito/asm/Type");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method5 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str3, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.mockito.asm.Type type1 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass3 = type2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type[] typeArray7 = classInfo6.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("()D", type1, typeArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(typeArray7);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isHidden();
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass14 = type13.getClass();
        boolean boolean15 = signature12.equals((java.lang.Object) wildcardClass14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 0);
        int int21 = type17.getOpcode(100);
        int int22 = type17.getSize();
        java.lang.String str23 = type17.getDescriptor();
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass28 = type27.getClass();
        boolean boolean29 = signature26.equals((java.lang.Object) wildcardClass28);
        java.lang.String str30 = signature26.getName();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 4, boolean15, '#', type17, signature26 };
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray31);
        java.lang.Class[] classArray33 = new java.lang.Class[] {};
        java.lang.String[] strArray34 = org.mockito.cglib.core.ReflectUtils.getNames(classArray33);
        java.lang.reflect.Method[] methodArray35 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass8, classArray32, (java.lang.Object[]) strArray34);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->java.beans.PropertyDescriptor.<init>(java.lang.Integer, java.lang.Boolean, java.lang.Character, org.mockito.asm.Type, org.mockito.cglib.core.Signature)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Z" + "'", str23, "Z");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[4, false, #, Z, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[4, false, #, Z, ]");
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(methodArray35);
        org.junit.Assert.assertNotNull(methodArray36);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setPreferred(true);
        java.lang.String str12 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method13 = null;
        propertyDescriptor3.setReadMethod(method13);
        boolean boolean15 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(Z)C" + "'", str12, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("()Z", "C");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans.PropertyDescriptor[name=");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        int int2 = type1.getSort();
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("(Z)C", method4, method5);
        java.util.Enumeration<java.lang.String> strEnumeration7 = propertyDescriptor6.attributeNames();
        boolean boolean8 = propertyDescriptor6.isPreferred();
        java.lang.String str9 = propertyDescriptor6.getName();
        boolean boolean10 = propertyDescriptor6.isExpert();
        propertyDescriptor6.setBound(true);
        propertyDescriptor6.setPreferred(true);
        boolean boolean15 = type1.equals((java.lang.Object) true);
        int int16 = type1.getSize();
        java.lang.String str17 = type1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type18 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(strEnumeration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "D" + "'", str17, "D");
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class4 = org.mockito.cglib.core.ReflectUtils.defineClass("java.beans.PropertyDescriptor[name=(Z)C; constrained]", byteArray2, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("org.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setHidden(false);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass14 = type13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass14);
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass14);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type[] typeArray19 = classInfo18.getInterfaces();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        boolean boolean22 = classInfo18.equals((java.lang.Object) type20);
        propertyDescriptor3.setValue("()Z", (java.lang.Object) type20);
        java.util.Enumeration<java.lang.String> strEnumeration24 = propertyDescriptor3.attributeNames();
        boolean boolean25 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org/mockito/asm/Type" + "'", str16, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "D" + "'", str21, "D");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strEnumeration24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("()C", "g.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()C' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Lchar;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray9);
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray10);
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass14 = type13.getClass();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass20 = type19.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.Class[] classArray22 = new java.lang.Class[] { wildcardClass14, wildcardClass16, wildcardClass20 };
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray22);
        java.lang.String[] strArray24 = org.mockito.cglib.core.ReflectUtils.getNames(classArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1, classArray10, (java.lang.Object[]) classArray22);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Byte, java.lang.Short, java.lang.Character, java.lang.Integer, java.lang.Float)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str17, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str21, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class9 = org.mockito.cglib.core.ReflectUtils.defineClass("Lg/mockito/asm/Type;", byteArray7, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 0, 100, 10, 10]");
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = type0.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, false, true);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor11 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass3, classArray10);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(classArray10);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(Z)Lchar;", "long");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(Z)Lchar;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
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
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("org/mockito/asm/TypeD", classLoader1);
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
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setPreferred(true);
        java.lang.String str12 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("(Z)C", method14, method15);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor16.setValue("org/mockito/asm/Type", (java.lang.Object) signature20);
        java.lang.String str22 = propertyDescriptor16.getDisplayName();
        propertyDescriptor16.setHidden(false);
        propertyDescriptor16.setHidden(false);
        propertyDescriptor16.setName("org/mockito/asm/Type");
        propertyDescriptor16.setDisplayName("long");
        boolean boolean31 = propertyDescriptor16.isPreferred();
        propertyDescriptor16.setName("org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass35 = type34.getClass();
        java.beans.PropertyEditor propertyEditor36 = propertyDescriptor16.createPropertyEditor((java.lang.Object) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass35);
        boolean boolean38 = propertyDescriptor3.equals((java.lang.Object) wildcardClass35);
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(Z)C" + "'", str12, "(Z)C");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(Z)C" + "'", str22, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(propertyEditor36);
        org.junit.Assert.assertNotNull(propertyDescriptorArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        org.mockito.asm.Type[] typeArray4 = signature3.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) typeArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray4);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        byte[] byteArray1 = new byte[] {};
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.mockito.cglib.core.ReflectUtils.defineClass("(Z)Lchar;", byteArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
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
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int4 = type2.getOpcode(0);
        int int5 = type2.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type[] typeArray12 = classInfo11.getInterfaces();
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type2, typeArray12);
        java.lang.String str14 = signature13.getName();
        org.mockito.asm.Type type15 = signature13.getReturnType();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        org.mockito.asm.Type[] typeArray19 = signature18.getArgumentTypes();
        org.mockito.asm.Type[] typeArray20 = signature18.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=java.beans.PropertyDescriptor[name=(Z)C; constrained]; preferred; propertyEditorClass=class org.mockito.asm.Type]", type15, typeArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'java.beans.PropertyDescriptor[name=(Z)C; shortDescription=java.beans.PropertyDescriptor[name=(Z)C; constrained]; preferred; propertyEditorClass=class org.mockito.asm.Type]' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org/mockito/asm/Type" + "'", str9, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(classInfo11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        boolean boolean7 = signature2.equals((java.lang.Object) (short) 1);
        java.lang.String str8 = signature2.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (byte) 0);
        int int13 = type9.getOpcode(100);
        int int14 = type9.getSize();
        int int16 = type9.getOpcode(4);
        int int18 = type9.getOpcode((int) ' ');
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] {};
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray21);
        java.lang.String str24 = type9.toString();
        boolean boolean25 = signature2.equals((java.lang.Object) str24);
        java.lang.String str26 = signature2.toString();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass28 = type27.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass28);
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        org.mockito.cglib.core.ClassInfo classInfo31 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type32 = classInfo31.getSuperType();
        org.mockito.asm.Type type33 = classInfo31.getSuperType();
        org.mockito.asm.Type[] typeArray34 = classInfo31.getInterfaces();
        org.mockito.asm.Type type35 = classInfo31.getType();
        boolean boolean36 = signature2.equals((java.lang.Object) classInfo31);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray37 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "D" + "'", str20, "D");
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "()D" + "'", str22, "()D");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "()Z" + "'", str23, "()Z");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z" + "'", str24, "Z");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(propertyDescriptorArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org/mockito/asm/Type" + "'", str30, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
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
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("char");
        java.lang.String str2 = type1.toString();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lchar;" + "'", str2, "Lchar;");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        boolean boolean10 = signature7.equals((java.lang.Object) wildcardClass9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 0);
        int int16 = type12.getOpcode(100);
        int int17 = type12.getSize();
        java.lang.String str18 = type12.getDescriptor();
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass23 = type22.getClass();
        boolean boolean24 = signature21.equals((java.lang.Object) wildcardClass23);
        java.lang.String str25 = signature21.getName();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 4, boolean10, '#', type12, signature21 };
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray26);
        int int28 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor29 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass1, classArray27);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Integer, java.lang.Boolean, java.lang.Character, org.mockito.asm.Type, org.mockito.cglib.core.Signature)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Z" + "'", str18, "Z");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[4, false, #, Z, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[4, false, #, Z, ]");
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        java.lang.reflect.Method method10 = null;
        propertyDescriptor3.setWriteMethod(method10);
        java.lang.Class<?> wildcardClass12 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setExpert(false);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass16);
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass16);
        java.lang.String str19 = propertyDescriptor3.getDisplayName();
        boolean boolean20 = propertyDescriptor3.isPreferred();
        boolean boolean22 = propertyDescriptor3.equals((java.lang.Object) 155);
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNull(propertyEditor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(Z)C" + "'", str19, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        java.lang.String str6 = signature2.getName();
        java.lang.String str7 = signature2.getName();
        java.lang.String str8 = signature2.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type9 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method[] methodArray5 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray2, true, true);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray2);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer12 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray7, (java.lang.Class) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(methodArray5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.beans.PropertyEditor propertyEditor8 = propertyDescriptor3.createPropertyEditor((java.lang.Object) 104);
        java.lang.String str9 = propertyDescriptor3.getName();
        propertyDescriptor3.setConstrained(false);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(propertyEditor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type[] typeArray16 = classInfo15.getInterfaces();
        int int17 = classInfo15.getModifiers();
        propertyDescriptor3.setValue("()D", (java.lang.Object) int17);
        propertyDescriptor3.setBound(false);
        java.lang.Class<?> wildcardClass21 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setBound(true);
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("(Z)C", method25, method26);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor27.setValue("org/mockito/asm/Type", (java.lang.Object) signature31);
        java.lang.String str33 = propertyDescriptor27.getDisplayName();
        propertyDescriptor27.setHidden(false);
        propertyDescriptor27.setHidden(false);
        java.lang.Object obj39 = propertyDescriptor27.getValue("()D");
        propertyDescriptor27.setName("java.beans.PropertyDescriptor[name=(Z)C; values={()D=Lorg/mockito/asm/Type;}]");
        propertyDescriptor27.setName("C");
        boolean boolean44 = propertyDescriptor27.isExpert();
        boolean boolean45 = propertyDescriptor3.equals((java.lang.Object) propertyDescriptor27);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org/mockito/asm/Type" + "'", str13, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(Z)C" + "'", str33, "(Z)C");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        int int2 = type1.getSort();
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("(Z)C", method4, method5);
        java.util.Enumeration<java.lang.String> strEnumeration7 = propertyDescriptor6.attributeNames();
        boolean boolean8 = propertyDescriptor6.isPreferred();
        java.lang.String str9 = propertyDescriptor6.getName();
        boolean boolean10 = propertyDescriptor6.isExpert();
        propertyDescriptor6.setBound(true);
        propertyDescriptor6.setPreferred(true);
        boolean boolean15 = type1.equals((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type16 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(strEnumeration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setHidden(true);
        boolean boolean7 = propertyDescriptor3.isExpert();
        boolean boolean8 = propertyDescriptor3.isBound();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray5);
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass10);
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type14 = classInfo13.getSuperType();
        org.mockito.asm.Type type15 = classInfo13.getSuperType();
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer18 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray6, (java.lang.Class) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org/mockito/asm/Type" + "'", str12, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        propertyDescriptor3.setShortDescription("Lchar;");
        java.lang.reflect.Method method13 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setName("[Lorg/mockito/asm/Type;");
        java.lang.String str16 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.beans.PropertyDescriptor[name=[Lorg/mockito/asm/Type;; shortDescription=Lchar;; bound]" + "'", str16, "java.beans.PropertyDescriptor[name=[Lorg/mockito/asm/Type;; shortDescription=Lchar;; bound]");
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("char");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.lang.Class[] classArray4 = new java.lang.Class[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        java.lang.reflect.Method[] methodArray6 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray6);
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass11);
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, true, true);
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray17);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray18);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray5);
        java.lang.Class[] classArray21 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method22 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass2, "()D", classArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: ()D");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(methodArray6);
        org.junit.Assert.assertNotNull(methodArray7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str12, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(methodArray18);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(classArray21);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass10 = type7.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass10);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass10);
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass10);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray15);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray19 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray19);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray23 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray23);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray23);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        java.lang.reflect.Method[] methodArray28 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray28);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray28);
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4, classArray16, (java.lang.Object[]) classArray32);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor, java.beans.PropertyDescriptor)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str6, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/asm/Type" + "'", str11, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/Type" + "'", str14, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(methodArray24);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(methodArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(methodArray30);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(classArray32);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        byte[] byteArray1 = new byte[] {};
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.mockito.cglib.core.ReflectUtils.defineClass("java.beans.PropertyDescriptor[name=[Lorg/mockito/asm/Type;; shortDescription=Lchar;; bound]", byteArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method8 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str6, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = classInfo9.getType();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type10);
        java.lang.Class<?> wildcardClass12 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(true);
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        propertyDescriptor3.setBound(false);
        java.lang.Class<?> wildcardClass19 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str20 = propertyDescriptor3.getDisplayName();
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(classInfo9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNull(propertyEditor11);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(Z)C" + "'", str20, "(Z)C");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
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
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/TypeLorg/mockito/asm/Type;" + "'", str4, "org/mockito/asm/TypeLorg/mockito/asm/Type;");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type[] typeArray6 = classInfo5.getInterfaces();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass8);
        boolean boolean10 = classInfo5.equals((java.lang.Object) wildcardClass8);
        java.util.List list11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass8, list11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setShortDescription("Z");
        boolean boolean12 = propertyDescriptor3.isHidden();
        java.lang.Class<?> wildcardClass13 = propertyDescriptor3.getPropertyEditorClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        java.lang.String str18 = type17.toString();
        java.beans.PropertyEditor propertyEditor19 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type17);
        int int20 = type17.getSize();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str16, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str18, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNull(propertyEditor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(Z)Lchar;", "()Lg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(Z)Lchar;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) 1 };
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class8 = org.mockito.cglib.core.ReflectUtils.defineClass("Lmockito/asm/Type;", byteArray6, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 100, -1, 1]");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray6 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/TypeLorg/mockito/asm/Type;" + "'", str3, "org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = classInfo9.getType();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type10);
        java.lang.Class<?> wildcardClass12 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(true);
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        propertyDescriptor3.setConstrained(true);
        propertyDescriptor3.setDisplayName("J");
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("(Z)C", method22, method23);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor24.setValue("org/mockito/asm/Type", (java.lang.Object) signature28);
        java.lang.String str30 = propertyDescriptor24.getDisplayName();
        propertyDescriptor24.setHidden(false);
        propertyDescriptor24.setHidden(false);
        java.lang.Object obj36 = propertyDescriptor24.getValue("()D");
        propertyDescriptor24.setName("java.beans.PropertyDescriptor[name=(Z)C; values={()D=Lorg/mockito/asm/Type;}]");
        propertyDescriptor24.setName("C");
        boolean boolean41 = propertyDescriptor24.isExpert();
        boolean boolean42 = propertyDescriptor24.isExpert();
        java.lang.reflect.Method method43 = propertyDescriptor24.getWriteMethod();
        java.beans.PropertyEditor propertyEditor44 = propertyDescriptor3.createPropertyEditor((java.lang.Object) method43);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(classInfo9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNull(propertyEditor11);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(Z)C" + "'", str30, "(Z)C");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(method43);
        org.junit.Assert.assertNull(propertyEditor44);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
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
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.lang.Object");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        boolean boolean6 = signature3.equals((java.lang.Object) wildcardClass5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = type7.getElementType();
        int int9 = type8.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        int int13 = type11.getOpcode(0);
        int int14 = type11.getSort();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass16);
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type[] typeArray21 = classInfo20.getInterfaces();
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type11, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) typeArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org/mockito/asm/Type" + "'", str18, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(classInfo20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "()Lg/mockito/asm/Type;" + "'", str23, "()Lg/mockito/asm/Type;");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        propertyDescriptor3.setDisplayName("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]");
        boolean boolean13 = propertyDescriptor3.isHidden();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass16);
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        java.lang.String str20 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass16);
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) wildcardClass16);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass27 = type24.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass27);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass27);
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray30);
        java.lang.String[] strArray32 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        java.lang.Class[] classArray33 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray31);
        java.lang.String[] strArray34 = org.mockito.cglib.core.ReflectUtils.getNames(classArray33);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray41 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray40);
        int int42 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray41);
        java.lang.String[] strArray43 = org.mockito.cglib.core.ReflectUtils.getNames(classArray41);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean46 = type44.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass47 = type44.getClass();
        java.lang.String str48 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass47);
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass47);
        java.beans.PropertyDescriptor[] propertyDescriptorArray50 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass47);
        java.lang.String str51 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass47);
        java.beans.PropertyDescriptor[] propertyDescriptorArray52 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass47);
        java.lang.reflect.Method[] methodArray55 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray52, false, false);
        java.lang.reflect.Method[] methodArray56 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray43, methodArray55);
        java.lang.Object[] objArray62 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray63 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray62);
        int int64 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray63);
        java.lang.String[] strArray65 = org.mockito.cglib.core.ReflectUtils.getNames(classArray63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean68 = type66.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass69 = type66.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass69);
        java.lang.reflect.Method[] methodArray73 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray70, true, true);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray70, false, true);
        java.lang.reflect.Method[] methodArray79 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray70, true, false);
        java.lang.reflect.Method[] methodArray80 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray65, methodArray79);
        java.lang.reflect.Method[] methodArray81 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray43, methodArray79);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj82 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass16, classArray33, (java.lang.Object[]) methodArray81);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Class, java.lang.Class, java.lang.Class, java.lang.Class, java.lang.Class, java.lang.Class, java.lang.Class, java.lang.Class)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org/mockito/asm/Type" + "'", str18, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str20, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org/mockito/asm/Type" + "'", str22, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org/mockito/asm/Type" + "'", str28, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray29);
        org.junit.Assert.assertNotNull(propertyDescriptorArray30);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "org/mockito/asm/Type" + "'", str48, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray49);
        org.junit.Assert.assertNotNull(propertyDescriptorArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "org/mockito/asm/Type" + "'", str51, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray52);
        org.junit.Assert.assertNotNull(methodArray55);
        org.junit.Assert.assertNotNull(methodArray56);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(propertyDescriptorArray70);
        org.junit.Assert.assertNotNull(methodArray73);
        org.junit.Assert.assertNotNull(methodArray76);
        org.junit.Assert.assertNotNull(methodArray79);
        org.junit.Assert.assertNotNull(methodArray80);
        org.junit.Assert.assertNotNull(methodArray81);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.mockito.asm.Type type0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type[] typeArray6 = classInfo5.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(typeArray6);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.lang.Class[] classArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor5 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass1, classArray4);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org/mockito/asm/Type" + "'", str2, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method[] methodArray5 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray2, true, true);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray2);
        java.lang.Class<?> wildcardClass7 = propertyDescriptorArray2.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass12 = type9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray13, true, true);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray13, false, true);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method21 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass7, "java.beans.PropertyDescriptor[name=boolean; bound]", classArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: java.beans.PropertyDescriptor[name=boolean; bound]");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(methodArray5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(classArray20);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("char");
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer10 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray6, (java.lang.Class) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setExpert(true);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyType();
        boolean boolean16 = propertyDescriptor3.isExpert();
        java.lang.String str17 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.beans.PropertyDescriptor[name=(Z)C; shortDescription=D; expert; bound]" + "'", str17, "java.beans.PropertyDescriptor[name=(Z)C; shortDescription=D; expert; bound]");
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray3 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray3);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray7 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray7);
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray7);
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.reflect.Method[] methodArray12 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray12);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(methodArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(methodArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(methodArray14);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        java.lang.String str7 = type6.getClassName();
        java.lang.Class<?> wildcardClass8 = type6.getClass();
        java.lang.String str9 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Object" + "'", str7, "java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str9, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.lang.Class[] classArray0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method2, method3);
        propertyDescriptor4.setExpert(false);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass9);
        propertyDescriptor4.setValue("java.beans.PropertyDescriptor[name=[Lorg/mockito/asm/Type;; shortDescription=Lchar;; bound]", (java.lang.Object) wildcardClass9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer12 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray0, (java.lang.Class) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("org.mockito.asm.Type", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.String str6 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.beans.PropertyDescriptor[name=org.mockito.asm.Type]" + "'", str6, "java.beans.PropertyDescriptor[name=org.mockito.asm.Type]");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        boolean boolean10 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setShortDescription("Z");
        java.util.Enumeration<java.lang.String> strEnumeration13 = propertyDescriptor3.attributeNames();
        java.lang.String str14 = propertyDescriptor3.getDisplayName();
        java.lang.String str15 = propertyDescriptor3.getName();
        java.lang.String str16 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strEnumeration13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(Z)C" + "'", str14, "(Z)C");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(Z)C" + "'", str15, "(Z)C");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.beans.PropertyDescriptor[name=(Z)C; shortDescription=Z; values={org/mockito/asm/Type=char}]" + "'", str16, "java.beans.PropertyDescriptor[name=(Z)C; shortDescription=Z; values={org/mockito/asm/Type=char}]");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        java.util.List list9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list10 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass7, list9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        boolean boolean17 = signature14.equals((java.lang.Object) wildcardClass16);
        boolean boolean18 = type11.equals((java.lang.Object) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        boolean boolean20 = propertyDescriptor3.equals((java.lang.Object) wildcardClass16);
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = type0.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method10 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str5, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.lang.Class class0 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray6);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor10 = org.mockito.cglib.core.ReflectUtils.getConstructor(class0, classArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        boolean boolean10 = type7.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass11 = type7.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer15 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray6, (java.lang.Class) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "D" + "'", str8, "D");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org/mockito/asm/Type" + "'", str12, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = type6.getElementType();
        int int8 = type7.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        int int12 = type10.getOpcode(0);
        int int13 = type10.getSort();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass15);
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type[] typeArray20 = classInfo19.getInterfaces();
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type10, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray20);
        org.mockito.asm.Type type23 = type7.getElementType();
        java.lang.String str24 = type23.getInternalName();
        java.lang.String str25 = type23.getInternalName();
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org/mockito/asm/Type" + "'", str17, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "()Lg/mockito/asm/Type;" + "'", str22, "()Lg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "mockito/asm/Type" + "'", str24, "mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "mockito/asm/Type" + "'", str25, "mockito/asm/Type");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=org.mockito.asm.Type]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("g/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        boolean boolean7 = signature2.equals((java.lang.Object) (short) 1);
        java.lang.String str8 = signature2.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (byte) 0);
        int int13 = type9.getOpcode(100);
        int int14 = type9.getSize();
        int int16 = type9.getOpcode(4);
        int int18 = type9.getOpcode((int) ' ');
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] {};
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray21);
        java.lang.String str24 = type9.toString();
        boolean boolean25 = signature2.equals((java.lang.Object) str24);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray26 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "D" + "'", str20, "D");
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "()D" + "'", str22, "()D");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "()Z" + "'", str23, "()Z");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Z" + "'", str24, "Z");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str2, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method9 = null;
        propertyDescriptor3.setWriteMethod(method9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass13 = type12.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass13);
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type[] typeArray17 = classInfo16.getInterfaces();
        boolean boolean19 = classInfo16.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray20 = classInfo16.getInterfaces();
        org.mockito.asm.Type type21 = classInfo16.getSuperType();
        propertyDescriptor3.setValue("()Lg/mockito/asm/Type;", (java.lang.Object) classInfo16);
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("(Z)C", method24, method25);
        propertyDescriptor26.setBound(true);
        java.lang.Class<?> wildcardClass29 = propertyDescriptor26.getPropertyType();
        java.lang.Object obj31 = propertyDescriptor26.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method32 = null;
        propertyDescriptor26.setWriteMethod(method32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass36 = type35.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass36);
        java.lang.String str38 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass36);
        org.mockito.cglib.core.ClassInfo classInfo39 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass36);
        org.mockito.asm.Type[] typeArray40 = classInfo39.getInterfaces();
        boolean boolean42 = classInfo39.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray43 = classInfo39.getInterfaces();
        org.mockito.asm.Type type44 = classInfo39.getSuperType();
        propertyDescriptor26.setValue("()Lg/mockito/asm/Type;", (java.lang.Object) classInfo39);
        boolean boolean46 = classInfo16.equals((java.lang.Object) propertyDescriptor26);
        propertyDescriptor26.setDisplayName("I");
        java.lang.String str49 = propertyDescriptor26.getDisplayName();
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/Type" + "'", str15, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNull(wildcardClass29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(propertyDescriptorArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org/mockito/asm/Type" + "'", str38, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "I" + "'", str49, "I");
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setPreferred(true);
        java.lang.String str12 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method13 = null;
        propertyDescriptor3.setReadMethod(method13);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type21 = classInfo20.getSuperType();
        org.mockito.asm.Type type22 = classInfo20.getSuperType();
        org.mockito.asm.Type[] typeArray23 = classInfo20.getInterfaces();
        org.mockito.asm.Type[] typeArray24 = classInfo20.getInterfaces();
        org.mockito.asm.Type type25 = classInfo20.getType();
        int int26 = type25.getSort();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass28 = type27.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass28);
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        org.mockito.cglib.core.ClassInfo classInfo31 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type32 = classInfo31.getSuperType();
        org.mockito.asm.Type type33 = classInfo31.getSuperType();
        org.mockito.asm.Type[] typeArray34 = classInfo31.getInterfaces();
        org.mockito.asm.Type[] typeArray35 = classInfo31.getInterfaces();
        org.mockito.asm.Type type36 = classInfo31.getType();
        java.lang.String str37 = classInfo31.toString();
        java.lang.reflect.Method method39 = null;
        java.lang.reflect.Method method40 = null;
        java.beans.PropertyDescriptor propertyDescriptor41 = new java.beans.PropertyDescriptor("(Z)C", method39, method40);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor41.setValue("org/mockito/asm/Type", (java.lang.Object) signature45);
        java.lang.String str47 = propertyDescriptor41.getDisplayName();
        boolean boolean48 = propertyDescriptor41.isHidden();
        propertyDescriptor41.setDisplayName("org.mockito.asm.Type");
        propertyDescriptor41.setConstrained(true);
        boolean boolean53 = classInfo31.equals((java.lang.Object) propertyDescriptor41);
        org.mockito.asm.Type[] typeArray54 = classInfo31.getInterfaces();
        org.mockito.asm.Type[] typeArray55 = classInfo31.getInterfaces();
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray55);
        boolean boolean57 = propertyDescriptor3.equals((java.lang.Object) type25);
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(Z)C" + "'", str12, "(Z)C");
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org/mockito/asm/Type" + "'", str19, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(propertyDescriptorArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org/mockito/asm/Type" + "'", str30, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "org.mockito.asm.Type" + "'", str37, "org.mockito.asm.Type");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(Z)C" + "'", str47, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "()Lorg/mockito/asm/Type;" + "'", str56, "()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = type0.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type[] typeArray16 = classInfo15.getInterfaces();
        boolean boolean18 = classInfo15.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray19 = classInfo15.getInterfaces();
        org.mockito.asm.Type type20 = classInfo15.getSuperType();
        java.lang.Class<?> wildcardClass21 = type20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer22 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray9, (java.lang.Class) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/Type" + "'", str14, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method[] methodArray5 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray2, false, true);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray5);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer13 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray6, (java.lang.Class) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(methodArray5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(classInfo12);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.mockito.asm.Type type0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] {};
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        java.lang.String str6 = type2.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass8);
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type[] typeArray13 = classInfo12.getInterfaces();
        java.lang.String str14 = classInfo12.toString();
        org.mockito.asm.Type[] typeArray15 = classInfo12.getInterfaces();
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("B", type2, typeArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "D" + "'", str3, "D");
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "()D" + "'", str5, "()D");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "D" + "'", str6, "D");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/mockito/asm/Type" + "'", str10, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(classInfo12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.mockito.asm.Type" + "'", str14, "org.mockito.asm.Type");
        org.junit.Assert.assertNotNull(typeArray15);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setPreferred(true);
        java.lang.String str12 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method13 = null;
        propertyDescriptor3.setReadMethod(method13);
        java.lang.String str15 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(Z)C" + "'", str12, "(Z)C");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]" + "'", str15, "java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setHidden(false);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass14 = type13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass14);
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass14);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type[] typeArray19 = classInfo18.getInterfaces();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        boolean boolean22 = classInfo18.equals((java.lang.Object) type20);
        propertyDescriptor3.setValue("()Z", (java.lang.Object) type20);
        java.lang.String str24 = type20.getClassName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = type20.getInternalName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org/mockito/asm/Type" + "'", str16, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "D" + "'", str21, "D");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "double" + "'", str24, "double");
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        org.mockito.asm.Type type7 = classInfo4.getSuperType();
        org.mockito.asm.Type[] typeArray8 = classInfo4.getInterfaces();
        int int9 = classInfo4.getModifiers();
        org.mockito.asm.Type type10 = classInfo4.getSuperType();
        int int11 = classInfo4.getModifiers();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray8);
        boolean boolean10 = type0.equals((java.lang.Object) classArray9);
        java.lang.String str11 = type0.toString();
        java.lang.String str12 = type0.getDescriptor();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Z" + "'", str11, "Z");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Z" + "'", str12, "Z");
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/Type" + "'", str6, "org/mockito/asm/Type");
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=Z; values={org/mockito/asm/Type=char}]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setHidden(false);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass14 = type13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass14);
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass14);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type[] typeArray19 = classInfo18.getInterfaces();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        boolean boolean22 = classInfo18.equals((java.lang.Object) type20);
        propertyDescriptor3.setValue("()Z", (java.lang.Object) type20);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type24 = type20.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org/mockito/asm/Type" + "'", str16, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "D" + "'", str21, "D");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setName("org/mockito/asm/Type");
        propertyDescriptor3.setDisplayName("long");
        boolean boolean18 = propertyDescriptor3.isPreferred();
        java.lang.Class<?> wildcardClass19 = propertyDescriptor3.getPropertyType();
        java.lang.String str20 = propertyDescriptor3.getDisplayName();
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass25 = type24.getClass();
        boolean boolean26 = signature23.equals((java.lang.Object) wildcardClass25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type28 = type27.getElementType();
        int int29 = type28.getSort();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        int int33 = type31.getOpcode(0);
        int int34 = type31.getSort();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass36 = type35.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass36);
        java.lang.String str38 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass36);
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass36);
        org.mockito.cglib.core.ClassInfo classInfo40 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass36);
        org.mockito.asm.Type[] typeArray41 = classInfo40.getInterfaces();
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", type31, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray41);
        org.mockito.asm.Type type44 = type28.getElementType();
        boolean boolean45 = propertyDescriptor3.equals((java.lang.Object) type28);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "long" + "'", str20, "long");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(propertyDescriptorArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org/mockito/asm/Type" + "'", str38, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray39);
        org.junit.Assert.assertNotNull(classInfo40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "()Lg/mockito/asm/Type;" + "'", str43, "()Lg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class[] classArray4 = new java.lang.Class[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, true);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray13);
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray14);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray1);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray16);
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Method method20 = null;
        java.beans.PropertyDescriptor propertyDescriptor21 = new java.beans.PropertyDescriptor("(Z)C", method19, method20);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor21.setValue("org/mockito/asm/Type", (java.lang.Object) signature25);
        java.lang.String str27 = propertyDescriptor21.getDisplayName();
        propertyDescriptor21.setHidden(false);
        propertyDescriptor21.setHidden(false);
        propertyDescriptor21.setName("org/mockito/asm/Type");
        propertyDescriptor21.setDisplayName("long");
        boolean boolean36 = propertyDescriptor21.isPreferred();
        propertyDescriptor21.setName("org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass40 = type39.getClass();
        java.beans.PropertyEditor propertyEditor41 = propertyDescriptor21.createPropertyEditor((java.lang.Object) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass40);
        java.lang.String str43 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer44 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray16, (java.lang.Class) wildcardClass40);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(methodArray2);
        org.junit.Assert.assertNotNull(methodArray3);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(Z)C" + "'", str27, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNull(propertyEditor41);
        org.junit.Assert.assertNotNull(propertyDescriptorArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "org/mockito/asm/Type" + "'", str43, "org/mockito/asm/Type");
    }
}

