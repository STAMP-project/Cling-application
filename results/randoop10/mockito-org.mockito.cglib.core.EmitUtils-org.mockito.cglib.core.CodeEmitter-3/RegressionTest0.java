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
        int int0 = org.mockito.cglib.core.CodeEmitter.USHR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 124 + "'", int0 == 124);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
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
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int0 = org.mockito.cglib.core.CodeEmitter.NEG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 116 + "'", int0 == 116);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = org.mockito.cglib.core.CodeEmitter.SUB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
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
        int int0 = org.mockito.asm.Type.BOOLEAN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        int int0 = org.mockito.asm.Type.OBJECT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        int int0 = org.mockito.asm.Type.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label5 = null;
        org.mockito.asm.Label label6 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLocalVariable("", "", "hi!", label5, label6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTypeInsn((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLdcInsn((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitInsn(7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label4 = null;
        org.mockito.asm.Label label5 = null;
        org.mockito.asm.Label[] labelArray6 = new org.mockito.asm.Label[] { label5 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTableSwitchInsn((int) (short) 1, 10, label4, labelArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labelArray6);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLdcInsn((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIntInsn(10, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "" };
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.add_properties(classEmitter0, strArray4, typeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(typeArray5);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitInsn(124);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor4 = methodAdapter1.visitAnnotation("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.load_class_this(codeEmitter0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTypeInsn((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        int int0 = org.mockito.cglib.core.CodeEmitter.XOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 130 + "'", int0 == 130);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        java.util.List list1 = null;
        org.mockito.cglib.core.ObjectSwitchCallback objectSwitchCallback2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.constructor_switch(codeEmitter0, list1, objectSwitchCallback2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        int int0 = org.mockito.cglib.core.CodeEmitter.ADD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 96 + "'", int0 == 96);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters5 = org.mockito.cglib.core.EmitUtils.DEFAULT_DELIMITERS;
        org.mockito.asm.MethodVisitor methodVisitor8 = null;
        org.mockito.asm.MethodAdapter methodAdapter9 = new org.mockito.asm.MethodAdapter(methodVisitor8);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 100, arrayDelimiters5, 'a', 100.0d, methodAdapter9 };
        java.lang.Object[] objArray17 = new java.lang.Object[] { (byte) 1, (byte) 1, (byte) 1, 130, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFrame((int) '#', (int) (short) 10, objArray10, (int) (byte) -1, objArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDelimiters5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[1, 1, 1, 130, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[1, 1, 1, 130, -1.0]");
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = null;
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.factory_method(classEmitter0, signature3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label5 = null;
        org.mockito.asm.Label label6 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLocalVariable("", "hi!", "", label5, label6, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.mockito.cglib.core.ObjectSwitchCallback objectSwitchCallback3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.string_switch(codeEmitter0, strArray1, 0, objectSwitchCallback3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.add_property(classEmitter0, "hi!", type2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitJumpInsn((int) (byte) -1, label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        int int0 = org.mockito.cglib.core.CodeEmitter.REM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 112 + "'", int0 == 112);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        int int0 = org.mockito.asm.Type.ARRAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitInsn(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type6, type8, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type2, typeArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.load_class(codeEmitter0, type2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "F" + "'", str4, "F");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.null_constructor(classEmitter0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitJumpInsn((int) (short) 0, label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type6, type8, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type2, typeArray11);
        org.mockito.cglib.core.ProcessArrayCallback processArrayCallback13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.process_arrays(codeEmitter0, type2, processArrayCallback13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type B is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "F" + "'", str4, "F");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        int int0 = org.mockito.asm.Type.CHAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        int int0 = org.mockito.cglib.core.CodeEmitter.NE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 154 + "'", int0 == 154);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        int int0 = org.mockito.cglib.core.CodeEmitter.AND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 126 + "'", int0 == 126);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
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
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLabel(label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Label label3 = null;
        org.mockito.cglib.core.Customizer customizer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.not_equals(codeEmitter0, type1, label3, customizer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "F" + "'", str2, "F");
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
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
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.cglib.core.MethodInfo methodInfo1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.load_method(codeEmitter0, methodInfo1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = null;
        org.mockito.asm.Label label4 = null;
        org.mockito.asm.Label label5 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTryCatchBlock(label3, label4, label5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitVarInsn(7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.MethodInfo methodInfo1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter2 = org.mockito.cglib.core.EmitUtils.begin_method(classEmitter0, methodInfo1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str5 = signature4.getName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter18 = classEmitter0.begin_method((int) (short) 1, signature4, typeArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1c995a28");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "F" + "'", str12, "F");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "F" + "'", str14, "F");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.factory_method(classEmitter0, signature3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@29238060");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitAttribute(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter1.visitParameterAnnotation(10, "C", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters2 = null;
        org.mockito.cglib.core.Customizer customizer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.append_string(codeEmitter0, type1, arrayDelimiters2, customizer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIntInsn(100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFieldInsn(9, "", "C", "F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.push_array(codeEmitter0, objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label5 = null;
        org.mockito.asm.Label label6 = null;
        org.mockito.asm.Label[] labelArray7 = new org.mockito.asm.Label[] { label6 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTableSwitchInsn(130, 154, label5, labelArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labelArray7);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.MethodInfo methodInfo2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter3 = org.mockito.cglib.core.EmitUtils.begin_method(classEmitter0, methodInfo2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        int int0 = org.mockito.asm.Type.DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitInsn((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitInsn(37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        int int0 = org.mockito.asm.Type.VOID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMethodInsn(130, "", "hi!", "F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
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
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTypeInsn((int) (short) 100, "C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
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
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.mockito.cglib.core.Block block0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSort();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.wrap_throwable(block0, type1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        int int0 = org.mockito.cglib.core.CodeEmitter.EQ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 153 + "'", int0 == 153);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label4 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitJumpInsn(130, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.null_constructor(classEmitter0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6f510c88");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
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
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitInsn((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type6, type8, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type2, typeArray11);
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        org.mockito.cglib.core.Customizer customizer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.not_equals(codeEmitter0, type2, label13, customizer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "F" + "'", str4, "F");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "C");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
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
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTryCatchBlock(label2, label3, label4, "(FCFFB)B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter1.visitParameterAnnotation((int) 'a', "C", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        int int0 = org.mockito.cglib.core.CodeEmitter.MUL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 104 + "'", int0 == 104);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor2 = methodAdapter1.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitVarInsn(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type7, type9, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type6, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type4, typeArray15);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLdcInsn((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "F" + "'", str11, "F");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "F" + "'", str13, "F");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray14);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str26 = type25.getDescriptor();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type20, type22, type23, type25, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("", type19, typeArray28);
        org.mockito.asm.Type[] typeArray30 = signature29.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("(FCFFB)F", type1, typeArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(FCFFB)F' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "F" + "'", str12, "F");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(FCFFB)F" + "'", str17, "(FCFFB)F");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "F" + "'", str21, "F");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "F" + "'", str24, "F");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "F" + "'", str26, "F");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray30);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        label3.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLabel(label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter1.visitAnnotation("F", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLocalVariable("(FCFFB)S", "(FF)B", "(FCFFB)S", label6, label7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMethodInsn((int) (short) -1, "C", "(FCFFB)S", "(FCFFB)F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0, (byte) -1, "(FCFFB)S" };
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        int int17 = type14.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type11, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray18);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame((int) (short) 100, (int) ' ', objArray8, 10, (java.lang.Object[]) typeArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, -1, (FCFFB)S]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, -1, (FCFFB)S]");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "F" + "'", str15, "F");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 37 + "'", int17 == 37);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(FF)B" + "'", str19, "(FF)B");
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "(FF)B", "(FCFFB)F", "C", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter0.visitMethod((int) (byte) 0, "(FF)B", "hi!", "(FF)B", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(FF)B' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
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
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.load_class(codeEmitter0, type1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
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
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitVarInsn((int) '#', 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor3 = methodAdapter1.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = methodAdapter1.visitParameterAnnotation((int) '#', "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitInsn(116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type9, type11, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type8, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type6, typeArray17);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray17);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type24, type26, type27, type29, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type23, typeArray32);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFrame((int) (short) 100, 130, (java.lang.Object[]) typeArray17, 154, (java.lang.Object[]) typeArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "F" + "'", str13, "F");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "F" + "'", str15, "F");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(FCFFB)F" + "'", str20, "(FCFFB)F");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "F" + "'", str25, "F");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "F" + "'", str28, "F");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "F" + "'", str30, "F");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray32);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.cglib.core.Block block1 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.wrap_undeclared_throwable(codeEmitter0, block1, typeArray14, type17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "F" + "'", str12, "F");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type17);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        java.lang.String[] strArray28 = new java.lang.String[] { "C", "hi!", "(FCFFB)S", "(FF)B", "(FCFFB)S", "(FCFFB)B" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor29 = classEmitter15.visitMethod((int) (byte) 1, "(FF)B", "(FCFFB)S", "(FCFFB)F", strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(FF)B' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "(FCFFB)F", "" };
        org.mockito.cglib.core.ObjectSwitchCallback objectSwitchCallback6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.string_switch(codeEmitter0, strArray4, 126, objectSwitchCallback6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown switch style 126");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BYTE_TYPE;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.add_property(classEmitter18, "(FCFFB)F", type22, "(FCFFB)B");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'get(FCFFB)F' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type22);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "(FCFFB)B", "(FCFFB)B" };
        org.mockito.cglib.core.ObjectSwitchCallback objectSwitchCallback6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.string_switch(codeEmitter0, strArray4, (int) 'a', objectSwitchCallback6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown switch style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        int int0 = org.mockito.cglib.core.CodeEmitter.OR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMaxs(126, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        int int0 = org.mockito.cglib.core.CodeEmitter.LE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 158 + "'", int0 == 158);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIincInsn(8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        java.lang.String[] strArray6 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor7 = classEmitter0.visitMethod(0, "(FCFFB)F", "F", "F", strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(FCFFB)F' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        java.lang.String[] strArray31 = new java.lang.String[] { "(FCFFB)F", "(FCFFB)S", "(FCFFB)F", "hi!", "(FCFFB)F" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor32 = classEmitter21.visitMethod((int) '#', "(FCFFB)F", "", "", strArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(FCFFB)F' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = methodAdapter2.visitParameterAnnotation((int) (byte) 0, "(FF)B", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter18.visitAttribute(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        int int0 = org.mockito.asm.Type.FLOAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter15.visitAttribute(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label2.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLabel(label2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Attribute attribute22 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter15.visitAttribute(attribute22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type24, type26, type27, type29, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type23, typeArray32);
        org.mockito.asm.Type[] typeArray34 = signature33.getArgumentTypes();
        java.lang.String str35 = signature33.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean39 = type37.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str41 = type40.getDescriptor();
        int int43 = type40.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type37, type40 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray44);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter46 = classEmitter15.begin_method((int) (short) 10, signature33, typeArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@d1848e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "F" + "'", str25, "F");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "F" + "'", str28, "F");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "F" + "'", str30, "F");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(FCFFB)B" + "'", str35, "(FCFFB)B");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "F" + "'", str41, "F");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 37 + "'", int43 == 37);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(FF)B" + "'", str45, "(FF)B");
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        int int0 = org.mockito.asm.Type.BYTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type7, type8, type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type4, typeArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type2, typeArray13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        boolean boolean18 = type2.equals((java.lang.Object) classEmitter16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type21, type23, type24, type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type20, typeArray29);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("(FCFFB)F", type2, typeArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(FCFFB)F' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "F" + "'", str6, "F");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "F" + "'", str11, "F");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "F" + "'", str22, "F");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "F" + "'", str25, "F");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "F" + "'", str27, "F");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
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
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = methodAdapter2.visitParameterAnnotation(6, "(FCFFB)B", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@690e9c74");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitVarInsn(130, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.mockito.cglib.core.Block block0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type7, type8, type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type4, typeArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type2, typeArray13);
        java.lang.String str16 = type2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.wrap_throwable(block0, type2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "F" + "'", str6, "F");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "F" + "'", str11, "F");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "S" + "'", str16, "S");
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitIincInsn((int) '4', 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        int int0 = org.mockito.cglib.core.CodeEmitter.LT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 155 + "'", int0 == 155);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label4 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLineNumber(0, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFieldInsn(124, "(FCFFB)F", "F", "(FCFFB)S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Attribute attribute22 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter21.visitAttribute(attribute22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitIincInsn(155, 37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.null_constructor(classEmitter15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@47d7a32e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("C", "F");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.push_object(codeEmitter0, (java.lang.Object) "F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        label3.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLabel(label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFieldInsn((int) (byte) 100, "(FCFFB)F", "C", "C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitVarInsn(37, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(3, type3);
        org.mockito.cglib.core.ProcessArrayCallback processArrayCallback18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.process_array(codeEmitter0, type3, processArrayCallback18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type S is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "F" + "'", str12, "F");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        int[] intArray9 = new int[] { (short) 1, 37, 100, (byte) 1, 96 };
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label12.info = 0L;
        org.mockito.asm.Label[] labelArray15 = new org.mockito.asm.Label[] { label10, label11, label12 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLookupSwitchInsn(label3, intArray9, labelArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 37, 100, 1, 96]");
        org.junit.Assert.assertNotNull(labelArray15);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        label3.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLabel(label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMaxs((int) (byte) 100, 124);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.null_constructor(classEmitter21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4e1711a3");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMethodInsn((int) 'a', "", "(FCFFB)F", "(FCFFB)F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "S", "(FF)B", "(FF)B", "hi!", "C" };
        org.mockito.cglib.core.ObjectSwitchCallback objectSwitchCallback8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.string_switch(codeEmitter0, strArray6, (int) (short) 0, objectSwitchCallback8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMethodInsn((int) '4', "(FCFFB)B", "C", "(FCFFB)B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        java.lang.String[] strArray28 = new java.lang.String[] { "(FCFFB)B", "(FCFFB)F", "(FCFFB)B", "(FCFFB)S", "", "(FF)B" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor29 = classEmitter15.visitMethod(154, "F", "hi!", "(FCFFB)B", strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@71a30b92");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter22 = classEmitter21.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@47f99a2b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.mockito.cglib.core.Block block0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type7, type8, type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type4, typeArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type2, typeArray13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        boolean boolean18 = type2.equals((java.lang.Object) classEmitter16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.wrap_throwable(block0, type2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "F" + "'", str6, "F");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "F" + "'", str11, "F");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        int int0 = org.mockito.asm.Type.INT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.cglib.core.ProcessArrayCallback processArrayCallback3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.process_array(codeEmitter0, type1, processArrayCallback3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type F is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "F" + "'", str2, "F");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLdcInsn((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("F");
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters3 = org.mockito.cglib.core.EmitUtils.DEFAULT_DELIMITERS;
        org.mockito.cglib.core.Customizer customizer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.append_string(codeEmitter0, type2, arrayDelimiters3, customizer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(arrayDelimiters3);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray14);
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        label18.info = 0L;
        org.mockito.cglib.core.Customizer customizer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.not_equals(codeEmitter0, type1, label18, customizer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "F" + "'", str12, "F");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(FCFFB)F" + "'", str17, "(FCFFB)F");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type29, typeArray38);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type27, typeArray38);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str42 = type41.toString();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str46 = type45.getDescriptor();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str49 = type48.getDescriptor();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str51 = type50.getDescriptor();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type45, type47, type48, type50, type52 };
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("", type44, typeArray53);
        org.mockito.asm.Type[] typeArray55 = signature54.getArgumentTypes();
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray55);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter57 = classEmitter22.begin_method(5, signature40, typeArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@64ad00be");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "F" + "'", str31, "F");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "F" + "'", str34, "F");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "F" + "'", str36, "F");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "C" + "'", str42, "C");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "F" + "'", str46, "F");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "F" + "'", str49, "F");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "F" + "'", str51, "F");
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "(FCFFB)C" + "'", str56, "(FCFFB)C");
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        int int8 = type5.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type2, type5 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.push_array(codeEmitter0, (java.lang.Object[]) typeArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "F" + "'", str6, "F");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37 + "'", int8 == 37);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(FF)B" + "'", str10, "(FF)B");
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMultiANewArrayInsn("S", 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIincInsn(126, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters2 = org.mockito.cglib.core.EmitUtils.DEFAULT_DELIMITERS;
        org.mockito.cglib.core.Customizer customizer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.append_string(codeEmitter0, type1, arrayDelimiters2, customizer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(arrayDelimiters2);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
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
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.MethodInfo methodInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter22 = org.mockito.cglib.core.EmitUtils.begin_method(classEmitter15, methodInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitInsn(153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        label26.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor29 = classEmitter15.visitField(0, "S", "", "F", (java.lang.Object) label26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.cglib.core.Block block1 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        java.lang.String str17 = signature16.getDescriptor();
        org.mockito.asm.Type[] typeArray18 = signature16.getArgumentTypes();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.wrap_undeclared_throwable(codeEmitter0, block1, typeArray18, type19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "F" + "'", str12, "F");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(FCFFB)S" + "'", str17, "(FCFFB)S");
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "F" + "'", str20, "F");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.null_constructor(classEmitter0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@58a5d54");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTypeInsn((int) '4', "(FCFFB)C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray11 = new java.lang.String[] { "(SCFFF)B", "(FCFFB)B", "(FCFFB)C", "C", "(FCFFB)B" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter0.visitMethod((int) ' ', "(FCFFB)S", "(SCFFF)B", "F", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(FCFFB)S' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.load_class(codeEmitter0, type1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor3 = methodAdapter2.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "(FCFFB)C", "(FF)B" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor29 = classEmitter15.visitMethod((int) (short) 10, "hi!", "(FF)B", "hi!", strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@310e9a62");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIntInsn(6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        int int0 = org.mockito.asm.Type.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitInsn(124);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMultiANewArrayInsn("(FCFFB)S", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLocalVariable("(FCFFB)B", "C", "(FCFFB)B", label5, label6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.push_object(codeEmitter0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(FCFFB)B");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber(128, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str3 = signature2.getName();
        boolean boolean5 = signature2.equals((java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        label3.info = 0L;
        int[] intArray6 = null;
        org.mockito.asm.Label[] labelArray7 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLookupSwitchInsn(label3, intArray6, labelArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labelArray7);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type7, type8, type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type4, typeArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type2, typeArray13);
        org.mockito.cglib.core.Customizer customizer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.hash_code(codeEmitter0, type2, (int) (short) 0, customizer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "F" + "'", str6, "F");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "F" + "'", str11, "F");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("C", "F");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor11 = classEmitter1.visitField(158, "(FCFFB)C", "(FCFFB)S", "hi!", (java.lang.Object) "C");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        label3.info = 0L;
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTryCatchBlock(label2, label3, label6, "F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLdcInsn((java.lang.Object) "(FCFFB)B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMethodInsn((int) (short) 100, "(FCFFB)C", "(SCFFF)B", "(FCFFB)C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTryCatchBlock(label3, label4, label5, "(FCFFB)B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.MethodVisitor methodVisitor26 = null;
        org.mockito.asm.MethodAdapter methodAdapter27 = new org.mockito.asm.MethodAdapter(methodVisitor26);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor28 = classEmitter15.visitField((int) (short) 1, "S", "(FCFFB)B", "(FCFFB)S", (java.lang.Object) methodAdapter27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str25 = signature24.getName();
        boolean boolean27 = signature24.equals((java.lang.Object) (short) -1);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type32, type34, type35, type37, type39 };
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type31, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", type29, typeArray40);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter43 = classEmitter18.begin_method((int) (byte) 100, signature24, typeArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@344cba45");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "F" + "'", str33, "F");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "F" + "'", str36, "F");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "F" + "'", str38, "F");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(typeArray40);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str25 = signature24.getName();
        boolean boolean27 = signature24.equals((java.lang.Object) (short) -1);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type30, type32, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type29, typeArray38);
        org.mockito.asm.Type[] typeArray40 = signature39.getArgumentTypes();
        java.lang.String str41 = signature39.getDescriptor();
        boolean boolean43 = signature39.equals((java.lang.Object) (byte) 10);
        org.mockito.asm.Type[] typeArray44 = signature39.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter45 = classEmitter15.begin_method((int) (short) 10, signature24, typeArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3953336c");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "F" + "'", str31, "F");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "F" + "'", str34, "F");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "F" + "'", str36, "F");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(FCFFB)B" + "'", str41, "(FCFFB)B");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(typeArray44);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type6, type8, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type2, typeArray11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type20, type21, type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type17, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type15, typeArray26);
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(3, type15);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str31 = type30.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type34, type36, type37, type39, type41 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("", type33, typeArray42);
        org.mockito.asm.Type[] typeArray44 = signature43.getArgumentTypes();
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        java.lang.String str48 = type46.getDescriptor();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean51 = type49.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str53 = type52.getDescriptor();
        int int55 = type52.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type15, type30, type46, type49, type52 };
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray56);
        org.mockito.cglib.core.ProcessArrayCallback processArrayCallback58 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.process_array(codeEmitter0, type2, processArrayCallback58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type B is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "F" + "'", str4, "F");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "F" + "'", str19, "F");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "F" + "'", str22, "F");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "F" + "'", str24, "F");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "C" + "'", str31, "C");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "F" + "'", str35, "F");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "F" + "'", str38, "F");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "F" + "'", str40, "F");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(FCFFB)C" + "'", str45, "(FCFFB)C");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "F" + "'", str47, "F");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "F" + "'", str48, "F");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "F" + "'", str53, "F");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 37 + "'", int55 == 37);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(SCFFF)B" + "'", str57, "(SCFFF)B");
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIincInsn((-1), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIincInsn((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = methodAdapter2.visitParameterAnnotation(8, "(FCFFB)C", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        java.lang.String[] strArray30 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter21.visit(124, (int) (short) 1, "(FCFFB)S", "(FF)B", "(FF)B", strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo23);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMultiANewArrayInsn("C", 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        int[] intArray7 = new int[] { 116, '#', 130 };
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 0L;
        java.lang.String str12 = label9.toString();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        label13.info = 0L;
        java.lang.String str16 = label13.toString();
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        label17.info = 0L;
        java.lang.String str20 = label17.toString();
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        label21.info = 0L;
        java.lang.String str24 = label21.toString();
        org.mockito.asm.Label[] labelArray25 = new org.mockito.asm.Label[] { label8, label9, label13, label17, label21 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLookupSwitchInsn(label3, intArray7, labelArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[116, 35, 130]");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1744034878" + "'", str12, "L1744034878");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L225374143" + "'", str16, "L225374143");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L549237739" + "'", str20, "L549237739");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L1432174905" + "'", str24, "L1432174905");
        org.junit.Assert.assertNotNull(labelArray25);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        label3.info = 0L;
        java.lang.String str6 = label3.toString();
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTryCatchBlock(label3, label7, label8, "(FCFFB)F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1083402199" + "'", str6, "L1083402199");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        label3.info = 0L;
        java.lang.String str6 = label3.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLabel(label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1240770764" + "'", str6, "L1240770764");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMethodInsn((int) (byte) 100, "(FCFFB)B", "(FCFFB)C", "F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type7, type9, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type6, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type4, typeArray15);
        java.lang.String str18 = type4.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLdcInsn((java.lang.Object) str18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "F" + "'", str11, "F");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "F" + "'", str13, "F");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "S" + "'", str18, "S");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 0L;
        java.lang.Object obj7 = new java.lang.Object();
        label4.info = obj7;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        org.mockito.asm.Label[] labelArray10 = new org.mockito.asm.Label[] { label9 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTableSwitchInsn(8, (int) '4', label4, labelArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labelArray10);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitInsn((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = null;
        org.mockito.cglib.core.MethodInfo methodInfo1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter2 = org.mockito.cglib.core.EmitUtils.begin_method(classEmitter0, methodInfo1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type6, type8, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type2, typeArray11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type20, type21, type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type17, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type15, typeArray26);
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(3, type15);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str31 = type30.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type34, type36, type37, type39, type41 };
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("", type33, typeArray42);
        org.mockito.asm.Type[] typeArray44 = signature43.getArgumentTypes();
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        java.lang.String str48 = type46.getDescriptor();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean51 = type49.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str53 = type52.getDescriptor();
        int int55 = type52.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type15, type30, type46, type49, type52 };
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray56);
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters58 = null;
        org.mockito.cglib.core.Customizer customizer59 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.append_string(codeEmitter0, type2, arrayDelimiters58, customizer59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "F" + "'", str4, "F");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "F" + "'", str19, "F");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "F" + "'", str22, "F");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "F" + "'", str24, "F");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "C" + "'", str31, "C");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "F" + "'", str35, "F");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "F" + "'", str38, "F");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "F" + "'", str40, "F");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(FCFFB)C" + "'", str45, "(FCFFB)C");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "F" + "'", str47, "F");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "F" + "'", str48, "F");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "F" + "'", str53, "F");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 37 + "'", int55 == 37);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(SCFFF)B" + "'", str57, "(SCFFF)B");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.cglib.core.Block block1 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str16 = type15.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.wrap_undeclared_throwable(codeEmitter0, block1, typeArray14, type15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "C" + "'", str16, "C");
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 0L;
        java.lang.Object obj3 = new java.lang.Object();
        label0.info = obj3;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.getClassName();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        org.mockito.cglib.core.Customizer customizer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.not_equals(codeEmitter0, type1, label5, customizer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "F" + "'", str2, "F");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "F" + "'", str3, "F");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "float" + "'", str4, "float");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type9, type11, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type8, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type6, typeArray17);
        java.lang.String str20 = signature19.getDescriptor();
        org.mockito.asm.Type[] typeArray21 = signature19.getArgumentTypes();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str26 = type25.getDescriptor();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str29 = type28.getDescriptor();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type25, type27, type28, type30, type32 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("", type24, typeArray33);
        org.mockito.asm.Type[] typeArray35 = signature34.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame(130, 104, (java.lang.Object[]) typeArray21, (-1), (java.lang.Object[]) typeArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "F" + "'", str13, "F");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "F" + "'", str15, "F");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(FCFFB)S" + "'", str20, "(FCFFB)S");
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "F" + "'", str26, "F");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "F" + "'", str29, "F");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "F" + "'", str31, "F");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray35);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 0L;
        java.lang.Object obj9 = new java.lang.Object();
        label6.info = obj9;
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        label11.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLocalVariable("C", "(FCFFB)C", "float", label6, label11, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 10L);
        org.mockito.cglib.core.Customizer customizer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.hash_code(codeEmitter0, type1, 128, customizer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter22 = classEmitter15.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@361a295");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLdcInsn((java.lang.Object) 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIntInsn(3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 0L;
        java.lang.String str7 = label4.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber(126, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1567675711" + "'", str7, "L1567675711");
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitVarInsn(124, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber(6, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(100, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        java.lang.Object[] objArray7 = null;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type17, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type14, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type12, typeArray23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        boolean boolean28 = type12.equals((java.lang.Object) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type36, type38, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type35, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("", type33, typeArray44);
        java.lang.String str47 = signature46.getDescriptor();
        org.mockito.asm.Type[] typeArray48 = signature46.getArgumentTypes();
        org.mockito.asm.Label label50 = new org.mockito.asm.Label();
        java.lang.Object[] objArray51 = new java.lang.Object[] { (byte) -1, (-1.0f), classEmitter29, signature46, 9, label50 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFrame((int) (short) 1, 0, objArray7, 5, objArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "F" + "'", str16, "F");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "F" + "'", str19, "F");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "F" + "'", str21, "F");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "F" + "'", str37, "F");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "F" + "'", str40, "F");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "F" + "'", str42, "F");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(FCFFB)S" + "'", str47, "(FCFFB)S");
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSort();
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters3 = org.mockito.cglib.core.EmitUtils.DEFAULT_DELIMITERS;
        org.mockito.cglib.core.Customizer customizer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.append_string(codeEmitter0, type1, arrayDelimiters3, customizer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(arrayDelimiters3);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMultiANewArrayInsn("F", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 0L;
        int[] intArray10 = new int[] { 3, 116 };
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        label11.info = 0L;
        java.lang.String str14 = label11.toString();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        label17.info = 0L;
        java.lang.Object obj20 = new java.lang.Object();
        label17.info = obj20;
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        org.mockito.asm.Label[] labelArray24 = new org.mockito.asm.Label[] { label11, label15, label16, label17, label22, label23 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLookupSwitchInsn(label5, intArray10, labelArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[3, 116]");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L849469319" + "'", str14, "L849469319");
        org.junit.Assert.assertNotNull(labelArray24);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        int int24 = type23.getSort();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.asm.Type[] typeArray39 = signature38.getArgumentTypes();
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray39);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray39);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.add_property(classEmitter15, "L373083987", type23, "L373083987");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4bae3afb");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "C" + "'", str26, "C");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "F" + "'", str30, "F");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "F" + "'", str33, "F");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "F" + "'", str35, "F");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(FCFFB)C" + "'", str40, "(FCFFB)C");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(FCFFB)B" + "'", str41, "(FCFFB)B");
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 0L;
        java.lang.Object obj11 = new java.lang.Object();
        label8.info = obj11;
        org.mockito.asm.Label label13 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLocalVariable("(FCFFB)B", "(FCFFB)B", "(FCFFB)C", label8, label13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMaxs((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTypeInsn(3, "S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 0L;
        java.lang.Object obj8 = new java.lang.Object();
        label5.info = obj8;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] { label10 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTableSwitchInsn(130, 3, label5, labelArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labelArray11);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitIincInsn(3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 0L;
        java.lang.String str9 = label6.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        label10.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLocalVariable("", "(FF)B", "L373083987", label6, label10, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L755350096" + "'", str9, "L755350096");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber((int) (byte) 100, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "(FCFFB)C", "(SCFFF)B", "(FCFFB)S" };
        org.mockito.cglib.core.ObjectSwitchCallback objectSwitchCallback6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.string_switch(codeEmitter0, strArray4, (int) (byte) 10, objectSwitchCallback6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown switch style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        java.util.List list1 = null;
        org.mockito.cglib.core.ObjectSwitchCallback objectSwitchCallback2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.method_switch(codeEmitter0, list1, objectSwitchCallback2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.MethodInfo methodInfo4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = org.mockito.cglib.core.EmitUtils.begin_method(classEmitter0, methodInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn((int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "float", "S" };
        org.mockito.cglib.core.ObjectSwitchCallback objectSwitchCallback5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.string_switch(codeEmitter0, strArray3, 37, objectSwitchCallback5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown switch style 37");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.push_object(codeEmitter0, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown type: class java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn(5, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.asm.MethodAdapter methodAdapter4 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) ' ', "float", (org.mockito.asm.MethodVisitor) methodAdapter4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.cglib.core.Block block1 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type21, type23, type24, type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type20, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type18, typeArray29);
        java.lang.String str32 = type18.toString();
        int int33 = type18.getSize();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.wrap_undeclared_throwable(codeEmitter0, block1, typeArray14, type18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "F" + "'", str12, "F");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "F" + "'", str22, "F");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "F" + "'", str25, "F");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "F" + "'", str27, "F");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "S" + "'", str32, "S");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 0L;
        java.lang.String str9 = label6.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        label10.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLocalVariable("(FCFFB)F", "(FCFFB)S", "float", label6, label10, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L65464745" + "'", str9, "L65464745");
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        int[] intArray7 = new int[] { 5, 112, 3 };
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 0L;
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        label11.info = 0L;
        java.lang.String str14 = label11.toString();
        org.mockito.asm.Label[] labelArray15 = new org.mockito.asm.Label[] { label8, label11 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLookupSwitchInsn(label3, intArray7, labelArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[5, 112, 3]");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L2106847072" + "'", str14, "L2106847072");
        org.junit.Assert.assertNotNull(labelArray15);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 0L;
        java.lang.String str8 = label5.toString();
        int[] intArray13 = new int[] { (short) 100, 104, (short) 10, 126 };
        org.mockito.asm.Label[] labelArray14 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLookupSwitchInsn(label5, intArray13, labelArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1318547129" + "'", str8, "L1318547129");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 104, 10, 126]");
        org.junit.Assert.assertNotNull(labelArray14);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        int int0 = org.mockito.cglib.core.CodeEmitter.GT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 157 + "'", int0 == 157);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 0L;
        java.lang.Object obj8 = new java.lang.Object();
        label5.info = obj8;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "L373083987", "(SCFFF)B", "C", "hi!" };
        org.mockito.cglib.core.ObjectSwitchCallback objectSwitchCallback7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.string_switch(codeEmitter0, strArray5, (int) '#', objectSwitchCallback7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown switch style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTypeInsn(130, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitVarInsn((int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters5 = new org.mockito.cglib.core.EmitUtils.ArrayDelimiters("(FCFFB)S", "S", "(FCFFB)C");
        org.mockito.cglib.core.Customizer customizer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.append_string(codeEmitter0, type1, arrayDelimiters5, customizer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 0L;
        java.lang.Object obj12 = new java.lang.Object();
        label9.info = obj12;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLocalVariable("float", "float", "(SCFFF)B", label8, label9, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 153");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitTypeInsn((int) 'a', "float");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type9, type11, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type8, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type6, typeArray17);
        org.mockito.asm.Type[] typeArray20 = signature19.getArgumentTypes();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type26, type28, type29, type31, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("", type25, typeArray34);
        org.mockito.asm.Type[] typeArray36 = signature35.getArgumentTypes();
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray36);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame(7, 5, (java.lang.Object[]) typeArray20, (int) (short) 100, (java.lang.Object[]) typeArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "F" + "'", str13, "F");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "F" + "'", str15, "F");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "C" + "'", str23, "C");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "F" + "'", str27, "F");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "F" + "'", str30, "F");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "F" + "'", str32, "F");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(FCFFB)C" + "'", str37, "(FCFFB)C");
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(112, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMaxs((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMethodInsn(155, "(FCFFB)F", "", "float");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 0L;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] { label10 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTableSwitchInsn((int) (byte) -1, (int) (byte) 1, label7, labelArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labelArray11);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 0L;
        java.lang.Object obj11 = new java.lang.Object();
        label8.info = obj11;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        label13.info = 0L;
        java.lang.String str16 = label13.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLocalVariable("", "(FCFFB)C", "C", label8, label13, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1232725259" + "'", str16, "L1232725259");
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter15.visitAttribute(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        int int0 = org.mockito.cglib.core.CodeEmitter.DIV;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 108 + "'", int0 == 108);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type6, type8, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type2, typeArray11);
        int int14 = type2.getOpcode((int) (short) -1);
        int int15 = type2.getSort();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        label16.info = 0L;
        java.lang.Object obj19 = new java.lang.Object();
        label16.info = obj19;
        org.mockito.cglib.core.Customizer customizer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.not_equals(codeEmitter0, type2, label16, customizer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "F" + "'", str4, "F");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter0.getClassInfo();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "(FCFFB)C", "I", "L373083987", "float" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor17 = classEmitter0.visitMethod(3, "I", "F", "(FCFFB)C", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3553db57");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitVarInsn(8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        java.lang.String str17 = type3.toString();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(158, type3);
        org.mockito.asm.Type type19 = local18.getType();
        org.mockito.asm.Type type20 = local18.getType();
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters24 = new org.mockito.cglib.core.EmitUtils.ArrayDelimiters("(FCFFB)S", "S", "(FCFFB)C");
        org.mockito.cglib.core.Customizer customizer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.append_string(codeEmitter0, type20, arrayDelimiters24, customizer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "F" + "'", str12, "F");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "S" + "'", str17, "S");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitMethodInsn(0, "", "(FCFFB)C", "(FCFFB)C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.MethodInfo methodInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter23 = org.mockito.cglib.core.EmitUtils.begin_method(classEmitter15, methodInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo21);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIincInsn(126, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.cglib.core.Block block1 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.asm.Type[] typeArray16 = signature15.getArgumentTypes();
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray16);
        org.mockito.asm.Type type18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.wrap_undeclared_throwable(codeEmitter0, block1, typeArray16, type18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "C" + "'", str3, "C");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "F" + "'", str12, "F");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(FCFFB)C" + "'", str17, "(FCFFB)C");
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFieldInsn(154, "(FCFFB)C", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor3 = methodAdapter2.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitIincInsn((int) (short) 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = methodAdapter1.visitAnnotation("F", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 0L;
        java.lang.String str9 = label6.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(1, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L415900658" + "'", str9, "L415900658");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn(155, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", "hi!");
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str29 = type28.getDescriptor();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type28, type30, type31, type33, type35 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", type27, typeArray36);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str44 = type43.getDescriptor();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str49 = type48.getDescriptor();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type43, type45, type46, type48, type50 };
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("", type42, typeArray51);
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("", type40, typeArray51);
        org.mockito.cglib.core.Local local54 = new org.mockito.cglib.core.Local(3, type40);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str56 = type55.toString();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str60 = type59.getDescriptor();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str63 = type62.getDescriptor();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str65 = type64.getDescriptor();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] { type59, type61, type62, type64, type66 };
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("", type58, typeArray67);
        org.mockito.asm.Type[] typeArray69 = signature68.getArgumentTypes();
        java.lang.String str70 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray69);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str72 = type71.getDescriptor();
        java.lang.String str73 = type71.getDescriptor();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean76 = type74.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type77 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str78 = type77.getDescriptor();
        int int80 = type77.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray81 = new org.mockito.asm.Type[] { type40, type55, type71, type74, type77 };
        java.lang.String str82 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray81);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter83 = classEmitter15.begin_method(126, signature25, typeArray81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4b808ebf");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo21);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "F" + "'", str29, "F");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "F" + "'", str32, "F");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "F" + "'", str34, "F");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "F" + "'", str44, "F");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "F" + "'", str47, "F");
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "F" + "'", str49, "F");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "C" + "'", str56, "C");
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "F" + "'", str60, "F");
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "F" + "'", str63, "F");
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "F" + "'", str65, "F");
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "(FCFFB)C" + "'", str70, "(FCFFB)C");
        org.junit.Assert.assertNotNull(type71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "F" + "'", str72, "F");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "F" + "'", str73, "F");
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "F" + "'", str78, "F");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 37 + "'", int80 == 37);
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "(SCFFF)B" + "'", str82, "(SCFFF)B");
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("(SCFFF)B");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.load_class(codeEmitter0, type2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type9, type11, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type8, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type6, typeArray17);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str26 = type25.getDescriptor();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str29 = type28.getDescriptor();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type25, type27, type28, type30, type32 };
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("", type24, typeArray33);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("", type22, typeArray33);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame(108, 116, (java.lang.Object[]) typeArray17, (int) (byte) 0, (java.lang.Object[]) typeArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "F" + "'", str13, "F");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "F" + "'", str15, "F");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "F" + "'", str26, "F");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "F" + "'", str29, "F");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "F" + "'", str31, "F");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 0L;
        java.lang.Object obj7 = new java.lang.Object();
        label4.info = obj7;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLineNumber(4, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn(128, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 0L;
        java.lang.Object obj3 = new java.lang.Object();
        label0.info = obj3;
        java.lang.Object obj5 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFieldInsn(130, "(FCFFB)S", "float", "(FCFFB)C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFieldInsn(116, "", "F", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor26 = classEmitter15.visitField(0, "(FCFFB)C", "float", "F", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 0L;
        java.lang.String str9 = label6.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(6, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1662436808" + "'", str9, "L1662436808");
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 0L;
        java.lang.Object obj7 = new java.lang.Object();
        label4.info = obj7;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 0L;
        java.lang.Object obj12 = new java.lang.Object();
        label9.info = obj12;
        java.lang.Object obj14 = label9.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTryCatchBlock(label3, label4, label9, "(FCFFB)F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        label3.info = 0L;
        java.lang.String str6 = label3.toString();
        int[] intArray13 = new int[] { (byte) 0, 155, 0, 3, 'a', 7 };
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        label14.info = 0L;
        java.lang.String str17 = label14.toString();
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        label18.info = 0L;
        java.lang.Object obj21 = new java.lang.Object();
        label18.info = obj21;
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        org.mockito.asm.Label label24 = new org.mockito.asm.Label();
        label24.info = 0L;
        java.lang.Object obj27 = new java.lang.Object();
        label24.info = obj27;
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        label29.info = 0L;
        java.lang.Object obj32 = new java.lang.Object();
        label29.info = obj32;
        org.mockito.asm.Label label34 = new org.mockito.asm.Label();
        label34.info = 0L;
        java.lang.String str37 = label34.toString();
        org.mockito.asm.Label[] labelArray38 = new org.mockito.asm.Label[] { label14, label18, label23, label24, label29, label34 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLookupSwitchInsn(label3, intArray13, labelArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L486797498" + "'", str6, "L486797498");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 155, 0, 3, 97, 7]");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L593537396" + "'", str17, "L593537396");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L1552842686" + "'", str37, "L1552842686");
        org.junit.Assert.assertNotNull(labelArray38);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
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
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.mockito.cglib.core.Block block0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type7, type8, type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type4, typeArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type2, typeArray13);
        java.lang.String str16 = type2.toString();
        int int17 = type2.getSize();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.wrap_throwable(block0, type2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "F" + "'", str6, "F");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "F" + "'", str11, "F");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "S" + "'", str16, "S");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(FF)B", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(FF)B' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 0L;
        java.lang.String str9 = label6.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        label10.info = 0L;
        java.lang.Object obj13 = new java.lang.Object();
        label10.info = obj13;
        java.lang.Object obj15 = label10.info;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLocalVariable("(FCFFB)S", "", "(SCFFF)B", label6, label10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L2058119317" + "'", str9, "L2058119317");
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        java.lang.String[] strArray1 = null;
        org.mockito.cglib.core.ObjectSwitchCallback objectSwitchCallback3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.string_switch(codeEmitter0, strArray1, (-1), objectSwitchCallback3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown switch style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        java.lang.String str17 = type3.toString();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(158, type3);
        org.mockito.cglib.core.ProcessArrayCallback processArrayCallback19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.process_arrays(codeEmitter0, type3, processArrayCallback19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type S is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "F" + "'", str12, "F");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "S" + "'", str17, "S");
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIntInsn((int) (short) 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(FF)B");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        int int4 = type1.getOpcode((int) '#');
        java.lang.String str5 = type1.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.load_class(codeEmitter0, type1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "F" + "'", str2, "F");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 37 + "'", int4 == 37);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.cglib.core.Block block1 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type7, type9, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type6, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type4, typeArray15);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.wrap_undeclared_throwable(codeEmitter0, block1, typeArray15, type19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "F" + "'", str11, "F");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "F" + "'", str13, "F");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(FCFFB)F" + "'", str18, "(FCFFB)F");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "I" + "'", str20, "I");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 0L;
        java.lang.Object obj9 = new java.lang.Object();
        label6.info = obj9;
        java.lang.Object obj11 = label6.info;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label12.info = 0L;
        java.lang.String str15 = label12.toString();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        label16.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label6, label12, label16, "(FCFFB)F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1040540271" + "'", str15, "L1040540271");
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 0L;
        java.lang.Object obj8 = new java.lang.Object();
        label5.info = obj8;
        java.lang.Object obj10 = label5.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = localVariablesSorter4.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type7, type9, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type6, typeArray15);
        org.mockito.asm.Type[] typeArray17 = signature16.getArgumentTypes();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type21, type23, type24, type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type20, typeArray29);
        org.mockito.asm.Type[] typeArray31 = signature30.getArgumentTypes();
        java.lang.String str32 = signature30.getDescriptor();
        boolean boolean34 = signature30.equals((java.lang.Object) (byte) 10);
        org.mockito.asm.Type[] typeArray35 = signature30.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitFrame((int) 'a', 0, (java.lang.Object[]) typeArray17, (int) (byte) 0, (java.lang.Object[]) typeArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "F" + "'", str11, "F");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "F" + "'", str13, "F");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "F" + "'", str22, "F");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "F" + "'", str25, "F");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "F" + "'", str27, "F");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(FCFFB)B" + "'", str32, "(FCFFB)B");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(typeArray35);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(157, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str29 = type28.getDescriptor();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type28, type30, type31, type33, type35 };
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", type27, typeArray36);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type25, typeArray36);
        java.lang.String str39 = type25.toString();
        org.mockito.cglib.core.Local local40 = new org.mockito.cglib.core.Local(158, type25);
        org.mockito.asm.Type type41 = local40.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.add_property(classEmitter21, "F", type41, "(FF)B");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@655e019e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "F" + "'", str29, "F");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "F" + "'", str32, "F");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "F" + "'", str34, "F");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "S" + "'", str39, "S");
        org.junit.Assert.assertNotNull(type41);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = methodAdapter3.visitParameterAnnotation((int) (short) 0, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSort();
        org.mockito.cglib.core.Customizer customizer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.hash_code(codeEmitter0, type1, (int) (byte) 100, customizer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFieldInsn(5, "float", "", "float");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        int int12 = type9.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type6, type9 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        int int18 = type15.getOpcode((int) '#');
        java.lang.String str19 = type15.toString();
        boolean boolean20 = type5.equals((java.lang.Object) str19);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLdcInsn((java.lang.Object) str19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37 + "'", int12 == 37);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(FF)B" + "'", str14, "(FF)B");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "F" + "'", str16, "F");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37 + "'", int18 == 37);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "F" + "'", str19, "F");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(0, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visit(9, 0, "(FCFFB)F", "C", "", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "(FCFFB)B", "I", "(FCFFB)S", "F", "(FCFFB)F" };
        org.mockito.cglib.core.ObjectSwitchCallback objectSwitchCallback8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.string_switch(codeEmitter0, strArray6, (int) (short) 100, objectSwitchCallback8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown switch style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str9 = signature8.toString();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("C", "F");
        boolean boolean13 = signature8.equals((java.lang.Object) signature12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type16, type18, type19, type21, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type15, typeArray24);
        org.mockito.asm.Type[] typeArray26 = signature25.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter27 = classEmitter0.begin_method(112, signature8, typeArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5b91f9cc");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "F" + "'", str17, "F");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "F" + "'", str20, "F");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "F" + "'", str22, "F");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray26);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 0L;
        java.lang.String str9 = label6.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        label10.info = 0L;
        java.lang.String str13 = label10.toString();
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        label14.info = 0L;
        java.lang.Object obj17 = new java.lang.Object();
        label14.info = obj17;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTryCatchBlock(label6, label10, label14, "float");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L897566033" + "'", str9, "L897566033");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L756647065" + "'", str13, "L756647065");
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMaxs(37, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(10, type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        int int11 = type8.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type5, type8 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("(SCFFF)B", type2, typeArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(SCFFF)B' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37 + "'", int11 == 37);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(FF)B" + "'", str13, "(FF)B");
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        java.lang.String[] strArray29 = new java.lang.String[] { "F", "L373083987", "(FCFFB)C", "F" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor30 = classEmitter15.visitMethod(124, "(FCFFB)S", "float", "float", strArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(FCFFB)S' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 0L;
        java.lang.Object obj10 = new java.lang.Object();
        label7.info = obj10;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLineNumber(112, label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.cglib.core.Block block1 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        java.lang.String str15 = signature13.getDescriptor();
        boolean boolean17 = signature13.equals((java.lang.Object) (byte) 10);
        org.mockito.asm.Type[] typeArray18 = signature13.getArgumentTypes();
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", "C");
        org.mockito.asm.Type type22 = signature21.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.wrap_undeclared_throwable(codeEmitter0, block1, typeArray18, type22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(FCFFB)B" + "'", str15, "(FCFFB)B");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type22);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter51 = classEmitter22.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3d6e3821");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "F" + "'", str30, "F");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "F" + "'", str33, "F");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "F" + "'", str35, "F");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(classInfo48);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L373083987");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMultiANewArrayInsn("", 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.null_constructor(classEmitter15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5e59e83b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFieldInsn((int) (byte) 10, "float", "(SCFFF)B", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
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
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTypeInsn(37, "(SCFFF)B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitAttribute(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = null;
        org.mockito.cglib.core.MethodInfo methodInfo1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter3 = org.mockito.cglib.core.EmitUtils.begin_method(classEmitter0, methodInfo1, 128);
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
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter4.visitParameterAnnotation((int) '4', "(FCFFB)S", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type3, type5, type6, type8, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type2, typeArray11);
        org.mockito.asm.Type[] typeArray13 = signature12.getArgumentTypes();
        java.lang.String str14 = signature12.getDescriptor();
        boolean boolean16 = signature12.equals((java.lang.Object) (byte) 10);
        org.mockito.asm.Type[] typeArray17 = signature12.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.factory_method(classEmitter0, signature12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "F" + "'", str4, "F");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(FCFFB)B" + "'", str14, "(FCFFB)B");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(typeArray17);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 0L;
        java.lang.Object obj8 = new java.lang.Object();
        label5.info = obj8;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@71791701");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label2 = null;
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        label3.info = 0L;
        java.lang.String str6 = label3.toString();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTryCatchBlock(label2, label3, label7, "(FCFFB)F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1660791590" + "'", str6, "L1660791590");
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitVarInsn(7, 5);
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
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 0L;
        java.lang.Object obj9 = new java.lang.Object();
        label6.info = obj9;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLabel(label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 0L;
        java.lang.Object obj11 = new java.lang.Object();
        label8.info = obj11;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type17, type19, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type16, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type14, typeArray25);
        label8.info = typeArray25;
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLocalVariable("", "", "hi!", label8, label29, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "F" + "'", str18, "F");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "F" + "'", str21, "F");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "F" + "'", str23, "F");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "C");
        org.mockito.asm.Type type4 = signature3.getReturnType();
        org.mockito.cglib.core.Customizer customizer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.hash_code(codeEmitter0, type4, 0, customizer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 153);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type21, type23, type24, type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type20, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type18, typeArray29);
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(3, type18);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str34 = type33.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str41 = type40.getDescriptor();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str43 = type42.getDescriptor();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type37, type39, type40, type42, type44 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("", type36, typeArray45);
        org.mockito.asm.Type[] typeArray47 = signature46.getArgumentTypes();
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray47);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        java.lang.String str51 = type49.getDescriptor();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean54 = type52.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str56 = type55.getDescriptor();
        int int58 = type55.getOpcode((int) '#');
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type18, type33, type49, type52, type55 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray59);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("(FCFFB)S", type1, typeArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(FCFFB)S' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "F" + "'", str12, "F");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "F" + "'", str22, "F");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "F" + "'", str25, "F");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "F" + "'", str27, "F");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "C" + "'", str34, "C");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "F" + "'", str38, "F");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "F" + "'", str41, "F");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "F" + "'", str43, "F");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(FCFFB)C" + "'", str48, "(FCFFB)C");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "F" + "'", str50, "F");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "F" + "'", str51, "F");
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "F" + "'", str56, "F");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 37 + "'", int58 == 37);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "(SCFFF)B" + "'", str60, "(SCFFF)B");
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn((int) (short) -1, 124);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTypeInsn(124, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitAttribute(attribute3);
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
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str54 = signature53.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.factory_method(classEmitter22, signature53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@9660345");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "F" + "'", str30, "F");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "F" + "'", str33, "F");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "F" + "'", str35, "F");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMethodInsn((int) '#', "L373083987", "(FCFFB)C", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 0L;
        java.lang.Object obj8 = new java.lang.Object();
        label5.info = obj8;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(6, "hi!", (org.mockito.asm.MethodVisitor) localVariablesSorter7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.getClassName();
        org.mockito.cglib.core.ProcessArrayCallback processArrayCallback5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.process_arrays(codeEmitter0, type1, processArrayCallback5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type F is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "F" + "'", str2, "F");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "F" + "'", str3, "F");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "float" + "'", str4, "float");
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label2 = new org.mockito.asm.Label();
        label2.info = 0L;
        java.lang.Object obj5 = new java.lang.Object();
        label2.info = obj5;
        java.lang.Object obj7 = label2.info;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 0L;
        java.lang.Object obj11 = new java.lang.Object();
        label8.info = obj11;
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        label13.info = 0L;
        java.lang.Object obj16 = new java.lang.Object();
        label13.info = obj16;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTryCatchBlock(label2, label8, label13, "C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type7, type8, type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type4, typeArray13);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type2, typeArray13);
        java.lang.String str16 = signature15.getDescriptor();
        org.mockito.asm.Type[] typeArray17 = signature15.getArgumentTypes();
        java.lang.String str18 = signature15.getDescriptor();
        java.lang.String str19 = signature15.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.factory_method(classEmitter0, signature15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "F" + "'", str6, "F");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "F" + "'", str11, "F");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(FCFFB)S" + "'", str16, "(FCFFB)S");
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(FCFFB)S" + "'", str18, "(FCFFB)S");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(FCFFB)S" + "'", str19, "(FCFFB)S");
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFieldInsn(124, "(SCFFF)B", "(FCFFB)F", "(FCFFB)B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMultiANewArrayInsn("hi!", 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn((int) (byte) 0, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.MethodInfo methodInfo51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter53 = org.mockito.cglib.core.EmitUtils.begin_method(classEmitter46, methodInfo51, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "F" + "'", str30, "F");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "F" + "'", str33, "F");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "F" + "'", str35, "F");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(classInfo48);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSort();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str10 = type9.toString();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type15, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type12, typeArray21);
        org.mockito.asm.Type[] typeArray23 = signature22.getArgumentTypes();
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray23);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray23);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type32, type34, type35, type37, type39 };
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type31, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", type29, typeArray40);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray40);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFrame(155, 0, (java.lang.Object[]) typeArray23, 100, (java.lang.Object[]) typeArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "C" + "'", str10, "C");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "F" + "'", str14, "F");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "F" + "'", str17, "F");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "F" + "'", str19, "F");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(FCFFB)C" + "'", str24, "(FCFFB)C");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(FCFFB)B" + "'", str25, "(FCFFB)B");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "F" + "'", str33, "F");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "F" + "'", str36, "F");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "F" + "'", str38, "F");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(FCFFB)F" + "'", str43, "(FCFFB)F");
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        int int0 = org.mockito.cglib.core.CodeEmitter.GE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 156 + "'", int0 == 156);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(SCFFF)B");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitIincInsn(0, 37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter5.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter21 = classEmitter18.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3f481433");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter21 = classEmitter15.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@10d41243");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.MethodInfo methodInfo4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter6 = org.mockito.cglib.core.EmitUtils.begin_method(classEmitter1, methodInfo4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 0L;
        java.lang.String str10 = label7.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLineNumber((int) (byte) 10, label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L569682405" + "'", str10, "L569682405");
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.MethodInfo methodInfo3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter4 = org.mockito.cglib.core.EmitUtils.begin_method(classEmitter2, methodInfo3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type5, type7, type8, type10, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type4, typeArray13);
        org.mockito.asm.Type[] typeArray15 = signature14.getArgumentTypes();
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.push_array(codeEmitter0, (java.lang.Object[]) typeArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "C" + "'", str2, "C");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "F" + "'", str6, "F");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "F" + "'", str11, "F");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(FCFFB)C" + "'", str16, "(FCFFB)C");
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.push_array(codeEmitter0, (java.lang.Object[]) typeArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "F" + "'", str12, "F");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(FCFFB)F" + "'", str17, "(FCFFB)F");
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMethodInsn(124, "CF", "(FCFFB)B", "(FCFFB)F");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type14, type16, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type13, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type11, typeArray22);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray22);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor26 = classEmitter1.visitField(112, "CF", "(FF)B", "L373083987", (java.lang.Object) str25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "F" + "'", str15, "F");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "F" + "'", str18, "F");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "F" + "'", str20, "F");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(FCFFB)F" + "'", str25, "(FCFFB)F");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 0L;
        java.lang.Object obj8 = new java.lang.Object();
        label5.info = obj8;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 0L;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 0L;
        java.lang.Object obj12 = new java.lang.Object();
        label9.info = obj12;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type20, type21, type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type17, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type15, typeArray26);
        label9.info = typeArray26;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLocalVariable("(FCFFB)F", "I", "hi!", label6, label9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "F" + "'", str19, "F");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "F" + "'", str22, "F");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "F" + "'", str24, "F");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 0L;
        java.lang.Object obj7 = new java.lang.Object();
        label4.info = obj7;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type15, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type12, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type10, typeArray21);
        label4.info = typeArray21;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitLineNumber(157, label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "F" + "'", str14, "F");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "F" + "'", str17, "F");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "F" + "'", str19, "F");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor8 = classEmitter2.visitField((int) (byte) -1, "", "(FF)B", "(SCFFF)B", (java.lang.Object) 158);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        java.lang.String[] strArray31 = new java.lang.String[] { "S", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor32 = classEmitter22.visitMethod(156, "I", "(SCFFF)B", "", strArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1d0262e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 0L;
        java.lang.Object obj9 = new java.lang.Object();
        label6.info = obj9;
        java.lang.Object obj11 = label6.info;
        int[] intArray16 = new int[] { 156, 96, 154, 3 };
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        label17.info = 0L;
        java.lang.Object obj20 = new java.lang.Object();
        label17.info = obj20;
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        label22.info = 0L;
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        label26.info = 0L;
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        label29.info = 0L;
        java.lang.Object obj32 = new java.lang.Object();
        label29.info = obj32;
        java.lang.Object obj34 = label29.info;
        org.mockito.asm.Label[] labelArray35 = new org.mockito.asm.Label[] { label17, label22, label25, label26, label29 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLookupSwitchInsn(label6, intArray16, labelArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[156, 96, 154, 3]");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(labelArray35);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "F" };
        org.mockito.asm.Type[] typeArray54 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.add_properties(classEmitter46, strArray53, typeArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "F" + "'", str30, "F");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "F" + "'", str33, "F");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "F" + "'", str35, "F");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNotNull(strArray53);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = methodAdapter2.visitParameterAnnotation(0, "L373083987", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMaxs((int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 0L;
        java.lang.Object obj8 = new java.lang.Object();
        label5.info = obj8;
        int[] intArray12 = new int[] { '4', 112 };
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        label13.info = 0L;
        java.lang.Object obj16 = new java.lang.Object();
        label13.info = obj16;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str26 = type25.getDescriptor();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type22, type24, type25, type27, type29 };
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type21, typeArray30);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("", type19, typeArray30);
        label13.info = typeArray30;
        org.mockito.asm.Label label34 = new org.mockito.asm.Label();
        label34.info = 0L;
        java.lang.String str37 = label34.toString();
        org.mockito.asm.Label label38 = new org.mockito.asm.Label();
        label38.info = 0L;
        java.lang.Object obj41 = new java.lang.Object();
        label38.info = obj41;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str48 = type47.getDescriptor();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str51 = type50.getDescriptor();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str53 = type52.getDescriptor();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type47, type49, type50, type52, type54 };
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", type46, typeArray55);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("", type44, typeArray55);
        label38.info = typeArray55;
        org.mockito.asm.Label label59 = new org.mockito.asm.Label();
        label59.info = 0L;
        java.lang.Object obj62 = new java.lang.Object();
        label59.info = obj62;
        java.lang.Object obj64 = label59.info;
        org.mockito.asm.Label label65 = new org.mockito.asm.Label();
        label65.info = 0L;
        org.mockito.asm.Label[] labelArray68 = new org.mockito.asm.Label[] { label13, label34, label38, label59, label65 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLookupSwitchInsn(label5, intArray12, labelArray68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[52, 112]");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "F" + "'", str23, "F");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "F" + "'", str26, "F");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "F" + "'", str28, "F");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L1210266194" + "'", str37, "L1210266194");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "F" + "'", str48, "F");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "F" + "'", str51, "F");
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "F" + "'", str53, "F");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(labelArray68);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray11 = new java.lang.String[] { "I", "(FCFFB)B" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classAdapter4.visitMethod(5, "float", "CF", "S", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1d0d8e68");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitVarInsn(6, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.null_constructor(classEmitter22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3bf632cf");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo23);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.factory_method(classEmitter15, signature25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7c46a6ab");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo22);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor23 = classEmitter15.visitField(37, "(FCFFB)F", "hi!", "S", (java.lang.Object) "(SCFFF)B");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        java.lang.String str17 = type3.toString();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(158, type3);
        org.mockito.asm.Type type19 = local18.getType();
        org.mockito.asm.Type type20 = local18.getType();
        org.mockito.cglib.core.ProcessArrayCallback processArrayCallback21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.process_array(codeEmitter0, type20, processArrayCallback21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type S is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "F" + "'", str12, "F");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "S" + "'", str17, "S");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(FCFFB)S");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.mockito.cglib.core.Block block0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSort();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str4 = type3.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type7, type9, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type6, typeArray15);
        org.mockito.asm.Type[] typeArray17 = signature16.getArgumentTypes();
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.wrap_throwable(block0, type1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "C" + "'", str4, "C");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "F" + "'", str11, "F");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "F" + "'", str13, "F");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(FCFFB)C" + "'", str18, "(FCFFB)C");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(FCFFB)B" + "'", str19, "(FCFFB)B");
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 0L;
        java.lang.String str12 = label9.toString();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        label13.info = 0L;
        java.lang.Object obj16 = new java.lang.Object();
        label13.info = obj16;
        java.lang.Object obj18 = label13.info;
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        label19.info = 0L;
        java.lang.Object obj22 = new java.lang.Object();
        label19.info = obj22;
        java.lang.Object obj24 = label19.info;
        org.mockito.asm.Label[] labelArray25 = new org.mockito.asm.Label[] { label13, label19 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTableSwitchInsn((int) (short) 0, 7, label9, labelArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L72124245" + "'", str12, "L72124245");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(labelArray25);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type29, type31, type32, type34, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("", type28, typeArray37);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type26, typeArray37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        boolean boolean42 = type26.equals((java.lang.Object) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.CHAR_TYPE;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.add_property(classEmitter22, "", type52, "(FCFFB)B");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1e266677");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "F" + "'", str30, "F");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "F" + "'", str33, "F");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "F" + "'", str35, "F");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNotNull(type52);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLineNumber(126, label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 0L;
        java.lang.String str10 = label7.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLabel(label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1675428157" + "'", str10, "L1675428157");
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMaxs((int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(FCFFB)B", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(FCFFB)B' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        label3.info = 0L;
        java.lang.Object obj6 = new java.lang.Object();
        label3.info = obj6;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitJumpInsn(158, label3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 0L;
        java.lang.Object obj3 = new java.lang.Object();
        label0.info = obj3;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type9, type11, type12, type14, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type8, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type6, typeArray17);
        label0.info = typeArray17;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "F" + "'", str13, "F");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "F" + "'", str15, "F");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn((int) (short) 10, 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 0L;
        java.lang.Object obj11 = new java.lang.Object();
        label8.info = obj11;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(7, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(2, 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(158, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.MethodInfo methodInfo4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter6 = org.mockito.cglib.core.EmitUtils.begin_method(classEmitter1, methodInfo4, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMaxs(158, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L373083987");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "float", "L1625180428" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter0.visitMethod(112, "byte", "", "F", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6f31838b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitVarInsn((int) (short) 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.MethodInfo methodInfo2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter4 = org.mockito.cglib.core.EmitUtils.begin_method(classEmitter0, methodInfo2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLdcInsn((java.lang.Object) classEmitter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter4.visitParameterAnnotation(124, "L373083987", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        java.lang.String[] strArray31 = new java.lang.String[] { "F", "L373083987", "I", "(SCFFF)B", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor32 = classEmitter15.visitMethod(155, "", "", "(FCFFB)C", strArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@640b2a64");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn(10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn((int) (byte) 1, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 0L;
        java.lang.Object obj8 = new java.lang.Object();
        label5.info = obj8;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        label10.info = 0L;
        java.lang.Object obj13 = new java.lang.Object();
        label10.info = obj13;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type19, type21, type22, type24, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type18, typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("", type16, typeArray27);
        label10.info = typeArray27;
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        label31.info = 0L;
        java.lang.Object obj34 = new java.lang.Object();
        label31.info = obj34;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str41 = type40.getDescriptor();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str44 = type43.getDescriptor();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str46 = type45.getDescriptor();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type40, type42, type43, type45, type47 };
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("", type39, typeArray48);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("", type37, typeArray48);
        label31.info = typeArray48;
        java.lang.String str52 = label31.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label5, label10, label31, "C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "F" + "'", str20, "F");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "F" + "'", str23, "F");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "F" + "'", str25, "F");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "F" + "'", str41, "F");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "F" + "'", str44, "F");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "F" + "'", str46, "F");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(typeArray48);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "L1406555337" + "'", str52, "L1406555337");
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitVarInsn((int) 'a', 96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn((int) (short) 100, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 0L;
        java.lang.Object obj10 = new java.lang.Object();
        label7.info = obj10;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type16, type18, type19, type21, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type15, typeArray24);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type13, typeArray24);
        label7.info = typeArray24;
        java.lang.String str28 = label7.toString();
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        label29.info = 0L;
        org.mockito.asm.Label label32 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTryCatchBlock(label7, label29, label32, "S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "F" + "'", str17, "F");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "F" + "'", str20, "F");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "F" + "'", str22, "F");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L189068925" + "'", str28, "L189068925");
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
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
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
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
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn((int) (byte) 1, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitMaxs(10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "(FF)B", "(FCFFB)S", "F", "I", "L1712303363" };
        org.mockito.cglib.core.ObjectSwitchCallback objectSwitchCallback8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.string_switch(codeEmitter0, strArray6, (int) (byte) 0, objectSwitchCallback8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter15.getClassInfo();
        org.mockito.asm.Attribute attribute23 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter15.visitAttribute(attribute23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo22);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter6.visitAnnotation("CF", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        java.lang.String[] strArray27 = new java.lang.String[] { "I" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor28 = classEmitter15.visitMethod(1, "I", "(FCFFB)F", "L373083987", strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@72391504");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 0L;
        java.lang.Object obj9 = new java.lang.Object();
        label6.info = obj9;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type15, type17, type18, type20, type22 };
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type14, typeArray23);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type12, typeArray23);
        label6.info = typeArray23;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str32 = type31.getDescriptor();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str35 = type34.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type31, type33, type34, type36, type38 };
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("", type30, typeArray39);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type28, typeArray39);
        java.lang.String str42 = type28.toString();
        int int43 = type28.getSize();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str45 = type44.toString();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str49 = type48.getDescriptor();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str52 = type51.getDescriptor();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str54 = type53.getDescriptor();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type48, type50, type51, type53, type55 };
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("", type47, typeArray56);
        org.mockito.asm.Type[] typeArray58 = signature57.getArgumentTypes();
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray58);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray58);
        label6.info = str60;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitJumpInsn(104, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "F" + "'", str16, "F");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "F" + "'", str19, "F");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "F" + "'", str21, "F");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "F" + "'", str32, "F");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "F" + "'", str35, "F");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "F" + "'", str37, "F");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "S" + "'", str42, "S");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "C" + "'", str45, "C");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "F" + "'", str49, "F");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "F" + "'", str52, "F");
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "F" + "'", str54, "F");
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "(FCFFB)C" + "'", str59, "(FCFFB)C");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "(FCFFB)S" + "'", str60, "(FCFFB)S");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitIincInsn(0, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 0L;
        java.lang.String str9 = label6.toString();
        java.lang.String str10 = label6.toString();
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitLineNumber((int) (byte) 1, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L771756440" + "'", str9, "L771756440");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L771756440" + "'", str10, "L771756440");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray5 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor6 = classEmitter0.visitMethod(0, "I", "CF", "L1625180428", strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@28476fb");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray12 = new java.lang.String[] { "byte", "", "C", "(FF)B" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = classEmitter3.visitMethod((int) (short) 0, "(FCFFB)F", "L1625180428", "hi!", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(FCFFB)F' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] { "(FF)B", "S", "I", "(FCFFB)C", "(SCFFF)B" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor14 = classEmitter3.visitMethod(4, "L373083987", "(FCFFB)C", "(FCFFB)C", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@14b4e530");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter6.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L1625180428");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type7, type9, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type6, typeArray15);
        int int18 = type6.getOpcode((int) (short) -1);
        int int19 = type6.getSort();
        boolean boolean21 = type6.equals((java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLdcInsn((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "F" + "'", str11, "F");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "F" + "'", str13, "F");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str7 = type6.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type6, type8, type9, type11, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type5, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type3, typeArray14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        boolean boolean19 = type3.equals((java.lang.Object) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter17.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter26 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2b5d3edd");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "F" + "'", str12, "F");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(classInfo24);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@317a97ba");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitIntInsn(4, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        org.mockito.asm.Label[] labelArray9 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTableSwitchInsn(155, 37, label8, labelArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labelArray9);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(130, 124);
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
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 0L;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label12.info = 0L;
        java.lang.Object obj15 = new java.lang.Object();
        label12.info = obj15;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type21, type23, type24, type26, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type20, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type18, typeArray29);
        label12.info = typeArray29;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLocalVariable("(SCFFF)B", "", "F", label9, label12, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "F" + "'", str22, "F");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "F" + "'", str25, "F");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "F" + "'", str27, "F");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.core.EmitUtils.ArrayDelimiters arrayDelimiters7 = new org.mockito.cglib.core.EmitUtils.ArrayDelimiters("(FCFFB)F", "(FCFFB)C", "float");
        org.mockito.cglib.core.Customizer customizer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.append_string(codeEmitter0, type1, arrayDelimiters7, customizer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "F" + "'", str2, "F");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "F" + "'", str3, "F");
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.mockito.asm.Type type0 = null;
        org.mockito.asm.Type[] typeArray2 = org.mockito.asm.Type.getArgumentTypes("(FCFFB)B");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray2);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label7 = null;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 0L;
        java.lang.Object obj11 = new java.lang.Object();
        label8.info = obj11;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str23 = type22.getDescriptor();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type17, type19, type20, type22, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type16, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type14, typeArray25);
        label8.info = typeArray25;
        org.mockito.asm.Label[] labelArray29 = new org.mockito.asm.Label[] { label8 };
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitTableSwitchInsn(153, 6, label7, labelArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "F" + "'", str18, "F");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "F" + "'", str21, "F");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "F" + "'", str23, "F");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(labelArray29);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(0, "I", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type27, type29, type30, type32, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("", type26, typeArray35);
        java.lang.String str37 = signature36.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.factory_method(classEmitter21, signature36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5dc7a3b8");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "F" + "'", str28, "F");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "F" + "'", str31, "F");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "F" + "'", str33, "F");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitInsn((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        label11.info = 0L;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type20, type21, type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type17, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type15, typeArray26);
        org.mockito.asm.Type type29 = signature28.getReturnType();
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        label30.info = 0L;
        java.lang.Object obj33 = new java.lang.Object();
        label30.info = obj33;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str43 = type42.getDescriptor();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str45 = type44.getDescriptor();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type39, type41, type42, type44, type46 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("", type38, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("", type36, typeArray47);
        label30.info = typeArray47;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str56 = type55.getDescriptor();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str59 = type58.getDescriptor();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str61 = type60.getDescriptor();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type55, type57, type58, type60, type62 };
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("", type54, typeArray63);
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("", type52, typeArray63);
        java.lang.String str66 = type52.toString();
        int int67 = type52.getSize();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str69 = type68.toString();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type72 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str73 = type72.getDescriptor();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type75 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str76 = type75.getDescriptor();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str78 = type77.getDescriptor();
        org.mockito.asm.Type type79 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray80 = new org.mockito.asm.Type[] { type72, type74, type75, type77, type79 };
        org.mockito.cglib.core.Signature signature81 = new org.mockito.cglib.core.Signature("", type71, typeArray80);
        org.mockito.asm.Type[] typeArray82 = signature81.getArgumentTypes();
        java.lang.String str83 = org.mockito.asm.Type.getMethodDescriptor(type68, typeArray82);
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type52, typeArray82);
        label30.info = str84;
        boolean boolean86 = type29.equals((java.lang.Object) label30);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLocalVariable("(FCFFB)B", "L1712303363", "(FCFFB)F", label11, label30, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 96");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "F" + "'", str19, "F");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "F" + "'", str22, "F");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "F" + "'", str24, "F");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "F" + "'", str40, "F");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "F" + "'", str43, "F");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "F" + "'", str45, "F");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "F" + "'", str56, "F");
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "F" + "'", str59, "F");
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "F" + "'", str61, "F");
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "S" + "'", str66, "S");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "C" + "'", str69, "C");
        org.junit.Assert.assertNotNull(type71);
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "F" + "'", str73, "F");
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertNotNull(type75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "F" + "'", str76, "F");
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "F" + "'", str78, "F");
        org.junit.Assert.assertNotNull(type79);
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "(FCFFB)C" + "'", str83, "(FCFFB)C");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "(FCFFB)S" + "'", str84, "(FCFFB)S");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(153, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 0L;
        java.lang.Object obj12 = new java.lang.Object();
        label9.info = obj12;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str22 = type21.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type18, type20, type21, type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type17, typeArray26);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type15, typeArray26);
        label9.info = typeArray26;
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        label30.info = 0L;
        java.lang.Object obj33 = new java.lang.Object();
        label30.info = obj33;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str43 = type42.getDescriptor();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str45 = type44.getDescriptor();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type39, type41, type42, type44, type46 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("", type38, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("", type36, typeArray47);
        label30.info = typeArray47;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str56 = type55.getDescriptor();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str59 = type58.getDescriptor();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str61 = type60.getDescriptor();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type55, type57, type58, type60, type62 };
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("", type54, typeArray63);
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("", type52, typeArray63);
        java.lang.String str66 = type52.toString();
        int int67 = type52.getSize();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str69 = type68.toString();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type72 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str73 = type72.getDescriptor();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type75 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str76 = type75.getDescriptor();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str78 = type77.getDescriptor();
        org.mockito.asm.Type type79 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray80 = new org.mockito.asm.Type[] { type72, type74, type75, type77, type79 };
        org.mockito.cglib.core.Signature signature81 = new org.mockito.cglib.core.Signature("", type71, typeArray80);
        org.mockito.asm.Type[] typeArray82 = signature81.getArgumentTypes();
        java.lang.String str83 = org.mockito.asm.Type.getMethodDescriptor(type68, typeArray82);
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type52, typeArray82);
        label30.info = str84;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLocalVariable("", "L1712303363", "org/mockito/cglib/core/ClassEmitter", label9, label30, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 130");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "F" + "'", str19, "F");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "F" + "'", str22, "F");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "F" + "'", str24, "F");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "F" + "'", str40, "F");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "F" + "'", str43, "F");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "F" + "'", str45, "F");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "F" + "'", str56, "F");
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "F" + "'", str59, "F");
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "F" + "'", str61, "F");
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "S" + "'", str66, "S");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "C" + "'", str69, "C");
        org.junit.Assert.assertNotNull(type71);
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "F" + "'", str73, "F");
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertNotNull(type75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "F" + "'", str76, "F");
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "F" + "'", str78, "F");
        org.junit.Assert.assertNotNull(type79);
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "(FCFFB)C" + "'", str83, "(FCFFB)C");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "(FCFFB)S" + "'", str84, "(FCFFB)S");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("", type5, typeArray16);
        org.mockito.asm.Type[] typeArray21 = org.mockito.asm.Type.getArgumentTypes("(FCFFB)B");
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitFrame((int) ' ', 0, (java.lang.Object[]) typeArray16, (int) (byte) 10, (java.lang.Object[]) typeArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "F" + "'", str12, "F");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "F" + "'", str14, "F");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray21);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        java.lang.String[] strArray33 = new java.lang.String[] { "(FF)B", "org/mockito/cglib/core/ClassEmitter", "I", "L1625180428" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor34 = classEmitter21.visitMethod((int) (byte) 10, "hi!", "(SCFFF)B", "(FF)B", strArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@62542ee2");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 0L;
        java.lang.String str8 = label5.toString();
        java.lang.String str9 = label5.toString();
        int[] intArray13 = new int[] { (byte) 0, (short) 1, 9 };
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label15.info = 0L;
        java.lang.Object obj18 = new java.lang.Object();
        label15.info = obj18;
        org.mockito.asm.Label[] labelArray20 = new org.mockito.asm.Label[] { label14, label15 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLookupSwitchInsn(label5, intArray13, labelArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L456288259" + "'", str8, "L456288259");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L456288259" + "'", str9, "L456288259");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 9]");
        org.junit.Assert.assertNotNull(labelArray20);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(0, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs((int) (short) 1, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str9 = type8.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type8, type10, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        org.mockito.asm.Type[] typeArray18 = signature17.getArgumentTypes();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type24, type26, type27, type29, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", type23, typeArray32);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("", type21, typeArray32);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray32);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter36 = classEmitter0.begin_method((int) (byte) 100, signature17, typeArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4e8e9d06");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "F" + "'", str12, "F");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "F" + "'", str14, "F");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "F" + "'", str25, "F");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "F" + "'", str28, "F");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "F" + "'", str30, "F");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(FCFFB)F" + "'", str35, "(FCFFB)F");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.mockito.cglib.core.Block block0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.wrap_throwable(block0, type1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "S" + "'", str2, "S");
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(FF)B", "F");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(FF)B' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter3.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@388912e4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitMethodInsn(153, "(FCFFB)B", "(FCFFB)B", "(FCFFB)B");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.MethodInfo methodInfo5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter6 = org.mockito.cglib.core.EmitUtils.begin_method(classEmitter4, methodInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.Attribute attribute25 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter22.visitAttribute(attribute25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo23);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type11, type13, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type10, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type8, typeArray19);
        org.mockito.asm.Type[] typeArray24 = org.mockito.asm.Type.getArgumentTypes("(FCFFB)C");
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFrame(116, 156, (java.lang.Object[]) typeArray19, 116, (java.lang.Object[]) typeArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "F" + "'", str12, "F");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "F" + "'", str15, "F");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "F" + "'", str17, "F");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray24);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitIincInsn(8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("(SCFFF)B");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.EmitUtils.add_property(classEmitter3, "I", type7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@18fc7549");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        org.mockito.asm.MethodAdapter methodAdapter2 = new org.mockito.asm.MethodAdapter((org.mockito.asm.MethodVisitor) methodAdapter1);
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter2.visitLdcInsn(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitIntInsn(7, 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.mockito.asm.MethodVisitor methodVisitor0 = null;
        org.mockito.asm.MethodAdapter methodAdapter1 = new org.mockito.asm.MethodAdapter(methodVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter1.visitTypeInsn((int) '#', "char");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(37, 37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitInsn((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type4, type6, type7, type9, type11 };
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type3, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("", type1, typeArray12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        boolean boolean17 = type1.equals((java.lang.Object) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str29 = signature28.toString();
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("C", "F");
        boolean boolean33 = signature28.equals((java.lang.Object) signature32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str39 = type38.getDescriptor();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str42 = type41.getDescriptor();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str44 = type43.getDescriptor();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type38, type40, type41, type43, type45 };
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("", type37, typeArray46);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("", type35, typeArray46);
        org.mockito.asm.Type[] typeArray49 = signature48.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter50 = classEmitter21.begin_method(1, signature28, typeArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2ba2c24f");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F" + "'", str5, "F");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "F" + "'", str8, "F");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "F" + "'", str10, "F");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "F" + "'", str39, "F");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "F" + "'", str42, "F");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "F" + "'", str44, "F");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray49);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type13, type15, type16, type18, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type12, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type10, typeArray21);
        java.lang.String str24 = type10.toString();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(158, type10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor26 = classEmitter0.visitField((int) (short) 100, "char", "char", "F", (java.lang.Object) 158);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "F" + "'", str14, "F");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "F" + "'", str17, "F");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "F" + "'", str19, "F");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "S" + "'", str24, "S");
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIntInsn((int) (short) 10, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMultiANewArrayInsn("C", 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 0L;
        java.lang.String str12 = label9.toString();
        java.lang.String str13 = label9.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLineNumber((int) (short) 1, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L969036648" + "'", str12, "L969036648");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L969036648" + "'", str13, "L969036648");
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 0L;
        java.lang.Object obj8 = new java.lang.Object();
        label5.info = obj8;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type14, type16, type17, type19, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("", type13, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type11, typeArray22);
        label5.info = typeArray22;
        java.lang.String str26 = label5.toString();
        int[] intArray27 = new int[] {};
        org.mockito.asm.Label[] labelArray28 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLookupSwitchInsn(label5, intArray27, labelArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "F" + "'", str15, "F");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "F" + "'", str18, "F");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "F" + "'", str20, "F");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1761301726" + "'", str26, "L1761301726");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(labelArray28);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(130, "(FF)B", (org.mockito.asm.MethodVisitor) methodAdapter3);
        // The following exception was thrown during execution in test generation
        try {
            methodAdapter3.visitIntInsn(100, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type12, type14, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type11, typeArray20);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type9, typeArray20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        boolean boolean25 = type9.equals((java.lang.Object) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter23.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLdcInsn((java.lang.Object) classEmitter23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "F" + "'", str13, "F");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "F" + "'", str16, "F");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "F" + "'", str18, "F");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(classInfo29);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 0L;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitJumpInsn(126, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.asm.MethodAdapter methodAdapter5 = new org.mockito.asm.MethodAdapter(methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter10 = new org.mockito.cglib.core.LocalVariablesSorter(157, "L1712303363", (org.mockito.asm.MethodVisitor) localVariablesSorter9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(104, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 0L;
        java.lang.Object obj11 = new java.lang.Object();
        label8.info = obj11;
        java.lang.Object obj13 = label8.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.asm.MethodAdapter methodAdapter3 = new org.mockito.asm.MethodAdapter(methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(96, "(FF)B", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}
