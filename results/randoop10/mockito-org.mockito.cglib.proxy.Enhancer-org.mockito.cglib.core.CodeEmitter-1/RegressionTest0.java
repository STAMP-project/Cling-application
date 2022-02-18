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
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.mockito.cglib.proxy.Enhancer.isEnhanced(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int0 = org.mockito.cglib.core.CodeEmitter.OR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = org.mockito.asm.Type.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.mockito.cglib.core.AbstractClassGenerator abstractClassGenerator0 = org.mockito.cglib.core.AbstractClassGenerator.getCurrent();
        org.junit.Assert.assertNull(abstractClassGenerator0);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
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
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        int int0 = org.mockito.asm.Type.BYTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        int int0 = org.mockito.asm.Type.FLOAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter1 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
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
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        int int0 = org.mockito.cglib.core.CodeEmitter.GT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 157 + "'", int0 == 157);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        int int0 = org.mockito.cglib.core.CodeEmitter.XOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 130 + "'", int0 == 130);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.Class class1 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType(class1);
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
            java.lang.String str1 = org.mockito.asm.Type.getInternalName(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
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
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int0 = org.mockito.cglib.core.CodeEmitter.MUL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 104 + "'", int0 == 104);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        int int0 = org.mockito.cglib.core.CodeEmitter.NE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 154 + "'", int0 == 154);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
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
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
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
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        int int0 = org.mockito.cglib.core.CodeEmitter.LE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 158 + "'", int0 == 158);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        int int0 = org.mockito.asm.Type.ARRAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
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
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        int int0 = org.mockito.cglib.core.CodeEmitter.USHR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 124 + "'", int0 == 124);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        int int0 = org.mockito.asm.Type.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor7 = classEmitter1.visitField(158, "", "byte", "", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        java.lang.ClassLoader classLoader4 = null;
        enhancer1.setClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass6 = enhancer1.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = null;
        enhancer7.setNamingPolicy(namingPolicy8);
        java.lang.ClassLoader classLoader10 = null;
        enhancer7.setClassLoader(classLoader10);
        java.lang.Class<?> wildcardClass12 = enhancer7.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass12);
        java.lang.Class[] classArray14 = new java.lang.Class[] { wildcardClass6, wildcardClass12 };
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = enhancer0.create(classArray14, objArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str13, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 1.0]");
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
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
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Block block1 = new org.mockito.cglib.core.Block(codeEmitter0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        int int0 = org.mockito.asm.Type.CHAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        int int0 = org.mockito.asm.Type.VOID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("byte", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        int int0 = org.mockito.cglib.core.CodeEmitter.EQ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 153 + "'", int0 == 153);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
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
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Callback[] callbackArray9 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass5, callbackArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(callbackArray9);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        int int0 = org.mockito.cglib.core.CodeEmitter.SUB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
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
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        int int0 = org.mockito.cglib.core.CodeEmitter.REM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 112 + "'", int0 == 112);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        org.mockito.cglib.proxy.Callback callback6 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray7 = new org.mockito.cglib.proxy.Callback[] { callback6 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass5, callbackArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(callbackArray7);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitInnerClass("hi!", "byte", "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        org.mockito.cglib.proxy.Callback callback6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass5, callback6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.junit.Assert.assertNotNull(type0);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) ' ', "byte", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Callback callback8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass5, callback8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type2 = classEmitter1.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(10, "byte", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer6.setNamingPolicy(namingPolicy7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer6.setClassLoader(classLoader9);
        java.lang.Class<?> wildcardClass11 = enhancer6.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass11);
        boolean boolean13 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = null;
        enhancer15.setNamingPolicy(namingPolicy16);
        java.lang.ClassLoader classLoader18 = null;
        enhancer15.setClassLoader(classLoader18);
        java.lang.Class<?> wildcardClass20 = enhancer15.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        boolean boolean22 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass20);
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = null;
        enhancer23.setNamingPolicy(namingPolicy24);
        java.lang.ClassLoader classLoader26 = null;
        enhancer23.setClassLoader(classLoader26);
        java.lang.Class<?> wildcardClass28 = enhancer23.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = null;
        enhancer31.setNamingPolicy(namingPolicy32);
        java.lang.ClassLoader classLoader34 = null;
        enhancer31.setClassLoader(classLoader34);
        java.lang.Class<?> wildcardClass36 = enhancer31.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy38 = null;
        enhancer37.setNamingPolicy(namingPolicy38);
        java.lang.ClassLoader classLoader40 = null;
        enhancer37.setClassLoader(classLoader40);
        java.lang.Class<?> wildcardClass42 = enhancer37.getClass();
        java.lang.String str43 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass42);
        boolean boolean44 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass42);
        java.lang.Class[] classArray45 = new java.lang.Class[] { wildcardClass11, wildcardClass20, wildcardClass28, wildcardClass36, wildcardClass42 };
        org.mockito.cglib.proxy.Callback callback46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass5, classArray45, callback46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str12, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str21, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str29, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str43, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(classArray45);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        enhancer0.setUseCache(false);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "double" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(128, 158, "Lorg/mockito/cglib/proxy/Enhancer;", "double", "hi!", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Lorg/mockito/cglib/proxy/Enhancer;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer6.setNamingPolicy(namingPolicy7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer6.setClassLoader(classLoader9);
        java.lang.Class<?> wildcardClass11 = enhancer6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer0.setClassLoader(classLoader9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitInnerClass("hi!", "Lorg/mockito/cglib/proxy/Enhancer;", "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("Lorg/mockito/cglib/proxy/Enhancer;", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classEmitter2.visitMethod(104, "Lorg/mockito/cglib/proxy/Enhancer;", "Lorg/mockito/cglib/proxy/Enhancer;", "byte", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@37c8c36b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type2 = classEmitter1.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(2, "double", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter2.visitAnnotation("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitInnerClass("", "byte", "Lorg/mockito/cglib/proxy/Enhancer;", 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = null;
        enhancer3.setNamingPolicy(namingPolicy4);
        java.lang.ClassLoader classLoader6 = null;
        enhancer3.setClassLoader(classLoader6);
        java.lang.Class<?> wildcardClass8 = enhancer3.getClass();
        java.lang.String str9 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        boolean boolean10 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.lang.Class[] classArray19 = new java.lang.Class[] { wildcardClass8, wildcardClass17 };
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSize();
        java.lang.String str23 = type21.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BYTE_TYPE;
        int int28 = type27.getSize();
        java.lang.String str29 = type27.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str31 = type30.getClassName();
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type24, type25, type26, type27, type30 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type21, typeArray32);
        org.mockito.asm.Type[] typeArray34 = signature33.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = enhancer0.create(classArray19, (java.lang.Object[]) typeArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str9, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str18, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "byte" + "'", str23, "byte");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "byte" + "'", str29, "byte");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "double" + "'", str31, "double");
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray34);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitInnerClass("Lorg/mockito/cglib/proxy/Enhancer;", "Lorg/mockito/cglib/proxy/Enhancer;", "Lorg/mockito/cglib/proxy/Enhancer;", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        int int0 = org.mockito.asm.Type.BOOLEAN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer0.setClassLoader(classLoader9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(100, "hi!", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        int int0 = org.mockito.asm.Type.INT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        int int0 = org.mockito.cglib.core.CodeEmitter.DIV;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 108 + "'", int0 == 108);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = classEmitter2.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = classEmitter2.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Callback[] callbackArray8 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass5, callbackArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(callbackArray8);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass5, callback7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("Lorg/mockito/cglib/proxy/Enhancer;", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        int int0 = org.mockito.cglib.core.CodeEmitter.LT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 155 + "'", int0 == 155);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter2.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@21f52edb");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = null;
        enhancer3.setNamingPolicy(namingPolicy4);
        java.lang.ClassLoader classLoader6 = null;
        enhancer3.setClassLoader(classLoader6);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = null;
        enhancer8.setNamingPolicy(namingPolicy9);
        java.lang.ClassLoader classLoader11 = null;
        enhancer8.setClassLoader(classLoader11);
        java.lang.Class<?> wildcardClass13 = enhancer8.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass13);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = null;
        enhancer15.setNamingPolicy(namingPolicy16);
        java.lang.ClassLoader classLoader18 = null;
        enhancer15.setClassLoader(classLoader18);
        java.lang.Class<?> wildcardClass20 = enhancer15.getClass();
        java.lang.Class[] classArray21 = new java.lang.Class[] { wildcardClass13, wildcardClass20 };
        enhancer3.setInterfaces(classArray21);
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = null;
        enhancer23.setNamingPolicy(namingPolicy24);
        java.lang.ClassLoader classLoader26 = null;
        enhancer23.setClassLoader(classLoader26);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = null;
        enhancer28.setNamingPolicy(namingPolicy29);
        java.lang.ClassLoader classLoader31 = null;
        enhancer28.setClassLoader(classLoader31);
        java.lang.Class<?> wildcardClass33 = enhancer28.getClass();
        java.lang.String str34 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass33);
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = null;
        enhancer35.setNamingPolicy(namingPolicy36);
        java.lang.ClassLoader classLoader38 = null;
        enhancer35.setClassLoader(classLoader38);
        java.lang.Class<?> wildcardClass40 = enhancer35.getClass();
        java.lang.Class[] classArray41 = new java.lang.Class[] { wildcardClass33, wildcardClass40 };
        enhancer23.setInterfaces(classArray41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = enhancer0.create(classArray21, (java.lang.Object[]) classArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str14, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str34, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(classArray41);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.String str12 = signature11.getName();
        java.lang.String str13 = signature11.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor14 = classEmitter4.visitField((int) (short) -1, "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", "Lorg/mockito/cglib/proxy/Enhancer;", "byte", (java.lang.Object) str13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        int int0 = org.mockito.cglib.core.CodeEmitter.ADD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 96 + "'", int0 == 96);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class6 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("(CBBBD)B", "()D", "(CBBBD)B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        int int0 = org.mockito.cglib.core.CodeEmitter.GE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 156 + "'", int0 == 156);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        int int0 = org.mockito.asm.Type.OBJECT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("byte", "Lorg/mockito/cglib/proxy/Enhancer;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray11 = new java.lang.String[] { "()D", "(CBBBD)B" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter4.visitMethod((int) (short) 100, "()D", "(CBBBD)B", "byte", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()D' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer0.setClassLoader(classLoader9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class11 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: createClass does not accept callbacks");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = enhancer0.getNamingPolicy();
        boolean boolean7 = enhancer0.getAttemptLoad();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class8 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namingPolicy6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter4.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer6.setNamingPolicy(namingPolicy7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer6.setClassLoader(classLoader9);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = null;
        enhancer11.setNamingPolicy(namingPolicy12);
        java.lang.ClassLoader classLoader14 = null;
        enhancer11.setClassLoader(classLoader14);
        java.lang.Class<?> wildcardClass16 = enhancer11.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = null;
        enhancer18.setNamingPolicy(namingPolicy19);
        java.lang.ClassLoader classLoader21 = null;
        enhancer18.setClassLoader(classLoader21);
        java.lang.Class<?> wildcardClass23 = enhancer18.getClass();
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass16, wildcardClass23 };
        enhancer6.setInterfaces(classArray24);
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = null;
        enhancer26.setNamingPolicy(namingPolicy27);
        java.lang.ClassLoader classLoader29 = null;
        enhancer26.setClassLoader(classLoader29);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = null;
        enhancer31.setNamingPolicy(namingPolicy32);
        java.lang.ClassLoader classLoader34 = null;
        enhancer31.setClassLoader(classLoader34);
        java.lang.Class<?> wildcardClass36 = enhancer31.getClass();
        java.lang.String str37 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass36);
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy39 = null;
        enhancer38.setNamingPolicy(namingPolicy39);
        java.lang.ClassLoader classLoader41 = null;
        enhancer38.setClassLoader(classLoader41);
        java.lang.Class<?> wildcardClass43 = enhancer38.getClass();
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass36, wildcardClass43 };
        enhancer26.setInterfaces(classArray44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = enhancer0.create(classArray24, (java.lang.Object[]) classArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str17, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str37, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(classArray44);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(124, type9);
        boolean boolean12 = type9.equals((java.lang.Object) 0);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        int int15 = type14.getSize();
        java.lang.String str16 = type14.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        int int21 = type20.getSize();
        java.lang.String str22 = type20.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type17, type18, type19, type20, type23 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type14, typeArray25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray25);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        int int30 = type29.getSize();
        java.lang.String str31 = type29.getClassName();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        int int36 = type35.getSize();
        java.lang.String str37 = type35.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str39 = type38.getClassName();
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type32, type33, type34, type35, type38 };
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type29, typeArray40);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.begin_class((int) (short) 1, (int) (short) 10, "(CBBBD)B", type9, typeArray40, "(CBBBD)B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "byte" + "'", str16, "byte");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "byte" + "'", str22, "byte");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "double" + "'", str24, "double");
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(CBBBD)B" + "'", str27, "(CBBBD)B");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "byte" + "'", str31, "byte");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "byte" + "'", str37, "byte");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "double" + "'", str39, "double");
        org.junit.Assert.assertNotNull(typeArray40);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        int int0 = org.mockito.asm.Type.DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = null;
        enhancer11.setNamingPolicy(namingPolicy12);
        java.lang.ClassLoader classLoader14 = null;
        enhancer11.setClassLoader(classLoader14);
        java.lang.Class<?> wildcardClass16 = enhancer11.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[] { wildcardClass16 };
        org.mockito.cglib.proxy.Callback callback18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass5, classArray17, callback18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(classArray17);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = classEmitter4.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        enhancer0.setUseCache(true);
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = null;
        enhancer8.setNamingPolicy(namingPolicy9);
        java.lang.ClassLoader classLoader11 = null;
        enhancer8.setClassLoader(classLoader11);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = null;
        enhancer13.setNamingPolicy(namingPolicy14);
        java.lang.ClassLoader classLoader16 = null;
        enhancer13.setClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass18 = enhancer13.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = null;
        enhancer20.setNamingPolicy(namingPolicy21);
        java.lang.ClassLoader classLoader23 = null;
        enhancer20.setClassLoader(classLoader23);
        java.lang.Class<?> wildcardClass25 = enhancer20.getClass();
        java.lang.Class[] classArray26 = new java.lang.Class[] { wildcardClass18, wildcardClass25 };
        enhancer8.setInterfaces(classArray26);
        org.mockito.cglib.proxy.Callback callback28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass5, classArray26, callback28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str19, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(classArray26);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("(CBBBD)B", "byte", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        int int0 = org.mockito.cglib.core.CodeEmitter.AND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 126 + "'", int0 == 126);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("()D", "(CBBBD)B", "(CBBBD)B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("Lorg/mockito/cglib/proxy/Enhancer;", "", "double", 132);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitSource("hi!", "(CBBBD)B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "L1219436756", "byte" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter1.visitMethod((int) (short) 0, "L1219436756", "()D", "", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2c552ff2");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str3 = signature2.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = null;
        enhancer10.setNamingPolicy(namingPolicy11);
        java.lang.ClassLoader classLoader13 = null;
        enhancer10.setClassLoader(classLoader13);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = null;
        enhancer15.setNamingPolicy(namingPolicy16);
        java.lang.ClassLoader classLoader18 = null;
        enhancer15.setClassLoader(classLoader18);
        java.lang.Class<?> wildcardClass20 = enhancer15.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = null;
        enhancer22.setNamingPolicy(namingPolicy23);
        java.lang.ClassLoader classLoader25 = null;
        enhancer22.setClassLoader(classLoader25);
        java.lang.Class<?> wildcardClass27 = enhancer22.getClass();
        java.lang.Class[] classArray28 = new java.lang.Class[] { wildcardClass20, wildcardClass27 };
        enhancer10.setInterfaces(classArray28);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter30 = null;
        org.mockito.cglib.proxy.Callback callback31 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray32 = new org.mockito.cglib.proxy.Callback[] { callback31 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass5, classArray28, callbackFilter30, callbackArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str21, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(callbackArray32);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = classEmitter2.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Callback[] callbackArray11 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass5, callbackArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(callbackArray11);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        boolean boolean20 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy25 = null;
        enhancer24.setNamingPolicy(namingPolicy25);
        java.lang.ClassLoader classLoader27 = null;
        enhancer24.setClassLoader(classLoader27);
        java.lang.Class<?> wildcardClass29 = enhancer24.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = null;
        enhancer30.setNamingPolicy(namingPolicy31);
        java.lang.ClassLoader classLoader33 = null;
        enhancer30.setClassLoader(classLoader33);
        java.lang.Class<?> wildcardClass35 = enhancer30.getClass();
        java.lang.String str36 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass35);
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy39 = null;
        enhancer38.setNamingPolicy(namingPolicy39);
        java.lang.ClassLoader classLoader41 = null;
        enhancer38.setClassLoader(classLoader41);
        java.lang.Class<?> wildcardClass43 = enhancer38.getClass();
        java.lang.String str44 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass43);
        org.mockito.cglib.proxy.Enhancer enhancer45 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy46 = null;
        enhancer45.setNamingPolicy(namingPolicy46);
        java.lang.ClassLoader classLoader48 = null;
        enhancer45.setClassLoader(classLoader48);
        java.lang.Class<?> wildcardClass50 = enhancer45.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer51 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy52 = null;
        enhancer51.setNamingPolicy(namingPolicy52);
        java.lang.ClassLoader classLoader54 = null;
        enhancer51.setClassLoader(classLoader54);
        java.lang.Class<?> wildcardClass56 = enhancer51.getClass();
        java.lang.String str57 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass56);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass56);
        java.lang.Class[] classArray59 = new java.lang.Class[] { wildcardClass29, wildcardClass35, wildcardClass43, wildcardClass50, wildcardClass56 };
        enhancer21.setInterfaces(classArray59);
        org.mockito.cglib.proxy.Enhancer enhancer61 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy62 = null;
        enhancer61.setNamingPolicy(namingPolicy62);
        java.lang.ClassLoader classLoader64 = null;
        enhancer61.setClassLoader(classLoader64);
        org.mockito.cglib.proxy.Enhancer enhancer66 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy67 = null;
        enhancer66.setNamingPolicy(namingPolicy67);
        java.lang.ClassLoader classLoader69 = null;
        enhancer66.setClassLoader(classLoader69);
        java.lang.Class<?> wildcardClass71 = enhancer66.getClass();
        java.lang.String str72 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass71);
        org.mockito.cglib.proxy.Enhancer enhancer73 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy74 = null;
        enhancer73.setNamingPolicy(namingPolicy74);
        java.lang.ClassLoader classLoader76 = null;
        enhancer73.setClassLoader(classLoader76);
        java.lang.Class<?> wildcardClass78 = enhancer73.getClass();
        java.lang.Class[] classArray79 = new java.lang.Class[] { wildcardClass71, wildcardClass78 };
        enhancer61.setInterfaces(classArray79);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj81 = enhancer0.create(classArray59, (java.lang.Object[]) classArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str36, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str44, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str57, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(classArray59);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str72, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(classArray79);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor10 = classEmitter3.visitField((int) ' ', "(CBBBD)B", "byte", "", (java.lang.Object) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Attribute attribute1 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitAttribute(attribute1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Callback[] callbackArray10 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass5, callbackArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(callbackArray10);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader6 = enhancer0.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class7 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader6);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter1.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = classEmitter3.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(157, "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 42");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        int int4 = type3.getSize();
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter10 = null;
        enhancer5.setCallbackFilter(callbackFilter10);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer5.setCallback(callback12);
        java.lang.ClassLoader classLoader14 = null;
        enhancer5.setClassLoader(classLoader14);
        enhancer5.setInterceptDuringConstruction(true);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.declare_field((int) (short) 10, "L1219436756", type3, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("byte");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType("Lorg/mockito/cglib/proxy/Enhancer;");
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type11 };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.begin_class(0, (int) (short) 10, "", type7, typeArray12, "Lorg/mockito/cglib/proxy/Enhancer;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray14 = new java.lang.String[] { "(CBBBD)B", "hi!", "", "byte" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visit(0, (int) ' ', "org/mockito/cglib/proxy/Enhancer", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", "hi!", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter2.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.lang.Class class0 = null;
        org.mockito.cglib.proxy.Callback callback1 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray2 = new org.mockito.cglib.proxy.Callback[] { callback1 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks(class0, callbackArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(callbackArray2);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = null;
        enhancer3.setNamingPolicy(namingPolicy4);
        java.lang.ClassLoader classLoader6 = null;
        enhancer3.setClassLoader(classLoader6);
        java.lang.Class<?> wildcardClass8 = enhancer3.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer9.setNamingPolicy(namingPolicy10);
        java.lang.ClassLoader classLoader12 = null;
        enhancer9.setClassLoader(classLoader12);
        java.lang.Class<?> wildcardClass14 = enhancer9.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        java.lang.ClassLoader classLoader20 = null;
        enhancer17.setClassLoader(classLoader20);
        java.lang.Class<?> wildcardClass22 = enhancer17.getClass();
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass22);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy25 = null;
        enhancer24.setNamingPolicy(namingPolicy25);
        java.lang.ClassLoader classLoader27 = null;
        enhancer24.setClassLoader(classLoader27);
        java.lang.Class<?> wildcardClass29 = enhancer24.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = null;
        enhancer30.setNamingPolicy(namingPolicy31);
        java.lang.ClassLoader classLoader33 = null;
        enhancer30.setClassLoader(classLoader33);
        java.lang.Class<?> wildcardClass35 = enhancer30.getClass();
        java.lang.String str36 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass35);
        java.lang.Class[] classArray38 = new java.lang.Class[] { wildcardClass8, wildcardClass14, wildcardClass22, wildcardClass29, wildcardClass35 };
        enhancer0.setInterfaces(classArray38);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str15, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str23, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str36, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(classArray38);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("byte", "()D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 42");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Callback callback10 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray11 = new org.mockito.cglib.proxy.Callback[] { callback10 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass5, callbackArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(callbackArray11);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer0.getNamingPolicy();
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy5);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter2.visitAnnotation("Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "J", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitInnerClass("", "L1219436756", "byte", 155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Attribute attribute1 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitAttribute(attribute1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = classEmitter2.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "Lorg/mockito/cglib/proxy/Enhancer;", "double" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = classEmitter4.visitMethod((int) (short) 10, "", "(CBBBD)B", "J", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@18bc78d8");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classEmitter2.visitMethod(10, "L1219436756", "hi!", "(CBBBD)B", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@29c1f893");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "double", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter4.visitAnnotation("byte", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("L1219436756", "", "byte", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer0.setClassLoader(classLoader9);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = null;
        enhancer0.setStrategy(generatorStrategy11);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = enhancer0.getNamingPolicy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class15 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: createClass does not accept callbacks");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy13);
        org.junit.Assert.assertNotNull(namingPolicy14);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        boolean boolean20 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = enhancer21.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        java.lang.String str29 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        java.lang.Class[] classArray31 = new java.lang.Class[] {};
        org.mockito.cglib.proxy.CallbackFilter callbackFilter32 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray33 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass26, classArray31, callbackFilter32, callbackArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str29, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(callbackArray33);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter3.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5f3abdf2");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter5.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@414b87e0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("", "J", "J", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        java.lang.Class class6 = null;
        enhancer0.setSuperclass(class6);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "hi!", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter3.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@70f424c0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray11 = new java.lang.String[] { "Lorg/mockito/cglib/proxy/Enhancer;", "org/mockito/cglib/proxy/Enhancer", "byte", "Lorg/mockito/cglib/proxy/Enhancer;", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter0.visitMethod(124, "org/mockito/cglib/proxy/Enhancer", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", "()B", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@f54ed66");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str10 = signature9.getDescriptor();
        boolean boolean12 = signature9.equals((java.lang.Object) (short) 1);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = null;
        enhancer13.setNamingPolicy(namingPolicy14);
        java.lang.ClassLoader classLoader16 = null;
        enhancer13.setClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass18 = enhancer13.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        boolean boolean20 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        int int23 = type21.getOpcode(128);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type21, type24 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter27 = classEmitter5.begin_method((int) (byte) 0, signature9, typeArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7fb2addd");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str19, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 132 + "'", int23 == 132);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "J" + "'", str25, "J");
        org.junit.Assert.assertNotNull(typeArray26);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer0.setClassLoader(classLoader9);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = null;
        enhancer13.setNamingPolicy(namingPolicy14);
        java.lang.ClassLoader classLoader16 = null;
        enhancer13.setClassLoader(classLoader16);
        boolean boolean18 = enhancer13.getAttemptLoad();
        enhancer13.setUseCache(true);
        java.lang.ClassLoader classLoader21 = enhancer13.getClassLoader();
        enhancer0.setClassLoader(classLoader21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(classLoader21);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = null;
        enhancer11.setNamingPolicy(namingPolicy12);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = null;
        enhancer14.setNamingPolicy(namingPolicy15);
        java.lang.ClassLoader classLoader17 = null;
        enhancer14.setClassLoader(classLoader17);
        java.lang.Class<?> wildcardClass19 = enhancer14.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = null;
        enhancer20.setNamingPolicy(namingPolicy21);
        java.lang.ClassLoader classLoader23 = null;
        enhancer20.setClassLoader(classLoader23);
        java.lang.Class<?> wildcardClass25 = enhancer20.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = null;
        enhancer28.setNamingPolicy(namingPolicy29);
        java.lang.ClassLoader classLoader31 = null;
        enhancer28.setClassLoader(classLoader31);
        java.lang.Class<?> wildcardClass33 = enhancer28.getClass();
        java.lang.String str34 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass33);
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = null;
        enhancer35.setNamingPolicy(namingPolicy36);
        java.lang.ClassLoader classLoader38 = null;
        enhancer35.setClassLoader(classLoader38);
        java.lang.Class<?> wildcardClass40 = enhancer35.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy42 = null;
        enhancer41.setNamingPolicy(namingPolicy42);
        java.lang.ClassLoader classLoader44 = null;
        enhancer41.setClassLoader(classLoader44);
        java.lang.Class<?> wildcardClass46 = enhancer41.getClass();
        java.lang.String str47 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass46);
        java.lang.Class[] classArray49 = new java.lang.Class[] { wildcardClass19, wildcardClass25, wildcardClass33, wildcardClass40, wildcardClass46 };
        enhancer11.setInterfaces(classArray49);
        java.util.List list51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass5, classArray49, list51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str26, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str34, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str47, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(classArray49);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = null;
        enhancer7.setNamingPolicy(namingPolicy8);
        java.lang.ClassLoader classLoader10 = null;
        enhancer7.setClassLoader(classLoader10);
        java.lang.Class<?> wildcardClass12 = enhancer7.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor15 = classEmitter2.visitField((int) (byte) 10, "hi!", "hi!", "double", (java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str13, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type14);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer0.setClassLoader(classLoader9);
        enhancer0.setInterceptDuringConstruction(true);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = enhancer0.getStrategy();
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(generatorStrategy6);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor10 = classEmitter4.visitField(130, "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", "", "double", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor10 = classEmitter4.visitField(126, "org/mockito/cglib/proxy/Enhancer", "L1219436756", "(CBBBD)B", (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("()B", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()B' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader6 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = null;
        enhancer7.setNamingPolicy(namingPolicy8);
        java.lang.ClassLoader classLoader10 = null;
        enhancer7.setClassLoader(classLoader10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = null;
        enhancer19.setNamingPolicy(namingPolicy20);
        java.lang.ClassLoader classLoader22 = null;
        enhancer19.setClassLoader(classLoader22);
        java.lang.Class<?> wildcardClass24 = enhancer19.getClass();
        java.lang.Class[] classArray25 = new java.lang.Class[] { wildcardClass17, wildcardClass24 };
        enhancer7.setInterfaces(classArray25);
        boolean boolean27 = enhancer7.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = null;
        enhancer28.setNamingPolicy(namingPolicy29);
        java.lang.ClassLoader classLoader31 = null;
        enhancer28.setClassLoader(classLoader31);
        java.lang.Class<?> wildcardClass33 = enhancer28.getClass();
        enhancer7.setSuperclass((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str18, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(type35);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.String str8 = signature7.getName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("double", type10, typeArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter15 = classEmitter2.begin_method(154, signature7, typeArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@780b012");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "()D" + "'", str13, "()D");
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitOuterClass("byte", "L1219436756", "Lorg/mockito/cglib/proxy/Enhancer;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor11 = classEmitter5.visitField(96, "byte", "byte", "Lorg/mockito/cglib/proxy/Enhancer;", (java.lang.Object) 157);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        boolean boolean20 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = enhancer21.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass26);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = null;
        enhancer28.setNamingPolicy(namingPolicy29);
        java.lang.ClassLoader classLoader31 = null;
        enhancer28.setClassLoader(classLoader31);
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = null;
        enhancer33.setNamingPolicy(namingPolicy34);
        java.lang.ClassLoader classLoader36 = null;
        enhancer33.setClassLoader(classLoader36);
        java.lang.Class<?> wildcardClass38 = enhancer33.getClass();
        java.lang.String str39 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass38);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy41 = null;
        enhancer40.setNamingPolicy(namingPolicy41);
        java.lang.ClassLoader classLoader43 = null;
        enhancer40.setClassLoader(classLoader43);
        java.lang.Class<?> wildcardClass45 = enhancer40.getClass();
        java.lang.Class[] classArray46 = new java.lang.Class[] { wildcardClass38, wildcardClass45 };
        enhancer28.setInterfaces(classArray46);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str39, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(classArray46);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "(CBBBD)B" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter3.visitMethod(7, "org/mockito/cglib/proxy/Enhancer", "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", "", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@63b56ee8");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("J");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("()D");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        int int10 = type9.getSize();
        java.lang.String str11 = type9.getClassName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor12 = classEmitter4.visitField(0, "Lorg/mockito/cglib/proxy/Enhancer;", "", "J", (java.lang.Object) str11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "byte" + "'", str11, "byte");
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.String str6 = signature5.getName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(124, type8);
        boolean boolean11 = type8.equals((java.lang.Object) 0);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        int int14 = type13.getSize();
        java.lang.String str15 = type13.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        int int20 = type19.getSize();
        java.lang.String str21 = type19.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type16, type17, type18, type19, type22 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type13, typeArray24);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter27 = classEmitter1.begin_method(130, signature5, typeArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@34dfe260");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "byte" + "'", str15, "byte");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "byte" + "'", str21, "byte");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "double" + "'", str23, "double");
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(CBBBD)B" + "'", str26, "(CBBBD)B");
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("J", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer0.setClassLoader(classLoader9);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = null;
        enhancer0.setStrategy(generatorStrategy11);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer0.getNamingPolicy();
        java.lang.Class[] classArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy13);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("(CBBBD)B", "()Lorg/mockito/cglib/proxy/Enhancer;", "()B", 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = classEmitter5.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 10, "", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        enhancer0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer0.getNamingPolicy();
        boolean boolean10 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = null;
        enhancer11.setNamingPolicy(namingPolicy12);
        java.lang.ClassLoader classLoader14 = null;
        enhancer11.setClassLoader(classLoader14);
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = null;
        enhancer16.setNamingPolicy(namingPolicy17);
        java.lang.ClassLoader classLoader19 = null;
        enhancer16.setClassLoader(classLoader19);
        java.lang.Class<?> wildcardClass21 = enhancer16.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass21);
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = null;
        enhancer23.setNamingPolicy(namingPolicy24);
        java.lang.ClassLoader classLoader26 = null;
        enhancer23.setClassLoader(classLoader26);
        java.lang.Class<?> wildcardClass28 = enhancer23.getClass();
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass21, wildcardClass28 };
        enhancer11.setInterfaces(classArray29);
        boolean boolean31 = enhancer11.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = null;
        enhancer32.setNamingPolicy(namingPolicy33);
        java.lang.ClassLoader classLoader35 = null;
        enhancer32.setClassLoader(classLoader35);
        java.lang.Class<?> wildcardClass37 = enhancer32.getClass();
        enhancer11.setSuperclass((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass37);
        java.lang.String str40 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass37);
        java.lang.String str41 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass37);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str22, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str40, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str41, "org/mockito/cglib/proxy/Enhancer");
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Callback callback11 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray12 = new org.mockito.cglib.proxy.Callback[] { callback11 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass5, callbackArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(callbackArray12);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("()D", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()D' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        boolean boolean20 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = enhancer21.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass26);
        org.mockito.cglib.proxy.Callback callback28 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray29 = new org.mockito.cglib.proxy.Callback[] { callback28 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass26, callbackArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(callbackArray29);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(10, "", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(153, "L1183194368", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray16 = new java.lang.String[] { "()D", "()B", "", "J" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visit(0, 112, "", "Lorg/mockito/cglib/proxy/Enhancer;", "()Lorg/mockito/cglib/proxy/Enhancer;", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        java.lang.String[] strArray15 = new java.lang.String[] { "L1183194368", "byte", "Lorg/mockito/cglib/proxy/Enhancer;", "(CBBBD)B" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visit((int) '4', 2, "double", "()D", "", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("()Lorg/mockito/cglib/proxy/Enhancer;", "org/mockito/cglib/proxy/Enhancer", "org/mockito/cglib/proxy/Enhancer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter2.visitAnnotation("J", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("double", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = classEmitter4.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        java.lang.String[] strArray16 = new java.lang.String[] { "B", "J", "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", "org/mockito/cglib/proxy/Enhancer", "L1183194368", "J" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(8, (int) (byte) 1, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", "org/mockito/cglib/proxy/Enhancer", "Lbyte;", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("org/mockito/cglib/proxy/Enhancer");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor6 = classEmitter0.visitField(0, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", "L1219436756", obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitInnerClass("", "org/mockito/cglib/proxy/Enhancer", "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter2.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter9 = null;
        enhancer0.setCallbackFilter(callbackFilter9);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = null;
        enhancer11.setNamingPolicy(namingPolicy12);
        java.lang.ClassLoader classLoader14 = null;
        enhancer11.setClassLoader(classLoader14);
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = null;
        enhancer16.setNamingPolicy(namingPolicy17);
        java.lang.ClassLoader classLoader19 = null;
        enhancer16.setClassLoader(classLoader19);
        java.lang.Class<?> wildcardClass21 = enhancer16.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass21);
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = null;
        enhancer23.setNamingPolicy(namingPolicy24);
        java.lang.ClassLoader classLoader26 = null;
        enhancer23.setClassLoader(classLoader26);
        java.lang.Class<?> wildcardClass28 = enhancer23.getClass();
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass21, wildcardClass28 };
        enhancer11.setInterfaces(classArray29);
        boolean boolean31 = enhancer11.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = null;
        enhancer32.setNamingPolicy(namingPolicy33);
        java.lang.ClassLoader classLoader35 = null;
        enhancer32.setClassLoader(classLoader35);
        java.lang.Class<?> wildcardClass37 = enhancer32.getClass();
        enhancer11.setSuperclass((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass37);
        java.lang.String str40 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass37);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str22, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str40, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertNotNull(type41);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = null;
        enhancer8.setNamingPolicy(namingPolicy9);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = null;
        enhancer11.setNamingPolicy(namingPolicy12);
        java.lang.ClassLoader classLoader14 = null;
        enhancer11.setClassLoader(classLoader14);
        java.lang.Class<?> wildcardClass16 = enhancer11.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        java.lang.ClassLoader classLoader20 = null;
        enhancer17.setClassLoader(classLoader20);
        java.lang.Class<?> wildcardClass22 = enhancer17.getClass();
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = null;
        enhancer25.setNamingPolicy(namingPolicy26);
        java.lang.ClassLoader classLoader28 = null;
        enhancer25.setClassLoader(classLoader28);
        java.lang.Class<?> wildcardClass30 = enhancer25.getClass();
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass30);
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = null;
        enhancer32.setNamingPolicy(namingPolicy33);
        java.lang.ClassLoader classLoader35 = null;
        enhancer32.setClassLoader(classLoader35);
        java.lang.Class<?> wildcardClass37 = enhancer32.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer38 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy39 = null;
        enhancer38.setNamingPolicy(namingPolicy39);
        java.lang.ClassLoader classLoader41 = null;
        enhancer38.setClassLoader(classLoader41);
        java.lang.Class<?> wildcardClass43 = enhancer38.getClass();
        java.lang.String str44 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass43);
        java.lang.Class[] classArray46 = new java.lang.Class[] { wildcardClass16, wildcardClass22, wildcardClass30, wildcardClass37, wildcardClass43 };
        enhancer8.setInterfaces(classArray46);
        org.mockito.cglib.proxy.Callback callback48 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass5, classArray46, callback48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str23, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str31, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str44, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(classArray46);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str6 = signature5.getDescriptor();
        java.lang.String str7 = signature5.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(124, type9);
        boolean boolean12 = type9.equals((java.lang.Object) 0);
        int int13 = type9.getSize();
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = null;
        enhancer14.setNamingPolicy(namingPolicy15);
        java.lang.ClassLoader classLoader17 = null;
        enhancer14.setClassLoader(classLoader17);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = null;
        enhancer19.setNamingPolicy(namingPolicy20);
        java.lang.ClassLoader classLoader22 = null;
        enhancer19.setClassLoader(classLoader22);
        java.lang.Class<?> wildcardClass24 = enhancer19.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = null;
        enhancer26.setNamingPolicy(namingPolicy27);
        java.lang.ClassLoader classLoader29 = null;
        enhancer26.setClassLoader(classLoader29);
        java.lang.Class<?> wildcardClass31 = enhancer26.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[] { wildcardClass24, wildcardClass31 };
        enhancer14.setInterfaces(classArray32);
        boolean boolean34 = enhancer14.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = null;
        enhancer35.setNamingPolicy(namingPolicy36);
        java.lang.ClassLoader classLoader38 = null;
        enhancer35.setClassLoader(classLoader38);
        java.lang.Class<?> wildcardClass40 = enhancer35.getClass();
        enhancer14.setSuperclass((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.String str43 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BYTE_TYPE;
        int int47 = type46.getSize();
        java.lang.String str48 = type46.getClassName();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BYTE_TYPE;
        int int53 = type52.getSize();
        java.lang.String str54 = type52.getClassName();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str56 = type55.getClassName();
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type49, type50, type51, type52, type55 };
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type46, typeArray57);
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray57);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray57);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter61 = classEmitter1.begin_method((int) (short) 100, signature5, typeArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3d59c51b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str25, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str43, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "byte" + "'", str48, "byte");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "byte" + "'", str54, "byte");
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "double" + "'", str56, "double");
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;" + "'", str59, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "(CBBBD)B" + "'", str60, "(CBBBD)B");
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = enhancer0.getNamingPolicy();
        boolean boolean7 = enhancer0.getAttemptLoad();
        enhancer0.setUseCache(true);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter(classVisitor10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namingPolicy6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(classInfo13);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        org.mockito.cglib.proxy.Callback callback8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass5, classArray7, callback8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(classArray7);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Callback callback11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass5, callback11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer9.setNamingPolicy(namingPolicy10);
        java.lang.ClassLoader classLoader12 = null;
        enhancer9.setClassLoader(classLoader12);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter14 = null;
        enhancer9.setCallbackFilter(callbackFilter14);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor16 = classEmitter4.visitField(132, "()D", "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", "org.mockito.cglib.proxy.Enhancer", (java.lang.Object) enhancer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("()B", "org/mockito/cglib/proxy/Enhancer", "L1219436756");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray13 = new java.lang.String[] { "()Lorg/mockito/cglib/proxy/Enhancer;", "L1219436756", "org/mockito/cglib/proxy/Enhancer", "Lorg/mockito/cglib/proxy/Enhancer;" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visit(128, 6, "double", "B", "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitInnerClass("double()B", "L1674961359", "Lorg/mockito/cglib/proxy/Enhancer;", 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        enhancer0.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = null;
        enhancer22.setNamingPolicy(namingPolicy23);
        java.lang.ClassLoader classLoader25 = null;
        enhancer22.setClassLoader(classLoader25);
        java.lang.Class<?> wildcardClass27 = enhancer22.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str28, "org/mockito/cglib/proxy/Enhancer");
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        int int0 = org.mockito.cglib.core.CodeEmitter.NEG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 116 + "'", int0 == 116);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = null;
        enhancer10.setNamingPolicy(namingPolicy11);
        java.lang.ClassLoader classLoader13 = null;
        enhancer10.setClassLoader(classLoader13);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = null;
        enhancer15.setNamingPolicy(namingPolicy16);
        java.lang.ClassLoader classLoader18 = null;
        enhancer15.setClassLoader(classLoader18);
        java.lang.Class<?> wildcardClass20 = enhancer15.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = null;
        enhancer22.setNamingPolicy(namingPolicy23);
        java.lang.ClassLoader classLoader25 = null;
        enhancer22.setClassLoader(classLoader25);
        java.lang.Class<?> wildcardClass27 = enhancer22.getClass();
        java.lang.Class[] classArray28 = new java.lang.Class[] { wildcardClass20, wildcardClass27 };
        enhancer10.setInterfaces(classArray28);
        boolean boolean30 = enhancer10.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = null;
        enhancer31.setNamingPolicy(namingPolicy32);
        java.lang.ClassLoader classLoader34 = null;
        enhancer31.setClassLoader(classLoader34);
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = null;
        enhancer36.setNamingPolicy(namingPolicy37);
        java.lang.ClassLoader classLoader39 = null;
        enhancer36.setClassLoader(classLoader39);
        java.lang.Class<?> wildcardClass41 = enhancer36.getClass();
        java.lang.String str42 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass41);
        org.mockito.cglib.proxy.Enhancer enhancer43 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy44 = null;
        enhancer43.setNamingPolicy(namingPolicy44);
        java.lang.ClassLoader classLoader46 = null;
        enhancer43.setClassLoader(classLoader46);
        java.lang.Class<?> wildcardClass48 = enhancer43.getClass();
        java.lang.Class[] classArray49 = new java.lang.Class[] { wildcardClass41, wildcardClass48 };
        enhancer31.setInterfaces(classArray49);
        enhancer10.setInterfaces(classArray49);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter52 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass5, classArray49, callbackFilter52, callbackArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str21, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str42, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(classArray49);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = enhancer0.getStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class7 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(generatorStrategy6);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter3.visitAnnotation("org.mockito.cglib.proxy.Enhancer", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B");
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.declare_field((int) ' ', "L1219436756", type9, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("()B", "double", "hi!", 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitOuterClass("(CBBBD)B", "L1183194368", "B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = classEmitter3.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(124, type10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor12 = classEmitter3.visitField(100, "long", "L1674961359", "org/mockito/cglib/proxy/Enhancer", (java.lang.Object) 124);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        java.lang.String str3 = label0.toString();
        java.lang.Object obj4 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L1096608109" + "'", str2, "L1096608109");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L1096608109" + "'", str3, "L1096608109");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        java.lang.Class class6 = null;
        enhancer0.setSuperclass(class6);
        java.lang.ClassLoader classLoader8 = enhancer0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer0.getNamingPolicy();
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str18, "org/mockito/cglib/proxy/Enhancer");
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("long");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("", "org.mockito.cglib.proxy.Enhancer", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B");
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type9, type10, type12, type15 };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.begin_class((int) (byte) -1, 96, "", type8, typeArray16, "org.mockito.cglib.proxy.Enhancer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "double" + "'", str11, "double");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "J" + "'", str13, "J");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", "()B");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = classEmitter2.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        java.lang.String str10 = label7.toString();
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] { label7 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(112, 0, label6, labelArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1318977314" + "'", str9, "L1318977314");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1318977314" + "'", str10, "L1318977314");
        org.junit.Assert.assertNotNull(labelArray11);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(157, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        enhancer0.setUseCache(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter2.visitAnnotation("()Lorg/mockito/cglib/proxy/Enhancer;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        java.lang.Class class6 = null;
        enhancer0.setSuperclass(class6);
        java.lang.ClassLoader classLoader8 = enhancer0.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class9 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader8);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer6.setNamingPolicy(namingPolicy7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer6.setClassLoader(classLoader9);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = null;
        enhancer11.setNamingPolicy(namingPolicy12);
        java.lang.ClassLoader classLoader14 = null;
        enhancer11.setClassLoader(classLoader14);
        java.lang.Class<?> wildcardClass16 = enhancer11.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = null;
        enhancer18.setNamingPolicy(namingPolicy19);
        java.lang.ClassLoader classLoader21 = null;
        enhancer18.setClassLoader(classLoader21);
        java.lang.Class<?> wildcardClass23 = enhancer18.getClass();
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass16, wildcardClass23 };
        enhancer6.setInterfaces(classArray24);
        boolean boolean26 = enhancer6.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = null;
        enhancer27.setNamingPolicy(namingPolicy28);
        java.lang.ClassLoader classLoader30 = null;
        enhancer27.setClassLoader(classLoader30);
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = null;
        enhancer32.setNamingPolicy(namingPolicy33);
        java.lang.ClassLoader classLoader35 = null;
        enhancer32.setClassLoader(classLoader35);
        java.lang.Class<?> wildcardClass37 = enhancer32.getClass();
        java.lang.String str38 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass37);
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = null;
        enhancer39.setNamingPolicy(namingPolicy40);
        java.lang.ClassLoader classLoader42 = null;
        enhancer39.setClassLoader(classLoader42);
        java.lang.Class<?> wildcardClass44 = enhancer39.getClass();
        java.lang.Class[] classArray45 = new java.lang.Class[] { wildcardClass37, wildcardClass44 };
        enhancer27.setInterfaces(classArray45);
        enhancer6.setInterfaces(classArray45);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter48 = null;
        org.mockito.cglib.proxy.Callback callback49 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray50 = new org.mockito.cglib.proxy.Callback[] { callback49 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass5, classArray45, callbackFilter48, callbackArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str17, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str38, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertNotNull(callbackArray50);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter5.visitAnnotation("byte", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter6.visit((int) 'a', 154, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", "double", "hi!", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(7, "J", "()D", "()D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        boolean boolean20 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = enhancer21.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy30 = null;
        enhancer29.setNamingPolicy(namingPolicy30);
        java.lang.ClassLoader classLoader32 = null;
        enhancer29.setClassLoader(classLoader32);
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = null;
        enhancer34.setNamingPolicy(namingPolicy35);
        java.lang.ClassLoader classLoader37 = null;
        enhancer34.setClassLoader(classLoader37);
        java.lang.Class<?> wildcardClass39 = enhancer34.getClass();
        java.lang.String str40 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass39);
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy42 = null;
        enhancer41.setNamingPolicy(namingPolicy42);
        java.lang.ClassLoader classLoader44 = null;
        enhancer41.setClassLoader(classLoader44);
        java.lang.Class<?> wildcardClass46 = enhancer41.getClass();
        java.lang.Class[] classArray47 = new java.lang.Class[] { wildcardClass39, wildcardClass46 };
        enhancer29.setInterfaces(classArray47);
        boolean boolean49 = enhancer29.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy51 = null;
        enhancer50.setNamingPolicy(namingPolicy51);
        java.lang.ClassLoader classLoader53 = null;
        enhancer50.setClassLoader(classLoader53);
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy56 = null;
        enhancer55.setNamingPolicy(namingPolicy56);
        java.lang.ClassLoader classLoader58 = null;
        enhancer55.setClassLoader(classLoader58);
        java.lang.Class<?> wildcardClass60 = enhancer55.getClass();
        java.lang.String str61 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass60);
        org.mockito.cglib.proxy.Enhancer enhancer62 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy63 = null;
        enhancer62.setNamingPolicy(namingPolicy63);
        java.lang.ClassLoader classLoader65 = null;
        enhancer62.setClassLoader(classLoader65);
        java.lang.Class<?> wildcardClass67 = enhancer62.getClass();
        java.lang.Class[] classArray68 = new java.lang.Class[] { wildcardClass60, wildcardClass67 };
        enhancer50.setInterfaces(classArray68);
        enhancer29.setInterfaces(classArray68);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter71 = null;
        org.mockito.cglib.proxy.Callback callback72 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray73 = new org.mockito.cglib.proxy.Callback[] { callback72 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj74 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass26, classArray68, callbackFilter71, callbackArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str40, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str61, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(classArray68);
        org.junit.Assert.assertNotNull(callbackArray73);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(104, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setUseCache(true);
        java.lang.ClassLoader classLoader8 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer9.setNamingPolicy(namingPolicy10);
        java.lang.ClassLoader classLoader12 = null;
        enhancer9.setClassLoader(classLoader12);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = null;
        enhancer14.setNamingPolicy(namingPolicy15);
        java.lang.ClassLoader classLoader17 = null;
        enhancer14.setClassLoader(classLoader17);
        java.lang.Class<?> wildcardClass19 = enhancer14.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass19);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = enhancer21.getClass();
        java.lang.Class[] classArray27 = new java.lang.Class[] { wildcardClass19, wildcardClass26 };
        enhancer9.setInterfaces(classArray27);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str20, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(classArray27);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        enhancer0.setUseFactory(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = null;
        enhancer8.setNamingPolicy(namingPolicy9);
        java.lang.ClassLoader classLoader11 = null;
        enhancer8.setClassLoader(classLoader11);
        java.lang.Class<?> wildcardClass13 = enhancer8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn(112, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = null;
        enhancer10.setNamingPolicy(namingPolicy11);
        java.lang.ClassLoader classLoader13 = null;
        enhancer10.setClassLoader(classLoader13);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = null;
        enhancer15.setNamingPolicy(namingPolicy16);
        java.lang.ClassLoader classLoader18 = null;
        enhancer15.setClassLoader(classLoader18);
        java.lang.Class<?> wildcardClass20 = enhancer15.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = null;
        enhancer22.setNamingPolicy(namingPolicy23);
        java.lang.ClassLoader classLoader25 = null;
        enhancer22.setClassLoader(classLoader25);
        java.lang.Class<?> wildcardClass27 = enhancer22.getClass();
        java.lang.Class[] classArray28 = new java.lang.Class[] { wildcardClass20, wildcardClass27 };
        enhancer10.setInterfaces(classArray28);
        boolean boolean30 = enhancer10.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = null;
        enhancer31.setNamingPolicy(namingPolicy32);
        java.lang.ClassLoader classLoader34 = null;
        enhancer31.setClassLoader(classLoader34);
        java.lang.Class<?> wildcardClass36 = enhancer31.getClass();
        enhancer10.setSuperclass((java.lang.Class) wildcardClass36);
        boolean boolean38 = enhancer10.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = null;
        enhancer39.setNamingPolicy(namingPolicy40);
        java.lang.ClassLoader classLoader42 = null;
        enhancer39.setClassLoader(classLoader42);
        boolean boolean44 = enhancer39.getAttemptLoad();
        enhancer39.setUseCache(true);
        java.lang.ClassLoader classLoader47 = enhancer39.getClassLoader();
        org.mockito.cglib.proxy.Callback callback48 = null;
        enhancer39.setCallback(callback48);
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy51 = null;
        enhancer50.setNamingPolicy(namingPolicy51);
        java.lang.ClassLoader classLoader53 = null;
        enhancer50.setClassLoader(classLoader53);
        boolean boolean55 = enhancer50.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = enhancer50.getStrategy();
        enhancer39.setStrategy(generatorStrategy56);
        enhancer10.setStrategy(generatorStrategy56);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor59 = classEmitter5.visitField((int) ' ', "Lorg/mockito/cglib/proxy/Enhancer;", "J", "L1674961359", (java.lang.Object) generatorStrategy56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str21, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(classLoader47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(generatorStrategy56);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter2.visitAnnotation("L1750185763", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = null;
        enhancer8.setNamingPolicy(namingPolicy9);
        java.lang.ClassLoader classLoader11 = null;
        enhancer8.setClassLoader(classLoader11);
        java.lang.Class<?> wildcardClass13 = enhancer8.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass13);
        boolean boolean15 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        boolean boolean17 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        boolean boolean19 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor21 = classEmitter2.visitField(6, "L1674961359", "L1183194368", "", (java.lang.Object) type20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str14, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(type20);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("org.mockito.cglib.proxy.Enhancer", "byte", "L1750185763", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray12 = new java.lang.String[] { "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", "Lbyte;", "B", "long" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(116, (int) '#', "", "L1622326596", "L1674961359", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("double", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        boolean boolean20 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = enhancer21.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        org.mockito.cglib.proxy.Callback callback29 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray30 = new org.mockito.cglib.proxy.Callback[] { callback29 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass26, callbackArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(callbackArray30);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(0, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = null;
        enhancer8.setNamingPolicy(namingPolicy9);
        java.lang.ClassLoader classLoader11 = null;
        enhancer8.setClassLoader(classLoader11);
        java.lang.Class<?> wildcardClass13 = enhancer8.getClass();
        java.lang.Class[] classArray14 = new java.lang.Class[] { wildcardClass13 };
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        int int17 = type16.getSize();
        java.lang.String str18 = type16.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BYTE_TYPE;
        int int23 = type22.getSize();
        java.lang.String str24 = type22.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type19, type20, type21, type22, type25 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type16, typeArray27);
        org.mockito.asm.Type[] typeArray29 = signature28.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = enhancer0.create(classArray14, (java.lang.Object[]) typeArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "byte" + "'", str18, "byte");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "byte" + "'", str24, "byte");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "double" + "'", str26, "double");
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "L1622326596", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray16 = new java.lang.String[] { "L609610250", "L1183194368", "L1674961359", "B", "org.mockito.cglib.proxy.Enhancer", "L1622326596" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(96, 7, "byte", "org/mockito/cglib/proxy/Enhancer", "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L1219436756");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitParameterAnnotation(7, "V", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.Object obj5 = label4.info;
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        label4.info = classInfo12;
        int[] intArray16 = new int[] { 104, 158 };
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.Object obj18 = label17.info;
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter(classVisitor21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter(classVisitor21);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        label19.info = classInfo27;
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        java.lang.Object obj30 = label29.info;
        java.lang.String str31 = label29.toString();
        java.lang.String str32 = label29.toString();
        java.lang.String str33 = label29.toString();
        org.mockito.asm.Label label34 = new org.mockito.asm.Label();
        java.lang.Object obj35 = label34.info;
        org.mockito.asm.ClassVisitor classVisitor36 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter(classVisitor36);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter(classVisitor36);
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter38.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter41.getClassInfo();
        label34.info = classInfo42;
        org.mockito.asm.Label label44 = new org.mockito.asm.Label();
        org.mockito.asm.Label[] labelArray45 = new org.mockito.asm.Label[] { label17, label19, label29, label34, label44 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray16, labelArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[104, 158]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNull(obj30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L1042389902" + "'", str31, "L1042389902");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L1042389902" + "'", str32, "L1042389902");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L1042389902" + "'", str33, "L1042389902");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo42);
        org.junit.Assert.assertNotNull(labelArray45);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        label7.info = classInfo15;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", "long", "org/mockito/cglib/proxy/Enhancer", label7, label17, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo15);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("double", type8, typeArray10);
        label6.info = typeArray10;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.Object obj18 = label17.info;
        java.lang.String str19 = label17.toString();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        java.lang.String str22 = label20.toString();
        java.lang.Object obj23 = label20.info;
        org.mockito.asm.Label label24 = new org.mockito.asm.Label();
        java.lang.Object obj25 = label24.info;
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        java.lang.Object obj27 = label26.info;
        java.lang.String str28 = label26.toString();
        java.lang.Object obj29 = label26.info;
        org.mockito.asm.Label[] labelArray30 = new org.mockito.asm.Label[] { label14, label15, label17, label20, label24, label26 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(6, (int) '#', label6, labelArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "()D" + "'", str11, "()D");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1028808530" + "'", str19, "L1028808530");
        org.junit.Assert.assertNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L100203424" + "'", str22, "L100203424");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L681076711" + "'", str28, "L681076711");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(labelArray30);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray11 = new java.lang.String[] { "double", "V", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter3.visitMethod((-1), "L1674961359", "(CBBBD)I", "", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7e8d2bf8");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("byte");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("V", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.String str10 = label8.toString();
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.String str13 = label11.toString();
        org.mockito.asm.Label[] labelArray14 = new org.mockito.asm.Label[] { label8, label11 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn((int) (byte) 0, (int) (byte) -1, label6, labelArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1943014949" + "'", str10, "L1943014949");
        org.junit.Assert.assertNull(obj12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1462395709" + "'", str13, "L1462395709");
        org.junit.Assert.assertNotNull(labelArray14);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(0, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", "double()B" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visit((int) (short) -1, 153, "L1219436756", "double()B", "L609610250", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        boolean boolean6 = enhancer0.getUseCache();
        enhancer0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer9.setNamingPolicy(namingPolicy10);
        java.lang.ClassLoader classLoader12 = null;
        enhancer9.setClassLoader(classLoader12);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = null;
        enhancer14.setNamingPolicy(namingPolicy15);
        java.lang.ClassLoader classLoader17 = null;
        enhancer14.setClassLoader(classLoader17);
        java.lang.Class<?> wildcardClass19 = enhancer14.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass19);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = enhancer21.getClass();
        java.lang.Class[] classArray27 = new java.lang.Class[] { wildcardClass19, wildcardClass26 };
        enhancer9.setInterfaces(classArray27);
        boolean boolean29 = enhancer9.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = null;
        enhancer30.setNamingPolicy(namingPolicy31);
        java.lang.ClassLoader classLoader33 = null;
        enhancer30.setClassLoader(classLoader33);
        java.lang.Class<?> wildcardClass35 = enhancer30.getClass();
        enhancer9.setSuperclass((java.lang.Class) wildcardClass35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass35);
        java.lang.String str38 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass35);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass35);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str20, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str38, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertNotNull(type39);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.String str7 = label5.toString();
        java.lang.String str8 = label5.toString();
        java.lang.String str9 = label5.toString();
        java.lang.Object obj10 = label5.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber(132, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L456781664" + "'", str7, "L456781664");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L456781664" + "'", str8, "L456781664");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L456781664" + "'", str9, "L456781664");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray11 = new java.lang.String[] { "J", "(CBBBD)B" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter4.visitMethod((int) 'a', "double()B", "L1183194368", "org/mockito/cglib/proxy/Enhancer", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'double()B' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("double", type6, typeArray8);
        label4.info = typeArray8;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] {};
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("double", type14, typeArray16);
        label12.info = typeArray16;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        java.lang.String str22 = label20.toString();
        java.lang.String str23 = label20.toString();
        java.lang.String str24 = label20.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label4, label12, label20, "Lbyte;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "()D" + "'", str9, "()D");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "()D" + "'", str17, "()D");
        org.junit.Assert.assertNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L660449797" + "'", str22, "L660449797");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L660449797" + "'", str23, "L660449797");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L660449797" + "'", str24, "L660449797");
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitOuterClass("", "L1750185763", "L1622326596");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        label7.info = classInfo15;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.Object obj18 = label17.info;
        org.mockito.asm.ClassVisitor classVisitor19 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter(classVisitor19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter(classVisitor19);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter24.getClassInfo();
        label17.info = classInfo25;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("(CBBBD)I", "L1750185763", "hi!", label7, label17, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo25);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitParameterAnnotation(96, "byte", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray14 = new java.lang.String[] { "L609610250", "L1750185763", "L1750185763", "double", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classEmitter4.visitMethod((int) (byte) 1, "()Lorg/mockito/cglib/proxy/Enhancer;", "L609610250", "L1183194368", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()Lorg/mockito/cglib/proxy/Enhancer;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitParameterAnnotation((-1), "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter(classVisitor16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter(classVisitor16);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        java.lang.Class<?> wildcardClass21 = classEmitter20.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.declare_field(154, "org/mockito/cglib/proxy/Enhancer", type22, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(type22);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.String str7 = label5.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn((int) ' ', label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L99980388" + "'", str7, "L99980388");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTypeInsn(1, "org.mockito.cglib.proxy.Enhancer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        java.lang.String[] strArray24 = new java.lang.String[] { "double()B", "L1183194368", "byte", "()Lorg/mockito/cglib/proxy/Enhancer;", "L1674961359", "B" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor25 = classEmitter5.visitMethod((int) (short) 10, "L1219436756", "double()B", "B", strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@97e019c");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        java.lang.Class class6 = null;
        enhancer0.setSuperclass(class6);
        java.lang.ClassLoader classLoader8 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer9.setNamingPolicy(namingPolicy10);
        java.lang.ClassLoader classLoader12 = null;
        enhancer9.setClassLoader(classLoader12);
        boolean boolean14 = enhancer9.getAttemptLoad();
        java.lang.ClassLoader classLoader15 = enhancer9.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter16 = null;
        enhancer9.setCallbackFilter(callbackFilter16);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = null;
        enhancer18.setNamingPolicy(namingPolicy19);
        boolean boolean21 = enhancer18.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = null;
        enhancer22.setNamingPolicy(namingPolicy23);
        java.lang.ClassLoader classLoader25 = null;
        enhancer22.setClassLoader(classLoader25);
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = null;
        enhancer27.setNamingPolicy(namingPolicy28);
        java.lang.ClassLoader classLoader30 = null;
        enhancer27.setClassLoader(classLoader30);
        java.lang.Class<?> wildcardClass32 = enhancer27.getClass();
        java.lang.String str33 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass32);
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = null;
        enhancer34.setNamingPolicy(namingPolicy35);
        java.lang.ClassLoader classLoader37 = null;
        enhancer34.setClassLoader(classLoader37);
        java.lang.Class<?> wildcardClass39 = enhancer34.getClass();
        java.lang.Class[] classArray40 = new java.lang.Class[] { wildcardClass32, wildcardClass39 };
        enhancer22.setInterfaces(classArray40);
        enhancer18.setInterfaces(classArray40);
        enhancer9.setInterfaces(classArray40);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str33, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(classArray40);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        boolean boolean20 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = enhancer21.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass26);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = null;
        enhancer28.setNamingPolicy(namingPolicy29);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = null;
        enhancer31.setNamingPolicy(namingPolicy32);
        java.lang.ClassLoader classLoader34 = null;
        enhancer31.setClassLoader(classLoader34);
        java.lang.Class<?> wildcardClass36 = enhancer31.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy38 = null;
        enhancer37.setNamingPolicy(namingPolicy38);
        java.lang.ClassLoader classLoader40 = null;
        enhancer37.setClassLoader(classLoader40);
        java.lang.Class<?> wildcardClass42 = enhancer37.getClass();
        java.lang.String str43 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        org.mockito.cglib.proxy.Enhancer enhancer45 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy46 = null;
        enhancer45.setNamingPolicy(namingPolicy46);
        java.lang.ClassLoader classLoader48 = null;
        enhancer45.setClassLoader(classLoader48);
        java.lang.Class<?> wildcardClass50 = enhancer45.getClass();
        java.lang.String str51 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass50);
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy53 = null;
        enhancer52.setNamingPolicy(namingPolicy53);
        java.lang.ClassLoader classLoader55 = null;
        enhancer52.setClassLoader(classLoader55);
        java.lang.Class<?> wildcardClass57 = enhancer52.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer58 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy59 = null;
        enhancer58.setNamingPolicy(namingPolicy59);
        java.lang.ClassLoader classLoader61 = null;
        enhancer58.setClassLoader(classLoader61);
        java.lang.Class<?> wildcardClass63 = enhancer58.getClass();
        java.lang.String str64 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass63);
        org.mockito.asm.Type type65 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass63);
        java.lang.Class[] classArray66 = new java.lang.Class[] { wildcardClass36, wildcardClass42, wildcardClass50, wildcardClass57, wildcardClass63 };
        enhancer28.setInterfaces(classArray66);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str43, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str51, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str64, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(classArray66);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        boolean boolean6 = enhancer0.getUseCache();
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        java.lang.String str12 = label9.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", "()D", "L1622326596", label7, label9, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 108");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1368460210" + "'", str11, "L1368460210");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1368460210" + "'", str12, "L1368460210");
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(96, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label4 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter14 = classEmitter12.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1ceb9d02");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer0.setClassLoader(classLoader9);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = null;
        enhancer0.setStrategy(generatorStrategy11);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = null;
        enhancer14.setNamingPolicy(namingPolicy15);
        java.lang.ClassLoader classLoader17 = null;
        enhancer14.setClassLoader(classLoader17);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = null;
        enhancer19.setNamingPolicy(namingPolicy20);
        java.lang.ClassLoader classLoader22 = null;
        enhancer19.setClassLoader(classLoader22);
        java.lang.Class<?> wildcardClass24 = enhancer19.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = null;
        enhancer26.setNamingPolicy(namingPolicy27);
        java.lang.ClassLoader classLoader29 = null;
        enhancer26.setClassLoader(classLoader29);
        java.lang.Class<?> wildcardClass31 = enhancer26.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[] { wildcardClass24, wildcardClass31 };
        enhancer14.setInterfaces(classArray32);
        boolean boolean34 = enhancer14.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = null;
        enhancer35.setNamingPolicy(namingPolicy36);
        java.lang.ClassLoader classLoader38 = null;
        enhancer35.setClassLoader(classLoader38);
        java.lang.Class<?> wildcardClass40 = enhancer35.getClass();
        enhancer14.setSuperclass((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.String str43 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass40);
        java.lang.String str45 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        java.lang.String str46 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        boolean boolean47 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass40);
        org.mockito.cglib.proxy.Callback[] callbackArray48 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerStaticCallbacks((java.lang.Class) wildcardClass40, callbackArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy13);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str25, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str43, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str45, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str46, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(callbackArray48);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("(CBBBD)I", "L1750185763");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer0.setClassLoader(classLoader9);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = null;
        enhancer0.setStrategy(generatorStrategy11);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = null;
        enhancer14.setNamingPolicy(namingPolicy15);
        java.lang.ClassLoader classLoader17 = null;
        enhancer14.setClassLoader(classLoader17);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = null;
        enhancer19.setNamingPolicy(namingPolicy20);
        java.lang.ClassLoader classLoader22 = null;
        enhancer19.setClassLoader(classLoader22);
        java.lang.Class<?> wildcardClass24 = enhancer19.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = null;
        enhancer26.setNamingPolicy(namingPolicy27);
        java.lang.ClassLoader classLoader29 = null;
        enhancer26.setClassLoader(classLoader29);
        java.lang.Class<?> wildcardClass31 = enhancer26.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[] { wildcardClass24, wildcardClass31 };
        enhancer14.setInterfaces(classArray32);
        boolean boolean34 = enhancer14.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = null;
        enhancer35.setNamingPolicy(namingPolicy36);
        java.lang.ClassLoader classLoader38 = null;
        enhancer35.setClassLoader(classLoader38);
        java.lang.Class<?> wildcardClass40 = enhancer35.getClass();
        enhancer14.setSuperclass((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.String str43 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass40);
        org.mockito.cglib.proxy.Callback[] callbackArray45 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass40, callbackArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy13);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str25, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str43, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertNotNull(callbackArray45);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor7 = classEmitter0.visitMethod(156, "org.mockito.cglib.proxy.Enhancer", "org.mockito.cglib.proxy.Enhancer", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4f25f7a5");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn((int) '4', "(CBBBD)B", "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", "Lorg/mockito/cglib/proxy/Enhancer;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer0.setClassLoader(classLoader9);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = null;
        enhancer0.setStrategy(generatorStrategy11);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = null;
        enhancer13.setNamingPolicy(namingPolicy14);
        java.lang.ClassLoader classLoader16 = null;
        enhancer13.setClassLoader(classLoader16);
        boolean boolean18 = enhancer13.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer13.getStrategy();
        enhancer0.setStrategy(generatorStrategy19);
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter(classVisitor21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter(classVisitor21);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertNull(classInfo24);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = enhancer0.getNamingPolicy();
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namingPolicy6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = classEmitter4.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter1.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7a4f4188");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(128, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn((int) ' ', 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str3 = signature2.getDescriptor();
        boolean boolean5 = signature2.equals((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray6 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean11 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = null;
        enhancer13.setNamingPolicy(namingPolicy14);
        java.lang.ClassLoader classLoader16 = null;
        enhancer13.setClassLoader(classLoader16);
        boolean boolean18 = enhancer13.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = enhancer13.getNamingPolicy();
        org.mockito.cglib.proxy.Callback callback20 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray21 = new org.mockito.cglib.proxy.Callback[] { callback20 };
        enhancer13.setCallbacks(callbackArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass5, callbackArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(namingPolicy19);
        org.junit.Assert.assertNotNull(callbackArray21);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter5.getClassInfo();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("double", type17, typeArray19);
        java.lang.String str22 = signature21.getDescriptor();
        java.lang.String str23 = signature21.toString();
        java.lang.String str24 = signature21.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(124, type27);
        boolean boolean30 = type27.equals((java.lang.Object) 0);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        int int33 = type32.getSize();
        java.lang.String str34 = type32.getClassName();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        int int39 = type38.getSize();
        java.lang.String str40 = type38.getClassName();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str42 = type41.getClassName();
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type35, type36, type37, type38, type41 };
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type32, typeArray43);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray43);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray43);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter47 = classEmitter5.begin_method((int) (byte) -1, signature21, typeArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7d94de22");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "()D" + "'", str20, "()D");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "()B" + "'", str22, "()B");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "double()B" + "'", str23, "double()B");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "double()B" + "'", str24, "double()B");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "byte" + "'", str34, "byte");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "byte" + "'", str40, "byte");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "double" + "'", str42, "double");
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(CBBBD)B" + "'", str45, "(CBBBD)B");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(CBBBD)I" + "'", str46, "(CBBBD)I");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.Object obj5 = label4.info;
        java.lang.String str6 = label4.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label4, label7, label10, "B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L26243339" + "'", str6, "L26243339");
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1609048403" + "'", str9, "L1609048403");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        java.lang.Object obj10 = label7.info;
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = null;
        enhancer11.setNamingPolicy(namingPolicy12);
        java.lang.ClassLoader classLoader14 = null;
        enhancer11.setClassLoader(classLoader14);
        enhancer11.setUseFactory(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = enhancer11.getNamingPolicy();
        label7.info = enhancer11;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        java.lang.String str22 = label20.toString();
        java.lang.String str23 = label20.toString();
        java.lang.String str24 = label20.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("J", "org/mockito/cglib/core/ClassEmitter", "J", label7, label20, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 157");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L245953686" + "'", str9, "L245953686");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(namingPolicy18);
        org.junit.Assert.assertNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L565779207" + "'", str22, "L565779207");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L565779207" + "'", str23, "L565779207");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L565779207" + "'", str24, "L565779207");
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        java.lang.Class class6 = null;
        enhancer0.setSuperclass(class6);
        java.lang.ClassLoader classLoader8 = enhancer0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer0.getNamingPolicy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class10 = enhancer0.createClass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback types are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(namingPolicy9);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        java.lang.String str10 = label7.toString();
        java.lang.String str11 = label7.toString();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter(classVisitor14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter(classVisitor14);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        label12.info = classInfo20;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label5, label7, label12, "L1887820774");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L103474221" + "'", str9, "L103474221");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L103474221" + "'", str10, "L103474221");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L103474221" + "'", str11, "L103474221");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo20);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean11 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        java.lang.Class[] classArray12 = null;
        org.mockito.cglib.proxy.CallbackFilter callbackFilter13 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray14 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass5, classArray12, callbackFilter13, callbackArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(callbackArray14);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("()Lorg/mockito/cglib/proxy/Enhancer;", "L609610250", "org/mockito/cglib/core/ClassEmitter", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer6.setNamingPolicy(namingPolicy7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer6.setClassLoader(classLoader9);
        java.lang.Class<?> wildcardClass11 = enhancer6.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] {};
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("double", type15, typeArray17);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray17);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = null;
        enhancer22.setNamingPolicy(namingPolicy23);
        java.lang.ClassLoader classLoader25 = null;
        enhancer22.setClassLoader(classLoader25);
        boolean boolean27 = enhancer22.getAttemptLoad();
        java.lang.ClassLoader classLoader28 = enhancer22.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter29 = null;
        enhancer22.setCallbackFilter(callbackFilter29);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = null;
        enhancer31.setNamingPolicy(namingPolicy32);
        boolean boolean34 = enhancer31.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = null;
        enhancer35.setNamingPolicy(namingPolicy36);
        java.lang.ClassLoader classLoader38 = null;
        enhancer35.setClassLoader(classLoader38);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy41 = null;
        enhancer40.setNamingPolicy(namingPolicy41);
        java.lang.ClassLoader classLoader43 = null;
        enhancer40.setClassLoader(classLoader43);
        java.lang.Class<?> wildcardClass45 = enhancer40.getClass();
        java.lang.String str46 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass45);
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy48 = null;
        enhancer47.setNamingPolicy(namingPolicy48);
        java.lang.ClassLoader classLoader50 = null;
        enhancer47.setClassLoader(classLoader50);
        java.lang.Class<?> wildcardClass52 = enhancer47.getClass();
        java.lang.Class[] classArray53 = new java.lang.Class[] { wildcardClass45, wildcardClass52 };
        enhancer35.setInterfaces(classArray53);
        enhancer31.setInterfaces(classArray53);
        enhancer22.setInterfaces(classArray53);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame((int) (byte) 100, 96, (java.lang.Object[]) typeArray17, 0, (java.lang.Object[]) classArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str12, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "()D" + "'", str18, "()D");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "()Lorg/mockito/cglib/proxy/Enhancer;" + "'", str20, "()Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(classLoader28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str46, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(classArray53);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer6.setNamingPolicy(namingPolicy7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer6.setClassLoader(classLoader9);
        java.lang.Class<?> wildcardClass11 = enhancer6.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] {};
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("double", type15, typeArray17);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray17);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        boolean boolean26 = enhancer21.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = enhancer21.getNamingPolicy();
        boolean boolean28 = enhancer21.getAttemptLoad();
        enhancer21.setUseCache(true);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = null;
        enhancer31.setNamingPolicy(namingPolicy32);
        java.lang.ClassLoader classLoader34 = null;
        enhancer31.setClassLoader(classLoader34);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter36 = null;
        enhancer31.setCallbackFilter(callbackFilter36);
        org.mockito.cglib.proxy.Callback callback38 = null;
        enhancer31.setCallback(callback38);
        java.lang.ClassLoader classLoader40 = null;
        enhancer31.setClassLoader(classLoader40);
        enhancer31.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = null;
        enhancer44.setNamingPolicy(namingPolicy45);
        java.lang.ClassLoader classLoader47 = null;
        enhancer44.setClassLoader(classLoader47);
        boolean boolean49 = enhancer44.getAttemptLoad();
        enhancer44.setUseCache(true);
        java.lang.ClassLoader classLoader52 = enhancer44.getClassLoader();
        enhancer31.setClassLoader(classLoader52);
        enhancer21.setClassLoader(classLoader52);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.declare_field(0, "org.mockito.cglib.proxy.Enhancer", type13, (java.lang.Object) enhancer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str12, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "()D" + "'", str18, "()D");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "()Lorg/mockito/cglib/proxy/Enhancer;" + "'", str20, "()Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(namingPolicy27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(classLoader52);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn((int) (byte) 100, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        java.lang.String str10 = label7.toString();
        java.lang.Object obj11 = label7.info;
        java.lang.Object obj12 = label7.info;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter(classVisitor15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter(classVisitor15);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        label13.info = classInfo21;
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        java.lang.Object obj24 = label23.info;
        java.lang.String str25 = label23.toString();
        java.lang.Object obj26 = label23.info;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        java.lang.Object obj28 = label27.info;
        java.lang.String str29 = label27.toString();
        java.lang.Object obj30 = label27.info;
        org.mockito.asm.Label[] labelArray31 = new org.mockito.asm.Label[] { label13, label23, label27 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn((int) (byte) 1, 126, label7, labelArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L499669489" + "'", str9, "L499669489");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L499669489" + "'", str10, "L499669489");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(obj24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L872755300" + "'", str25, "L872755300");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L1507582241" + "'", str29, "L1507582241");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(labelArray31);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "org/mockito/cglib/proxy/Enhancer" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(132, 155, "J", "()Lorg/mockito/cglib/proxy/Enhancer;", "()Lorg/mockito/cglib/proxy/Enhancer;", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] { "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", "org.mockito.cglib.proxy.Enhancer", "double()B", "(CBBBD)I", "V", "L1622326596" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = classEmitter1.visitMethod(158, "L1183194368", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", "L1674961359", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@747f4cd1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray9);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("double", type7, typeArray9);
        label5.info = typeArray9;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "()D" + "'", str10, "()D");
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.String str10 = signature9.getName();
        java.lang.String str11 = signature9.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) 9);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] {};
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("double", type16, typeArray18);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter22 = classEmitter2.begin_method(156, signature9, typeArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2f879f7c");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "()D" + "'", str19, "()D");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "()B" + "'", str21, "()B");
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        java.lang.String str10 = label7.toString();
        java.lang.Object obj11 = label7.info;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        java.lang.String str15 = label13.toString();
        java.lang.Object obj16 = label13.info;
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] { label12, label13 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(112, 5, label7, labelArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L166467706" + "'", str9, "L166467706");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L166467706" + "'", str10, "L166467706");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L559796265" + "'", str15, "L559796265");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(labelArray17);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer0.setClassLoader(classLoader9);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = null;
        enhancer0.setStrategy(generatorStrategy11);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = null;
        enhancer14.setNamingPolicy(namingPolicy15);
        java.lang.ClassLoader classLoader17 = null;
        enhancer14.setClassLoader(classLoader17);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = null;
        enhancer19.setNamingPolicy(namingPolicy20);
        java.lang.ClassLoader classLoader22 = null;
        enhancer19.setClassLoader(classLoader22);
        java.lang.Class<?> wildcardClass24 = enhancer19.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = null;
        enhancer26.setNamingPolicy(namingPolicy27);
        java.lang.ClassLoader classLoader29 = null;
        enhancer26.setClassLoader(classLoader29);
        java.lang.Class<?> wildcardClass31 = enhancer26.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[] { wildcardClass24, wildcardClass31 };
        enhancer14.setInterfaces(classArray32);
        boolean boolean34 = enhancer14.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = null;
        enhancer35.setNamingPolicy(namingPolicy36);
        java.lang.ClassLoader classLoader38 = null;
        enhancer35.setClassLoader(classLoader38);
        java.lang.Class<?> wildcardClass40 = enhancer35.getClass();
        enhancer14.setSuperclass((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.String str43 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass40);
        java.lang.String str45 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        java.lang.String str46 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy48 = null;
        enhancer47.setNamingPolicy(namingPolicy48);
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy51 = null;
        enhancer50.setNamingPolicy(namingPolicy51);
        java.lang.ClassLoader classLoader53 = null;
        enhancer50.setClassLoader(classLoader53);
        java.lang.Class<?> wildcardClass55 = enhancer50.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy57 = null;
        enhancer56.setNamingPolicy(namingPolicy57);
        java.lang.ClassLoader classLoader59 = null;
        enhancer56.setClassLoader(classLoader59);
        java.lang.Class<?> wildcardClass61 = enhancer56.getClass();
        java.lang.String str62 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass61);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass61);
        org.mockito.cglib.proxy.Enhancer enhancer64 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy65 = null;
        enhancer64.setNamingPolicy(namingPolicy65);
        java.lang.ClassLoader classLoader67 = null;
        enhancer64.setClassLoader(classLoader67);
        java.lang.Class<?> wildcardClass69 = enhancer64.getClass();
        java.lang.String str70 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass69);
        org.mockito.cglib.proxy.Enhancer enhancer71 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy72 = null;
        enhancer71.setNamingPolicy(namingPolicy72);
        java.lang.ClassLoader classLoader74 = null;
        enhancer71.setClassLoader(classLoader74);
        java.lang.Class<?> wildcardClass76 = enhancer71.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer77 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy78 = null;
        enhancer77.setNamingPolicy(namingPolicy78);
        java.lang.ClassLoader classLoader80 = null;
        enhancer77.setClassLoader(classLoader80);
        java.lang.Class<?> wildcardClass82 = enhancer77.getClass();
        java.lang.String str83 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass82);
        org.mockito.asm.Type type84 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass82);
        java.lang.Class[] classArray85 = new java.lang.Class[] { wildcardClass55, wildcardClass61, wildcardClass69, wildcardClass76, wildcardClass82 };
        enhancer47.setInterfaces(classArray85);
        org.mockito.cglib.proxy.Callback callback87 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj88 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass40, classArray85, callback87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy13);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str25, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str43, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str45, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str46, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str62, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str70, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str83, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertNotNull(classArray85);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer6.setNamingPolicy(namingPolicy7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer6.setClassLoader(classLoader9);
        boolean boolean11 = enhancer6.getAttemptLoad();
        java.lang.Class class12 = null;
        enhancer6.setSuperclass(class12);
        java.lang.ClassLoader classLoader14 = enhancer6.getClassLoader();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor15 = classEmitter1.visitField((int) (byte) 0, "double", "B", "org/mockito/cglib/core/ClassEmitter", (java.lang.Object) classLoader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(classLoader14);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(104, "org/mockito/cglib/core/ClassEmitter", "hi!", "org.mockito.cglib.proxy.Enhancer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn((int) (byte) 100, 124);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.String str7 = label5.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn((int) (short) -1, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L222637174" + "'", str7, "L222637174");
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter14 = classEmitter5.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("L609610250", "org.mockito.cglib.proxy.Enhancer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        java.lang.Object[] objArray6 = null;
        java.lang.Object[] objArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame((int) (byte) 10, 155, objArray6, (-1), objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        java.lang.ClassLoader classLoader4 = null;
        enhancer1.setClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass6 = enhancer1.getClass();
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        boolean boolean8 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        boolean boolean10 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        java.lang.ClassLoader classLoader20 = null;
        enhancer17.setClassLoader(classLoader20);
        java.lang.Class<?> wildcardClass22 = enhancer17.getClass();
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass22);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy25 = null;
        enhancer24.setNamingPolicy(namingPolicy25);
        java.lang.ClassLoader classLoader27 = null;
        enhancer24.setClassLoader(classLoader27);
        java.lang.Class<?> wildcardClass29 = enhancer24.getClass();
        java.lang.Class[] classArray30 = new java.lang.Class[] { wildcardClass22, wildcardClass29 };
        enhancer12.setInterfaces(classArray30);
        boolean boolean32 = enhancer12.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = null;
        enhancer33.setNamingPolicy(namingPolicy34);
        java.lang.ClassLoader classLoader36 = null;
        enhancer33.setClassLoader(classLoader36);
        java.lang.Class<?> wildcardClass38 = enhancer33.getClass();
        enhancer12.setSuperclass((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        java.lang.String str41 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BYTE_TYPE;
        int int45 = type44.getSize();
        java.lang.String str46 = type44.getClassName();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BYTE_TYPE;
        int int51 = type50.getSize();
        java.lang.String str52 = type50.getClassName();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str54 = type53.getClassName();
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type47, type48, type49, type50, type53 };
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type44, typeArray55);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray55);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("double()B", type11, typeArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'double()B' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str7, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str23, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str41, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "byte" + "'", str46, "byte");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "byte" + "'", str52, "byte");
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "double" + "'", str54, "double");
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;" + "'", str57, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;");
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        boolean boolean20 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = enhancer21.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        java.lang.String str29 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        org.mockito.cglib.proxy.Callback callback32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass26, callback32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str29, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = null;
        enhancer7.setNamingPolicy(namingPolicy8);
        java.lang.ClassLoader classLoader10 = null;
        enhancer7.setClassLoader(classLoader10);
        boolean boolean12 = enhancer7.getAttemptLoad();
        java.lang.ClassLoader classLoader13 = enhancer7.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter14 = null;
        enhancer7.setCallbackFilter(callbackFilter14);
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = null;
        enhancer16.setNamingPolicy(namingPolicy17);
        boolean boolean19 = enhancer16.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = null;
        enhancer20.setNamingPolicy(namingPolicy21);
        java.lang.ClassLoader classLoader23 = null;
        enhancer20.setClassLoader(classLoader23);
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = null;
        enhancer25.setNamingPolicy(namingPolicy26);
        java.lang.ClassLoader classLoader28 = null;
        enhancer25.setClassLoader(classLoader28);
        java.lang.Class<?> wildcardClass30 = enhancer25.getClass();
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass30);
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = null;
        enhancer32.setNamingPolicy(namingPolicy33);
        java.lang.ClassLoader classLoader35 = null;
        enhancer32.setClassLoader(classLoader35);
        java.lang.Class<?> wildcardClass37 = enhancer32.getClass();
        java.lang.Class[] classArray38 = new java.lang.Class[] { wildcardClass30, wildcardClass37 };
        enhancer20.setInterfaces(classArray38);
        enhancer16.setInterfaces(classArray38);
        enhancer7.setInterfaces(classArray38);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] {};
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray46);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("double", type44, typeArray46);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(4, 157, (java.lang.Object[]) classArray38, 158, (java.lang.Object[]) typeArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str31, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "()D" + "'", str47, "()D");
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("(CBBBD)B", "org/mockito/cglib/core/ClassEmitter", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFieldInsn((int) ' ', "L609610250", "B", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter3.visitParameterAnnotation(0, "V", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) "(CBBBD)I");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer9.setNamingPolicy(namingPolicy10);
        java.lang.ClassLoader classLoader12 = null;
        enhancer9.setClassLoader(classLoader12);
        java.lang.Class<?> wildcardClass14 = enhancer9.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass14);
        boolean boolean16 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        int int19 = type17.getOpcode(128);
        int int21 = type17.getOpcode(0);
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = null;
        enhancer22.setNamingPolicy(namingPolicy23);
        java.lang.ClassLoader classLoader25 = null;
        enhancer22.setClassLoader(classLoader25);
        java.lang.Class<?> wildcardClass27 = enhancer22.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        boolean boolean29 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        int int32 = type30.getOpcode(128);
        int int33 = type30.getSize();
        java.lang.String str34 = type30.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.declare_field(100, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", type17, (java.lang.Object) type30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str15, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 132 + "'", int19 == 132);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str28, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 132 + "'", int32 == 132);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str34, "Lorg/mockito/cglib/proxy/Enhancer;");
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor17 = classEmitter14.visitAnnotation("Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.String str8 = label6.toString();
        java.lang.Object obj9 = label6.info;
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = null;
        enhancer10.setNamingPolicy(namingPolicy11);
        java.lang.ClassLoader classLoader13 = null;
        enhancer10.setClassLoader(classLoader13);
        enhancer10.setUseFactory(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = enhancer10.getNamingPolicy();
        label6.info = enhancer10;
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        java.lang.String str21 = label19.toString();
        java.lang.String str22 = label19.toString();
        java.lang.Object obj23 = label19.info;
        org.mockito.asm.Label[] labelArray24 = new org.mockito.asm.Label[] { label19 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn(124, 126, label6, labelArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1282317706" + "'", str8, "L1282317706");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(namingPolicy17);
        org.junit.Assert.assertNull(obj20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1401242362" + "'", str21, "L1401242362");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1401242362" + "'", str22, "L1401242362");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(labelArray24);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray13 = new java.lang.String[] { "(CBBBD)B", "L1750185763", "J", "long" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visit(116, (int) (short) 100, "org/mockito/cglib/core/ClassEmitter", "double", "V", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        java.lang.ClassLoader classLoader6 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter7 = null;
        enhancer0.setCallbackFilter(callbackFilter7);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer9.setNamingPolicy(namingPolicy10);
        boolean boolean12 = enhancer9.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = null;
        enhancer13.setNamingPolicy(namingPolicy14);
        java.lang.ClassLoader classLoader16 = null;
        enhancer13.setClassLoader(classLoader16);
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = null;
        enhancer18.setNamingPolicy(namingPolicy19);
        java.lang.ClassLoader classLoader21 = null;
        enhancer18.setClassLoader(classLoader21);
        java.lang.Class<?> wildcardClass23 = enhancer18.getClass();
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass23);
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = null;
        enhancer25.setNamingPolicy(namingPolicy26);
        java.lang.ClassLoader classLoader28 = null;
        enhancer25.setClassLoader(classLoader28);
        java.lang.Class<?> wildcardClass30 = enhancer25.getClass();
        java.lang.Class[] classArray31 = new java.lang.Class[] { wildcardClass23, wildcardClass30 };
        enhancer13.setInterfaces(classArray31);
        enhancer9.setInterfaces(classArray31);
        enhancer0.setInterfaces(classArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str24, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray31);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor4 = localVariablesSorter3.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter12.visitOuterClass("double()B", "Lbyte;", "V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.String str9 = label7.toString();
        java.lang.String str10 = label7.toString();
        java.lang.Object obj11 = label7.info;
        java.lang.Object obj12 = label7.info;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("L609610250", "", "byte", label7, label13, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 97");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L2033641199" + "'", str9, "L2033641199");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L2033641199" + "'", str10, "L2033641199");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        boolean boolean20 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = enhancer21.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        java.lang.String str29 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        org.mockito.cglib.proxy.Callback callback30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass26, callback30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str29, "org/mockito/cglib/proxy/Enhancer");
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("org/mockito/cglib/proxy/Enhancer");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = enhancer0.getNamingPolicy();
        boolean boolean7 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer9.setNamingPolicy(namingPolicy10);
        java.lang.ClassLoader classLoader12 = null;
        enhancer9.setClassLoader(classLoader12);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = null;
        enhancer14.setNamingPolicy(namingPolicy15);
        java.lang.ClassLoader classLoader17 = null;
        enhancer14.setClassLoader(classLoader17);
        java.lang.Class<?> wildcardClass19 = enhancer14.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass19);
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = enhancer21.getClass();
        java.lang.Class[] classArray27 = new java.lang.Class[] { wildcardClass19, wildcardClass26 };
        enhancer9.setInterfaces(classArray27);
        boolean boolean29 = enhancer9.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = null;
        enhancer30.setNamingPolicy(namingPolicy31);
        java.lang.ClassLoader classLoader33 = null;
        enhancer30.setClassLoader(classLoader33);
        java.lang.Class<?> wildcardClass35 = enhancer30.getClass();
        enhancer9.setSuperclass((java.lang.Class) wildcardClass35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass35);
        java.lang.String str38 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass35);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass35);
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local((int) (byte) 100, type39);
        java.lang.Class<?> wildcardClass41 = type39.getClass();
        java.lang.String str42 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass41);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.asm.Type");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(namingPolicy6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str20, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str38, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str42, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L1183194368");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter4.visitAnnotation("(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean11 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        boolean boolean12 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Callback callback13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass5, callback13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter5.visitAnnotation("double()B", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 9);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("double", type10, typeArray12);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray12);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray12);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(124, type18);
        boolean boolean21 = type18.equals((java.lang.Object) 0);
        int int22 = type18.getSize();
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = null;
        enhancer23.setNamingPolicy(namingPolicy24);
        java.lang.ClassLoader classLoader26 = null;
        enhancer23.setClassLoader(classLoader26);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = null;
        enhancer28.setNamingPolicy(namingPolicy29);
        java.lang.ClassLoader classLoader31 = null;
        enhancer28.setClassLoader(classLoader31);
        java.lang.Class<?> wildcardClass33 = enhancer28.getClass();
        java.lang.String str34 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass33);
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = null;
        enhancer35.setNamingPolicy(namingPolicy36);
        java.lang.ClassLoader classLoader38 = null;
        enhancer35.setClassLoader(classLoader38);
        java.lang.Class<?> wildcardClass40 = enhancer35.getClass();
        java.lang.Class[] classArray41 = new java.lang.Class[] { wildcardClass33, wildcardClass40 };
        enhancer23.setInterfaces(classArray41);
        boolean boolean43 = enhancer23.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = null;
        enhancer44.setNamingPolicy(namingPolicy45);
        java.lang.ClassLoader classLoader47 = null;
        enhancer44.setClassLoader(classLoader47);
        java.lang.Class<?> wildcardClass49 = enhancer44.getClass();
        enhancer23.setSuperclass((java.lang.Class) wildcardClass49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass49);
        java.lang.String str52 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass49);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass49);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BYTE_TYPE;
        int int56 = type55.getSize();
        java.lang.String str57 = type55.getClassName();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BYTE_TYPE;
        int int62 = type61.getSize();
        java.lang.String str63 = type61.getClassName();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str65 = type64.getClassName();
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type58, type59, type60, type61, type64 };
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type55, typeArray66);
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray66);
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray66);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.begin_class(100, 154, "J", type5, typeArray66, "()F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "()D" + "'", str13, "()D");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "()B" + "'", str15, "()B");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "()F" + "'", str16, "()F");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str34, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str52, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "byte" + "'", str57, "byte");
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "byte" + "'", str63, "byte");
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "double" + "'", str65, "double");
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;" + "'", str68, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "(CBBBD)B" + "'", str69, "(CBBBD)B");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray11 = new java.lang.String[] { "L609610250", "double", "org.mockito.cglib.proxy.Enhancer", "B" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter2.visitMethod(126, "()F", "L1750185763", "", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()F' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(124, "B", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        java.lang.String[] strArray13 = new java.lang.String[] { "L1622326596", "Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B", "org.mockito.cglib.proxy.Enhancer", "L415954201" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor14 = classEmitter2.visitMethod(10, "org/mockito/cglib/core/ClassEmitter", "J", "", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@31e96ab4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter5.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type9 = classEmitter5.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        java.lang.ClassLoader classLoader4 = null;
        enhancer1.setClassLoader(classLoader4);
        java.lang.Class<?> wildcardClass6 = enhancer1.getClass();
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        boolean boolean8 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        int int10 = type9.getSize();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(108, type9);
        int int12 = type9.getDimensions();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str7, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitOuterClass("hi!", "org/mockito/cglib/proxy/Enhancer", "Lorg/mockito/cglib/proxy/Enhancer;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter(classVisitor12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter(classVisitor12);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        label10.info = classInfo18;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        java.lang.String str22 = label20.toString();
        java.lang.Object obj23 = label20.info;
        org.mockito.asm.Label label24 = new org.mockito.asm.Label();
        java.lang.Object obj25 = label24.info;
        java.lang.String str26 = label24.toString();
        java.lang.String str27 = label24.toString();
        java.lang.Object obj28 = label24.info;
        java.lang.Object obj29 = label24.info;
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.Object obj31 = label30.info;
        java.lang.String str32 = label30.toString();
        org.mockito.asm.Label[] labelArray33 = new org.mockito.asm.Label[] { label9, label10, label20, label24, label30 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTableSwitchInsn(7, (int) 'a', label7, labelArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L462007886" + "'", str22, "L462007886");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L964121447" + "'", str26, "L964121447");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L964121447" + "'", str27, "L964121447");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L305529255" + "'", str32, "L305529255");
        org.junit.Assert.assertNotNull(labelArray33);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSort();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = localVariablesSorter4.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMethodInsn(6, "Lorg/mockito/cglib/proxy/Enhancer;", "V", "org/mockito/cglib/core/ClassEmitter");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitParameterAnnotation(3, "L609610250", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer0.setClassLoader(classLoader9);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = null;
        enhancer0.setStrategy(generatorStrategy11);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Callback callback15 = null;
        enhancer0.setCallback(callback15);
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter(classVisitor17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter(classVisitor17);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        java.lang.Class<?> wildcardClass22 = classEmitter21.getClass();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy25 = null;
        enhancer24.setNamingPolicy(namingPolicy25);
        java.lang.ClassLoader classLoader27 = null;
        enhancer24.setClassLoader(classLoader27);
        java.lang.Class<?> wildcardClass29 = enhancer24.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        boolean boolean31 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass29);
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = null;
        enhancer32.setNamingPolicy(namingPolicy33);
        java.lang.ClassLoader classLoader35 = null;
        enhancer32.setClassLoader(classLoader35);
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy38 = null;
        enhancer37.setNamingPolicy(namingPolicy38);
        java.lang.ClassLoader classLoader40 = null;
        enhancer37.setClassLoader(classLoader40);
        java.lang.Class<?> wildcardClass42 = enhancer37.getClass();
        java.lang.String str43 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass42);
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = null;
        enhancer44.setNamingPolicy(namingPolicy45);
        java.lang.ClassLoader classLoader47 = null;
        enhancer44.setClassLoader(classLoader47);
        java.lang.Class<?> wildcardClass49 = enhancer44.getClass();
        java.lang.Class[] classArray50 = new java.lang.Class[] { wildcardClass42, wildcardClass49 };
        enhancer32.setInterfaces(classArray50);
        boolean boolean52 = enhancer32.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy54 = null;
        enhancer53.setNamingPolicy(namingPolicy54);
        java.lang.ClassLoader classLoader56 = null;
        enhancer53.setClassLoader(classLoader56);
        java.lang.Class<?> wildcardClass58 = enhancer53.getClass();
        enhancer32.setSuperclass((java.lang.Class) wildcardClass58);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass58);
        java.lang.String str61 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass58);
        java.lang.String str62 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass58);
        java.lang.Class[] classArray63 = new java.lang.Class[] { wildcardClass22, wildcardClass29, wildcardClass58 };
        org.mockito.cglib.proxy.Enhancer enhancer65 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy66 = null;
        enhancer65.setNamingPolicy(namingPolicy66);
        java.lang.ClassLoader classLoader68 = null;
        enhancer65.setClassLoader(classLoader68);
        java.lang.Class<?> wildcardClass70 = enhancer65.getClass();
        java.lang.String str71 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass70);
        boolean boolean72 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass70);
        org.mockito.asm.Type type73 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass70);
        org.mockito.cglib.proxy.Enhancer enhancer74 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy75 = null;
        enhancer74.setNamingPolicy(namingPolicy75);
        java.lang.ClassLoader classLoader77 = null;
        enhancer74.setClassLoader(classLoader77);
        java.lang.Class<?> wildcardClass79 = enhancer74.getClass();
        java.lang.String str80 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass79);
        org.mockito.asm.Type type81 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass79);
        org.mockito.asm.Type type83 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type84 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray85 = new org.mockito.asm.Type[] {};
        java.lang.String str86 = org.mockito.asm.Type.getMethodDescriptor(type84, typeArray85);
        org.mockito.cglib.core.Signature signature87 = new org.mockito.cglib.core.Signature("double", type83, typeArray85);
        java.lang.String str88 = org.mockito.asm.Type.getMethodDescriptor(type81, typeArray85);
        org.mockito.cglib.core.Signature signature89 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type73, typeArray85);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj90 = enhancer0.create(classArray63, (java.lang.Object[]) typeArray85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy13);
        org.junit.Assert.assertNotNull(namingPolicy14);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str30, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str43, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str61, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str62, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertNotNull(classArray63);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str71, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str80, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type81);
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertNotNull(typeArray85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "()D" + "'", str86, "()D");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "()Lorg/mockito/cglib/proxy/Enhancer;" + "'", str88, "()Lorg/mockito/cglib/proxy/Enhancer;");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter10 = null;
        enhancer5.setCallbackFilter(callbackFilter10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        boolean boolean17 = enhancer12.getAttemptLoad();
        java.lang.Class class18 = null;
        enhancer12.setSuperclass(class18);
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = enhancer12.getNamingPolicy();
        enhancer5.setNamingPolicy(namingPolicy20);
        enhancer0.setNamingPolicy(namingPolicy20);
        org.mockito.cglib.proxy.Callback callback23 = null;
        enhancer0.setCallback(callback23);
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter(classVisitor25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter(classVisitor25);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(namingPolicy20);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter15 = classEmitter14.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        java.lang.ClassLoader classLoader4 = null;
        enhancer1.setClassLoader(classLoader4);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = null;
        enhancer6.setNamingPolicy(namingPolicy7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer6.setClassLoader(classLoader9);
        java.lang.Class<?> wildcardClass11 = enhancer6.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass11);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = null;
        enhancer13.setNamingPolicy(namingPolicy14);
        java.lang.ClassLoader classLoader16 = null;
        enhancer13.setClassLoader(classLoader16);
        java.lang.Class<?> wildcardClass18 = enhancer13.getClass();
        java.lang.Class[] classArray19 = new java.lang.Class[] { wildcardClass11, wildcardClass18 };
        enhancer1.setInterfaces(classArray19);
        boolean boolean21 = enhancer1.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = null;
        enhancer22.setNamingPolicy(namingPolicy23);
        java.lang.ClassLoader classLoader25 = null;
        enhancer22.setClassLoader(classLoader25);
        java.lang.Class<?> wildcardClass27 = enhancer22.getClass();
        enhancer1.setSuperclass((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) (byte) 100, type31);
        java.lang.Class<?> wildcardClass33 = type31.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = null;
        enhancer34.setNamingPolicy(namingPolicy35);
        java.lang.ClassLoader classLoader37 = null;
        enhancer34.setClassLoader(classLoader37);
        org.mockito.cglib.proxy.Enhancer enhancer39 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = null;
        enhancer39.setNamingPolicy(namingPolicy40);
        java.lang.ClassLoader classLoader42 = null;
        enhancer39.setClassLoader(classLoader42);
        java.lang.Class<?> wildcardClass44 = enhancer39.getClass();
        java.lang.String str45 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass44);
        org.mockito.cglib.proxy.Enhancer enhancer46 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy47 = null;
        enhancer46.setNamingPolicy(namingPolicy47);
        java.lang.ClassLoader classLoader49 = null;
        enhancer46.setClassLoader(classLoader49);
        java.lang.Class<?> wildcardClass51 = enhancer46.getClass();
        java.lang.Class[] classArray52 = new java.lang.Class[] { wildcardClass44, wildcardClass51 };
        enhancer34.setInterfaces(classArray52);
        boolean boolean54 = enhancer34.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy56 = null;
        enhancer55.setNamingPolicy(namingPolicy56);
        java.lang.ClassLoader classLoader58 = null;
        enhancer55.setClassLoader(classLoader58);
        org.mockito.cglib.proxy.Enhancer enhancer60 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy61 = null;
        enhancer60.setNamingPolicy(namingPolicy61);
        java.lang.ClassLoader classLoader63 = null;
        enhancer60.setClassLoader(classLoader63);
        java.lang.Class<?> wildcardClass65 = enhancer60.getClass();
        java.lang.String str66 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass65);
        org.mockito.cglib.proxy.Enhancer enhancer67 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy68 = null;
        enhancer67.setNamingPolicy(namingPolicy68);
        java.lang.ClassLoader classLoader70 = null;
        enhancer67.setClassLoader(classLoader70);
        java.lang.Class<?> wildcardClass72 = enhancer67.getClass();
        java.lang.Class[] classArray73 = new java.lang.Class[] { wildcardClass65, wildcardClass72 };
        enhancer55.setInterfaces(classArray73);
        enhancer34.setInterfaces(classArray73);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter76 = null;
        org.mockito.cglib.proxy.Enhancer enhancer77 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy78 = null;
        enhancer77.setNamingPolicy(namingPolicy78);
        java.lang.ClassLoader classLoader80 = null;
        enhancer77.setClassLoader(classLoader80);
        boolean boolean82 = enhancer77.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy83 = enhancer77.getNamingPolicy();
        org.mockito.cglib.proxy.Callback callback84 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray85 = new org.mockito.cglib.proxy.Callback[] { callback84 };
        enhancer77.setCallbacks(callbackArray85);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj87 = org.mockito.cglib.proxy.Enhancer.create((java.lang.Class) wildcardClass33, classArray73, callbackFilter76, callbackArray85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str12, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str30, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str45, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str66, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(classArray73);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(namingPolicy83);
        org.junit.Assert.assertNotNull(callbackArray85);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.mockito.asm.Type type1 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(124, type4);
        boolean boolean7 = type4.equals((java.lang.Object) 0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        int int10 = type9.getSize();
        java.lang.String str11 = type9.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        int int16 = type15.getSize();
        java.lang.String str17 = type15.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type13, type14, type15, type18 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type9, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("()F", type1, typeArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "byte" + "'", str11, "byte");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "byte" + "'", str17, "byte");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "double" + "'", str19, "double");
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(CBBBD)B" + "'", str22, "(CBBBD)B");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(CBBBD)I" + "'", str23, "(CBBBD)I");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = classEmitter2.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        boolean boolean6 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = null;
        enhancer7.setNamingPolicy(namingPolicy8);
        java.lang.ClassLoader classLoader10 = null;
        enhancer7.setClassLoader(classLoader10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = null;
        enhancer19.setNamingPolicy(namingPolicy20);
        java.lang.ClassLoader classLoader22 = null;
        enhancer19.setClassLoader(classLoader22);
        java.lang.Class<?> wildcardClass24 = enhancer19.getClass();
        java.lang.Class[] classArray25 = new java.lang.Class[] { wildcardClass17, wildcardClass24 };
        enhancer7.setInterfaces(classArray25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        int int29 = type28.getSize();
        java.lang.String str30 = type28.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        int int35 = type34.getSize();
        java.lang.String str36 = type34.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str38 = type37.getClassName();
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type31, type32, type33, type34, type37 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type28, typeArray39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = enhancer0.create(classArray25, (java.lang.Object[]) typeArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments must be non-null and of equal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str18, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "byte" + "'", str30, "byte");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "byte" + "'", str36, "byte");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "double" + "'", str38, "double");
        org.junit.Assert.assertNotNull(typeArray39);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        java.lang.ClassLoader classLoader20 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        boolean boolean26 = enhancer21.getAttemptLoad();
        enhancer21.setUseCache(true);
        java.lang.ClassLoader classLoader29 = enhancer21.getClassLoader();
        enhancer0.setClassLoader(classLoader29);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = null;
        enhancer31.setNamingPolicy(namingPolicy32);
        java.lang.ClassLoader classLoader34 = null;
        enhancer31.setClassLoader(classLoader34);
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = null;
        enhancer36.setNamingPolicy(namingPolicy37);
        java.lang.ClassLoader classLoader39 = null;
        enhancer36.setClassLoader(classLoader39);
        java.lang.Class<?> wildcardClass41 = enhancer36.getClass();
        java.lang.String str42 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass41);
        org.mockito.cglib.proxy.Enhancer enhancer43 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy44 = null;
        enhancer43.setNamingPolicy(namingPolicy44);
        java.lang.ClassLoader classLoader46 = null;
        enhancer43.setClassLoader(classLoader46);
        java.lang.Class<?> wildcardClass48 = enhancer43.getClass();
        java.lang.Class[] classArray49 = new java.lang.Class[] { wildcardClass41, wildcardClass48 };
        enhancer31.setInterfaces(classArray49);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(classLoader20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(classLoader29);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str42, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(classArray49);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray13 = new java.lang.String[] { "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", "B", "(CBBBD)B" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visit((int) (byte) 1, (-1), "hi!", "Lorg/mockito/asm/Type;", "L1674961359", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int9 = type7.getOpcode(3);
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = null;
        enhancer10.setNamingPolicy(namingPolicy11);
        java.lang.ClassLoader classLoader13 = null;
        enhancer10.setClassLoader(classLoader13);
        enhancer10.setUseFactory(true);
        enhancer10.setInterceptDuringConstruction(true);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.declare_field(96, "org/mockito/cglib/proxy/Enhancer", type7, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        java.lang.Class class6 = null;
        enhancer0.setSuperclass(class6);
        java.lang.ClassLoader classLoader8 = enhancer0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer0.getNamingPolicy();
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        org.mockito.cglib.proxy.Callback callback14 = null;
        enhancer0.setCallback(callback14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(namingPolicy9);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMultiANewArrayInsn("Lbyte;", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray9);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = null;
        enhancer11.setNamingPolicy(namingPolicy12);
        java.lang.ClassLoader classLoader14 = null;
        enhancer11.setClassLoader(classLoader14);
        java.lang.Class<?> wildcardClass16 = enhancer11.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("double", type20, typeArray22);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray22);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.begin_class((int) (byte) 10, (int) (short) 10, "hi!", type8, typeArray22, "L1158624635");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "()D" + "'", str10, "()D");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str17, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "()D" + "'", str23, "()D");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "()Lorg/mockito/cglib/proxy/Enhancer;" + "'", str25, "()Lorg/mockito/cglib/proxy/Enhancer;");
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter(classVisitor15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter(classVisitor15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.declare_field(130, "L1219436756", type6, (java.lang.Object) classEmitter21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        enhancer0.setUseCache(true);
        java.lang.ClassLoader classLoader8 = enhancer0.getClassLoader();
        boolean boolean9 = enhancer0.getAttemptLoad();
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter(classVisitor10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor10);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        java.lang.Class<?> wildcardClass15 = classEmitter14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.core.ClassEmitter");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org/mockito/cglib/core/ClassEmitter" + "'", str16, "org/mockito/cglib/core/ClassEmitter");
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor17 = classEmitter5.visitMethod(108, "hi!", "hi!", "L1158624635", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@54e8cadc");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        java.lang.String[] strArray11 = new java.lang.String[] { "Lorg/mockito/cglib/proxy/Enhancer;", "(CBBBD)I" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter2.visitMethod((-1), "L1887820774", "double()B", "L1887820774", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6a2e480e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] {};
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        int int12 = type11.getSize();
        java.lang.String str13 = type11.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        int int18 = type17.getSize();
        java.lang.String str19 = type17.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type14, type15, type16, type17, type20 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type11, typeArray22);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.begin_class(153, (int) '#', "", type7, typeArray22, "()F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "()D" + "'", str9, "()D");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "byte" + "'", str13, "byte");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "byte" + "'", str19, "byte");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "double" + "'", str21, "double");
        org.junit.Assert.assertNotNull(typeArray22);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        java.lang.String[] strArray11 = new java.lang.String[] { "long" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit((int) (byte) -1, 154, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", "L1147440102", "Lbyte;", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter14.visitOuterClass("L1176429447", "L1674961359", "Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(153, "()D", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIntInsn((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        int int11 = type10.getSize();
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        java.lang.ClassLoader classLoader20 = null;
        enhancer17.setClassLoader(classLoader20);
        java.lang.Class<?> wildcardClass22 = enhancer17.getClass();
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass22);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy25 = null;
        enhancer24.setNamingPolicy(namingPolicy25);
        java.lang.ClassLoader classLoader27 = null;
        enhancer24.setClassLoader(classLoader27);
        java.lang.Class<?> wildcardClass29 = enhancer24.getClass();
        java.lang.Class[] classArray30 = new java.lang.Class[] { wildcardClass22, wildcardClass29 };
        enhancer12.setInterfaces(classArray30);
        boolean boolean32 = enhancer12.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = null;
        enhancer33.setNamingPolicy(namingPolicy34);
        java.lang.ClassLoader classLoader36 = null;
        enhancer33.setClassLoader(classLoader36);
        java.lang.Class<?> wildcardClass38 = enhancer33.getClass();
        enhancer12.setSuperclass((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        java.lang.String str41 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BYTE_TYPE;
        int int45 = type44.getSize();
        java.lang.String str46 = type44.getClassName();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BYTE_TYPE;
        int int51 = type50.getSize();
        java.lang.String str52 = type50.getClassName();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str54 = type53.getClassName();
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type47, type48, type49, type50, type53 };
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type44, typeArray55);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray55);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray55);
        org.mockito.asm.Type type59 = type10.getElementType();
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter60);
        boolean boolean62 = type59.equals((java.lang.Object) classEmitter60);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor65 = classEmitter60.visitAnnotation("L1750185763", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str23, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str41, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "byte" + "'", str46, "byte");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "byte" + "'", str52, "byte");
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "double" + "'", str54, "double");
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;" + "'", str57, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;" + "'", str58, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        boolean boolean20 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = null;
        enhancer26.setNamingPolicy(namingPolicy27);
        java.lang.ClassLoader classLoader29 = null;
        enhancer26.setClassLoader(classLoader29);
        java.lang.Class<?> wildcardClass31 = enhancer26.getClass();
        java.lang.String str32 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass31);
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = null;
        enhancer33.setNamingPolicy(namingPolicy34);
        java.lang.ClassLoader classLoader36 = null;
        enhancer33.setClassLoader(classLoader36);
        java.lang.Class<?> wildcardClass38 = enhancer33.getClass();
        java.lang.Class[] classArray39 = new java.lang.Class[] { wildcardClass31, wildcardClass38 };
        enhancer21.setInterfaces(classArray39);
        enhancer0.setInterfaces(classArray39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str32, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(classArray39);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn(8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 100, "", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        boolean boolean20 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = enhancer21.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.lang.Class class0 = null;
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = null;
        enhancer1.setNamingPolicy(namingPolicy2);
        boolean boolean4 = enhancer1.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = null;
        enhancer10.setNamingPolicy(namingPolicy11);
        java.lang.ClassLoader classLoader13 = null;
        enhancer10.setClassLoader(classLoader13);
        java.lang.Class<?> wildcardClass15 = enhancer10.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        java.lang.ClassLoader classLoader20 = null;
        enhancer17.setClassLoader(classLoader20);
        java.lang.Class<?> wildcardClass22 = enhancer17.getClass();
        java.lang.Class[] classArray23 = new java.lang.Class[] { wildcardClass15, wildcardClass22 };
        enhancer5.setInterfaces(classArray23);
        enhancer1.setInterfaces(classArray23);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter26 = null;
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = null;
        enhancer27.setNamingPolicy(namingPolicy28);
        java.lang.ClassLoader classLoader30 = null;
        enhancer27.setClassLoader(classLoader30);
        boolean boolean32 = enhancer27.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer27.getNamingPolicy();
        org.mockito.cglib.proxy.Callback callback34 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray35 = new org.mockito.cglib.proxy.Callback[] { callback34 };
        enhancer27.setCallbacks(callbackArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = org.mockito.cglib.proxy.Enhancer.create(class0, classArray23, callbackFilter26, callbackArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callback is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str16, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(namingPolicy33);
        org.junit.Assert.assertNotNull(callbackArray35);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = null;
        enhancer3.setNamingPolicy(namingPolicy4);
        java.lang.ClassLoader classLoader6 = null;
        enhancer3.setClassLoader(classLoader6);
        java.lang.Class<?> wildcardClass8 = enhancer3.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer9.setNamingPolicy(namingPolicy10);
        java.lang.ClassLoader classLoader12 = null;
        enhancer9.setClassLoader(classLoader12);
        java.lang.Class<?> wildcardClass14 = enhancer9.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        java.lang.ClassLoader classLoader20 = null;
        enhancer17.setClassLoader(classLoader20);
        java.lang.Class<?> wildcardClass22 = enhancer17.getClass();
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass22);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy25 = null;
        enhancer24.setNamingPolicy(namingPolicy25);
        java.lang.ClassLoader classLoader27 = null;
        enhancer24.setClassLoader(classLoader27);
        java.lang.Class<?> wildcardClass29 = enhancer24.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = null;
        enhancer30.setNamingPolicy(namingPolicy31);
        java.lang.ClassLoader classLoader33 = null;
        enhancer30.setClassLoader(classLoader33);
        java.lang.Class<?> wildcardClass35 = enhancer30.getClass();
        java.lang.String str36 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass35);
        java.lang.Class[] classArray38 = new java.lang.Class[] { wildcardClass8, wildcardClass14, wildcardClass22, wildcardClass29, wildcardClass35 };
        enhancer0.setInterfaces(classArray38);
        enhancer0.setUseFactory(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = enhancer0.create();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str15, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str23, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str36, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(classArray38);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.String str7 = label5.toString();
        java.lang.String str8 = label5.toString();
        java.lang.String str9 = label5.toString();
        java.lang.Object obj10 = label5.info;
        java.lang.Object obj11 = label5.info;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        java.lang.Object obj13 = label12.info;
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter(classVisitor14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter(classVisitor14);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        label12.info = classInfo20;
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = label22.info;
        java.lang.String str24 = label22.toString();
        java.lang.Object obj25 = label22.info;
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = null;
        enhancer26.setNamingPolicy(namingPolicy27);
        java.lang.ClassLoader classLoader29 = null;
        enhancer26.setClassLoader(classLoader29);
        enhancer26.setUseFactory(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer26.getNamingPolicy();
        label22.info = enhancer26;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label5, label12, label22, "Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L645045409" + "'", str7, "L645045409");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L645045409" + "'", str8, "L645045409");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L645045409" + "'", str9, "L645045409");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(obj23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L200253451" + "'", str24, "L200253451");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(namingPolicy33);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitInnerClass("(CBBBD)I", "L385417742", "()F", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        java.lang.String str3 = label0.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        label0.info = str5;
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = null;
        enhancer7.setNamingPolicy(namingPolicy8);
        java.lang.ClassLoader classLoader10 = null;
        enhancer7.setClassLoader(classLoader10);
        boolean boolean12 = enhancer7.getAttemptLoad();
        java.lang.Class class13 = null;
        enhancer7.setSuperclass(class13);
        org.mockito.cglib.proxy.Callback callback15 = null;
        enhancer7.setCallback(callback15);
        label0.info = callback15;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L1734172415" + "'", str2, "L1734172415");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L1734172415" + "'", str3, "L1734172415");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "J" + "'", str5, "J");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        int int11 = type10.getSize();
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        java.lang.ClassLoader classLoader20 = null;
        enhancer17.setClassLoader(classLoader20);
        java.lang.Class<?> wildcardClass22 = enhancer17.getClass();
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass22);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy25 = null;
        enhancer24.setNamingPolicy(namingPolicy25);
        java.lang.ClassLoader classLoader27 = null;
        enhancer24.setClassLoader(classLoader27);
        java.lang.Class<?> wildcardClass29 = enhancer24.getClass();
        java.lang.Class[] classArray30 = new java.lang.Class[] { wildcardClass22, wildcardClass29 };
        enhancer12.setInterfaces(classArray30);
        boolean boolean32 = enhancer12.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = null;
        enhancer33.setNamingPolicy(namingPolicy34);
        java.lang.ClassLoader classLoader36 = null;
        enhancer33.setClassLoader(classLoader36);
        java.lang.Class<?> wildcardClass38 = enhancer33.getClass();
        enhancer12.setSuperclass((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        java.lang.String str41 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BYTE_TYPE;
        int int45 = type44.getSize();
        java.lang.String str46 = type44.getClassName();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BYTE_TYPE;
        int int51 = type50.getSize();
        java.lang.String str52 = type50.getClassName();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str54 = type53.getClassName();
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type47, type48, type49, type50, type53 };
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type44, typeArray55);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray55);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray55);
        org.mockito.asm.Type type59 = type10.getElementType();
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter60);
        boolean boolean62 = type59.equals((java.lang.Object) classEmitter60);
        // The following exception was thrown during execution in test generation
        try {
            int int63 = classEmitter60.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str23, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str41, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "byte" + "'", str46, "byte");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "byte" + "'", str52, "byte");
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "double" + "'", str54, "double");
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;" + "'", str57, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;" + "'", str58, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.String str7 = label5.toString();
        java.lang.String str8 = label5.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        java.lang.String str12 = label9.toString();
        java.lang.String str13 = label9.toString();
        java.lang.Object obj14 = label9.info;
        java.lang.String str15 = label9.toString();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        java.lang.String str18 = label16.toString();
        java.lang.Object obj19 = label16.info;
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = null;
        enhancer20.setNamingPolicy(namingPolicy21);
        java.lang.ClassLoader classLoader23 = null;
        enhancer20.setClassLoader(classLoader23);
        enhancer20.setUseFactory(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = enhancer20.getNamingPolicy();
        label16.info = enhancer20;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label5, label9, label16, "L1887820774");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1961904380" + "'", str7, "L1961904380");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1961904380" + "'", str8, "L1961904380");
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L358852097" + "'", str11, "L358852097");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L358852097" + "'", str12, "L358852097");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L358852097" + "'", str13, "L358852097");
        org.junit.Assert.assertNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L358852097" + "'", str15, "L358852097");
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L2122915163" + "'", str18, "L2122915163");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(namingPolicy27);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("L1176429447", 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.mockito.asm.MethodVisitor methodVisitor6 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(153, "()D", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(0, "hi!", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = null;
        enhancer8.setNamingPolicy(namingPolicy9);
        java.lang.ClassLoader classLoader11 = null;
        enhancer8.setClassLoader(classLoader11);
        boolean boolean13 = enhancer8.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = enhancer8.getNamingPolicy();
        org.mockito.cglib.proxy.Callback callback15 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray16 = new org.mockito.cglib.proxy.Callback[] { callback15 };
        enhancer8.setCallbacks(callbackArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass5, callbackArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(namingPolicy14);
        org.junit.Assert.assertNotNull(callbackArray16);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = null;
        enhancer7.setNamingPolicy(namingPolicy8);
        java.lang.ClassLoader classLoader10 = null;
        enhancer7.setClassLoader(classLoader10);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter12 = null;
        enhancer7.setCallbackFilter(callbackFilter12);
        org.mockito.cglib.proxy.Callback callback14 = null;
        enhancer7.setCallback(callback14);
        java.lang.ClassLoader classLoader16 = null;
        enhancer7.setClassLoader(classLoader16);
        enhancer7.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = null;
        enhancer20.setNamingPolicy(namingPolicy21);
        java.lang.ClassLoader classLoader23 = null;
        enhancer20.setClassLoader(classLoader23);
        boolean boolean25 = enhancer20.getAttemptLoad();
        enhancer20.setUseCache(true);
        java.lang.ClassLoader classLoader28 = enhancer20.getClassLoader();
        enhancer7.setClassLoader(classLoader28);
        enhancer0.setClassLoader(classLoader28);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = null;
        enhancer31.setNamingPolicy(namingPolicy32);
        java.lang.ClassLoader classLoader34 = null;
        enhancer31.setClassLoader(classLoader34);
        boolean boolean36 = enhancer31.getAttemptLoad();
        java.lang.ClassLoader classLoader37 = enhancer31.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter38 = null;
        enhancer31.setCallbackFilter(callbackFilter38);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy41 = null;
        enhancer40.setNamingPolicy(namingPolicy41);
        boolean boolean43 = enhancer40.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = null;
        enhancer44.setNamingPolicy(namingPolicy45);
        java.lang.ClassLoader classLoader47 = null;
        enhancer44.setClassLoader(classLoader47);
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy50 = null;
        enhancer49.setNamingPolicy(namingPolicy50);
        java.lang.ClassLoader classLoader52 = null;
        enhancer49.setClassLoader(classLoader52);
        java.lang.Class<?> wildcardClass54 = enhancer49.getClass();
        java.lang.String str55 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass54);
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy57 = null;
        enhancer56.setNamingPolicy(namingPolicy57);
        java.lang.ClassLoader classLoader59 = null;
        enhancer56.setClassLoader(classLoader59);
        java.lang.Class<?> wildcardClass61 = enhancer56.getClass();
        java.lang.Class[] classArray62 = new java.lang.Class[] { wildcardClass54, wildcardClass61 };
        enhancer44.setInterfaces(classArray62);
        enhancer40.setInterfaces(classArray62);
        enhancer31.setInterfaces(classArray62);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(classLoader28);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(classLoader37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str55, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(classArray62);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(153, "()D", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = classEmitter6.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray7 = new java.lang.String[] { "L1887820774" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = classEmitter0.visitMethod(33, "L1147440102", "double()B", "hi!", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@419c6d4d");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classEmitter2.visitMethod(1, "L1750185763", "org.mockito.cglib.proxy.Enhancer", "L609610250", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3c1297d0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        boolean boolean20 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = enhancer21.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass26);
        org.mockito.cglib.proxy.Enhancer enhancer28 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = null;
        enhancer28.setNamingPolicy(namingPolicy29);
        java.lang.ClassLoader classLoader31 = null;
        enhancer28.setClassLoader(classLoader31);
        boolean boolean33 = enhancer28.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = enhancer28.getNamingPolicy();
        org.mockito.cglib.proxy.Callback callback35 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray36 = new org.mockito.cglib.proxy.Callback[] { callback35 };
        enhancer28.setCallbacks(callbackArray36);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass26, callbackArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(namingPolicy34);
        org.junit.Assert.assertNotNull(callbackArray36);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.visitOuterClass("(CBBBD)B", "L1219436756", "L1622326596");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classEmitter2.visitMethod(0, "byte", "double()B", "(CBBBD)I", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1d9ab823");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitAnnotation("(CBBBD)B", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("()F");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(153, "()D", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLdcInsn((java.lang.Object) "L609610250");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        java.lang.Class<?> wildcardClass5 = enhancer0.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        boolean boolean7 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        boolean boolean11 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        java.lang.Class[] classArray13 = null;
        java.util.List list14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.getMethods((java.lang.Class) wildcardClass5, classArray13, list14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str6, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type12);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(153, "()D", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMultiANewArrayInsn("()D", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        boolean boolean20 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = enhancer21.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        java.lang.String str29 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        java.lang.String str32 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = null;
        enhancer33.setNamingPolicy(namingPolicy34);
        java.lang.ClassLoader classLoader36 = null;
        enhancer33.setClassLoader(classLoader36);
        boolean boolean38 = enhancer33.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy39 = enhancer33.getNamingPolicy();
        org.mockito.cglib.proxy.Callback callback40 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray41 = new org.mockito.cglib.proxy.Callback[] { callback40 };
        enhancer33.setCallbacks(callbackArray41);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass26, callbackArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str29, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str32, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(namingPolicy39);
        org.junit.Assert.assertNotNull(callbackArray41);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        classEmitter1.setTarget(classVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitSource("Lbyte;", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        boolean boolean20 = enhancer0.getAttemptLoad();
        boolean boolean21 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = null;
        enhancer22.setNamingPolicy(namingPolicy23);
        java.lang.ClassLoader classLoader25 = null;
        enhancer22.setClassLoader(classLoader25);
        boolean boolean27 = enhancer22.getAttemptLoad();
        java.lang.ClassLoader classLoader28 = enhancer22.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter29 = null;
        enhancer22.setCallbackFilter(callbackFilter29);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = null;
        enhancer31.setNamingPolicy(namingPolicy32);
        boolean boolean34 = enhancer31.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = null;
        enhancer35.setNamingPolicy(namingPolicy36);
        java.lang.ClassLoader classLoader38 = null;
        enhancer35.setClassLoader(classLoader38);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy41 = null;
        enhancer40.setNamingPolicy(namingPolicy41);
        java.lang.ClassLoader classLoader43 = null;
        enhancer40.setClassLoader(classLoader43);
        java.lang.Class<?> wildcardClass45 = enhancer40.getClass();
        java.lang.String str46 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass45);
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy48 = null;
        enhancer47.setNamingPolicy(namingPolicy48);
        java.lang.ClassLoader classLoader50 = null;
        enhancer47.setClassLoader(classLoader50);
        java.lang.Class<?> wildcardClass52 = enhancer47.getClass();
        java.lang.Class[] classArray53 = new java.lang.Class[] { wildcardClass45, wildcardClass52 };
        enhancer35.setInterfaces(classArray53);
        enhancer31.setInterfaces(classArray53);
        enhancer22.setInterfaces(classArray53);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(classLoader28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str46, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(classArray53);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(153, "()D", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.String str12 = label10.toString();
        java.lang.Object obj13 = label10.info;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter(classVisitor16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter(classVisitor16);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        label14.info = classInfo22;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("org/mockito/cglib/core/ClassEmitter", "L1183194368", "L1622326596", label10, label14, 112);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 112");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1015362456" + "'", str12, "L1015362456");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo22);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.String str10 = label8.toString();
        java.lang.Object obj11 = label8.info;
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        enhancer12.setUseFactory(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = enhancer12.getNamingPolicy();
        label8.info = enhancer12;
        org.mockito.asm.Label label21 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("(CBBBD)I", "L1750185763", "double()B", label8, label21, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L364280955" + "'", str10, "L364280955");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(namingPolicy19);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = enhancer0.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        boolean boolean10 = enhancer5.getAttemptLoad();
        java.lang.Class class11 = null;
        enhancer5.setSuperclass(class11);
        java.lang.ClassLoader classLoader13 = enhancer5.getClassLoader();
        boolean boolean14 = enhancer5.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = null;
        enhancer15.setNamingPolicy(namingPolicy16);
        java.lang.ClassLoader classLoader18 = null;
        enhancer15.setClassLoader(classLoader18);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = null;
        enhancer20.setNamingPolicy(namingPolicy21);
        java.lang.ClassLoader classLoader23 = null;
        enhancer20.setClassLoader(classLoader23);
        java.lang.Class<?> wildcardClass25 = enhancer20.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = null;
        enhancer27.setNamingPolicy(namingPolicy28);
        java.lang.ClassLoader classLoader30 = null;
        enhancer27.setClassLoader(classLoader30);
        java.lang.Class<?> wildcardClass32 = enhancer27.getClass();
        java.lang.Class[] classArray33 = new java.lang.Class[] { wildcardClass25, wildcardClass32 };
        enhancer15.setInterfaces(classArray33);
        boolean boolean35 = enhancer15.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = null;
        enhancer36.setNamingPolicy(namingPolicy37);
        java.lang.ClassLoader classLoader39 = null;
        enhancer36.setClassLoader(classLoader39);
        java.lang.Class<?> wildcardClass41 = enhancer36.getClass();
        enhancer15.setSuperclass((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass41);
        java.lang.String str44 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass41);
        enhancer5.setSuperclass((java.lang.Class) wildcardClass41);
        org.mockito.cglib.core.NamingPolicy namingPolicy47 = enhancer5.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy47);
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy50 = null;
        enhancer49.setNamingPolicy(namingPolicy50);
        java.lang.ClassLoader classLoader52 = null;
        enhancer49.setClassLoader(classLoader52);
        java.lang.Class<?> wildcardClass54 = enhancer49.getClass();
        java.lang.String str55 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass54);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(namingPolicy4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str26, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str44, "org/mockito/cglib/proxy/Enhancer");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(namingPolicy47);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "org/mockito/cglib/proxy/Enhancer" + "'", str55, "org/mockito/cglib/proxy/Enhancer");
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L1674961359");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter6.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L1622326596");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("", "B", "(CBBBD)B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitOuterClass("L1183194368", "Lorg/mockito/asm/Type;", "long");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter2.visitMethod(112, "L1591299506", "", "(CBBBD)I", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1d577695");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(153, "()D", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        java.lang.String str12 = label9.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        label9.info = str14;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter(classVisitor18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter(classVisitor18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        label16.info = classInfo24;
        java.lang.String str26 = label16.toString();
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] { label16, label27 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTableSwitchInsn((int) (short) 10, 0, label9, labelArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1658049462" + "'", str11, "L1658049462");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1658049462" + "'", str12, "L1658049462");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "J" + "'", str14, "J");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNull(classInfo24);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1623399653" + "'", str26, "L1623399653");
        org.junit.Assert.assertNotNull(labelArray28);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn((int) (short) 100, "L1219436756", "L1622326596", "()D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn((int) (byte) 100, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        boolean boolean20 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = enhancer21.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass26);
        java.lang.ClassLoader classLoader28 = enhancer0.getClassLoader();
        java.lang.Class<?> wildcardClass29 = enhancer0.getClass();
        org.mockito.cglib.proxy.Callback[] callbackArray30 = new org.mockito.cglib.proxy.Callback[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.proxy.Enhancer.registerCallbacks((java.lang.Class) wildcardClass29, callbackArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.proxy.Enhancer is not an enhanced class");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(classLoader28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(callbackArray30);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = null;
        enhancer7.setNamingPolicy(namingPolicy8);
        java.lang.ClassLoader classLoader10 = null;
        enhancer7.setClassLoader(classLoader10);
        boolean boolean12 = enhancer7.getAttemptLoad();
        java.lang.Class class13 = null;
        enhancer7.setSuperclass(class13);
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = enhancer7.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy15);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        java.lang.ClassLoader classLoader20 = null;
        enhancer17.setClassLoader(classLoader20);
        java.lang.Class<?> wildcardClass22 = enhancer17.getClass();
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass22);
        boolean boolean24 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        boolean boolean26 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        boolean boolean28 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass22);
        boolean boolean29 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass22);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackType((java.lang.Class) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(namingPolicy15);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str23, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type15 = classEmitter12.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(153, "()D", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        java.lang.String str12 = label9.toString();
        java.lang.String str13 = label9.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getReturnType("Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B");
        label9.info = type15;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("byte");
        label17.info = "byte";
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = label22.info;
        org.mockito.asm.Label[] labelArray24 = new org.mockito.asm.Label[] { label17, label21, label22 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTableSwitchInsn(155, 10, label9, labelArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L903795297" + "'", str11, "L903795297");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L903795297" + "'", str12, "L903795297");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L903795297" + "'", str13, "L903795297");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(labelArray24);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("byte", "()B");
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] {};
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("double", type20, typeArray22);
        label18.info = typeArray22;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter26 = classEmitter12.begin_method(130, signature17, typeArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@d452644");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "()D" + "'", str23, "()D");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("double");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter12.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer0.setCallbackFilter(callbackFilter5);
        org.mockito.cglib.proxy.Callback callback7 = null;
        enhancer0.setCallback(callback7);
        java.lang.ClassLoader classLoader9 = null;
        enhancer0.setClassLoader(classLoader9);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy11 = null;
        enhancer0.setStrategy(generatorStrategy11);
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = null;
        enhancer13.setNamingPolicy(namingPolicy14);
        java.lang.ClassLoader classLoader16 = null;
        enhancer13.setClassLoader(classLoader16);
        boolean boolean18 = enhancer13.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = enhancer13.getStrategy();
        enhancer0.setStrategy(generatorStrategy19);
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = null;
        enhancer23.setNamingPolicy(namingPolicy24);
        java.lang.ClassLoader classLoader26 = null;
        enhancer23.setClassLoader(classLoader26);
        boolean boolean28 = enhancer23.getAttemptLoad();
        java.lang.ClassLoader classLoader29 = enhancer23.getClassLoader();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter30 = null;
        enhancer23.setCallbackFilter(callbackFilter30);
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = null;
        enhancer32.setNamingPolicy(namingPolicy33);
        boolean boolean35 = enhancer32.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = null;
        enhancer36.setNamingPolicy(namingPolicy37);
        java.lang.ClassLoader classLoader39 = null;
        enhancer36.setClassLoader(classLoader39);
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy42 = null;
        enhancer41.setNamingPolicy(namingPolicy42);
        java.lang.ClassLoader classLoader44 = null;
        enhancer41.setClassLoader(classLoader44);
        java.lang.Class<?> wildcardClass46 = enhancer41.getClass();
        java.lang.String str47 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass46);
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy49 = null;
        enhancer48.setNamingPolicy(namingPolicy49);
        java.lang.ClassLoader classLoader51 = null;
        enhancer48.setClassLoader(classLoader51);
        java.lang.Class<?> wildcardClass53 = enhancer48.getClass();
        java.lang.Class[] classArray54 = new java.lang.Class[] { wildcardClass46, wildcardClass53 };
        enhancer36.setInterfaces(classArray54);
        enhancer32.setInterfaces(classArray54);
        enhancer23.setInterfaces(classArray54);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(generatorStrategy19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(classLoader29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str47, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(classArray54);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        classEmitter1.setTarget(classVisitor2);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(153, "()D", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMultiANewArrayInsn("L62291075", 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLdcInsn((java.lang.Object) 96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        enhancer0.setAttemptLoad(false);
        enhancer0.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = null;
        enhancer7.setNamingPolicy(namingPolicy8);
        java.lang.ClassLoader classLoader10 = null;
        enhancer7.setClassLoader(classLoader10);
        enhancer7.setUseFactory(true);
        enhancer7.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = enhancer7.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = enhancer7.getNamingPolicy();
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = null;
        enhancer18.setNamingPolicy(namingPolicy19);
        boolean boolean21 = enhancer18.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = null;
        enhancer22.setNamingPolicy(namingPolicy23);
        java.lang.ClassLoader classLoader25 = null;
        enhancer22.setClassLoader(classLoader25);
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = null;
        enhancer27.setNamingPolicy(namingPolicy28);
        java.lang.ClassLoader classLoader30 = null;
        enhancer27.setClassLoader(classLoader30);
        java.lang.Class<?> wildcardClass32 = enhancer27.getClass();
        java.lang.String str33 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass32);
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = null;
        enhancer34.setNamingPolicy(namingPolicy35);
        java.lang.ClassLoader classLoader37 = null;
        enhancer34.setClassLoader(classLoader37);
        java.lang.Class<?> wildcardClass39 = enhancer34.getClass();
        java.lang.Class[] classArray40 = new java.lang.Class[] { wildcardClass32, wildcardClass39 };
        enhancer22.setInterfaces(classArray40);
        enhancer18.setInterfaces(classArray40);
        enhancer7.setInterfaces(classArray40);
        org.mockito.cglib.proxy.Enhancer enhancer44 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = null;
        enhancer44.setNamingPolicy(namingPolicy45);
        java.lang.ClassLoader classLoader47 = null;
        enhancer44.setClassLoader(classLoader47);
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy50 = null;
        enhancer49.setNamingPolicy(namingPolicy50);
        java.lang.ClassLoader classLoader52 = null;
        enhancer49.setClassLoader(classLoader52);
        java.lang.Class<?> wildcardClass54 = enhancer49.getClass();
        java.lang.String str55 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass54);
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy57 = null;
        enhancer56.setNamingPolicy(namingPolicy57);
        java.lang.ClassLoader classLoader59 = null;
        enhancer56.setClassLoader(classLoader59);
        java.lang.Class<?> wildcardClass61 = enhancer56.getClass();
        java.lang.Class[] classArray62 = new java.lang.Class[] { wildcardClass54, wildcardClass61 };
        enhancer44.setInterfaces(classArray62);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = enhancer0.create(classArray40, (java.lang.Object[]) classArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Callbacks are required");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namingPolicy16);
        org.junit.Assert.assertNotNull(namingPolicy17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str33, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str55, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(classArray62);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        boolean boolean5 = enhancer0.getAttemptLoad();
        java.lang.Class class6 = null;
        enhancer0.setSuperclass(class6);
        java.lang.ClassLoader classLoader8 = enhancer0.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = enhancer0.getNamingPolicy();
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Callback callback12 = null;
        enhancer0.setCallback(callback12);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = null;
        enhancer14.setNamingPolicy(namingPolicy15);
        boolean boolean17 = enhancer14.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = null;
        enhancer18.setNamingPolicy(namingPolicy19);
        java.lang.ClassLoader classLoader21 = null;
        enhancer18.setClassLoader(classLoader21);
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = null;
        enhancer23.setNamingPolicy(namingPolicy24);
        java.lang.ClassLoader classLoader26 = null;
        enhancer23.setClassLoader(classLoader26);
        java.lang.Class<?> wildcardClass28 = enhancer23.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = null;
        enhancer30.setNamingPolicy(namingPolicy31);
        java.lang.ClassLoader classLoader33 = null;
        enhancer30.setClassLoader(classLoader33);
        java.lang.Class<?> wildcardClass35 = enhancer30.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[] { wildcardClass28, wildcardClass35 };
        enhancer18.setInterfaces(classArray36);
        enhancer14.setInterfaces(classArray36);
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.setCallbackTypes(classArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown callback type class org.mockito.cglib.proxy.Enhancer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(namingPolicy9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str29, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(classArray36);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitOuterClass("L1147440102", "()F", "L1591299506");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("double", type8, typeArray10);
        label6.info = typeArray10;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber((int) (byte) 10, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "()D" + "'", str11, "()D");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray9 = new java.lang.String[] { "org.mockito.cglib.proxy.Enhancer" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visit(100, (int) (short) 10, "double", "()Lorg/mockito/cglib/proxy/Enhancer;", "", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.String str7 = label5.toString();
        java.lang.String str8 = label5.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(6, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1979681282" + "'", str7, "L1979681282");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1979681282" + "'", str8, "L1979681282");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor3 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(153, "()D", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitInsn(3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str3 = signature2.getDescriptor();
        boolean boolean5 = signature2.equals((java.lang.Object) (short) 1);
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.String str7 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter5.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter9 = classEmitter5.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@790354bc");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter5.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitOuterClass("L1176429447", "Lbyte;", "L62291075");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo14);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitInnerClass("(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", "L1147440102", "()Lbyte;", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter2.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@26cfcd78");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] {};
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("double", type8, typeArray10);
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = null;
        enhancer14.setNamingPolicy(namingPolicy15);
        java.lang.ClassLoader classLoader17 = null;
        enhancer14.setClassLoader(classLoader17);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter19 = null;
        enhancer14.setCallbackFilter(callbackFilter19);
        enhancer14.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = null;
        enhancer23.setNamingPolicy(namingPolicy24);
        java.lang.ClassLoader classLoader26 = null;
        enhancer23.setClassLoader(classLoader26);
        boolean boolean28 = enhancer23.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = enhancer23.getNamingPolicy();
        org.mockito.cglib.proxy.Callback callback30 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray31 = new org.mockito.cglib.proxy.Callback[] { callback30 };
        enhancer23.setCallbacks(callbackArray31);
        enhancer14.setCallbacks(callbackArray31);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFrame(9, 0, (java.lang.Object[]) typeArray10, 124, (java.lang.Object[]) callbackArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "()D" + "'", str11, "()D");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(namingPolicy29);
        org.junit.Assert.assertNotNull(callbackArray31);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(153, "()D", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter5.visitAnnotation("double()B", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.String str8 = label6.toString();
        java.lang.String str9 = label6.toString();
        java.lang.String str10 = label6.toString();
        java.lang.Object obj11 = label6.info;
        java.lang.Object obj12 = label6.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitJumpInsn(156, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L188517773" + "'", str8, "L188517773");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L188517773" + "'", str9, "L188517773");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L188517773" + "'", str10, "L188517773");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("()Lbyte;", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "L1158624635", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.String str7 = label5.toString();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.String str11 = label9.toString();
        java.lang.String str12 = label9.toString();
        java.lang.String str13 = label9.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getReturnType("Lorg/mockito/cglib/proxy/Enhancer;(CBBBD)B");
        label9.info = type15;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label5, label8, label9, "L1887820774");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L533868336" + "'", str7, "L533868336");
        org.junit.Assert.assertNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1195526126" + "'", str11, "L1195526126");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1195526126" + "'", str12, "L1195526126");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1195526126" + "'", str13, "L1195526126");
        org.junit.Assert.assertNotNull(type15);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        java.lang.ClassLoader classLoader3 = null;
        enhancer0.setClassLoader(classLoader3);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = null;
        enhancer5.setNamingPolicy(namingPolicy6);
        java.lang.ClassLoader classLoader8 = null;
        enhancer5.setClassLoader(classLoader8);
        java.lang.Class<?> wildcardClass10 = enhancer5.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = null;
        enhancer12.setNamingPolicy(namingPolicy13);
        java.lang.ClassLoader classLoader15 = null;
        enhancer12.setClassLoader(classLoader15);
        java.lang.Class<?> wildcardClass17 = enhancer12.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass10, wildcardClass17 };
        enhancer0.setInterfaces(classArray18);
        boolean boolean20 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = null;
        enhancer21.setNamingPolicy(namingPolicy22);
        java.lang.ClassLoader classLoader24 = null;
        enhancer21.setClassLoader(classLoader24);
        java.lang.Class<?> wildcardClass26 = enhancer21.getClass();
        enhancer0.setSuperclass((java.lang.Class) wildcardClass26);
        boolean boolean28 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer29 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy30 = null;
        enhancer29.setNamingPolicy(namingPolicy30);
        java.lang.ClassLoader classLoader32 = null;
        enhancer29.setClassLoader(classLoader32);
        boolean boolean34 = enhancer29.getAttemptLoad();
        enhancer29.setUseCache(true);
        java.lang.ClassLoader classLoader37 = enhancer29.getClassLoader();
        org.mockito.cglib.proxy.Callback callback38 = null;
        enhancer29.setCallback(callback38);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy41 = null;
        enhancer40.setNamingPolicy(namingPolicy41);
        java.lang.ClassLoader classLoader43 = null;
        enhancer40.setClassLoader(classLoader43);
        boolean boolean45 = enhancer40.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy46 = enhancer40.getStrategy();
        enhancer29.setStrategy(generatorStrategy46);
        enhancer0.setStrategy(generatorStrategy46);
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy50 = null;
        enhancer49.setNamingPolicy(namingPolicy50);
        java.lang.ClassLoader classLoader52 = null;
        enhancer49.setClassLoader(classLoader52);
        enhancer49.setUseFactory(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy56 = enhancer49.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy56);
        org.mockito.asm.ClassVisitor classVisitor58 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter(classVisitor58);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter(classVisitor58);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.ClassInfo classInfo62 = classEmitter60.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str11, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(classLoader37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(generatorStrategy46);
        org.junit.Assert.assertNotNull(namingPolicy56);
        org.junit.Assert.assertNull(classInfo62);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor19 = classEmitter5.visitMethod(158, "B", "byte", "L1887820774", strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1b2fdff5");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str3 = signature2.getDescriptor();
        boolean boolean5 = signature2.equals((java.lang.Object) (short) 1);
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.String str7 = signature2.getName();
        java.lang.String str8 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray9 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = null;
        enhancer0.setNamingPolicy(namingPolicy1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = null;
        enhancer4.setNamingPolicy(namingPolicy5);
        java.lang.ClassLoader classLoader7 = null;
        enhancer4.setClassLoader(classLoader7);
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer9.setNamingPolicy(namingPolicy10);
        java.lang.ClassLoader classLoader12 = null;
        enhancer9.setClassLoader(classLoader12);
        java.lang.Class<?> wildcardClass14 = enhancer9.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass14);
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = null;
        enhancer16.setNamingPolicy(namingPolicy17);
        java.lang.ClassLoader classLoader19 = null;
        enhancer16.setClassLoader(classLoader19);
        java.lang.Class<?> wildcardClass21 = enhancer16.getClass();
        java.lang.Class[] classArray22 = new java.lang.Class[] { wildcardClass14, wildcardClass21 };
        enhancer4.setInterfaces(classArray22);
        enhancer0.setInterfaces(classArray22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        // The following exception was thrown during execution in test generation
        try {
            enhancer0.generateClass((org.mockito.asm.ClassVisitor) classEmitter25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lorg/mockito/cglib/proxy/Enhancer;" + "'", str15, "Lorg/mockito/cglib/proxy/Enhancer;");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classArray22);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitInnerClass("L1147440102", "J", "L385417742", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.String str2 = label0.toString();
        java.lang.String str3 = label0.toString();
        java.lang.String str4 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L91118847" + "'", str2, "L91118847");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L91118847" + "'", str3, "L91118847");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L91118847" + "'", str4, "L91118847");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter6.visitInnerClass("L1183194368", "", "()Lorg/mockito/cglib/proxy/Enhancer;", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor10 = classEmitter2.visitField((int) (short) 10, "L1622326596", "long", "double()B", (java.lang.Object) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("()B");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(124, type10);
        boolean boolean13 = type10.equals((java.lang.Object) 0);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        int int16 = type15.getSize();
        java.lang.String str17 = type15.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSize();
        java.lang.String str23 = type21.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type19, type20, type21, type24 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type15, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray26);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(155, (int) (byte) 100, (java.lang.Object[]) typeArray7, (int) (byte) 0, (java.lang.Object[]) typeArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "byte" + "'", str17, "byte");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "byte" + "'", str23, "byte");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "double" + "'", str25, "double");
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(CBBBD)B" + "'", str28, "(CBBBD)B");
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter15 = classEmitter12.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@22a9b67b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor2);
        java.lang.Object[] objArray6 = null;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] {};
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray9);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(7, 96, objArray6, 1, (java.lang.Object[]) typeArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "()D" + "'", str10, "()D");
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(112, "(CBBBD)Lorg/mockito/cglib/proxy/Enhancer;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(104, "Lg/mockito/cglib/proxy/Enhancer;", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSize();
        java.lang.String str7 = type5.getClassName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        int int12 = type11.getSize();
        java.lang.String str13 = type11.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type9, type10, type11, type14 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Enhancer;", type5, typeArray16);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.Object obj19 = null;
        boolean boolean20 = signature17.equals(obj19);
        org.mockito.asm.Type[] typeArray21 = signature17.getArgumentTypes();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 9);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] {};
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("double", type27, typeArray29);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray29);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray29);
        boolean boolean34 = signature17.equals((java.lang.Object) type22);
        org.mockito.asm.Label label35 = new org.mockito.asm.Label();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] {};
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray39);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("double", type37, typeArray39);
        label35.info = typeArray39;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter43 = classEmitter2.begin_method((int) (short) 10, signature17, typeArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@301f4ca1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "byte" + "'", str7, "byte");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "byte" + "'", str13, "byte");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "double" + "'", str15, "double");
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(CBBBD)B" + "'", str18, "(CBBBD)B");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "()D" + "'", str30, "()D");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "()B" + "'", str32, "()B");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "()F" + "'", str33, "()F");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "()D" + "'", str40, "()D");
    }
}
